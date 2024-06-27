import { Component, OnInit } from '@angular/core';
import { Accounts } from 'src/app/model/accounts';
import { ParkingFare } from 'src/app/model/parking-fare';
import { Transection } from 'src/app/model/transection';
import { ControllerService } from 'src/app/service/controller.service';

@Component({
  selector: 'app-parking-booking',
  templateUrl: './parking-booking.component.html',
  styleUrls: ['./parking-booking.component.css']
})
export class ParkingBookingComponent implements OnInit {

  constructor(private myservice:ControllerService) { 
    this.myservice.getAllAccountsByType(this.taccountType).subscribe((x)=>{
      this.accounts=x;
    });
  }

  ngOnInit(): void {
  }
  carNo:any;
  date:any;
  service:any="select";
  cartype:any="select";
  slotNo:any="select";
  status:any;
  fare:any;

  allslot:any=[]
  onCatagoryChangePropertyEvent(event:Event){
    const value = (event.target as HTMLSelectElement).value;
    this.myservice.getParkingSlotByCarType(value).subscribe((x)=>{
      this.allslot=x;
    })
  }
  setfare(event:Event){
    const value = (event.target as HTMLSelectElement).value;
    for(let i of this.allslot){
      if(i.slotno==value){
        this.fare=i.fare;
      }
    }
  }

  updateBookingStatus(){
    this.status="booked"
    this.myservice.updateParkingStatus(this.slotNo,this.status).subscribe();
  }

  updateCheckoutStatus(){
    this.status="available"
    this.myservice.updateParkingStatus(this.slotNo,this.status).subscribe();
  }

//constructor(parkingId:any,slotno:any,carType:any,carNo:any,parkingDate:any)
newParking:any;
saveParking(){
this.newParking=new ParkingFare(null,this.slotNo,this.cartype,this.carNo,this.date,this.fare);
this.myservice.bookedParking(this.newParking).subscribe();
}

checkin(){
  this.updateBookingStatus();
  this.saveParking();
  this.date="";
  this.carNo="";
  this.cartype="select";
  this.slotNo="select";
  alert("Check in!")

}
//==================================Transection===========================

//Account Details
accounts:any=[];
taccountType:any="admin";
taccountName:any;
accountNumber:any="select";

setTransectionAccountsDetails(event:Event){
  const value = (event.target as HTMLSelectElement).value;
  // this.servicePropertyid=value;
  for(let i of this.accounts){
    if(i.accountName==value){
      this.accountNumber=i.accountName; 
      
    }
  }
 
}

 //==============================Transection part===========================================
 accNo:any;
 accountType:any;
 accountName:any;
 debit:any=0;
 credit:any=0;
 balance:any=0;
 payAmmount:any;

 transectionId:any;
 adminId:any=1001
 payerId:any;
 ammount:any;
 transectionType:any = "Select Payment Type";
 transectionStatus:any = "Parking Fee";
 purpose:any="parking";
 transectiondate:any;
 account:any;
 // (transectionId:any,accNo:any,payerId:any,ammount:any,transectionType:any,transectionStatus:any,purpose:any,date:any)
 newTransection:any;
 transection(){
   
   this.newTransection = new Transection(null,this.accountNumber,this.adminId,this.fare,this.transectionType,this.transectionStatus,this.purpose,this.transectiondate);
   this.myservice.saveTransection(this.newTransection).subscribe(()=>{alert("Transection Save")});
 }


 // (accId:any,accountType:any,accNo:any,accountName:any,debit:any,credit:any,balance:any)

accUpdate(){
  this.account=new Accounts(null,this.accountType,this.accountNumber,this.accountName,this.debit,this.fare,this.balance);
  this.myservice.updateAccountBalance(this.account,this.adminId).subscribe(()=>{alert("Accounts Updated")});
}
alldata:any=[]
findCheckoutdata(){
  this.myservice.ParkingdataBydateCarno(this.date,this.carNo).subscribe((x)=>{
    this.alldata=x;
    for(let i of this.alldata){
      this.slotNo=i.slotno;
    this.cartype=i.carType;
    this.fare=i.fare; 
    }
    
    
  });
}

checkout(){
this.accUpdate();
this.transection();
this.updateCheckoutStatus();
alert("Successfully Check out!")
this.date="";
this.carNo="";
this.cartype="select";
  this.slotNo="select";
  this.accountNumber="select";
  this.transectionType = "Select Payment Type";
  this.fare="";
}



}

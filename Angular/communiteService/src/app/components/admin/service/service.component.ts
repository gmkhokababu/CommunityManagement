import { Component, OnInit } from '@angular/core';
import { Accounts } from 'src/app/model/accounts';
import { ServiceCatagory } from 'src/app/model/service-catagory';
import { ServiceProperty } from 'src/app/model/service-property';
import { ServicePropertyRent } from 'src/app/model/service-property-rent';
import { Transection } from 'src/app/model/transection';
import { ControllerService } from 'src/app/service/controller.service';

@Component({
  selector: 'app-service',
  templateUrl: './service.component.html',
  styleUrls: ['./service.component.css']
})
export class ServiceComponent implements OnInit {

  constructor(private myservice:ControllerService) {
    this.myservice.getAdminPropertyCatagory().subscribe((x)=>{
      this.allcatagory=x;
    });
    this.myservice.getAllAccountsByType(this.taccountType).subscribe((x)=>{
      this.accounts=x;
    })
   }

  ngOnInit(): void {
  }

  //==============================service Catagory==================================

  catagoryId:any;
	catagoryName:any;
  newCatagory:any;
  allcatagory:any=[];

  saveCatagory(){
    alert("works")
    let getcatagoryName= prompt("Type Catagory Name:");
    if(getcatagoryName != null){
      this.catagoryName=getcatagoryName;
      this.newCatagory=new ServiceCatagory(null,this.catagoryName);
      this.myservice.saveAdminPropertycatagory(this.newCatagory).subscribe(()=>{alert("New Catagory Added!")});
    }else{
      alert("Catagory Name Can't Blank!");
    }
    
  }

  onCatagoryChangeEvent(event:Event){
    const value = (event.target as HTMLSelectElement).value;
    if (value === 'addNew') {
      this.saveCatagory();
    } else {
      this.catagory = value;
    }
  }
 

  //==========================================Template========================================
  service:any="Add Service Property";

  
	propertyName:any;
	rentPday:any;
	servicecharge:any;
	catagory:any="Select Service Catagory";


  saveProperty:any;
  save(){
    this.saveProperty=new ServiceProperty(null,this.propertyName,this.rentPday,this.servicecharge,this.catagory);
    this.myservice.saveAdminProperty(this.saveProperty).subscribe(()=>{
      alert ("Property save!");
      this.propertyName="";
      this.rentPday="";
      this.servicecharge="";
      this.catagory="Select Service Catagory";
    })
  }

//===========================================Booked property========================================

catagoryforproperty:any="Select Service Catagory";
allProperty:any=[];

onCatagoryChangePropertyEvent(event:Event){
  const value = (event.target as HTMLSelectElement).value;
  this.myservice.getAllAdminPropertyByCatagory(value).subscribe((x)=>{
    this.allProperty=x;
  })
}

  bookingId:any;
  servicePropertyid:any;
	bookingStart:any;
	bookingEnd:any;
	status:any;
	customerName:any;
	phoneNo:any;
  totalDays:any;
  rentPerDay:any;
  serviceCharge:any;
  totalBill:any;
  payAmmount:any;
  daycalculation(){
    let startDate=new Date(this.bookingStart);
    let endDate=new Date(this.bookingEnd);
    let days=Math.floor((Date.UTC(endDate.getFullYear(),endDate.getMonth(),endDate.getDate())-Date.UTC(startDate.getFullYear(),startDate.getMonth(),startDate.getDate()))/(1000*60*60*24))+1;
    this.totalDays=days;
  }

    // constructor(bookingId:any,servicePropertyid:any,bookingStart:any,bookingEnd:any,status:any,customerName:any,phoneNo:any)
setServicePropertyId(event:Event){
  const value = (event.target as HTMLSelectElement).value;
  // this.servicePropertyid=value;
  for(let i of this.allProperty){
    if(i.servicePropertyid==value){
      this.servicePropertyid=i.servicePropertyid; 
      this.rentPerDay=i.rentPday;
      this.serviceCharge=i.servicecharge;
    }
  }
  this.totalBill=(this.totalDays*this.rentPerDay)+this.serviceCharge;
}

saveadminandtransection(){
  this.saveAdminPropertyBooking();
  this.transection();
  this.accUpdate();
}

propertyBooking:any;
saveAdminPropertyBooking(){
  this.status="Booked";
  this.propertyBooking=new ServicePropertyRent(null,this.servicePropertyid,this.bookingStart,this.bookingEnd,this.status,this.customerName,this.phoneNo);
  this.myservice.saveAdminPropertyBooking(this.propertyBooking).subscribe(()=>{
    alert("Service Property Booked!");
  })
}
//========================new Accounts===================

accNo:any;
accountType:any;
accountName:any;
debit:any=0;
credit:any=0;
balance:any=0;

account:any;
  createAccount(){
    this.accountType="admin";
    this.account=new Accounts(null,this.accountType,this.accNo,this.accountName,this.debit,this.credit,this.balance);
    this.myservice.createAccount(this.account).subscribe(()=>{
      alert("Account Save")
    });
    this.accountType="";
  }


//==================================Transection===========================

//Account Details
accounts:any=[];
taccountType:any="admin";
taccountName:any;
accountNumber:any;

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
 transectionId:any;
 adminId:any=1001
 payerId:any;
 ammount:any;
 transectionType:any = "Select Payment Type";
 transectionStatus:any = "Service Fee";
 purpose:any="rent";
 transectiondate:any;
 // (transectionId:any,accNo:any,payerId:any,ammount:any,transectionType:any,transectionStatus:any,purpose:any,date:any)
 newTransection:any;
 transection(){
   alert("transection work");
   // this.transectiondate=
   this.newTransection = new Transection(null,this.accountNumber,this.adminId,this.totalBill,this.transectionType,this.transectionStatus,this.purpose,this.transectiondate);
   this.myservice.saveTransection(this.newTransection).subscribe(()=>{alert("Transection Save")});
 }


 // (accId:any,accountType:any,accNo:any,accountName:any,debit:any,credit:any,balance:any)

accUpdate(){
  this.account=new Accounts(null,this.accountType,this.accountNumber,this.accountName,this.debit,this.totalBill,this.balance);
  this.myservice.updateAccountBalance(this.account,this.adminId).subscribe(()=>{alert("Accounts Updated")});
}



}

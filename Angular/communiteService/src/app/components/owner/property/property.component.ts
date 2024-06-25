import { state } from '@angular/animations';
import { DATE_PIPE_DEFAULT_TIMEZONE } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Accounts } from 'src/app/model/accounts';
import { Property } from 'src/app/model/property';
import { RentAgreement } from 'src/app/model/rent-agreement';
import { RentalRegistration } from 'src/app/model/rental-registration';
import { Transection } from 'src/app/model/transection';
import { ControllerService } from 'src/app/service/controller.service';

@Component({
  selector: 'app-property',
  templateUrl: './property.component.html',
  styleUrls: ['./property.component.css']
})
export class PropertyComponent implements OnInit {
//==================================Conostractor==========================
  constructor(private myservice:ControllerService, private router:Router) { }



  //==================================tenent details part==========================
  regid:any;
  ownerId:any; //print
  howsNumber:any; //print
  flatNumber:any; //print
  tenantName:any; //print
  phoneNo:any; //print
  familymember:any;
  occupation:any;
  rentDate:any;

  //=================================Tenent aGREEMENT part by owner=============================
  fixedDeposit:any;
  monthlyRent:any;
  serviceBill:any;
  utilityBill:any;

  //==============================service commnity booking=======================================
  propertyType:any;
  date:any;
  ownerTenentId:any;
  reason:any;
  property:any;

  //==============================Bill Part======================================================
  bills:any[]=[]; //print
  bill:any={billdes:"",ammount:0};
  totalBill:any; //print
  payammount:any; //print
  paydate:any=new Date; //print

  sentData:any={
    ownerId:0 ,
    howsNumber:0 ,
    flatNumber:"", 
    tenantName:"", 
    phoneNo:"",
    totalBill:0, 
    payammount:0, 
  }

  //==============================Transection part===========================================
  transectionId:any;
	accNo:any;
	payerId:any;
	ammount:any;
	transectionType:any = "Select Payment Type";
	transectionStatus:any = "jan";
	purpose:any="rent";
	transectiondate:any;
  

  //==============================Accounts Part===========================================

  accId:any;
	accountType:any;
	// accNo:any;
	accountName:any;
	debit:any;
	credit:any;
	balance:any;
  
  //========================local variable===========================
  template:any="Rent Property";

 
  propertyDetails:any=[];
  

  ngOnInit(): void {
  }
  addbill(){
    this.bills=[];
    this.bill=new Object;
    this.bill.billdes="Fixed Deposit";
    this.bill.ammount=this.fixedDeposit;
    this.bills.push(this.bill);
    this.bill=new Object;
    this.bill.billdes="Monthly Rent";
    this.bill.ammount=this.monthlyRent;
    this.bills.push(this.bill);
    this.bill=new Object;
    this.bill.billdes="Service Bill";
    this.bill.ammount=this.serviceBill;
    this.bills.push(this.bill);
    this.bill=new Object;
    this.bill.billdes="Utility Bill";
    this.bill.ammount=this.utilityBill;
    this.bills.push(this.bill);
    this.totalBill=0;
    for(let i of this.bills){
      
      this.totalBill=this.totalBill+i.ammount;
    }

  }
  houseNoByOwnerId(){
    this.myservice.getPropertyByOwnerId(this.ownerId).subscribe((x)=>{
      this.propertyDetails=x;
    })
  }

  setHouseNo(i:any){
    this.howsNumber=this.propertyDetails[i].houseNo;
    // alert(this.howsNumber);
  }
  setFlatNo(i:any){
    this.flatNumber=this.propertyDetails[i].flatNo;
    // alert(this.howsNumber);
  }

  submit(){
    
    this.addbill();
    this.template="Agreement Billing";
  }

  //(agreementid:any,rentPerMonth:any,fixedDepo:any,serviceBill:any,utilityBill:any,houseNo:any,flatno:any)
  agreement:any;
  saveAgreement(){
    this.agreement=new RentAgreement(null,this.monthlyRent,this.fixedDeposit,this.serviceBill,this.utilityBill,this.howsNumber,this.flatNumber);
    this.myservice.makerentAgreement(this.agreement).subscribe(()=>{alert("Rent Agreement Seccessfull")})
  }

  //(regid:any,houseNo:any,flatNo:any,tenantName:any,phoneNo:any,familyMember:any,Occupation:any,rentDate:any,terminateDate:any,status:any)
  tenantRegistration:any;
  registrationTenant(){

    this.tenantRegistration=new RentalRegistration(null,this.howsNumber,this.flatNumber,this.tenantName,this.phoneNo,this.familymember,this.occupation,this.rentDate,null,"rented");
    this.myservice.registrationRent(this.tenantRegistration).subscribe(()=>{alert ("Rent Registration Seccessfull")});
  }

  print(){
    this.saveAgreement();
    this.registrationTenant();
    this.transection();
    this.accUpdate();
    this.sentData=new Object;
    this.sentData.ownerId=this.ownerId;
    this.sentData.howsNumber=this.howsNumber;
    this.sentData.flatNumber=this.flatNumber;
    this.sentData.tenantName=this.tenantName;
    this.sentData.phoneNo=this.phoneNo;
    this.sentData.totalBill=this.totalBill;
    this.sentData.payammount=this.payammount;
      this.router.navigateByUrl("/print-agreement-bill",{state:{sentdata:this.sentData,bills:this.bills}})
  }

  // (transectionId:any,accNo:any,payerId:any,ammount:any,transectionType:any,transectionStatus:any,purpose:any,date:any)
  newTransection:any;
  transection(){
    alert("transection work");
    // this.transectiondate=
    this.newTransection = new Transection(null,this.accNo,this.regid,this.totalBill,this.transectionType,this.transectionStatus,this.purpose,this.transectiondate);
    this.myservice.saveTransection(this.newTransection).subscribe(()=>{alert("Transection Save")});
  }


  // (accId:any,accountType:any,accNo:any,accountName:any,debit:any,credit:any,balance:any)
account:any;
  accUpdate(){
    this.account=new Accounts(null,this.accountType,this.accNo,this.accountName,this.debit,this.totalBill,this.balance);
    this.myservice.updateAccountBalance(this.account,this.ownerId).subscribe(()=>{alert("Accounts Updated")});
  } 
}
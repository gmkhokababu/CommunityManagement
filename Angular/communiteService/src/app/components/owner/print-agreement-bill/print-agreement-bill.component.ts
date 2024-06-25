import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-print-agreement-bill',
  templateUrl: './print-agreement-bill.component.html',
  styleUrls: ['./print-agreement-bill.component.css']
})
export class PrintAgreementBillComponent implements OnInit {
//===========================Constractor======================================
  constructor(private router:Router) { 
    this.getdata=this.router.getCurrentNavigation()?.extras.state?.["sentdata"];
    this.bills=this.router.getCurrentNavigation()?.extras.state?.["bills"];
    this.ownerId=this.getdata.ownerId;
    this.howsNumber=this.getdata.howsNumber;
    this.flatNumber=this.getdata.flatNumber;
    this.tenantName=this.getdata.tenantName;
    this.phoneNo=this.getdata.phoneNo;
    this.totalBill=this.getdata.totalBill;
    this.payammount=this.getdata.payammount;


    setTimeout(()=>{                           // <<<---using ()=> syntax
      window.print();
  }, 1000);
    setTimeout(()=>{                           // <<<---using ()=> syntax
      this.template="agreementPrint"
  }, 1500);
    setTimeout(()=>{                           // <<<---using ()=> syntax
      window.print();
  }, 2000);

  }
  template:any="billPrint";
  ngOnInit(): void {
  }


  
  //==================================tenent details part==========================
  getdata:any;

  //-----------------------------------------------------------------
  ownerId:any;
  howsNumber:any;
  flatNumber:any;
  tenantName:any;
  phoneNo:any;
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
  bills:any[]=[];
  bill:any={billdes:"",ammount:0};
  totalBill:any;
  payammount:any;
  paydate:any=new Date;


  //========================local variable===========================
 

 
  propertyDetails:any=[];
  


}

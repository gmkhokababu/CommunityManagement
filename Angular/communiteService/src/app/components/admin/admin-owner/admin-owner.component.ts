import { Component, OnInit } from '@angular/core';
import { Accounts } from 'src/app/model/accounts';
import { Owner } from 'src/app/model/owner';
import { ControllerService } from 'src/app/service/controller.service';

@Component({
  selector: 'app-admin-owner',
  templateUrl: './admin-owner.component.html',
  styleUrls: ['./admin-owner.component.css']
})
export class AdminOwnerComponent implements OnInit {

  ownerName:any;
  phoneNo:any;
  accNo:any;
  accountType:any="owner";
	accountName:any;
	debit:any=0;
	credit:any=0;
	balance:any=0; 

  constructor(private myservice:ControllerService) { }

  ngOnInit(): void {
  }
  owner:any;
  Save(){
    this.saveOwner();
    this.createAccount();
    this.getLastOwnerId();
  }

  saveOwner(){
    this.owner=new Owner(null,this.ownerName,this.phoneNo,this.accNo);
    this.myservice.saveOwner(this.owner).subscribe(()=>{
      alert("owner Save");
    })
  }

  account:any;
  createAccount(){
    this.account=new Accounts(null,this.accountType,this.accNo,this.accountName,this.debit,this.credit,this.balance);
    this.myservice.createAccount(this.account).subscribe(()=>{
      alert("Account Save")
    })
  }


Owners:any;
ownersId:any;
  getLastOwnerId(){
    this.myservice.getOwner().subscribe((x)=>{
      this.Owners=x;
      for(let i of this.Owners){
        this.ownersId=i.ownerId;
      }
      alert("Owners Id is : " +this.ownersId)
    })
  }

}

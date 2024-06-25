import { Component, OnInit } from '@angular/core';
import { Property } from 'src/app/model/property';
import { ControllerService } from 'src/app/service/controller.service';

@Component({
  selector: 'app-owner',
  templateUrl: './owner.component.html',
  styleUrls: ['./owner.component.css']
})
export class OwnerComponent implements OnInit {
  template:any="List Property";

  propertyType:any;
  flatNumber:any;
  howsNumber:any;
  ownerId:any;
  property:any;

  allproperty:any=[];

  constructor(private myservice:ControllerService) {
    this.getAllProperty();
   }

  ngOnInit(): void {
  }


//(propertyid:any,type:any,houseNo:any,flatNo:any,ownerId:any)
saveProperty(){
  this.property=new Property(null,this.propertyType,this.howsNumber,this.flatNumber,this.ownerId);
  this.myservice.saveproperty(this.property).subscribe(()=>{
    alert("Property Save")
  })
}
getAllProperty(){
  this.myservice.getproperty().subscribe((x)=>{
    this.allproperty=x;
  })
}




}

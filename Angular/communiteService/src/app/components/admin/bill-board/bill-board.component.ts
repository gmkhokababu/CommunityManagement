import { Component, OnInit } from '@angular/core';
import { AdvertisementCatagory } from 'src/app/model/advertisement-catagory';
import { AdvertisementProperty } from 'src/app/model/advertisement-property';
import { ServiceProperty } from 'src/app/model/service-property';
import { ControllerService } from 'src/app/service/controller.service';

@Component({
  selector: 'app-bill-board',
  templateUrl: './bill-board.component.html',
  styleUrls: ['./bill-board.component.css']
})
export class BillBoardComponent implements OnInit {

  constructor(private myservice:ControllerService) {
    this.getAllCatagory();
   }

  ngOnInit(): void {
  }


  service:any="Add Service Property";

  propertyName:any;
	rentPerMonth:any;
	servicecharge:any;
	catagory:any="Select Service Catagory";


  saveProperty:any;
  save(){
    this.saveProperty=new AdvertisementProperty(null,this.propertyName,this.rentPerMonth,this.servicecharge,this.catagory);
    this.myservice.saveAdvertisementProperty(this.saveProperty).subscribe(()=>{
      alert ("Property save!");
      this.propertyName="";
      this.rentPerMonth="";
      this.servicecharge="";
      this.catagory="Select Service Catagory";
    })
  }

  
  //==============================service Catagory==================================

  catagoryId:any;
	catagoryName:any;
  newCatagory:any;
  allcatagory:any=[];

  getAllCatagory(){
    this.myservice.getAdvertisementCatagory().subscribe((x)=>{
      this.allcatagory=x;
    });
  }

  saveCatagory(){
    let getcatagoryName= prompt("Type Catagory Name:");
    if(getcatagoryName != null){
      this.catagoryName=getcatagoryName;
      this.newCatagory=new AdvertisementCatagory(null,this.catagoryName);
      this.myservice.saveAdvertisementCatagory(this.newCatagory).subscribe(()=>{alert("New Catagory Added!")});
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
 
}

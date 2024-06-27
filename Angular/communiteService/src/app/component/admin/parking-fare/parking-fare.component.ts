import { Component, OnInit } from '@angular/core';
import { Parking } from 'src/app/model/parking';
import { ControllerService } from 'src/app/service/controller.service';

@Component({
  selector: 'app-parking-fare',
  templateUrl: './parking-fare.component.html',
  styleUrls: ['./parking-fare.component.css']
})
export class ParkingFareComponent implements OnInit {

  constructor(private myservice:ControllerService) { }

  ngOnInit(): void {
  }

  buildingNo:any;
  capacity:any;
  //constructor(parkingId:any,slotno:any,carType:any,fare:any,status:any)     parking slot booking
  buildingSlot:any;
  parkingId:any;
	slotno:any;
	carType:any;
	fare:any;
	status:any;
  parking:any;
  save(){
    this.buildingSlot=this.buildingNo;
    for(let i=0;i<this.capacity;i++){ 
      this.slotno=this.carType+"-"+this.buildingSlot.toString();
      this.status="available"
      this.parking=new Parking(null,this.slotno,this.carType,this.fare,this.status)
      this.myservice.saveParkingSlot(this.parking).subscribe();
      this.buildingSlot=this.buildingSlot+1;
    }
    alert("Parking Slot Created!")
  }
}

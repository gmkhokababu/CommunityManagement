export class ParkingFare {
    parkingId:any;
	slotno:any;
    carType:any;
	carNo:any;
    parkingDate:any;
    fare:any;
    constructor(parkingId:any,slotno:any,carType:any,carNo:any,parkingDate:any,fare:any){
        this.parkingId=parkingId;
        this.slotno=slotno;
        this.carType=carType;
        this.carNo=carNo;
        this.parkingDate=parkingDate;
        this.fare=fare;
    }
}

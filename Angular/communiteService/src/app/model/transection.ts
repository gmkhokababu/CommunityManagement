export class Transection {
    transectionId:any;
	accNo:any;
	payerId:any;
	ammount:any;
	transectionType:any;
	transectionStatus:any;
	purpose:any;
	date:any;
    constructor(transectionId:any,accNo:any,payerId:any,ammount:any,transectionType:any,transectionStatus:any,purpose:any,date:any){
        this.transectionId=transectionId;
        this.accNo=accNo;
        this.payerId=payerId;
        this.ammount=ammount;
        this.transectionType=transectionType;
        this.transectionStatus=transectionStatus;
        this.purpose=purpose;
        this.date=date;
    }
}

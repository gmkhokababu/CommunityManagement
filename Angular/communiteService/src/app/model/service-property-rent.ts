export class ServicePropertyRent {
    bookingId:any;
	servicePropertyid:any;
	bookingStart:any;
	bookingEnd:any;
	status:any;
	customerName:any;
	phoneNo:any;

    constructor(bookingId:any,servicePropertyid:any,bookingStart:any,bookingEnd:any,status:any,customerName:any,phoneNo:any){
        this.bookingId=bookingId;
        this.servicePropertyid=servicePropertyid;
        this.bookingStart=bookingStart;
        this.bookingEnd=bookingEnd;
        this.status=status;
        this.customerName=customerName;
        this.phoneNo=phoneNo;
    }
}

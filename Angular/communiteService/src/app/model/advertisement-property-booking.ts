export class AdvertisementPropertyBooking {
    adPropertyBookingId:any;
	adPropertyId:any;
	bookingStart:any;
	bookingEnd:any;
	status:any;
	customerName:any;
	phoneNo:any;
    constructor(adPropertyBookingId:any,adPropertyId:any,bookingStart:any,bookingEnd:any,status:any,customerName:any,phoneNo:any){
        this.adPropertyBookingId=adPropertyBookingId;
        this.adPropertyId=adPropertyId;
        this.bookingStart=bookingStart;
        this.bookingEnd=bookingEnd;
        this.status=status;
        this.customerName=customerName;
        this.phoneNo=phoneNo;
    }
}

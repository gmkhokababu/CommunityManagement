export class AdvertisementProperty {
    adPropertyId:any;
	propertyName:any;
	rentPerMonth:any;
	serviceCharge:any;
	catagory:any;

    constructor(adPropertyId:any,
        propertyName:any,
        rentPerMonth:any,
        serviceCharge:any,
        catagory:any
    ){

        this.adPropertyId=adPropertyId;
        this.propertyName=propertyName;
        this.rentPerMonth=rentPerMonth;
        this.serviceCharge=serviceCharge;
        this.catagory=catagory;
    }
}

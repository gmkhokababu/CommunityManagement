export class RentAgreement {

    agreementid:any;
	rentPerMonth:any;
	fixedDepo:any;
	serviceBill:any;
	utilityBill:any;
	houseNo:any;
	flatno:any;

    constructor(agreementid:any,rentPerMonth:any,fixedDepo:any,serviceBill:any,utilityBill:any,houseNo:any,flatno:any){
        this.agreementid=agreementid;
        this.rentPerMonth=rentPerMonth;
        this.fixedDepo=fixedDepo;
        this.serviceBill=serviceBill;
        this.utilityBill=utilityBill;
        this.houseNo=houseNo;
        this.flatno=flatno;
    }
}

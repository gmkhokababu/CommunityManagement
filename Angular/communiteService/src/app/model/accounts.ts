export class Accounts {
    accId:any;
	accountType:any;
	accNo:any;
	accountName:any;
	debit:any;
	credit:any;
	balance:any;
    constructor(accId:any,accountType:any,accNo:any,accountName:any,debit:any,credit:any,balance:any){
        this.accId=accId;
        this.accountType=accountType;
        this.accNo=accNo;
        this.accountName=accountName;
        this.debit=debit;
        this.credit=credit;
        this.balance=balance;
    }
}

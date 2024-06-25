import { ThisReceiver } from "@angular/compiler";

export class Tenant {
regid:any;
houseNo:any;
flatNo:any;
tenantName:any;
phoneNo:any;
familyMember:any;
 Occupation:any;
rentDate:any;
terminateDate:any;
status:any;
constructor(regid:any,houseNo:any,flatNo:any,tenantName:any,phoneNo:any,familyMember:any,Occupation:any,rentDate:any,terminateDate:any,status:any){
    this.regid=regid
    this.houseNo=houseNo;
    this.flatNo=flatNo;
    this.tenantName=tenantName;
    this.phoneNo=phoneNo;
    this.familyMember=familyMember;
    this.Occupation=Occupation;
    this.rentDate=rentDate;
    this.terminateDate=terminateDate;
    this.status=status;
}

}

import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Owner } from '../model/owner';
import { Property } from '../model/property';
import { RentalRegistration } from '../model/rental-registration';
import { RentAgreement } from '../model/rent-agreement';
import { Accounts } from '../model/accounts';
import { Transection } from '../model/transection';
import { ServiceProperty } from '../model/service-property';
import { ServiceCatagory } from '../model/service-catagory';
import { ServicePropertyRent } from '../model/service-property-rent';
import { AdvertisementCatagory } from '../model/advertisement-catagory';
import { AdvertisementProperty } from '../model/advertisement-property';

@Injectable({
  providedIn: 'root'
})
export class ControllerService {

  constructor(private http:HttpClient) { 

  }

  url:any="http://localhost:8080/";
//==============================owner==================================

//save owner
saveOwner(o:any):Observable<Owner>{
  this.url="http://localhost:8080/save-owner";
 return this.http.post<Owner>(this.url,o);
}
//Get All owner
getOwner():Observable<Owner>{
  this.url="http://localhost:8080/get-owners";
 return this.http.get<Owner>(this.url);
}




//============================== property==================================

//save property
saveproperty(p:any):Observable<Property>{
  this.url="http://localhost:8080/save-property";
 return this.http.post<Property>(this.url,p);
}

// get Property details by owner id
getPropertyByOwnerId(id:any):Observable<Property>{
  this.url="http://localhost:8080/get-owner/"+id;
 return this.http.get<Property>(this.url);
}

//==============================Get property==================================


getproperty():Observable<Property>{
  this.url="http://localhost:8080/get-property";
 return this.http.get<Property>(this.url);
}



//==================================================Rent Registration==========================================
registrationRent(r:any):Observable<RentalRegistration>{
  this.url="http://localhost:8080/rent-registration";
 return this.http.post<RentalRegistration>(this.url,r);
}






//==================================================Rent Agreement==========================================
makerentAgreement(r:any):Observable<RentAgreement>{
  this.url="http://localhost:8080/rent-agreement";
 return this.http.post<RentAgreement>(this.url,r);
}


//==================================================Accounts & Transection ==========================================
//create account
createAccount(a:any):Observable<Accounts>{
  this.url="http://localhost:8080/create-account";
 return this.http.post<Accounts>(this.url,a);
}

//update account
updateAccountBalance(accounts:any,id:any){
  this.url="http://localhost:8080/update-account/"+id;
 return this.http.put<Accounts>(this.url,accounts);
}

//get Accounts by type
getAllAccountsByType(type:any):Observable<Accounts>{
  this.url="http://localhost:8080/get-accounts-by-type/"+type;
 return this.http.get<Accounts>(this.url);
}

//save transection
saveTransection(a:any){
  this.url="http://localhost:8080/save-transection";
 return this.http.post<Transection>(this.url,a);
}



//=================================================Admin property============================================

//save property
saveAdminProperty(p:any):Observable<any>{
  this.url="http://localhost:8080/admin-property-save";
  return this.http.post<ServiceProperty>(this.url,p);
}

// get all property by catagory
getAllAdminPropertyByCatagory(catagory:any):Observable<ServiceProperty>{
  this.url="http://localhost:8080/get-admin-property-by-catagory/"+catagory;
 return this.http.get<ServiceProperty>(this.url);
}


//save property catagory
saveAdminPropertycatagory(p:any):Observable<ServiceCatagory>{
  this.url="http://localhost:8080/admin-property-catagory-save";
  return this.http.post<ServiceCatagory>(this.url,p);
}


//get property catagory
getAdminPropertyCatagory():Observable<ServiceCatagory>{
  this.url="http://localhost:8080/get-admin-property-catagory";
 return this.http.get<ServiceCatagory>(this.url);
}

//save admin property booking 
saveAdminPropertyBooking(p:any):Observable<ServicePropertyRent>{
  this.url="http://localhost:8080/admin-property-booking-save";
  return this.http.post<ServicePropertyRent>(this.url,p);
}


//=============================================Advertisement section===============================================

//save advertisement catagor
saveAdvertisementCatagory(p:any):Observable<AdvertisementCatagory>{
  this.url="http://localhost:8080/advertisement-catagory-save";
  return this.http.post<AdvertisementCatagory>(this.url,p);
}

//get advertisement catagor
getAdvertisementCatagory():Observable<AdvertisementCatagory>{
  this.url="http://localhost:8080/advertisement-catagory-gate";
  return this.http.get<AdvertisementCatagory>(this.url);
}

//save advertisement property
saveAdvertisementProperty(p:any):Observable<AdvertisementProperty>{
  this.url="http://localhost:8080/advertisement-property-save";
  return this.http.post<AdvertisementProperty>(this.url,p);
}


}

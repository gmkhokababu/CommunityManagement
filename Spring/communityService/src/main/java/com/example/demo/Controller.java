package com.example.demo;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.da.AccountsDA;
import com.example.demo.da.AdvertisementPropertyDA;
import com.example.demo.da.ParkingBookingDA;
import com.example.demo.da.ParkingDA;
import com.example.demo.da.PropertyDA;
import com.example.demo.da.RentServicePropertyBookingDA;
import com.example.demo.entity.Accounts;
import com.example.demo.entity.AdvertiseCatagory;
import com.example.demo.entity.AdvertisementProperty;
import com.example.demo.entity.AdvertisementPropertyBooking;
import com.example.demo.entity.Owner;
import com.example.demo.entity.Parking;
import com.example.demo.entity.ParkingBooking;
import com.example.demo.entity.Property;
import com.example.demo.entity.RentServiceProperty;
import com.example.demo.entity.RentServicePropertyBooking;
import com.example.demo.entity.RentalAgreement;
import com.example.demo.entity.RentalRegistration;
import com.example.demo.entity.ServiceCatagory;
import com.example.demo.entity.Transection;
import com.example.demo.repo.AccountsRepo;
import com.example.demo.repo.AdvertiseCatagoryRepo;
import com.example.demo.repo.AdvertisementPropertyBookingRepo;
import com.example.demo.repo.AdvertisementPropertyRepo;
import com.example.demo.repo.OwnerRepo;
import com.example.demo.repo.ParkingBookingRepo;
import com.example.demo.repo.ParkingRepo;
import com.example.demo.repo.PropertyRepo;
import com.example.demo.repo.RentServicePropertyBookingRepo;
import com.example.demo.repo.RentServicePropertyRepo;
import com.example.demo.repo.RentalAgreementRepo;
import com.example.demo.repo.RentalRepo;
import com.example.demo.repo.ServiceCatagoryRepo;
import com.example.demo.repo.TransectionRepo;

@RestController
@CrossOrigin("*")
public class Controller {
	@Autowired
	OwnerRepo ownerrepo;
	
	@Autowired
	PropertyRepo propertyrepo;
	
	@Autowired
	RentalAgreementRepo rentalAgreementRepo;
	
	@Autowired
	RentalRepo rentalRepo;
	
	@Autowired
	AccountsRepo accountsRepo;
	
	@Autowired
	TransectionRepo transectionRepo;
	
	@Autowired
	RentServicePropertyRepo rentServicePropertyRepo;
	
	@Autowired
	ServiceCatagoryRepo serviceCatagoryRepo;
	
	@Autowired
	RentServicePropertyBookingRepo rentServicePropertyBookingRepo;
	
	@Autowired
	AdvertiseCatagoryRepo advertiseCatagoryRepo;
	
	@Autowired
	AdvertisementPropertyRepo advertisementPropertyRepo;
	
	@Autowired
	AdvertisementPropertyBookingRepo advertisementPropertyBookingRepo;
	
	@Autowired
	ParkingRepo parkingRepo;
	
	@Autowired
	ParkingBookingRepo parkingBookingRepo;
	
	//=================================Owner================================
	@PostMapping("/save-owner")
	public void saveOwner(@RequestBody Owner o) {
		System.out.println(o);
		ownerrepo.save(o);
	}
	@GetMapping("/get-owners")
	public Iterable<Owner> getOwners(){
		Iterable<Owner> all = ownerrepo.findAll();
		return all;
	}
	
	
	
	//=========================================Property===================================
	@PostMapping("/save-property")
	public void saveProperty(@RequestBody Property p) {
		System.out.println(p);
		propertyrepo.save(p);
		
	}
	@GetMapping("/get-owner/{id}")
	public List<Property> getOwnerPropertyDetailsById(@PathVariable int id){
		PropertyDA da=new PropertyDA();
		return da.getPropertyDataById(id);
	}
	
	@GetMapping("/get-property")
	public Iterable<Property> getAllProperty() {
		
		 Iterable<Property> all = propertyrepo.findAll();
		 return all;
		
	}
	
	
	//===================================Property rentel issu by owner=========================
	
	@PostMapping("/rent-agreement")
	public void saveRentAgreement(@RequestBody RentalAgreement RA) {
		System.out.println("Fixed Depo=> "+RA.getFixedDepo());
		rentalAgreementRepo.save(RA);
	}
	
	
	
		@PostMapping("/rent-registration")
		public void saveRentRegistration(@RequestBody RentalRegistration RA) {
			System.out.println("Tenant Name=> "+RA.getTenantName());
			System.out.println("Tenant Occupation=> "+RA.getOccupation());
			rentalRepo.save(RA);
		}
	
	
		
		
		//================================Accounts & Transection======================
		
		//created accounts
		@PostMapping("/create-account")
		public void createAccount(@RequestBody Accounts RA) {
			
			accountsRepo.save(RA);
			System.out.println("Account created!");
		}
		
		//update accounts
		@PutMapping("/update-account/{id}")
		public void updateAccount(@RequestBody Accounts RA, @PathVariable int id) {
			System.out.println("Accounts=> "+RA);
			System.out.println("id=> "+id);
			AccountsDA da=new AccountsDA();
			da.updateAccounts(id, RA);
			
		}
		
		//get accounts by type
		@GetMapping("/get-accounts-by-type/{accountType}")
		public List<Accounts> accountListByType(@PathVariable String accountType){
			AccountsDA da=new AccountsDA();
			return da.getAllAccountsByType(accountType);
		}
		
		
		@PostMapping("/save-transection")
		public void createAccount(@RequestBody Transection RA) {
			java.util.Date utilDate=new java.util.Date();
			java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
			RA.setDate(sqlDate);
			System.out.println("Transection=> "+RA);
			System.out.println("Transection=> "+RA.getDate());
			transectionRepo.save(RA);
			System.out.println("Transection Saved!");
		}
		
		
		
		//=======================Report========================================
//		String reports;
//		@GetMapping(value="/reports/{formate}")
//		public String exportreport(@PathVariable String formate) {
//			String path="C:/reports/";
//			String reportpath="";
//			try {
//				 
//				List<Owner> allOwnerData=(List<Owner>) ownerrepo.findAll();
//			}catch(Exception e) {
//				System.out.println(e);
//			}
//			return reports;
//		}
		
		
		//===============================Rental service Property==============================
		
		@PostMapping("/admin-property-save")
		public void saveAdminProperty(@RequestBody RentServiceProperty P) {
			rentServicePropertyRepo.save(P);
		}
		
		
		//=================================== Save Admin property catagory ===================
		@PostMapping("/admin-property-catagory-save")
		public void saveAdminPropertyCatagory(@RequestBody ServiceCatagory P) {
			serviceCatagoryRepo.save(P);
		}
		
		//=================================== get Admin property catagory ===================
		@GetMapping("/get-admin-property-catagory")
		public Iterable<ServiceCatagory> getAllAdminPropertyCatagory() {
			
			 Iterable<ServiceCatagory> all = serviceCatagoryRepo.findAll();
			 return all;
			
		}
		
		//=============================get admin property by catagory============================
		
	@GetMapping("/get-admin-property-by-catagory/{catagory}")
	public List<RentServiceProperty> getAdminPropertyByCatagory(@PathVariable String catagory){
		RentServicePropertyBookingDA da= new RentServicePropertyBookingDA();
		return da.getallPropertyByCatagory(catagory);
	}
	
	
	//======================Rental service property booking=======================================
	
	@PostMapping("/admin-property-booking-save")
	public void saveAdminPropertyBooking(@RequestBody RentServicePropertyBooking P) {
		rentServicePropertyBookingRepo.save(P);
	}
		
	//get Booking 
		@GetMapping("/getbookigproperty")
		public Iterable<RentServicePropertyBooking> getbookingproperty() {
			
			 Iterable<RentServicePropertyBooking> all = rentServicePropertyBookingRepo.findAll();
			 return all;
			
		}
		
	
	
	//===============================Advertise ment===================================
	
	//save advertisement catagory
//	advertiseCatagoryRepo
	@PostMapping("/advertisement-catagory-save")
	public void saveAdvertisementCatagory(@RequestBody AdvertiseCatagory A) {
		advertiseCatagoryRepo.save(A);
	}
	
	//get Advertisement catagory
	@GetMapping("/advertisement-catagory-gate")
	public Iterable<AdvertiseCatagory> getAdvertisementCatagory() {
		
		 Iterable<AdvertiseCatagory> all = advertiseCatagoryRepo.findAll();
		 return all;
		
	}
	

	//get Advertisement catagory
	@GetMapping("/bookingadvertisement")
	public Iterable<AdvertiseCatagory> allbookingadvertisement() {
		
		 Iterable<AdvertiseCatagory> all = advertiseCatagoryRepo.findAll();
		 return all;
		
	}
	
	
	
	//save advertise property
//	advertisementPropertyRepo
	@PostMapping("/advertisement-property-save")
	public void saveAdvertisementProperty(@RequestBody AdvertisementProperty A) {
		advertisementPropertyRepo.save(A);
	}
	
	
	//booked advertise
	//advertisementPropertyBookingRepo
	@PostMapping("/bookedadvertise")
	public void bookedAdvertise(@RequestBody AdvertisementPropertyBooking A) {
		advertisementPropertyBookingRepo.save(A);
	}
	
	
	//get advertisebooking
	@GetMapping("/getbookigadvertise")
	public Iterable<AdvertisementPropertyBooking> getbookingadvertise() {
		
		 Iterable<AdvertisementPropertyBooking> all = advertisementPropertyBookingRepo.findAll();
		 return all;
		
	}
	
	//=============================get advertisement property by catagory============================
	
		@GetMapping("/get-advertisement-property-by-catagory/{catagory}")
		public List<AdvertisementProperty> getAdvertisementPropertyByCatagory(@PathVariable String catagory){
			AdvertisementPropertyDA da= new AdvertisementPropertyDA();
			return da.getallAdvertisementPropertyByCatagory(catagory);
		}
	
	
		//=============================Parking section============================================
		
		//save advertise property
//		parkingRepo
		@PostMapping("/save-parking-slot")
		public void saveParkingSlot(@RequestBody Parking p) {
			parkingRepo.save(p);
		}
		
		//get all parking slot by car type
		@GetMapping("/get-parking-slot-by-car-type/{catagory}")
		public List<Parking> getParkingSlotByCarType(@PathVariable String catagory){
			ParkingDA da= new ParkingDA();
			return da.getAllParkingSlotByCarType(catagory);
		}
		
		//update status
		@GetMapping("/update-parking-status/{slotNo}/{status}")
		public void updateStatus(@PathVariable String slotNo, @PathVariable String status){
			ParkingDA da= new ParkingDA();
			da.updateStatus(status, slotNo);
		}
		
		
		//========================parking booking==================================
		
		
		//save advertise property
//		parkingBookingRepo
		@PostMapping("/save-parking-booking")
		public void saveParkingBooking(@RequestBody ParkingBooking p) {
			parkingBookingRepo.save(p);
		}
		//getAllParkingCarByDateCarNo
		//get all parking slot by car type
				@GetMapping("/get-parking-by-date-carno/{date}/{carno}")
				public List<ParkingBooking> getAllParkingCarByDateCarNo(@PathVariable Date date, @PathVariable String carno){
					System.out.println("date=>"+date+"\n carno"+carno);
					ParkingBookingDA da= new ParkingBookingDA();
//					System.out.println(da.getAllParkingCarByDateCarNo(carno,date));
					return da.getAllParkingCarByDateCarNo(carno,date);
				}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}

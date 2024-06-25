package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.RentalAgreement;

@Repository
public interface RentalAgreementRepo extends CrudRepository<RentalAgreement, Integer> {

	
}

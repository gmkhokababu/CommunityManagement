package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.RentServicePropertyBooking;


@Repository
public interface RentServicePropertyBookingRepo extends CrudRepository<RentServicePropertyBooking, Integer> {

}

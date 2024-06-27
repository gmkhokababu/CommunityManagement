package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.ParkingBooking;

@Repository
public interface ParkingBookingRepo extends CrudRepository<ParkingBooking, Integer>{

}

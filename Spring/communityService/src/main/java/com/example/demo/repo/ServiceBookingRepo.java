package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.ServiceBooking;

@Repository
public interface ServiceBookingRepo extends CrudRepository<ServiceBooking, Integer>{

}

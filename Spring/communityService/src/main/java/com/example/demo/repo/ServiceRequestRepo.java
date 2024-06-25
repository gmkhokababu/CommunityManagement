package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.example.demo.entity.ServiceRequest;

@Repository
public interface ServiceRequestRepo extends CrudRepository<ServiceRequest, Integer> {

}

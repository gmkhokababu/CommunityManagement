package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.example.demo.entity.ServiceBill;
@Repository
public interface ServiceBillRepo extends CrudRepository<ServiceBill, Integer> {

}

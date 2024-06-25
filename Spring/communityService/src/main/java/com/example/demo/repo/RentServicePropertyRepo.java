package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.example.demo.entity.RentServiceProperty;
@Repository
public interface RentServicePropertyRepo extends CrudRepository<RentServiceProperty, Integer>{

}

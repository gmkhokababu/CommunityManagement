package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.example.demo.entity.Property;
@Repository
public interface PropertyRepo extends CrudRepository<Property, Integer>  {

}

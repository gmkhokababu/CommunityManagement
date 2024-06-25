package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.example.demo.entity.Transection;

@Repository
public interface TransectionRepo extends CrudRepository<Transection, Integer> {

}

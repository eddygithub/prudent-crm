package com.prudent.crm.persistent.mongo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.prudent.crm.domain.Customer;

public interface CustomerRepository extends MongoRepository<Customer, String> {

	List<Customer> findByFirstName(String firstname);
	
	List<Customer> findByLastName(String lastname);
}

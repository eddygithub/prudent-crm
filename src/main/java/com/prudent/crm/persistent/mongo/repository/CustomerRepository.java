package com.prudent.crm.persistent.mongo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.prudent.crm.model.Customer;

public interface CustomerRepository extends MongoRepository<Customer, String> {

	List<Customer> findByFirstName(String firstname);
	
	List<Customer> findByLastName(String lastname);
	
	Optional<Customer> findBySsn(int ssn);
	
	List<Customer> findByLastNameAndFirstName(String lastName, String firstName);
}

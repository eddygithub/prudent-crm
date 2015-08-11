package com.prudent.crm.persistent.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prudent.crm.model.Customer;
import com.prudent.crm.persistent.mongo.repository.CustomerRepository;
import com.prudent.crm.persistent.services.DataStoreService;

@Service("mongoDataStore")
public class MongoDataStoreServiceImpl implements DataStoreService {

	@Autowired
	private CustomerRepository customerRepository;
	
	public Optional<Customer> findBySSN(int ssn){
		return customerRepository.findBySsn(ssn);
	}
	
	@Override
	public List<Customer> getPersons() {
		return customerRepository.findAll();
	}

	@Override
	public void storePerson(Customer person) {
		customerRepository.save(person);
	}

	@Override
	public void deletePerson(Customer person) {
		customerRepository.delete(person);
	}
	
	@Override
	public List<Customer> findByLastNameAndFirstName(String lastName,
			String firstName) {
		return null;
	}

}

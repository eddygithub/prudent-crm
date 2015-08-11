package com.prudent.crm.persistent.services;

import java.util.List;
import java.util.Optional;

import com.prudent.crm.model.Customer;

public interface DataStoreService {
	public List<Customer> getPersons();

	public void storePerson(Customer person);

	public void deletePerson(Customer person);
	
	public Optional<Customer> findBySSN(int ssn);
	
	public List<Customer> findByLastNameAndFirstName(String lastName, String firstName);
}

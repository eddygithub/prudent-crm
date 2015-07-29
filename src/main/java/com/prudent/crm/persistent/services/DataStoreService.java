package com.prudent.crm.persistent.services;

import java.util.List;

import com.prudent.crm.domain.Customer;

public interface DataStoreService {
	public List<Customer> getPersons();

	public void storePerson(Customer person);

	public void deletePerson(Customer person);
}

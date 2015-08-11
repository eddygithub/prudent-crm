package com.prudent.crm.persistent.services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.prudent.crm.model.Customer;
import com.prudent.crm.persistent.services.DataStoreService;

@Service("inMemoryDataStore")
public class InMemoryDataStoreServiceImpl implements DataStoreService {
	private List<Customer> personList = new ArrayList<Customer>();

	// TODO only use for testing
	@PostConstruct
	public void init() {
		Customer customer = new Customer();
		customer.setSsn(123);
		customer.setFirstName("Tester2");
		customer.setLastName("Ongoing");
		personList.add(customer);
		
		Customer customer2 = new Customer();
		customer2.setFirstName("Tester1");
		customer2.setLastName("Ongoing");
		customer2.setSsn(456);
		personList.add(customer2);
	}

	@Override
	public List<Customer> getPersons() {
		return personList;
	}

	@Override
	public void storePerson(Customer person) {
		personList.add(person);
	}

	@Override
	public void deletePerson(Customer person) {
		personList.remove(person);
	}

	@Override
	public Optional<Customer> findBySSN(int ssn) {
		return personList.stream().filter(p -> p.getSsn() == ssn).findFirst();
	}

	@Override
	public List<Customer> findByLastNameAndFirstName(String lastName,
			String firstName) {
		
		return personList.stream().filter(
				p -> {
					return (p.getLastName().equalsIgnoreCase(lastName) && p
							.getFirstName().equalsIgnoreCase(firstName));
				}).collect(Collectors.toList());
		}
}

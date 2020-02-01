package com.transactionManagement;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TransactionManagementMain {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("Application.xml");

		CustomerManagement customerManager = ctx.getBean("customerManager",
				CustomerManagementImpl.class);

		Customer cust = createDummyCustomer();
		customerManager.createCutomer(cust);

		ctx.close();
	}

	private static Customer createDummyCustomer() {
		Customer customer = new Customer();
		customer.setId(2);
		customer.setName("Pankaj");
		Address address = new Address();
		address.setId(2);
		address.setCountry("India");
		address.setAddress("Albany Dr, San Jose, CA 95129");
		customer.setAddress(address);
		return customer;
	}

	

}

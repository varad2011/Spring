package com.transactionManagement;

import org.springframework.transaction.annotation.Transactional;

public class CustomerManagementImpl implements CustomerManagement {
	
	private CustomerDao customerDao;
	
	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}
	
	@Transactional
	public void createCutomer(Customer customer) {
		customerDao.create(customer);
	}

}

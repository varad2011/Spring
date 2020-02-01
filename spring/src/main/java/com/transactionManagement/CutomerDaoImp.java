package com.transactionManagement;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class CutomerDaoImp implements CustomerDao{
	private DataSource dataSource;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public void create(Customer customer) {
		
		String quaryCutomer = "insert into Customer (id, name) values (?,?)";
		String quaryAddress = "insert into Address (id, address,country) values (?,?,?)";
		JdbcTemplate template = new JdbcTemplate();
		template.update(quaryCutomer,new Object[] { customer.getId(), customer.getName() });
		System.out.println("insert into customer table successfully ");
		template.update(quaryAddress, new Object[] { customer.getId(), customer.getAddress().getAddress(), customer.getAddress().getCountry() });
		System.out.println("insert into address table successfully");
	}
}

package com.anno.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

@Repository(value="customerDAOJdbcSupportImpe")
public class CustomerDAOJdbcSupportImpe extends JdbcDaoSupport implements CustomerDAO {
	
	@Autowired
	public CustomerDAOJdbcSupportImpe(JdbcTemplate jdbcTemplate) {
		setJdbcTemplate(jdbcTemplate);
	}
	@Override
	public int insert(Customer c) {
		int row=0;
		String query="insert into customers values(?,?)";
		row=getJdbcTemplate().update(query,c.getCustomerId(),c.getCustomerName());
		return row;
	}

	@Override
	public int update(int CustomerId) {
		int row=0;
		String query="update customers set name='Rahul Sharma' where id=?";
		row=getJdbcTemplate().update(query,CustomerId);
		return row;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		String query="delete from customers where id=?";
		int row=getJdbcTemplate().update(query,id);
		if(row>0)
			return 1;
		return 0;
	}
	
	
}
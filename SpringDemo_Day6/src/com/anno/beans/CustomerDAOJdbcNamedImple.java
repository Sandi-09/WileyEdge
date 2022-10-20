package com.anno.beans;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository(value="customerDAOJdbcNamedImple")
public class CustomerDAOJdbcNamedImple implements CustomerDAO {
	
	@Autowired
	NamedParameterJdbcTemplate namedTemp;
	
	@Override
	public int insert(Customer c) {
		int row=0;
		String query="insert into customers values(:customerId,:customerName)";
		Map<String,Object> map = new HashMap<>();
		map.put("customerId",c.getCustomerId());
		map.put("customerName", c.getCustomerName());
		row=namedTemp.update(query,map);
		return row;
	}

	@Override
	public int update(int cid) {
		// TODO Auto-generated method stub
		int row=0;
		String query="update customers set customerName='Ramesh sippy' where id=:cid";
		Map<String,Object> map = new HashMap<>();
		//map.put("cname", c.getName());
		map.put("cid",cid);
		row=namedTemp.update(query,map);
		return row;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		String query="delete from customers where id=:id";
		Map<String,Object> map = new HashMap<>();
		map.put("id", id);
		int row=namedTemp.update(query,map);
		if(row>0)
			return 1;
		return 0;
	}
}
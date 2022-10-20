package com.anno.beans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository(value="customerDAOImpl")
public class CustomerDAOImpl implements CustomerDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public int insert(Customer customer) {
		int rows=0;
		String sql="insert into customers value(?,?)";
		rows=jdbcTemplate.update(sql, customer.getCustomerId(), customer.getCustomerName() );
		return rows;
		
	}

	@Override
	public int update(int customerId) {
		// TODO Auto-generated method stub
		int rows=0;
		String sql = "update customers SET customerName='Don Smith' where id=?";
		rows=jdbcTemplate.update(sql,customerId);
		return rows;
	}

	@Override
	public int delete(int id1) {
		// TODO Auto-generated method stub
		return 0;
	}

}

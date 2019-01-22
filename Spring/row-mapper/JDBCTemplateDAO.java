package com.spring.practice;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.sql.ResultSet;  
import java.sql.SQLException;  
import java.util.ArrayList;  
import java.util.List;  
import org.springframework.dao.DataAccessException;  
import org.springframework.jdbc.core.JdbcTemplate;  
import org.springframework.jdbc.core.ResultSetExtractor;  
import org.springframework.jdbc.core.RowMapper;  

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.stereotype.Component;

@Component(jdbcTemplate)
public class JDBCTemplateDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	public void setTemplate(JdbcTemplate template) {  
	    this.jdbcTemplate = template;  
	}  
	  
	public List<Driver> getAllDriverRowMapper(){  
		 return jdbcTemplate.query("select * from driver_det",new RowMapper<Driver>(){  
			 
			 public Driver mapRow(ResultSet rs, int rownumber) throws SQLException {  
		        Driver e=new Driver();  
		        e.setDriverId(rs.getInt(1));
		        e.setDriverName(rs.getString(2));  
		        
		        return e;  
		    }  
		 }); 
	}
	
	public int saveDriver(Driver driver) {
		
		String query="insert into driver_det values ("+driver.getDriverId()+",'"+driver.getDriverName()+"')";
		return jdbcTemplate.update(query);
		
	}
	


}

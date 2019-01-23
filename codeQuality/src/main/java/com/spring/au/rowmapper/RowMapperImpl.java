package com.spring.au.rowmapper;



import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.au.model.Student;

public class RowMapperImpl {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<Student> getAllStudentsRowMapper() {
		return jdbcTemplate.query("select * from student", new RowMapper<Student>() {

			/* (non-Javadoc)
			 * @see org.springframework.jdbc.core.RowMapper#mapRow(java.sql.ResultSet, int)
			 */
			public Student mapRow(ResultSet rs, int rownumber) throws SQLException {
				Student e = new Student();
				e.setStudentId(rs.getInt("id"));
				e.setStudentName(rs.getString("name"));
				return e;
			}
		});
	}
}
package com.spring.jdbc.dao;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.entities.Student;
public class StudentDaoImpl implements StudentDao {
	
	 private JdbcTemplate jdbcTemplate;
     public int insert(Student student)
     {
    	 String query="insert into student(id,name,city) values(?,?,?)";
    			 
    	 int r=this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
    	 
    	 return r;
     }
     public int Change(Student student)
     {
    	 String query="update student set name=?,city=? where id=?"; //order should be valid in query and update method
    	 
    	 int r=this.jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
    	 
		return r;
    	 
     }
     public int Delete(int StudentId) {
 		String query="delete from student where id=?";
 		
 		int r=this.jdbcTemplate.update(query,StudentId);
 		return 0;
 	}
     
 	public Student getStudent(int studentId) {
 	    
 		String query="select * from student where id=?";
 		
 		RowMapper<Student> rowMapper=new RowMapperImpl();
 		
 		Student student=this.jdbcTemplate.queryForObject(query, rowMapper,studentId);
 		return student;
 	}
 	
	public List<Student> getAllStudent() {
        String query="select * from student";
 		
 		RowMapper<Student> rowMapper=new RowMapperImpl();
 		
 		List<Student> students=this.jdbcTemplate.query(query, rowMapper);
 		return students;
	}
     
     
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	
	
	
}

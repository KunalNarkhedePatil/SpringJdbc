package com.spring.jdbc;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;

import com.spring.jdbc.JavaConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
//        String config_loc="/com/spring/jdbc/Config.xml";
//        ApplicationContext context=new ClassPathXmlApplicationContext(config_loc);
        
        
         ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
		
//        
        StudentDao studentDao=context.getBean("studentDao",StudentDao.class);
        /*
         -------------------------------------------
        Student student=new Student();
        
        student.setId(501);
        student.setName("Pravin");
        student.setCity("Nashik");
        
        
        int result =studentDao.insert(student);
        System.out.println("Number of record inserted:"+result);
        --------------------------------------------------
        */
        
        //Update
        
//        Student student=new Student();
//        
//        student.setId(101);
//        student.setName("Prasad");
//        student.setCity("Pimpri");
//        
//        int result=studentDao.Change(student);
//        
//        System.out.println("Data changed"+result);
        
        //Delete
        
//        Student student=new Student();
//        
//        int result=studentDao.Delete(501);
//        
//        System.out.println("Recored deleted"+result);
        
        
          //Display One Object
        
//        Student student=studentDao.getStudent(203);
//        System.out.println(student);
        
        //Display All Object
        
        
        List<Student>  students=studentDao.getAllStudent();
        
        for(Student s:students)
        {
        	System.out.println(s);
        }
    }
}

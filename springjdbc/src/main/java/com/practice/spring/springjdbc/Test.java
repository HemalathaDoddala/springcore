package com.practice.spring.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {

	public static void main(String[] args) {
ApplicationContext context=new ClassPathXmlApplicationContext("com/practice/spring/springjdbc/Config.xml");
JdbcTemplate jdbctemplate = (JdbcTemplate)context.getBean("JdbcTemplate");
String sql="insert into Employee values(?,?,?)";
int result = jdbctemplate.update(sql, 1,"Hema", "Latha");
System.out.println("Number of records inserted are : "+result);
	}

}

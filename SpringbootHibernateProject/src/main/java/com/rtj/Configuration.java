package com.rtj;
import javax.sql.DataSource;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import com.rtj.Employee;


@org.springframework.context.annotation.Configuration
public class Configuration {
	
	  @Autowired DataSource dataSource;
	  
	  @Bean public LocalSessionFactoryBean sessionFactory() {
	  LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
	  sessionFactory.setDataSource(dataSource);
	  sessionFactory.setAnnotatedClasses(Employee.class); return sessionFactory; }
	 

}

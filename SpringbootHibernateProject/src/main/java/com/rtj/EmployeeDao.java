package com.rtj;



import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class EmployeeDao {
	
	  @Autowired SessionFactory sessionFactory;
	 
	Employee getEmployees(){
		//Employee e=(Employee)sessionFactory.getCurrentSession().load(Employee.class, 1);
		//Employee e= sessionFactory.openSession().load(Employee.class, 1);

		Employee e= sessionFactory.openSession().get(Employee.class, 1);
		
	return e;
	
		
	}

}

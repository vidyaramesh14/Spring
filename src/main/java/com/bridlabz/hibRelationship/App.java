package com.bridlabz.hibRelationship;

import java.io.File;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bridgelabz.Hibernate.Alian;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Laptop laptop=new Laptop();
		laptop.setLid(101);
		laptop.setLname("Dell");
	
		Student stu=new Student();
		stu.setRollno(1);
		stu.setMarks(77);
		stu.setName("vidya");
		//stu.setLaptop(laptop); //for onetoone relationship
		stu.getLaptop().add(laptop);//for onetomany 1 student have many laptop
		File file = new File("/home/admin1/Desktop/vidya/Hibernate/src/main/java/com/bridgelabz/Hibernate/hibernate1.cfg.xml");
		
		 
	    //it is used to bootstrapping the hibernate.
	    Configuration con=new Configuration().configure(file).addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
	       
	    //it is used to create the session
	    @SuppressWarnings("deprecation")
		SessionFactory sf=con.buildSessionFactory();
	      
	    //Session it is a runtime interface b/w java application and hibernate.
	    Session session=sf.openSession();
	    Transaction tx=session.beginTransaction();
	    session.save(laptop);
	    session.save(stu);
	    tx.commit();
	}

}

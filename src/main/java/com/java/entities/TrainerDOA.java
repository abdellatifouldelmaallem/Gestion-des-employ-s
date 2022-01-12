package com.java.entities;

import org.hibernate.*;
import org.hibernate.cfg.*;

public class TrainerDOA {

	public static void main(String[] args) {
		
          try{
        	  Configuration cfg = new Configuration();
        	  cfg.configure("hibernate.cfg.xml");
        	  SessionFactory sessionFactory = cfg.buildSessionFactory();
        	    Session session = sessionFactory.openSession();
        	    Transaction tx = session.beginTransaction();
        	    
        	    Trainer obj = new Trainer();
        	    obj.setFname("abdellatif");
        	    obj.setLname("ouldelmaallem");
        	    obj.setEmial("abdellatif@gmail.com");
        	    obj.setPhone(0664534262);
        	    session.save(obj);
        	    tx.commit();
        	    session.close();
        	    System.out.println("save successfuly");
          }
          catch(Exception ex) {
        	  System.out.println(ex);
          }
	}

}

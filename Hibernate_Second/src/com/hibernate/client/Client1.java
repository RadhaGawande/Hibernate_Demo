package com.hibernate.client;
import java.sql.Date;
//import java.util.Scanner;
import org.hibernate.*;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.hibernate.model.Product;
public class Client1 {
	public static void main(String[] args) {
		try{
			Configuration config=new Configuration().configure();
			ServiceRegistry registry=new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
			SessionFactory factory=config.buildSessionFactory(registry);
			Session session = factory.getCurrentSession();
			Transaction txn = session.beginTransaction();
			//code,name,price,brand,manufacturingDate
			//Save method
			Product p1 = new Product();
			p1.setP1Code(200);
			p1.setP1Name("IPhone");
			p1.setP1Price(50000);
			p1.setP1Brand("Apple");
			p1.setManufacturingDate(Date.valueOf("2021-07-28")); 
			session.save(p1);
			txn.commit();
			System.out.println("Done!!");
		} catch (HibernateException e) {
			e.printStackTrace();
		}		

	}
}

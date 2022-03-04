package com.hibernate.client;
import java.util.Scanner;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import com.hibernate.model.Product;
public class Client3 {
	public static void main(String[] args) {
		try{
			Configuration config=new Configuration().configure();
			ServiceRegistry registry=new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
			SessionFactory factory=config.buildSessionFactory(registry);
			Session session = factory.getCurrentSession();
			Transaction txn = session.beginTransaction();
			//delete an existing record
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Product code=");
			int code=sc.nextInt();
			Product p=(Product) session.get(Product.class,code);
			if(p!=null)
				session.delete(p);
			else
				System.out.println("Record Not FOund!!");
			txn.commit();
			System.out.println("Done!!");
		} catch (HibernateException e) {
			e.printStackTrace();
		}				
}
}

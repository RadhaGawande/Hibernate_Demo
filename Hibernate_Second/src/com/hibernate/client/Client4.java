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
public class Client4 {
	public static void main(String[] args) {
		try{
			Configuration config=new Configuration().configure();
			ServiceRegistry registry=new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
			SessionFactory factory=config.buildSessionFactory(registry);
			Session session = factory.getCurrentSession();
			Transaction txn = session.beginTransaction();
			//code,name,price,brand,manufacturingDate
			//update an existing record(insert)
			    Scanner sc=new Scanner(System.in);
				System.out.println("Enter Product code=");
				int code=sc.nextInt();
				Product p=(Product) session.get(Product.class,code);
			    if(p!=null){
				p.setP1Price(28000);	
				p.setP1Name("SamSung");
					session.update(p);
			}
				else
				System.out.println("Record Not FOund!!");
					
				
				txn.commit(); 
				System.out.println("Done!!");
			} catch (HibernateException e) {
				e.printStackTrace();
			}		

	}

}

package com.dxc.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.dxc.pojos.Admin;
import com.dxc.pojos.Customer;
import com.dxc.pojos.Product;


public class AdminDao implements IAdminDao
{
private static SessionFactory sessionFactory;
	
	static{
		Configuration configuration=new Configuration().configure();
		sessionFactory=configuration.buildSessionFactory();
	}
	
	public void addAdmin(Admin a)
	{
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.save(a);
		session.getTransaction().commit();
	}
	
	public boolean loginAdmin(Admin a) 
	{
       Session session=sessionFactory.openSession();
       Query query=session.createQuery("from Admin");
       List<Admin> list=query.getResultList();
       for(Admin l : list)
       {
    	   
    	   if(a.getAdminid().equals(l.getAdminid()) && a.getPassword().equals(l.getPassword()))
    	   {
    		   return true;
    	   }
       }
       return false;
	}

	@Override
	public void addproduct(Product p) 
	{
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.save(p);
		session.getTransaction().commit();
	}

	@Override
	public List<Product> getAllProducts() 
	{
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("from Product");
		return query.getResultList();
		
	}

	@Override
	public void addcustomer(Customer c) 
	{
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.save(c);
		session.getTransaction().commit();	
	}
     
	@Override
	public boolean removecustomer(int i) 
	{
		if(findcustomer(i))
		{
		  Session session=sessionFactory.openSession();
		  session.beginTransaction();
		  Query query=session.createQuery("delete from Customer where customerid=:i");
		  query.setParameter("i",i);
		  query.executeUpdate();
		  session.getTransaction().commit();
		  return true;
		}
		return false;
	}
	public boolean findcustomer(int i) 
	{
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("from Customer where customerid=:i");
		query.setParameter("i", i);
		List<Customer> c1=query.getResultList();
		if(c1.size()==1)
		{
			return true;
		}
		return false;
	}

	@Override
	public List<Customer> getAllCustomers() 
	{
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("from Customer");
		return query.getResultList();	
		
	}

}

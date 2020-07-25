package com.dxc.dao;

import java.util.List;

import com.dxc.pojos.Admin;
import com.dxc.pojos.Customer;
import com.dxc.pojos.Product;

public interface IAdminDao 
{
	public boolean loginAdmin(Admin a);
	
	public void addAdmin(Admin a);
	
	public void addproduct(Product p);
	
	public List<Product> getAllProducts();
	
	public void addcustomer(Customer c);
	
	public boolean findcustomer(int i);
	
	public boolean removecustomer(int i);
	
	public List<Customer> getAllCustomers();
	
	}

package com.dxc.services;

import java.util.List;

import com.dxc.dao.CustomerDao;
import com.dxc.dao.ICustomerDao;
import com.dxc.pojos.Cart;
import com.dxc.pojos.Customer;
import com.dxc.pojos.Product;

public class CustomerService implements ICustomerService
{
 ICustomerDao dao=new CustomerDao();
	@Override
	public boolean loginCustomer(Customer c) 
	{
		return dao.loginCustomer(c);
	}
	@Override
	public void AddToCart(int cid, int productno) 
	{
	dao.AddToCart(cid,productno);	
	}
	@Override
	public List<Product> getAllProducts() {
		
		return dao.getAllProducts();
	}
	@Override
	public List<Product> DisplayCartList(int cid) 
	{
		return dao.DisplayCartList(cid);
	}
	@Override
	public boolean paybill(Product p, double finalcost,int cid) 
	{
		return dao.paybill(p,finalcost, cid);
	}
	@Override
	public void addmoneytowallet(int cid, double balance) 
	{
	 dao.addmoneytowallet(cid,balance);	
	}

}

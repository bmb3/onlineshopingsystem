package com.dxc.services;


import java.util.List;

import com.dxc.dao.AdminDao;
import com.dxc.pojos.Admin;
import com.dxc.pojos.Customer;
import com.dxc.pojos.Product;

public class AdminService implements IAdminService
{
 AdminDao dao=new AdminDao();

public boolean loginAdmin(Admin a) 
{
return dao.loginAdmin(a);
}

public void addAdmin(Admin a) 
{
	dao.addAdmin(a);	
}

public void addproduct(Product p) 
{
   dao.addproduct(p);	
}

public List<Product> getAllProducts() {
	
	return dao.getAllProducts();
}

public void addcustomer(Customer c) 
{
	dao.addcustomer(c);	
}
public boolean findcustomer(int i) {
	
	return dao.findcustomer(i);
}

public boolean removecustomer(int i) 
{
	return dao.removecustomer(i);	
}

public List<Customer> getAllCustomers() 
{
 return dao.getAllCustomers();
}

}

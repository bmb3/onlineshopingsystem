package com.dxc.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dxc.pojos.Admin;
import com.dxc.pojos.Customer;
import com.dxc.pojos.Product;
import com.dxc.services.AdminService;

	@Controller
	@RequestMapping("/views")
	public class AdminController 
	{
		
		AdminService service=new AdminService();
		
		String message =" ";
		
		@RequestMapping("/add")
		public String add(@ModelAttribute Admin a, Model m)
		{
			service.addAdmin(a);
			message = "Admin Added Successfully...";
			m.addAttribute("message",message);
             return "message";
		}
		
		@RequestMapping("/login")
		public String login(@ModelAttribute Admin a, Model m )
		{
			boolean b=service.loginAdmin(a);
			if(b)
			{
			return "adminoptions";
			}
			else
			{
				message = "Incorrect Login Credentials";
				m.addAttribute("message",message);
				return "message";
			}
		}
		
		@RequestMapping("/addproduct")
		public String addproduct(@ModelAttribute Product p, Model m)
		{
			service.addproduct(p);
			message = "Product Added Successfully..";
			m.addAttribute("message",message);
			return "message";
			
		}
		
		@RequestMapping("/display")
		public String getAllProducts(Model m)
		{
			List<Product> list=service.getAllProducts();
			m.addAttribute("list", list);
			return "display";
		}
		
		@RequestMapping("/addcustomer")
		public String addcustomer(@ModelAttribute Customer c,Model m)
		{
			service.addcustomer(c);
			message = "Customer Added Successfully..";
			m.addAttribute("message",message);
			return "message";
			
		}
		
		@RequestMapping("/removecustomer")
		public String removecustomer(@ModelAttribute Customer c, Model m)
		{
			int i=c.getCustomerid();
			boolean b=service.removecustomer(i);
			if(b==true) 
			{
				message = "Customer Removed Successfully..";
				m.addAttribute("message",message);
			    return "message";
			}
			else
			{
				message = "Customer Not Found..";
				m.addAttribute("message",message);
			    return "message";
			}
		}
		
		@RequestMapping("/displaycustomer")
		public String getAllCustomers(Model m)
		{
			List<Customer> list=service.getAllCustomers();
			m.addAttribute("list", list);
			return "displaycustomers";
		}
}

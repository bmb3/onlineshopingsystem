package com.dxc.pojos;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cart 
{
	@Id
 private int id;
 private int customerid;
 private int productno;
 
 
 public Cart()
 {
	 
 }


public int getCustomerid() {
	return customerid;
}

public void setCustomerid(int customerid) {
	this.customerid = customerid;
}

public int getProductno() {
	return productno;
}

public void setProductno(int productno) {
	this.productno = productno;
}
 
}

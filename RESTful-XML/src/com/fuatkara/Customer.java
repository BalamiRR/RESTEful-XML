package com.fuatkara;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name="customer")  
//Burda customer yazdik kucuk harflerle, yani sinifin adini kucuk yazdik
//yani bu sinif kucuk harflerle olsun
public class Customer {
	int customerId;
	String customerName;
	String customerSurname;

	//@XmlElement(name="id")
	@XmlAttribute(name="id")
	//<musteri name="id">
	//	<adi>John</adi>
	//  <soyadi>Black</soyadi>
	//</musteri>               Seklinde olur
	public int getCustomerId() {
		return customerId;
	}
	
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	@XmlElement(name="name")
	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	@XmlElement(name="surname")
	public String getCustomerSurname() {
		return customerSurname;
	}

	public void setCustomerSurname(String customerSurname) {
		this.customerSurname = customerSurname;
	}

}

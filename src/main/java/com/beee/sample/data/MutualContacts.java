package com.beee.sample.data;

import java.io.Serializable;

public class MutualContacts implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2886745035277767295L;

	
	private String name;
	private String contactNumber;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	
	
}

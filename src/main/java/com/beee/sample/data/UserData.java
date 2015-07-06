package com.beee.sample.data;

import java.io.Serializable;
import java.util.List;

public class UserData implements Serializable{
	private String contactNumber;
	private String jobTitle;
	private String professionalSummary;
	private String totalExperience;
	private String name;
	private List<MutualContacts> mutualContacts;
	
	public UserData() {
		// TODO Auto-generated constructor stub
	}


	public UserData(User s) {
		this.contactNumber = s.getContactNumber();
		this.jobTitle = s.getJobTitle();
		this.professionalSummary = s.getProfessionalSummary();
		this.totalExperience = s.getTotalExperience();
		this.name = s.getName();
	}


	public String getContactNumber() {
		return contactNumber;
	}


	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}


	public String getJobTitle() {
		return jobTitle;
	}


	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}


	public String getProfessionalSummary() {
		return professionalSummary;
	}


	public void setProfessionalSummary(String professionalSummary) {
		this.professionalSummary = professionalSummary;
	}


	public String getTotalExperience() {
		return totalExperience;
	}


	public void setTotalExperience(String totalExperience) {
		this.totalExperience = totalExperience;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public List<MutualContacts> getMutualContacts() {
		return mutualContacts;
	}


	public void setMutualContacts(List<MutualContacts> mutualContacts) {
		this.mutualContacts = mutualContacts;
	}
	
	
}

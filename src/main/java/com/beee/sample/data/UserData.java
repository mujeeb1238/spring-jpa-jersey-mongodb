package com.beee.sample.data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserData implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5182130002228835807L;
	
	private String 					contactNumber;
	private Date 					createdDate;
	private Boolean 				isDeleted;
	private String 					jobTitle;
	private Date 					modifiedDate;
	private List<MutualContacts>	mutualContacts;
	private String 					name;
	private String 					professionalSummary;
	private String 					totalExperience;
	
	public UserData() {
		mutualContacts = new ArrayList<MutualContacts>();
	}

	public UserData(User s) {
		this.contactNumber = s.getContactNumber();
		this.jobTitle = s.getJobTitle();
		this.professionalSummary = s.getProfessionalSummary();
		this.totalExperience = s.getTotalExperience();
		this.name = s.getName();
	}
	
	public void createReturnData(User s){
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

	public Boolean isDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public void addIndividualMutualContacts(MutualContacts mct) {
		this.mutualContacts.add(mct);
		
	}
	
	
}

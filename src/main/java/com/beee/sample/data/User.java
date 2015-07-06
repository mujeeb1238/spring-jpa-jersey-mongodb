package com.beee.sample.data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Document(collection = "users")
public class User implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	
	@Indexed
	private String contactNumber;
	@DateTimeFormat(iso = ISO.DATE_TIME)
	private Date createdDate;
	@Id
	private String id;
	private Boolean isDeleted;
	private String jobTitle;
	@DateTimeFormat(iso = ISO.DATE_TIME)
	private Date modifiedDate;
	private List<MutualContacts> mutualContacts;
	private String name;
	private String professionalSummary;
	private String totalExperience;
	

	public User() {
	}

	public static User fromJson(String contactNumber, String totalExperience,
			String jobTitle, String name, String professionalSummary, List<MutualContacts> mutualContacts, Boolean isDeleted) {
		User user = new User();
		user.contactNumber = contactNumber;
		user.name = name;
		user.jobTitle = jobTitle;
		user.professionalSummary = professionalSummary;
		user.totalExperience = totalExperience;
		user.mutualContacts = mutualContacts;
		user.setCreatedDate(new Date());
		user.isDeleted = isDeleted;
		return user;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}

	public List<MutualContacts> getMutualContacts() {
		return mutualContacts;
	}

	public void setMutualContacts(List<MutualContacts> mutualContacts) {
		this.mutualContacts = mutualContacts;
	}

	public Boolean getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	
	

}

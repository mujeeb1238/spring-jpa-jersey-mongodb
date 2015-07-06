package com.beee.sample.data;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class User implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private String id;
	private String contactNumber;
	private String name;
	private String jobTitle;
	private String professionalSummary;
	private String totalExperience;
	private List<MutualContacts> mutualContacts;

	public User() {
	}

	public static User fromJson(String contactNumber, String totalExperience,
			String jobTitle, String name, String professionalSummary, List<MutualContacts> mutualContacts) {
		User user = new User();
		user.contactNumber = contactNumber;
		user.name = name;
		user.jobTitle = jobTitle;
		user.professionalSummary = professionalSummary;
		user.totalExperience = totalExperience;
		user.mutualContacts = mutualContacts;
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
	
	

}

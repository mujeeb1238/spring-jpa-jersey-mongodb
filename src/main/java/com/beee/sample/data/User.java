package com.beee.sample.data;

public class User {
	
	private String contactNumber;
	private String name;
	private String jobTitle;
	private String professionalSummary;
	private String totalExperience;
	
	public User() {}

	public static User fromJson(String contactNumber, String totalExperience, String jobTitle,
			String name, String professionalSummary) {
		User user = new User();		
		user.contactNumber = contactNumber;
		user.name = name;
		user.jobTitle = jobTitle;
		user.professionalSummary = professionalSummary;
		user.totalExperience = totalExperience;
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

	public static User fromJson(UserData user) {
		// TODO Auto-generated method stub
		return null;
	}

}

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import com.beee.sample.data.MutualContacts;
import com.beee.sample.data.User;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;




public class GenerateJsonObject{
	
	public static void main(String[] agrs){
		
		final static Gson gson = new GsonBuilder().setPrettyPrinting().create();
		List<MutualContacts> mc = new ArrayList<E>();
		UserData ud = new UserData();
		ud.setContactNumber("9550723467");
		ud.setIsDeleted("false");
		ud.setJobTitle("Java Developer");
		ud.setName("Syed Mujeeb ur Rahman");
		ud.setProfessionalSummary("openbilling system developer and open source contributer");
		ud.setTotalExperience("8 years");
		long contactNumber = 80000600000;
		for(int i=0; i<1000; i++){
			MutualContacts mcobj = new MutualContacts();
			mcobj.setContactNumber(""+contactNumber);
			mcobj.setName("Mujeeb: "+contactNumber);
			contactNumber++;
			mc.add(mcobj);
		}
		
		System.out.println(gson.toJson(ud));
		
	}
}

class MutualContacts implements Serializable{
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

class User implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	

	private String contactNumber;
	private Date createdDate;
	private String id;
	private Boolean isDeleted;
	private String jobTitle;
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

class UserData implements Serializable{
	
	
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
	
	
}
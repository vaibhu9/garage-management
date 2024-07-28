package Model;

// Admin model for storing data of admin with setter and getter methods (POJO) class.
public class AdminModel {

	private int Ad_Id;
	private String FirstName;
	
	public AdminModel(){
		
	}
	
	public AdminModel(int Ad_Id, String FirstName, String LastName, String Email, String Contact, String Username, String Password){
		this.Ad_Id=Ad_Id;
		this.FirstName=FirstName;
		this.LastName=LastName;
		this.Email=Email;
		this.Contact=Contact;
		this.Username=Username;
		this.Password=Password;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	private String LastName;
	private String Contact;
	private String Username;
	private String Password;

	public int getAd_Id() {
		return Ad_Id;
	}

	public void setAd_Id(int ad_Id) {
		Ad_Id = ad_Id;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getContact() {
		return Contact;
	}

	public void setContact(String contact) {
		Contact = contact;
	}

	private String Email;

}

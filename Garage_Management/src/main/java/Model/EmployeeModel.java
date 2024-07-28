package Model;

//Employee model for storing data of employee with setter and getter methods (POJO) class.
public class EmployeeModel {

	private int EId;
	private String FirstName;
	private String LastName;
	private String contact;
	private String Email;
	private String address;
	
	public EmployeeModel() {
		
	}

	public EmployeeModel(int EId, String FirstName, String LastName, String Email, String contact, String address,String Username, String Password) {
		this.EId=EId;
		this.FirstName=FirstName;
		this.LastName=LastName;
		this.Email=Email;
		this.contact=contact;
		this.address=address;
		this.Username=Username;
		this.Password=Password;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getEId() {
		return EId;
	}

	public void setEId(int eId) {
		EId = eId;
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

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
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

	private String Username;
	private String Password;

}

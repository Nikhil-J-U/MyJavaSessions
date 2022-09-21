package ConcstructorConcept;

public class RegistrationPage {
	
	//page class
	//private class var: fn ln email..
	//const... with all fields
	//getter/setter
	
	//test class:
	//create the object of page class
	//try to get some values using getter
	//try to update email,ph... again get them using getters.
	
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	private String pwd;
	private String confirmPwd;
	
	//constructor
	public RegistrationPage(String firstName, String lastName, String email, String phoneNumber, String pwd,
			String confirmPwd) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.pwd = pwd;
		this.confirmPwd = confirmPwd;
	}

	//getters/setters
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getConfirmPwd() {
		return confirmPwd;
	}

	public void setConfirmPwd(String confirmPwd) {
		this.confirmPwd = confirmPwd;
	}
	
	
	
	
}

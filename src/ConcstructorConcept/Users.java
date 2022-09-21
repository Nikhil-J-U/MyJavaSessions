package ConcstructorConcept;

public class Users {
	
	String firstName;
	int userID;
	boolean isActive;
	String city;
	
	public Users(String firstName, int userID, boolean isActive, String city) {
		this.firstName = firstName;
		this.userID = userID;
		this.isActive = isActive;
		this.city = city;
	}

	public Users(String firstName, String city) {
		this.firstName = firstName;
		this.city = city;
	}

	public Users(String firstName, int userID) {
		this.firstName = firstName;
		this.userID = userID;
	}
	
	
	
	

}

package ConcstructorConcept;

public class Test {

	public static void main(String[] args) {
		
		RegistrationPage rp = new RegistrationPage("Tom", "Joe", "tom@gmail.com", "9912341234", "admin123", "admin123");
		
		System.out.println(rp.getFirstName());
		System.out.println(rp.getLastName());
		System.out.println(rp.getEmail());
		System.out.println(rp.getPhoneNumber());
		System.out.println(rp.getPwd());
		System.out.println(rp.getConfirmPwd());
		
		System.out.println("------------");
		rp.setEmail("tomjoe@gmail.com");
		rp.setPhoneNumber("9887655432");
		System.out.println(rp.getFirstName());
		System.out.println(rp.getLastName());
		System.out.println(rp.getEmail());
		System.out.println(rp.getPhoneNumber());
		System.out.println(rp.getPwd());
		System.out.println(rp.getConfirmPwd());

	}

}

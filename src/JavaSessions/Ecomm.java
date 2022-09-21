package JavaSessions;

public class Ecomm {
	public void login() {
		System.out.println("default login...");
	}
	
	public int login(String user, String pwd) {
		System.out.println("login with"+user+ ":" +pwd);
		return 100;
	}
	public void login(String user, String pwd, int otp) {
		System.out.println("login with"+user+ ":" +pwd+ "OTP: "+otp);
	}
	
	public void search() {
		System.out.println("default search");
	}
	
	public void search(String name) {
		System.out.println("searching with: "+name);
	}
	
	public void search(String name, int price) {
		System.out.println("prod name: "+name+"price:"+price);
	}
	
	public void search(String name, int price, String seller) {
		System.out.println("prod name: "+name+"price:"+price+ " seller:" +seller);
	}
	
	
	
	public static void main(String[] args) {
		Ecomm e = new Ecomm();
		e.login();
		e.login("Nikhil", "niki");
		e.search("apple");
		e.search("a-z", 200, "amazon");

	}

}

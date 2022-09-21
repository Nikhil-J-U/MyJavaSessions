package SuperKeyword;

public class LoginPage extends Page{
	
	int timeOut=200;
	
	public LoginPage() {
		super(10,20);
		System.out.println("hi");
	}
	
	public void loginInfo() {
		System.out.println("login info ");
		super.display();
		super.display();
		display();
	}
	
	@Override
	public void display() {
		System.out.println("L page display");
		super.display();
		
	}
	
	public void getTimeout() {
		System.out.println(timeOut);
		System.out.println(super.timeOut);
	}
}

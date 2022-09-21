package OOP_Abstract;

public class LoginPage extends Page {
	
	public LoginPage() {
		System.out.println("LP -- const");
	}

	@Override
	public void title() {
		System.out.println("LP -- Title");
		
	}

	@Override
	public void url() {
		System.out.println("LP -- url");
		
	}
	
	public void doLogin(String un, String pwd) {
		System.out.println("login with: "+un + ": "+pwd);
	}
	
	public void doLogin(String un, String pwd,long ph) {
		System.out.println("login with: "+un + ": "+pwd+ ": "+ ph);
	}
	
}

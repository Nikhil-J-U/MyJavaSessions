package OOP_Abstract;

public class AmazonTest {

	public static void main(String[] args) {
		
		LoginPage lp = new LoginPage();
		
		lp.title();
		lp.url();
		lp.doLogin("admin", "admin");
		lp.header();
		
		HomePage hp = new HomePage();
		hp.title();
		hp.url();
		hp.header();
		hp.logout();
		
		Page p = new LoginPage();
		p.title();
		p.url();
		p.header();
		
	}

}

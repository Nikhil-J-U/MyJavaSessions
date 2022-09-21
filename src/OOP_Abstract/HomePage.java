package OOP_Abstract;

public class HomePage extends Page{

	@Override
	public void title() {
		System.out.println("hp -- title");
		
	}

	@Override
	public void url() {
		System.out.println("hp -- url");
		
	}
	
	@Override
	public void header() {
		System.out.println("hp header");
	}
	
	public void logout() {
		System.out.println("hp logout");
	}

}

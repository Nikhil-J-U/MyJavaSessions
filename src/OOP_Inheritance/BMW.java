package OOP_Inheritance;

public class BMW extends Car{
	
	//overridden method
	
	@Override 
	public void start() {
		System.out.println("BMW -- start");
	}
	
	public void autoParking() {
		System.out.println("BMW -- autoparking");
	}
	
	
	public  static void drive() {
		System.out.println("BMW -- drive");
	}
	
	

}

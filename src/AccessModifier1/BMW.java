package AccessModifier1;

public class BMW extends Car {

	public static void main(String[] args) {
		
		Car c = new Car();
		c.name = "BMW520";
		c.color = "BMW";
//		c.license// cant access
		
		

	}

}

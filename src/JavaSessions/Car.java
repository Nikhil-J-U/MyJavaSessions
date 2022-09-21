package JavaSessions;

public class Car {
	
	String name;
	int price;
	String color;
	static int wheels;
	
	public static void main(String[] args) {
		
		Car c1 = new Car();
		c1.name = "BMW";
		c1.price = 60;
		c1.color = "blue";
		
		Car c2 = new Car();
		c2.name = "Audi";
		c2.price = 70;
		c2.color = "white";
		
		Car c3 = new Car();
		c3.name = "Honda";
		c3.price = 15;
		c3.color = "black";
		
		System.out.println(c1.name + " :" + c1.price + " :" + c1.color + " :");
		
		//how to access static variables
		//1. within the same class, you can access them directly
		System.out.println(wheels);
		
		//2. you can call by the class name
		System.out.println(Car.wheels);
		
		//3. call by object ref
		System.out.println(c1.wheels);
		
		
	}

}

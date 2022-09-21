package OOP_Inheritance;

public class TestCar {

	public static void main(String[] args) {
		
		BMW b = new BMW();
		b.start();//overridden method
		b.stop();//inherited
		b.refuel();//inherited
		b.autoParking();//individual
		b.engine();
		b.manufacture();
		b.speed();
		b.physics();
//		b.drive();
		BMW.drive();
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();
		
		
		Audi a = new Audi();
		a.start();
		a.stop();
		a.theftSafety();
		a.sportsMode();
		
		//child class can be referred by parent class ref variable
		//top casting
		Car c1 = new BMW();
		c1.start();
		c1.stop();
		c1.refuel();
		
		//child class can be referred by grant parent class ref variable
		Vehicle v1 = new BMW();
		v1.engine();
		
		Science s1 = new BMW();
		s1.physics();
	
		
		
		//down casting:
		//parent class object can be referred by child class ref variable
		//BMW b1 = (BMW)new Car();
		//b1.start();
		
		//grant parent class object can be referred by child class ref variable
		//BMW b2 = (BMW) new Vehicle();
		
		
	}

}

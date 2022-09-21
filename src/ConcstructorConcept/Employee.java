package ConcstructorConcept;

public class Employee {
	
	String name;
	int id;
	int age;
	double salary;
	boolean isPerm;
	char gender;
	
	//constructor
	//name of the constructor will be same as the class name
	//constructor cannot have any return type, no void, no return
	//const.. will be called when you create the object of the class
	public Employee() { //0 param/default constructor
		System.out.println("default const...");
		
	}
	
	public Employee(int a) { //1 param constructor
		System.out.println(a);
		
	}
	
	public Employee(String name,int id) { //1 param constructor
		this.name = name;
		this.id = id; 
		
	}
	
	public Employee(String name,int id, int age) { //1 param constructor
		this.name = name;
		this.id = id;
		this.age =  age;
		
	}
	
	public Employee(String name,boolean isPerm) { //1 param constructor
		this.name = name;
		this.isPerm = isPerm; 
		
	}
	
	public Employee(String name,int id, int age, double salary,boolean isPerm,char gender ) { //1 param constructor
		this.name = name;
		this.id = id;
		this.age =  age;
		this.salary = salary;
		this.isPerm = isPerm;
		this.gender = gender;
		
	}

}

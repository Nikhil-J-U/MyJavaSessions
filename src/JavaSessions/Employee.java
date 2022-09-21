package JavaSessions;

public class Employee {
	
	String name;
	int age;
	String city;
	double salary;
	boolean isPerm;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 = new Employee();
		e1.name="nik";
		e1.age=20;
		e1.city="beng";
		e1.salary=55.5;
		e1.isPerm=true;
		
		System.out.println(e1.name+ " " + e1.age+" "+ e1.city);
		
		Employee e2 = new Employee();
		e1.name="RAJ";
		e1.age=30;
		e1.city="beng";
		e1.salary=55.5;
		e1.isPerm=true;
	}

}

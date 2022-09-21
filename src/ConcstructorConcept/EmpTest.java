package ConcstructorConcept;

public class EmpTest {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.name = "Nikhil";
		e1.age = 23;
		e1.id = 123;
		e1.isPerm = true;
		e1.gender = 'M';
		
		Employee e2 = new Employee(10);
		
		Employee e3 = new Employee("Tom",201);
		System.out.println(e3.name + " " + e3.id + " " + e3.age + " " + e3.isPerm + " " + e3.gender);
		
		Employee e4 = new Employee("Nik", 123, 23, 1000, true, 'M');
		System.out.println(e4.isPerm);
		
		//
		Users u1 = new Users("Nikhil", "Bengaluru");
		Users u2 = new Users("Naveen",100, true, "Pune");
		Users u3 = new Users("Tom", 123);
		//Users u4 = new Users(); //error
		
		//
		//MySystem m1= new MySystem();
		

	}

}

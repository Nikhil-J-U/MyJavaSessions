package JavaSessions;

public class FunctionsInJava {
	//can not create a function inside an function
	//can call the functions from other function
	
	//1. no input and no return
	//void - no return
	public void test() {
		System.out.println("test method");
		int i = 10;//local
		System.out.println(i);
	}
	
	public void getPrint() {
		System.out.println("print my paper");
	}
	
	//2. no input but some return
	//return type: int
	public int getBalance() {
		System.out.println("get balance");
		int fee = 10;
		int tax = 5;
		int total = fee+tax;//15
		return total;
	}
	
	public String getTrainerName() {
		System.out.println("get trainer name");
		String name = "Nikhil";
		return name;
	}
	
	public boolean isEmpActive() {
		System.out.println("is emp active?");
		//boolean flag = true;
		//return flag;
		return true;
	}
	
	//3. some input and some return:
	public int add(int a, int b) {
		System.out.println("add method");
		int z = a+b;
		return z;
	}
	
	public int getCourseFee(String courseName) {
		System.out.println("get course fee for " + courseName);
		
		if(courseName.equals("Selenium")) {
			return 100;
		}
		else if (courseName.equals("API")) {
			return 50;
		}
		else if(courseName.equals("Mobile"))
		{
			return 70;
		}
		else {
			System.out.println("course not found..."); //complusory to return an int as the method says to return some value
			return -1;
		}
		
	}

	public static void main(String[] args) {
		
		FunctionsInJava obj =  new FunctionsInJava();
		obj.test();
		obj.getPrint();
		int p = obj.getBalance(); // use this approach
		System.out.println(p);
		
		System.out.println(obj.getBalance());
		
		String n = obj.getTrainerName();
		System.out.println("trainer name is : " +n);
		
		if(obj.isEmpActive()) {
			System.out.println("PASS");
		}
		
		boolean b = obj.isEmpActive();
		System.out.println(b);
		
		int s1 = obj.add(10, 20);// method arguments
		System.out.println(s1);
		
		int s2 = obj.add(30, 40);
		System.out.println(s2-10);
		
		int f1 = obj.getCourseFee("Selenium");
		System.out.println(f1);
		
		int f2 = obj.getCourseFee("C#");
		System.out.println(f2);
		
		if(f2==-1) {
			System.out.println("this is not part of the training");
		}
		
		
	}

}

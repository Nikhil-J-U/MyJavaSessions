package OOP_Interface;

public interface USMedical extends WHO {
	 
	//cannot have method body
	//only method prototype -- abstract methods
	//no method body, only method declaration
	//interface can not have bussiness logic
	
	public void physioServices();
	
	public void cardioServices();
	
	public void oncologyServices();
	
	public void emergencyServices();
	
	public static void billing() {
		System.out.println("US -- billing");
	}
	
	default void medInsurance() {
		System.out.println("US medinsur");
	}
	
}

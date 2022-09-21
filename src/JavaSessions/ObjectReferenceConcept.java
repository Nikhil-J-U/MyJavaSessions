package JavaSessions;

public class ObjectReferenceConcept {
	
	String name;
	int age;
	
	public void get() {
		System.out.println("get method");
	}
	public static void main(String[] args) {
		ObjectReferenceConcept obj = new ObjectReferenceConcept();
//		obj = null;
//		
//		obj.name = "TOm";
//		obj.age = 25;
//		
//		System.out.println(obj.name);
		
		new ObjectReferenceConcept().name="peter";
		new ObjectReferenceConcept().age=24;
		new ObjectReferenceConcept().get();
		
		ObjectReferenceConcept obj1 = new ObjectReferenceConcept();
	}

}

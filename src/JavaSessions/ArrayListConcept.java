package JavaSessions;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList ar = new ArrayList();
		
		ar.add(100);
		ar.add(200);
		
		
		System.out.println(ar.size());
		
		ar.add(300);
		ar.add(400);
		
		System.out.println(ar.size());
		ar.add(400);
		ar.add(500);
		ar.add(600);
		ar.add(700);
		ar.add("nikki");
		ar.add('n');
		ar.add(11.11);
		ar.add(true);
		System.out.println(ar.size());
		
		System.out.println(ar.get(0));
		System.out.println(ar.get(4));
		//System.out.println(ar.get(8));
		
		ar.remove(5);
		System.out.println(ar.get(5));
		System.out.println(ar.size());
		
		for (int i=0; i< ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		

	}

}

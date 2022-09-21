package JavaSessions;

import java.util.ArrayList;

public class ArrayListGenerics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <Integer> ar = new ArrayList<Integer>();
		
		ar.add(100);
		//ar.add(11.11);
		ar.add(200);
		
		for(Integer e:ar) {
			System.out.println(e);
		}
		
		System.out.println("____________________");
		
		for(int e:ar) {
			System.out.println(e);
		}
		
		System.out.println("index based:");
		
		for(int i=0; i<ar.size();i++)
		{
			System.out.println("index of "+ i+ " "+ar.get(i));
		}
		ArrayList<Double> ar1 = new ArrayList<Double>();
		ar1.add(12.33);
		ar1.add(100.01);
		
		for(Double e:ar1) {
			System.out.println(e);
		}
		
		System.out.println("____________________");
		
		ArrayList<String> prodList = new ArrayList<String>();
		prodList.add("Apple");
		prodList.add("Samsung");
		prodList.add("Nokia");
		prodList.add("Nothing");
		
		for(String e:prodList) {
			System.out.println(e);
		}
		
		System.out.println("____________________");
		
		for( int q=0; q<prodList.size();q++)
		{
			System.out.println("index of "+ q+ " "+prodList.get(q));
		}
		
		ArrayList<Object> empData = new ArrayList<Object>();
		empData.add("Nikhil");
		empData.add(1234);
		empData.add('M');
		empData.add(true);
		
		for(Object e:empData) {
			System.out.println(e);
		}
		System.out.println(empData.size());
		
		System.out.println("index based:");
		int len=empData.size();
		
		for( int p=0; p<len;p++)
		{
			System.out.println("index of "+ p+ " "+empData.get(p));
		}
		
		System.out.println(empData);
		
		
		

	}

}

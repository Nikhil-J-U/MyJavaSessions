package JavaSessions;

public class DataConversion {

	public static void main(String[] args) {
		
		String x = "100";
		System.out.println(x+20);
		
		int i = Integer.parseInt(x);
		System.out.println(i+20);
		
		String y = "100A";
//		int j = Integer.parseInt(y);//numbformatexception
////		System.out.println(j);
		
		//string to double
		String p = "12.33";
		System.out.println(p+20);
		
		double d = Double.parseDouble(p);
		System.out.println(d+20);
		
		//int to string
		
		int total = 100;
		String t = String.valueOf(total);
		System.out.println(t+20);

	}

}

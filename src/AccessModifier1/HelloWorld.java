package AccessModifier1;

public class HelloWorld {
	
	public static void printVertical(String str) {
		
		for(int i=0; i<str.length();i++) {
			System.out.println(str.charAt(i));
		}
	}

	public static void main(String[] args) {
		
		//printVertical("Hello World");
		
		Object arr[] = {5,"s"};
		for(int i=0; i<arr.length;i++)
		{
			
			System.out.println(arr[i]);
		}

	}

}

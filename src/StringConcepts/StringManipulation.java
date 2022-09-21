package StringConcepts;

public class StringManipulation {

	public static void main(String[] args) {
		
		
		String s = "hello This is my java code and I am so happy to be part of this session";
		
		System.out.println(s.length());
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(37));
//		System.out.println(s.charAt(38));
//		System.out.println(s.charAt(-1));
		
		System.out.println(s.indexOf('j'));
		System.out.println(s.indexOf('i'));
		System.out.println(s.indexOf('i', s.indexOf('i')+1));
		System.out.println(s.indexOf('i', s.indexOf('i', s.indexOf('i')+1)+1));
		System.out.println(s.indexOf('i', s.indexOf('i', s.indexOf('i',s.indexOf('i')+1)+1)+1));
		
		System.out.println(s.indexOf("code"));
		System.out.println(s.indexOf("python"));
		
		String msg = "Welcome Admin";
		
		if(msg.indexOf("Admin")>0) {
			System.out.println("PASS");
		}
		
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		
		String str = "   hello world    ";
		
		System.out.println(str.trim());
		System.out.println(str.replace(" ",""));
		
		String dob = "01-01-1990";
		System.out.println(dob.replace('-','/' ));
		
		String s1 = "your user id is nikhilautomation";
		System.out.println(s1.contains("nikhilautomation"));
		
		if(s1.contains("nikhilautomation")) {
			System.out.println("pass");
		}
		
		//comparison
		
		String t1 = "hello java";
		String t2 = "hello java";
		
		System.out.println(t1.equals(t2));
		System.out.println(t1.equalsIgnoreCase(t2));
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t1==t2);
		
		String t5 = new String("hello ruby");
		String t6 = "hello ruby";
		String t7 = new String("hello ruby");
		
		System.out.println(t5==t7);
		System.out.println(t5==t6);
		
		//SPLIT
		
		String lang = "JAVA_PYTHON_RUBY_PHP";
		String langArr[] = lang.split("_");
		System.out.println(langArr[0]);
		
		for(String e:langArr) {
			System.out.println(e);
		}
		
		String name = "xXtestingxXjavaxXXSeleniumXxXPython";
		String nameArr[] = name.split("xX");
		System.out.println(nameArr[0]);
		System.out.println(nameArr[1]);
		System.out.println(nameArr[2]);
		System.out.println(nameArr[3]);
		
		String empData = "Nikhil;Jyothi;24;BLR;IN;02-12-1997;selenium;QA";
		String emp[] = empData.split(";");
		for (String e:emp) {
			System.out.println(e);
		}
		
		String credentials = "admin;admin123";
		System.out.println(credentials.split(";")[0]);
		System.out.println(credentials.split(";")[1]);
		
		String message = "your order id is 12345";
		System.out.println(message.substring(8));
		System.out.println(message.substring(17));
		System.out.println(message.substring(0,10));
		System.out.println(message.substring(message.indexOf("is")+3, message.length()));
		
		String orderId = message.substring(message.indexOf("is")+3, message.length());
		System.out.println(orderId);

	}

}

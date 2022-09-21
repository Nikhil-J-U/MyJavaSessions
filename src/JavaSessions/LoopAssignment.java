package JavaSessions;

public class LoopAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i[] = new int[4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		
		int index=0;
		for(int e : i) {
			System.out.println("index: "+ index++ +" -> value: "+e);
		}

	}

}

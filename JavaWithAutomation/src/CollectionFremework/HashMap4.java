package CollectionFremework;

import java.util.HashMap;

public class HashMap4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashMap m =Calculate(5,5);
		System.out.println(m.keySet());
		System.out.println(m.get("mul"));
		
	}

	
	public static HashMap Calculate(int a, int b) {
		
		int sum =a+b;
		int sub =a-b;
		int mul = a*b;
		int div= a/b;
		
		HashMap   hm = new HashMap();
		hm.put("sum", sum);
		hm.put("sub", sub);
		hm.put("mul", mul);
		hm.put("div",sub );
		
		return hm;
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

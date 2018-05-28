package CollectionFremework;

import java.util.HashMap;

public class HashMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap m =calculation(10,5);
		//m.get("mul");
		System.out.println(m.get("mul"));
		
//		HashMap hm =new HashMap();
//		hm.put("k1", 10);
//		hm.put(12, "HELLO");
//		System.out.println(hm.get(12));
//		
		//____________________________________________
		
		
}

	public static HashMap calculation(int a,int b) {
		// TODO Auto-generated method stub
       int sum= a+b;
       int sub= a-b;
       int mul=a*b;
       int div=a/b;
       
       HashMap h = new HashMap();
       h.put("sum", sum);
       h.put("sub", sub);
       h.put("mul", mul);
       h.put("div", div);
       return h;
        
	}
	
	
	
	
	
}
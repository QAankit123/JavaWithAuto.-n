package Strings;

public class BufferANDBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		String s ="ankit 123";
//		System.out.println(s.hashCode());
//		s="srv";
//		
//		System.out.println(s.hashCode());
		
		
		StringBuffer sb = new StringBuffer("hello");
		System.out.println(sb.hashCode());
		sb.append("123");
		System.out.println(sb.hashCode());
		System.out.println(sb.reverse());
	}

}

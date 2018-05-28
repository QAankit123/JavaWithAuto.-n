package Strings;

import java.util.Scanner;

public class Class3 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String s = "Condeco";
		int len;
		String rev="";
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any string");
		String userinput=scan.nextLine();
		len=userinput.length();
		
		for(int i=len-1;i>=0;i--)
			
		      rev=rev+userinput.charAt(i);
			
			
		
		
		
		System.out.println(rev);
		
	}

}

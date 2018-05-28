package Strings;

public class Class4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		MYCompare("Ankit","ankit",3);
	}

	public static void MYCompare(String a1,String a2,int a) {
		int x1=0;
		int x2=0;
		String s1=a1; 
		String s2=a2;
		int x=a; ////this is user input for that we need to compare last n charactor
		 int length1=0;//toget the length of first string
		 String rev1="";//for storing the last n value first string
		 String rev2="";////for storing the last n value second string
		 int length2=0;
		 length1=s1.length();
		x1=length1-x;
		x2=length2-x;
		 for(int i=length1-1;i<=x1;i--)
			 rev1=rev1+s1.charAt(i);
		
		 length2=s2.length();
		 
		 for(int i=length2-1;i<=x2;i--)
			 rev2=rev2+s1.charAt(i);
		 		
		 //System.out.println(s1.compareTo(s2));
		
		 
		 if(s1==s2)
		 {
			 System.out.println("Last three positions are same");
		 }
		 
		 else {
			 System.out.println("not same");
		 }
		 
		 
	}
	
}

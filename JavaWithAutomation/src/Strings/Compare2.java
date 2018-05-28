package Strings;
//This code is for to compare first N charactors of an Sting.
public class Compare2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		MyCompare("ankit","ankit",3);
		
	}

	public static  void MyCompare(String s1,String s2,int a) {
		// TODO Auto-generated method stub
		
		int length1=0;//To hold the length of first string.
		int length2=0;//To hold the length of second string.
		//int x =a; // To get the till what position from start we have to compare
		length1=s1.length();
		length2=s2.length();
		String reverse1=""; //To hold the reversed string.
		String reverse2="";
	if(a>length1 ||a>length2 ||a<0) 
		
	{
		System.out.println("Invalid camparision Please enter valid inputs");
	}
		
	else {
		
	   for (int i =0;i<=a;i++)
		   reverse1=reverse1+s1.charAt(i);
	
	   
	   for(int i =0;i<=a;i++)
		  
		   reverse2=reverse2+s2.charAt(i);
	
	if(s1==s2)
	{
		System.out.println("First" + "  " + a + "  "+"positions are same");
	}
	else{
		System.out.println("First" + "  " + a + " " +"positions are not same");
	}
	}	
	}
}

package Strings;

public class FindCommonString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		MyString("this is testing this is hello","this");
	}
	   public static void MyString(String s1,String s2) {
		// TODO Auto-generated method stub
        
		   int x=0;
		   String[] Arr= s1.split(" ");
		   System.out.println(Arr.length);
		   
		   for (int i =0;i<=Arr.length-1;i++)
		   {
			   
			  if(Arr[i]==s2)
			   {
				   x=x+1;
			   }
		  
			  System.out.println("sub string is found"  + x + "times");
		  //else{
				   System.out.println("not found");
			   }
		   
		   
	}
	
	
		   
	
	
	
	   }


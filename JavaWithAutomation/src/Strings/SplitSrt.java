package Strings;
//This code is for to split string based on Spaces and show them in Small Capital and Small format.
public class SplitSrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UserData("ankit srv gurgaon");
		
		
	}

	public static void UserData(String s) {
		// TODO Auto-generated method stub

		String[] words=s.split("\\s");
	
		         //words[0]=words[0].toUpperCase();
		         //words[1]=words[1].toLowerCase();
		         //words[2]=words[2].toUpperCase();
	System.out.println(words.length);
	for(String s1: words )
		
	System.out.println(s1);
	
	}
}

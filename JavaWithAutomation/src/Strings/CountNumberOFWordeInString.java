package Strings;

public class CountNumberOFWordeInString {

	public static void main(String[] args) {
		String s = "Ankit Shrivatava gurgaon delhi";
		int count = 1;
		for (int i =0;i<s.length();i++){
			
			
			if (s.charAt(i)==' ' && s.charAt(i+1)!= ' '){
				count++;
			}
		}
            System.out.println("number of words in the strings are "+"  "+count);
	}

}

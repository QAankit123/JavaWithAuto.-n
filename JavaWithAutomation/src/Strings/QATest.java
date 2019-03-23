package Strings;

public class QATest {

	public static void main(String[] args) {
		String s = "condeco";
	    char arr[]=s.toCharArray();
	    int current_value= arr[0];
	    int count =0;
	    int l =0;
	    while(l<s.length()){
	    for(int i =0;i<arr.length;i++){
	    	 if(arr[i]==current_value){
	    		 count++;
	    		 
	    	 }
	    	 System.out.println(count);
	    	 current_value++;
	    	 l++;
	    	
	    }
            
	
		
	}

}
}
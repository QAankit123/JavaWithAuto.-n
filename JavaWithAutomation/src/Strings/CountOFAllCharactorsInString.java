package Strings;

public class CountOFAllCharactorsInString {

	public static void main(String[] args) {
		
		//System.out.println("the charactor "+ " "+arr[i]+" +"+"is present"+" "+counter+" "+"Time");
		
		String s = "ankitagurgaon";
		char [] arr= s.toCharArray();
		
		for(int i =0;i<arr.length;i++){
			int counter = 0;
			
			for (int j=0;j<arr.length;j++){
				
				if(j<i && arr[j]==arr[i]){
					break;
				}
				if(arr[i]==arr[j]){
					counter++;
				}
			}
			if (counter>0){
				System.out.println(arr[i]+"  is present"+counter+" Time");
			}
		}
		
		
		
		
}
}
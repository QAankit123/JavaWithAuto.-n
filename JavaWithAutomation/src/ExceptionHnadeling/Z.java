package ExceptionHnadeling;

public class Z {

	private void AgeTest(int a)throws ArithmeticException {
		// TODO Auto-generated method stub
  
		if(a<18){
			   
			throw(new ArithmeticException());
		}

	
}      
	
	public static void main(String[] args) {
		 Z o = new Z();
		 try{
		 o.AgeTest(17);
		 
		 }
		 catch(Exception e){
			 System.out.println("exception handelled");
		 }
	}
	
	
}
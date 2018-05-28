package ExceptionHnadeling;
//********* here we are creating exception manually*********/////////////
public class HardCodeExceptin {

	  public void mytest(int x) {
		// TODO Auto-generated method stub
          
		  try{
			  if(x<18){
				  throw (new ArithmeticException());
			  }
				  
		  }
		  
		  catch(ArithmeticException e)
		  {
			  System.out.println("exception handelled");
		  }
			  
		  finally{
			  System.out.println("finally block executed");
		  }
		 
	}
	
	public static void main(String[] args) {
		HardCodeExceptin e =new HardCodeExceptin ();
		e.mytest(17);
	}
}


        
package ExceptionHnadeling;

import java.io.FileNotFoundException;

public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      A o = new A();
      try{
    	  o.Testing();
    	  System.out.println("No exception came");
      }
     
      catch(FileNotFoundException e)
      
      {
    	  
    	  System.out.println("Exception Handelled");
      }
      finally{
    	   System.out.println("Finally block");
      }
	}

}


public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int x=Factorial(5);
		System.out.println(Factorial(5));
		}

	
	public static int Factorial(int n)
	{
		if(n<1)
		
			return 1;
	
		else return(n*Factorial(n-1));
		
			 
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

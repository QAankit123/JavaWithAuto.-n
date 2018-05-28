package Arrays;

public class Class1 {

	public void Hello() {
		// TODO Auto-generated method stub
       int z=0;
       int x=0;
		int Arr[]= new int[5];
		Arr[0]=2;
		Arr[1]=5;
		Arr[2]=6;
		Arr[3]=2;
		Arr[4]=11;
	   
	System.out.println(Arr.length);
	//*****Print all values of Array***//
	for(int a : Arr)
	{
		System.out.print(a+ " ");
	}
	//***Print Sum of element of Array****//
	
	 for(int i =0;i<Arr.length;i++)
		 
		 z=z+Arr[i];
		 System.out.println("Sum of Array is"+" "+ z);
	 
		 //**Finding the element is present in array ///****
		 
		 int key =2;
	
	     for(int i =0;i<Arr.length;i++)
	    	 
	     if(Arr[i]==key)
	     {
	    	 System.out.println("found");
	    	break;
	    	 
	     }
	      //Finding the number of occerences   
	     for(int i =0;i<Arr.length;i++)
	    	 if(Arr[i]==key)
	    	 {
	    		 x=x+1;
	    	 }
	          System.out.println(x);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

package StaticThisFinalSuper;

public class A extends Z{

	 int i =100;
	
	//static{
		//System.out.println("this is static");
	//}
	 int z=100;
	A()
	{
		System.out.println("A constructor");
	}
	public void Welcome() {
	
		
		System.out.println("child welcome.....");
		int z =4;
		System.out.println(super.z);
	}
	
	
//	int z= 0;
//
	public void Hello() {
	this.Welcome();
		super.Welcome();
		int z=100;
	}
//	}
	
	
	
	
}

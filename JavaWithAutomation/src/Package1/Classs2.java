package Package1;

public class Classs2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int x,y,z;
		Classs2 C2 = new Classs2();
		x=C2.Add(10, 10);	
		y=C2.Add(x, 10);
		z=C2.Add(5, 10);
		C2.Multiply(z, y);
	
	
	
	}
	
  public int Add(int a,int b) {
		// TODO Auto-generated method stub
    int c= a+b;
    return c;
	}
	
	
	 public void Multiply(int a, int b) {
		// TODO Auto-generated method stub
       int c= a*b;
       System.out.println(c);
	}
	
	
	
	
	
	
	
	
	
	
}

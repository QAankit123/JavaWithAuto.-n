package CollectionFremework;
import java.util.ArrayList;
public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList <Integer> mylist = new ArrayList <Integer> ();
		mylist.add(15);
		mylist.add(13);
		mylist.add(14);
		mylist.add(15);
		mylist.add(16);
		mylist.add(12);
		mylist.add(11);
		//mylist.remove(3);
		mylist.add(1, 55);
		for (Integer x :mylist)
			System.out.println(x);
		
		
		
		System.out.println(mylist.size());
		
		mylist.clear();
		
		System.out.println(mylist.size());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

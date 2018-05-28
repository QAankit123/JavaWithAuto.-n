package ExceptionHnadeling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.NoSuchElementException;

public class A {

	public void Testing() throws FileNotFoundException,NoSuchElementException {
		// TODO Auto-generated method stub
  
		File f = new File("E:\\F11.txt");
		FileReader fr = new FileReader(f);
		
		
	}
	
	
	
	
	
	
}

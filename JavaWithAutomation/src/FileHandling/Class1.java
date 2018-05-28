package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Class1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File f = new File("E:\\F11.txt");
		
		FileReader fr =new FileReader(f);
		
		 int z=fr.read();
		 
		 while(z!=-1)
			 
		 {
			 System.out.print((char)z);
			 z=fr.read();
		 }
		
		
	
	}

}

package FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;

public class FileHandlingBufferReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
           int a=0; //this is used to read only top "N" line of a file
		File f =new File("E:\\F11.txt");
		
		FileReader fr =new FileReader(f);
		
		BufferedReader br = new BufferedReader(fr);
		String s =br.readLine();
		while (s!=null){
			/**a=a+1;    
			if (a==3) //for reading only first three lines.
			{
				break;
			}
			*/	
		  
			System.out.println(s);
			s=br.readLine();
		}
		

	}
	
}
	

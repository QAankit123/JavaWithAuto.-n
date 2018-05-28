package FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Cless3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        int x=0;
		File f= new File("E:\\F11.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br= new BufferedReader(fr);
		
		String s =br.readLine();
		
		while(s!=null)
			
		{
			if(s.contains("hello"))
				
			{
				x=x+1;
			}
			 
			s=br.readLine();
			
			
		}
		System.out.println("Hello is present in" + "  " +x +" " +"Lines" );
	}

}

package FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MultiOperations {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File f = new File("E:\\F11.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		
		File f1 = new File("E:\\F121.txt");
		FileWriter fr1 = new FileWriter(f1,true);
		BufferedWriter bw1 = new BufferedWriter(fr1);
		
		
		String s=br.readLine();
		
		while(s!=null)
		{
			bw1.newLine();
			bw1.write(s);
			s=br.readLine();
			
		}
		
		bw1.flush();
		bw1.close();
		
		
		
		
		
		
	}

}

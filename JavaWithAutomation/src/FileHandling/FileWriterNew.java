package FileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterNew {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		File f =new File("E:\\F222.text");
	
		FileWriter fr = new FileWriter(f,true);	
		
		BufferedWriter bw= new BufferedWriter(fr);
		
		bw.write("HI ankit");
		bw.flush();
		bw.close();
		
		
		
		
		
		
		
		
	}

}

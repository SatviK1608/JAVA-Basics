package stream.Buffered;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Buffered {

	public Buffered() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		
		//buffer maintains a queue 
		BufferedReader in=null;
		BufferedWriter out=null;      
		
		try{
			//need FileReader and FileWriter as after flush we want that data to be writtent to a file
			in=new BufferedReader(new FileReader("BufferIn.txt"));  		
			out=new BufferedWriter(new FileWriter("BufferOut.txt"));   
			
			
			String line;
			while((line=in.readLine())!=null){  
				out.write(line);              //reads line by line
				out.write("\n");              //to get next line of input in next line of output file
				System.out.println(line);
			}
			System.out.println("Process is completed");
		}catch(FileNotFoundException e){
			System.out.println("Sorry, source file is not found");
		}
		finally{
			if(in!=null){
				in.close();
			}
			if(out!=null){
				out.close();
			}
		}

	}

}

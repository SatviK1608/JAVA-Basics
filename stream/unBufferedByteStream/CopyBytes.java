package stream.unBufferedByteStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class CopyBytes {
	//create a file and write some data in it

	public CopyBytes() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream in=null;
		FileOutputStream out=null;      
		
		try{
			in=new FileInputStream("CopyBiteIn.txt");  		//this must be created
			out=new FileOutputStream("CopyBiteOut.txt");    //it is created by JVM if not present
			
			System.out.println("Total Byte Available : "+in.available());
			
			int c;
			while((c=in.read())!=-1){
				out.write(c);
			}
			System.out.println("Process is completed");
			
		}catch(FileNotFoundException e){
			System.out.println("Sorry, source file is not found");
		}finally{
			if(in!=null){
				in.close();
			}
			if(out!=null){
				out.close();
			}
		}
	}

}

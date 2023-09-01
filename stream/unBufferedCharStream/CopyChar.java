package stream.unBufferedCharStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class CopyChar {

	public CopyChar() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader in=null;
		FileWriter out=null;      
		
		try{
			in=new FileReader("CopyCharIn.txt");  		//this must be created
			out=new FileWriter("CopyCharOut.txt");    //it is created by JVM if not present
			
			
			int c;
			while((c=in.read())!=-1){
				out.write(c);              //internally byte by byte is been done
				
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




package fileHandelling.makeDirectoryAndFileUsingMethod;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Create {

	public Create() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args){
		Path path=Paths.get("D:/JavaUCA");
		
		
		Path newDirectory=null;
		Path newFile=null;
		
		try{
			
			newDirectory=Files.createDirectories(path.resolve("documents/personal"));
			newFile=Files.createFile(newDirectory.resolve("my_resume.doc"));
			
		}catch(IOException e){
			
			e.printStackTrace();
			
		}finally{
			
			if(newDirectory!=null){
				System.out.println("Directory Created Successfully");
				
			}
			if(newFile!=null){
				System.out.println("File Created Successfully");
			}
			
		}
	}

}

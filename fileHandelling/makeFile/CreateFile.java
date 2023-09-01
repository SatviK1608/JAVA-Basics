package fileHandelling.makeFile;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class CreateFile {

	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		Scanner sc=new Scanner(System.in);
		
		System.out.print("File: ");  //emp_data.txt
		String file_name=sc.next();
		
		String path="D:/JavaUCA/personal";
		File file=new File(path+"/"+file_name);
		
		boolean result;
		
		try{
			result=file.createNewFile();     //creates a new file
			
			if(result){
				System.out.println("file created!! \n"+file.getCanonicalPath());    //returns the path
			}
			else{
				System.out.println("File already exists at location. \n"+file.getCanonicalPath());
			}
		}catch(IOException e){
			e.printStackTrace();
		}
		
		
	}

}

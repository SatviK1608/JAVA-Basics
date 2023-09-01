package fileHandelling.makeDirectory;

import java.io.File;
import java.util.Scanner;

public class CreateDirectory {

	public CreateDirectory() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Path: ");
		String path=sc.next();    //    D:/JavaUCA
		
		boolean createMoreDirectory=true;
		do{
			System.out.print("New Directory Name: ");
			String directoryName=sc.next();      //personal
			
			path=path + "/" + directoryName;
			
			File file=new File(path);
			
			//boolean isCreated=file.mkdir();        //returns true if directory is created successfully, else false
			
			/*
			 * mkdir() can create only 1 directory whereas mkdirs() can make one and more directorys.
			 * mkdirs() can be used to make multiple directories and is better than mkdir
			 * to use this give directory name as "personal1/document"
			 */
			boolean isCreated=file.mkdirs();
			
			if(isCreated){
				System.out.println("A new directory is created successfully.");
			}
			else{
				System.out.println("Oops! There is some error in creation of a new directory.");
			}
			
			System.out.print("Do you want to create more directory(Y/N): ");
			if(sc.next().toUpperCase().equals("Y")){
				createMoreDirectory=true;
			}
			else{
				createMoreDirectory=false;
			}
			
			
		}while(createMoreDirectory);

	}

}

package array.arrayOfObjects;

import java.util.Scanner;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		System.out.println("Enter the number of employess : ");
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		Employee[] e=new Employee[x];
		for(int i=0;i<x;i++){
			Employee obj=new Employee();
			e[i]=obj;
		}
		for(int i=0;i<x;i++){
			e[i].getEmployee();
		}

	}

}

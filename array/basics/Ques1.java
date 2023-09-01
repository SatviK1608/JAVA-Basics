package array.basics;

public class Ques1 {

	public Ques1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr={
					 {1,2,3,4,5}
					,{6,7,8,9,10}
					,{11,12,13,14,15}
					,{16,17,18,19,20}
					,{21,22,23,24,25}
				};
		System.out.println("The original array is");
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		int middleEle=arr[5/2][5/2];
		System.out.println("The middle ele is : "+middleEle);
		
		//Making all diagonal elements value equal to that of middle ele
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				arr[i][i]=middleEle;
				arr[i][5-i-1]=middleEle;
			}
		}
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		//Finding sum of all boundary values
		int sum=0;
		for(int i=0;i<5;i++){
			sum+=arr[0][i];
			sum+=arr[5-1][i];
		}
		for(int i=1;i<5-1;i++){
			sum+=arr[i][0];
			sum+=arr[i][5-1];
		}
		System.out.println("Sum of boundary values is "+sum);
		
		//sum of Boundary of middle
		int sum2=0;
		int r=5/2,c=5/2;
		for(int i=r-1;i<r+2;i++){
			for(int j=r-1;j<r+2;j++){
				sum2+=arr[i][j];
			}
		}
		//sum2-=middleEle;
		System.out.println("Sum of boundary elements of middle is "+(sum2-middleEle));

	}

}

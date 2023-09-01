package array.basics;
import java.util.*;
public class Array {

	public Array() {
		//Array is an object containing fixed number of values of the same type
		
		//Declaration---> int[] arr; || int array[];
		
		//Initialization --> int [] arr=new int[10]; || int [] array=new int[] {1,2,3,4,5}
		
		/*For-each loop --->for(int x : arr){
			System.out.println(x);
		}
		*/
		
		//Length of array ---> arr.length;
		
		//Sorting an array ---> Arrays.sort(arr,start,end); present in java.util.Arrays library
		
		String[] _iceCreamNames={"Mango","PineApple","Chocolate","Vanilla","Orange"};
		int[] _iceCreamPrices={50,25,90,70,10};
		Arrays.sort(_iceCreamNames,0,_iceCreamNames.length);
		
		
		//int[][] arr=new int[n][m];
		int[][] array2=new int[2][5];
	}

	public static void main(String[] args) {
		Array obj=new Array();

	}

}

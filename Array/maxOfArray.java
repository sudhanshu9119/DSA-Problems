package Array;
import java.util.*;

public class maxOfArray {
	
	public static int maxOfArr( int arr[]) {
		int max =0;
		for (int i=0; i<arr.length; i++) {
		
			if (arr[i]>max) {
				max = arr[i];
			}
			
		}
		return max;
		
	}
	
	public static void main (String[] args) {
		int num[] =  {5,6,7,8,9,10};
		System.out.print("the max of array is"+" "+ maxOfArr(num));
	}
}


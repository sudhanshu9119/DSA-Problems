package Array;
import java.util.*;
// this code is not complete and right  //

public class populateArray {

	public static void main (String[] args) {
		System.out.println("hello word");
		Scanner s = new Scanner (System.in);
		int N = s.nextInt();
		int popArr[] = new int [N];
		int val =1 ;
		for (int i=0; i<N; i++)
		{
			 popArr[i] = val;
			 System.out.print(popArr[i]);
			 val++;
			 for (int j=(N-1); j>N; j--) {
				 popArr[j]= val;
				 val++;
				
			 }
			 
			
		}
		
	
	}
}

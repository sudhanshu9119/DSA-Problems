package StringAndTwoArray;

public class printSumEachRow {
	
	public static void printSumEachRow(int arr[][]) {
	    int i = 0;
	    
		int collength = arr[i].length;
		int rowLength = arr.length;
		
		for (i =0; i < rowLength; i++ ) {
			 
			 int sum = 0;
			
			for (int j = 0; j < collength; j++) {
				
				sum += arr[i][j];
				
						
			}
			
			System.out.print(sum+" ");
			
		}
	
		
	} 
	

	public static void main (String [] args) {
		int arr[][]= {{4,5,3,2,6}, {7,5,3,8,9}};
		printSumEachRow(arr);
	}
}

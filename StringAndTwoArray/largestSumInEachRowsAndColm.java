package StringAndTwoArray;

public class largestSumInEachRowsAndColm {

	public static void LargestSumRowscolm(int arr[][]){
	    int i = 0;
	    int lrowsum = 0;
	    int index = 0;
			int collength = arr[i].length;
			int rowLength = arr.length;
			
			for (i =0; i < rowLength; i++ ) {
				 
				 int rowsum = 0;
				
				for (int j = 0; j < collength; j++) {
					
					rowsum += arr[i][j];
					
				}
				
				if (rowsum > lrowsum) {
					lrowsum = rowsum;
					 index = i;
				}
				
			}
			
		System.out.print("row no"+index);
			
			
			
		} 
	
	public static void main (String[] agrs) {
		int arr [][]= {{3,6,9},{1,4,7},{2,8,9}};
		 LargestSumRowscolm(arr);
		
		
		
	}
		
	}


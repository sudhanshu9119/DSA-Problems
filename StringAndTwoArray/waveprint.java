package StringAndTwoArray;

public class waveprint {
	public static void waveprint (int arr[][]) {
		int nrows = arr.length;
		int mcols= arr[0].length;
		
		if (nrows == 0) {
			return;
		}
		int j = 0;
		if ( j% 2 == 0) {
			for (int i =0; i<nrows; i++) {
			   System.out.print(arr[i][j]);
			}
		}
		else {
			for (int i = nrows -1; i >=0; i-- ) {
				System.out.print(arr[i][j]);
			}
		}
	}
	
	public static void main (String[] args) {
		
		int arr [][] = {{1,2,3,4}, {5,6,7,8,}, {9,10,11,12,}};
		waveprint(arr);
	}

}

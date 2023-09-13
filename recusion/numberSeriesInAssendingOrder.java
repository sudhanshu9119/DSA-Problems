package recusion;

public class numberSeriesInAssendingOrder {
	
	
	public static void fact (int n ) {
		if (n == 0) {
			return ;
		}
		
		else {
			
			
			fact(n-1);
			System.out.println(n);
		}
		
		
	}
	
	public static void main (String args[]) {
		fact(5);
	}

}

package recusion;
import java.util.Scanner;

public class xTothePowerN {
	
	
	public static int xPowerN (int x , int n) {
		
		if (n==0)
			return 1;
		else {
			return x* xPowerN(x, (n-1));
		}
		
		
	}
	
	public static void main (String args[]) {
		Scanner s = new Scanner(System.in);
		int x  = s.nextInt();
		int n = s.nextInt();
		System.out.print(xPowerN(x,n));
		
	}

}

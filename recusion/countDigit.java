package recusion;
import java.util.Scanner;

public class countDigit{
	
	
	public static void countDigit (int num) {
		if (num == 0) {
			return;
	}
	else {
		int count =0;
		countDigit(num/10);
		count ++;
		System.out.print(count);
	}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		countDigit(num);
	  

	}

}

package StringAndTwoArray;
import java.util.*;

public class useOfString {
	public static int wordCount(String s){
	    int space = 0;
	    int count =0;
	    for (int i =0; i<s.length()-1; i++){
	        
	        if (s.charAt(i)==' '){
	            count++;
	           
	        }
	    }
	    return count;
	}
	
	 public static void main(String[] args) {
	        String str= "my name is sudhanshu";
	        int w= wordCount(str);
	        System.out.println(w);

}
}
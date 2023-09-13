package StringAndTwoArray;
import java.util.*;

public class chechPalindrom {
 public static boolean chechPalindrom(String s) {
	 int i = 0;
	 int j = s.length()-1;
	  while (i<j) {
		  if (s.charAt(i)!= s.charAt(j)) {
			  return false;
		  }else 
			  i++;
			  j--;
			  
		 
			 
		  
	  }
	  return true;
 }
 
 
 public static void main (String args[]) {
	 String s = "abbba";
	 System.out.println(chechPalindrom(s));
 }
}


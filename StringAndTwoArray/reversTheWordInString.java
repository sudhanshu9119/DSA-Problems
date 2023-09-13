package StringAndTwoArray;

public class reversTheWordInString {

	public static String reversWord(String str) {
	
			String temp = "";
			int i = str.length()-1;
			int end = str.length();
			while (i > 0) {
				
				if (i == ' ') {
				temp += str.substring(i+1, end) +" ";
				end = i+1;
				
				}
				i--;
			}
			
		return temp;
	}
	
	public static void main (String []args) {
		String s= " my name is sudhanshu Tiwari";
		System.out.print( reversWord(s));
	}
}

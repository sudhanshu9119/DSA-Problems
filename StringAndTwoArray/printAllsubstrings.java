package StringAndTwoArray;

public class printAllsubstrings {
	public static void printAllsubstring(String str) {
		
		for (int start = 0; start< str.length()+1; start++) { // this loop for start incresers 
			
			for (int end = start +1; end < str.length()+1; end++) { // this loop for end increses 
				System.out.println(str.substring(start, end));
			}
		}
		
		
	}
	

	public static void main (String args[]) {
		String str = "sudhanshu";
		printAllsubstring(str);
	}
}

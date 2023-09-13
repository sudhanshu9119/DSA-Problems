package linkedList;
import java.util.*;
public class arraylist {

	

	public static void main (String args[]) {
		ArrayList<Integer>  list1 = new ArrayList<Integer>();
		list1.add(15);
		list1.add(5);
        list1.add(25);
		list1.add(45);
		list1.add(3);
		list1.add(3,38);
	    list1.remove(3);
		
		for (int i =0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}
	
	}
}

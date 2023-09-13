package linkedList;
import java.util.*;

public class takeInput {
	
	public static linknode<Integer> takeInput(){
		Scanner s = new Scanner (System.in);
		int data = s.nextInt();
		
		linknode <Integer> head = null;
		
		while (data ==-1) {
			
			linknode <Integer> newNode = new linknode(data);
			
			if (head == null) {
			 head = newNode;
			}
			
			linknode<Integer> temp ;  
				temp = head;
				temp.next = newNode;
				temp = temp.next;
				
				
			
			
		}
		return head;
	}

}

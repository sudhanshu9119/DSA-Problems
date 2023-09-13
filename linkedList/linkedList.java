package linkedList;

public class linkedList {
	
	public class node {
		int data;
		node next ; 
		
		public  node(int data){
			this.data = data;
			this.next = null;
		}
		
		
	}
	
	public void addFirst(int data) {
		node newNode = new node(data);
		newNode.next =head;
		head = newNode;
		
	}
	
	public void addLast (int data){
		node newNode = new node (data);
		tail.next = newNode;
		tail = newNode;
		
	}
	public static node head;
	public static node tail;

	public static void main(String[] args) {
		linkedList ll = new linkedList();
		
		ll.head = ll.new node(4);
		ll.tail = ll.new node(6);
		ll.addFirst(4);
		ll.addFirst(2);
		ll.addLast(3);
		ll.addLast(1);
		
		
		node temp = head;
		while (temp != null) {
			System.out.print(temp.data +" ");
			temp = temp.next;
		}
	
		
		//System.out.print(ll.head.data);
	
	
	}
}

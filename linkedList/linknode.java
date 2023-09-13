package linkedList;

public class linknode <T> {
	
	T data ;
	linknode <T> next ;
	 
	public  linknode(T data) { 
		this.data = data;
		this.next = null ; 
	}
	
	public T getvalue() { // getter function 
		return data;
	}
	

}

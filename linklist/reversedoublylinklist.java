package linklist;

import linklist.doublylinklist.Node;

public class reversedoublylinklist extends doublylinklist{

	public void reverse() { 
        Node temp = null; 
        Node current = head; 
  
        /* swap next and prev for all nodes of  
         doubly linked list */
        while (current != null) { 
            temp = current.prev; 
            current.prev = current.next; 
            current.next = temp; 
            current = current.prev; 
        } 
  
        /* Before changing head, check for the cases like empty  
         list and list with only one node */
        if (temp != null) { 
            head = temp.prev; 
        } 
    } 
	public static void main(String[] args) {
		doublylinklist dlist=new doublylinklist();
		dlist.addfirst(10);
		dlist.addfirst(20);
		dlist.addfirst(30);
		dlist.addfirst(40);
	dlist.reverse();
		dlist.displayfwd();

	}

}

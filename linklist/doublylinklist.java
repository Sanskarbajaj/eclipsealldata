package linklist;

import linklist.doublylinklist.Node;

public class doublylinklist {
	class Node
	{
		int data;
		Node next;
		Node prev;
		
		public Node(int data,Node next,Node prev) {
		this.data=data;
		this.next=next;
		this.prev=prev;
		}
	}
	int size;
	static Node head;
	Node tail;
	public doublylinklist() {
	int size=0;
	this.head=null;
	this.tail=null;
	}
	public int size()
	{
		return this.size;
	}
	public boolean isempty()
	{
		return this.size()==0;
	}
	public void addfirst(int value)
	{ Node node=new Node(value, null, null);
		if(isempty())
		{
			node.next=null;
			node.prev=null;
			head=node;
			tail=node;
			}
		else
		{
			node.next=head;
			node.prev=null;
			head.prev=node;
			head=node;
		}
		this.size++;
			
	}
	public void addlast(int value)
	{
		Node node=new Node(value,null,null);
		if(isempty())
		{
			node.next=null;
			node.prev=null;
			head=node;
			tail=node;
		}
		else
		{
			node.next=null;
			node.prev=tail;
			tail.next=node;
			tail=node;
		}
		this.size++;
	}
	public int removefirst() throws Exception
	{ Node temp=head;
		if(isempty())
		{
			throw new Exception("khaali h bro");
		}
		else if(head==tail)
		{
			tail=null;
		}
		else {
			head.next.prev=null;
			head=head.next;
			temp.next=null;
		}
		size--;
		return temp.data; 
	}
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
    } 	public int removelast() throws Exception
	{ Node temp=tail;
		if(isempty())
		{
			throw new Exception("khaali h bro");
		}
		else if(size==1)
		{
			head=null;
		}
		else {
			
			tail.prev.next=null;
			tail=tail.prev;
			temp.prev=null;
		}
		size--;
		return temp.data; 
	}
	public void displayfwd()
	{  Node temp=this.head;
	while(temp!=null)
	{
		System.out.print(temp.data+"->");
		temp=temp.next;
	}
	System.out.println("End");
		
	}
	public void displaybkwd()
	{  Node temp=this.tail;
	while(temp!=null)
	{
		System.out.print(temp.data+"->");
				temp=temp.prev;
	}
	System.out.println("End");
		
	}
	public static void main(String[] args) throws Exception  {
		doublylinklist dlist=new doublylinklist();
		dlist.addfirst(10);
		dlist.addfirst(20);
		dlist.addfirst(30);
		dlist.addfirst(40);
		//dlist.reverse();
		dlist.displayfwd();
}
}

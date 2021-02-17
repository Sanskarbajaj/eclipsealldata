package linklist;

import java.util.Stack;

import linklist.linkedlistimplementation.Node;

public class linkedlistimplementation {
public class Node
	{
		int data;
		Node next;
		public Node(int data,Node next) {
			this.data=data;
			this.next=next;
		}
		
	}
	static Node head;
	Node tail;
	static int size;
	public linkedlistimplementation() {
		this.head=null;
		this.tail=null;
		this.size=0;
	}
	public int size()
	{
		return this.size;
	}
	public boolean isempty()
	{
		return this.size()==0;
	}
	public void addfirst(int data)
	{
		Node node=new Node(data,this.head);
		if(this.size>=1)
		{
		this.head=node;
		}
		if(isempty())
		{
		   	this.head=node;
		   	this.tail=node;
		}
	this.size++;
	}
	public void addlast(int data)
	{
		Node node=new Node(data,null);
		if(isempty())
		{
			this.head=node;
			this.tail=node;
		}
		if(this.size>=1)
		{
			this.tail.next=node;
			this.tail=node;
		}
		size++;
	}

	public int getfirst() throws Exception
	{
		if(isempty())
		{
			throw new Exception("linklist is empty");
		}
		return this.head.data;
	}
	public int getlast() throws Exception
	{
		if(isempty())
		{
			throw new Exception("linklist is empty");
		}
		return this.tail.data;
	}
	public   Node getnodeat(int index) throws Exception
	{
		if(index<0||index>size)
		{
			throw new Exception("invalid index");
		}
	  	int count =0;
	  	Node temp=head;
	  	while(count<index)
	  	{
	  		temp=temp.next;
	  		count++;
	  	}
	  	return temp;
	}
	public void addat(int data,int index) throws Exception
	{if(index<0||index>size)
	{
		throw new Exception("invalid index");
	}
	if(index==0)
	{
		addfirst(data);
	}
	else if(index==size)
	{
		addlast(data);
	}
	Node nm1=getnodeat(index-1);
	Node node =new Node(data,nm1.next);
	nm1.next=node;
	size++;
	}
	public int getat(int index) throws Exception
	{
		if(index<0||index>size)
		{
			throw new Exception("invalid index");
		}
		int count =0;
	  	Node temp=head;
	  	while(count<index)
	  	{
	  		temp=temp.next;
	  		count++;
	  	}
	  	return temp.data;
	}
	public int removefirst()
	{
		int rv=this.head.data;
		if (this.size() == 1) {
			this.head = null;
			this.tail = null;
		} else {
			this.head = this.head.next;
		}
		size--;
		return rv;
	}
	public int removelast() throws Exception
	{
		int rv=this.tail.data;
		if (this.size() == 1) {
			this.head = null;
			this.tail = null;
		} else {
			Node nm2=getnodeat(size-2);
			this.tail = nm2;
			this.tail.next = null;
			
		}
		size--;
		return rv;
	}
	public void reversedata() throws Exception
	{
		int beg=0; int end=size-1;
		while(beg<end)
		{
			Node l=getnodeat(beg);
			Node r=getnodeat(end);
			int temp=l.data;
			l.data=r.data;
			r.data=temp;
			beg++;
			end--;
		}
	}
	public  int kthNodeFromEnd(int k) throws Exception {
		if (k <= 0 || k > this.size) {
			throw new Exception("Invalid K");
		}
		Node fast = this.head;
		Node slow = this.head;
		for (int i = 0; i < k; i++) {
			fast = fast.next;
		}

		while (fast != null) {
			slow = slow.next;
			fast = fast.next;
		}

		return slow.data;
	}
	public Node getmiddle()
	{
		Node slow=this.head;
		Node fast=this.head;
		while(fast.next!=null&&fast.next.next==null)
		{
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow;
	}
	public boolean detectloop()
	{
		Node slow=head,fast=head;
		while(fast.next!=null&&fast.next.next!=null)
		{
			slow=slow.next;
			fast=fast.next;
			if (fast == slow) {
				return true;
		}
	}
		return false;

	}
	public boolean ispalindrome(Node head)
	{  Node temp=this.head;
	Stack<Integer> stack=new Stack<Integer>();
		while(temp!=null)
		{
			stack.push(temp.data);
			temp=temp.next;
		}
		while(!stack.isEmpty())
		{ temp=head;
			   int ans=stack.pop();
			   if(ans==temp.data)
			   {
				temp=temp.next;
				break;
			   }else
			   {
				   return false;
			   }
		}
		return true;	
	}
	public void removeduplicates(Node head) throws Exception
	{
	  Node curr=head;
	  Node next_next;
	  if(isempty())
	  {
		  throw new Exception("khaali h bro");
	  }
	  while(curr.next!=null)
	  {
	  if(curr.data==curr.next.data)
	  { 
		  next_next= curr.next.next;
		  
		  curr.next=next_next;
		  
	  }
	  else
	  {
		  curr=curr.next;
	  }
	}
	}

	public void display()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.println("End");
	}

	public static void main(String[] args) throws Exception {
		linkedlistimplementation list=new linkedlistimplementation();
		list.addlast(1);
		list.addlast(1);
		list.addlast(1);
		list.addlast(3);
		list.removeduplicates(head);
		list.display();
	}

}

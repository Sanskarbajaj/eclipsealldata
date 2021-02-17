package linklist;

import linklist.linkedlistimplementation.Node;

public class circularlinklist {
	public class Node
	{
		int data;
		Node next;
		public Node(int data,Node next) {
		this.data=data;
		this.next=next;
		}
	}
Node last;
int size;
public circularlinklist() {
     this.last=null;
     this.size=0;
}
public int size()
{
	return this.size;
}
public boolean isempty()
{
	return this.size==0;
}
public void addlast(int value)
{  
	Node node =new Node(value,null);
	if(isempty())
    { node.next=node;
	  last=node;
    }
	node.next=last.next;
	last.next=node;
	last=node;
	this.size++;
}
public void addfirst(int value)
{   Node node =new Node(value,null);
   if(isempty())
    { node.next=node;
      last=node;
    }
   node.next=last.next;
	last.next=node;
	this.size++;
}
public Node getnodeat(int index) throws Exception
{
	if(index<0||index>size)
	{
		throw new Exception("invalid index");
	}
  	int count =0;
  	Node temp=last.next;
  for(int i=0;i<index;i++)
  {
	  temp=temp.next;
	  count++;
  }
  	return temp;
}
public int removelast() throws Exception
{
	if(isempty())
	{
		throw new Exception("khaali bro");
		
	}
	int rv=this.last.data;
	Node nm2=getnodeat(size-2);
	nm2.next=last.next;
	nm2=last;
	size--;
	return rv;
}
public int removefirst() throws Exception
{ Node temp=null;
	if(isempty())
	{
		throw new Exception("khaali bro");
	}
	else if(size==1)
	{
		last=null;
	}
	else
	{
		 temp=last.next;
		last.next=temp.next;
		temp.next=null;
	}
	size--;
	return temp.data;
	
}
public void addat(int index,int value) throws Exception
{
	if(isempty())
	{
		addlast(value);
	}
	Node node=new Node(value,null);
	Node nm1=getnodeat(index-1);
	nm1.next=node;
	node.next=nm1.next;
	size++;
}
public void display()
{ Node temp;
temp=last.next;
do
{
	System.out.print(temp.data+"->");
	temp=temp.next;
}while(temp!=last.next); 
System.out.println("End");
}
public static void main(String[] args) throws Exception  {
	circularlinklist clist=new circularlinklist();
	clist.addlast(10);
	clist.addlast(20);
	clist.addlast(30);
	clist.addlast(40);
	clist.addlast(50);
	clist.display();
clist.removelast();
	clist.display();
	System.out.println(clist.size);
}
}

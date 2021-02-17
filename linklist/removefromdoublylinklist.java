package linklist;

import linklist.doublylinklist.Node;

public class removefromdoublylinklist extends doublylinklist {
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
	public int removelast() throws Exception
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

	public static void main(String[] args) {
		
	}

}

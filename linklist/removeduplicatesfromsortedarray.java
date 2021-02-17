package linklist;

public class removeduplicatesfromsortedarray extends linkedlistimplementation {
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

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		linkedlistimplementation list=new linkedlistimplementation();
		list.addlast(1);
		list.addlast(1);
		list.addlast(1);
		list.addlast(3);
		list.removeduplicates(head);
		list.display();
	}

}

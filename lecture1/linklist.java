package lecture1;

public class linklist {
	private class Node {
		int data;
		Node next;

		public Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}

	}

	private Node head;
	private Node tail;
	private int size;

	public linklist() {
		this.size = 0;
		this.head = null;
		this.tail = null;
	}

	public int size() {
		return size;
	}

	public boolean isempty() {
		if (size == 0)
			return true;
		else
			return false;
	}

	public void addf(int data) {
		Node node = new Node(data, this.head);
		if (size == 0) {
			this.tail = node;
		}
		this.head = node;
		size++;

	}

	public void addl(int data) {
		Node node = new Node(data, null);
		if (size == 0) {
			this.head = node;
		}
		this.tail.next = node;
		this.tail = node;
		size++;

	}

	private Node getnd(int index)  {
		
		Node temp;
		temp = this.head;
		int count = 0;
		while (count < index) {
			temp = temp.next;
			count++;
		}
		return temp;
	}

	public void addat(int index,int data) 
         {
        	
        	 if(size==0)
        	 {
        		 addf(data);
        	 }
        	 else if(index==size-1)
        	 {
        		 addl(data);
        	 }
        	 else
        	 {
        	 Node nm1=getnd(index-1);
        	 Node node=new Node(data,nm1.next);
        	 nm1.next=node;
        	 size++;
        	 }
         }
        	 public int remf() throws Exception
        	 {
        		 if(isempty())
        		 {
        			 throw new Exception("empty");
        		 }
        		 
        		 int rv=this.head.data;
        		 this.head=this.head.next;
        		 
        		 return rv;
        	 }
        	 public int rml() throws Exception
        	 {
        		 if(isempty())
        		 {
        			 throw new Exception("empty");
        		 }
        		 int rv=this.tail.data;
        		 Node nm1=getnd(size-2);
        		 nm1.next=null;
                   return rv;
        	 }
        	 public int rmvat(int index) throws Exception
        	 {
        		 if(index<0||index>=size)
            	 {
            		 throw new Exception("invalid index");
            	 }
        		   Node nm1=getnd(index-1);
        		   int rv=nm1.next.data;
        		   nm1.next=nm1.next.next;
        		   return rv;
        	 }
        	 public void reverseDI() throws Exception {
        			int beg = 0, end = this.size - 1;
        			while (beg <= end) {
        				Node left = this.getnd(beg);
        				Node right = this.getnd(end);
        				int temp = left.data;
        				left.data = right.data;
        				right.data = temp;
        				beg++;
        				end--;

        			}
        		}

        		public void reversePI() {
        			Node prev = this.head;
        			Node curr = prev.next;
        			while (curr != null) {
        				Node tprev = prev;
        				Node tcurr = curr;
        				prev = curr;
        				curr = curr.next;
        				tcurr.next = tprev;
        			}

        			Node temp = this.head;
        			this.head = this.tail;
        			this.tail = temp;
        			this.tail.next = null;
        		}

        		public void reversePR() {
        			reversePR(this.head);
        			Node temp = this.head;
        			this.head = this.tail;
        			this.tail = temp;
        			this.tail.next = null;
        		}

        		private void reversePR(Node node) {
        			if (node == this.tail) {
        				return;
        			}
        			reversePR(node.next);
        			node.next.next=node;
        		}
//        		
//        		public int mid()
//        		{
//        			if(size%2==0)
//        			{
//        				Node n=this.getnd((size/2)-1);
//        				return n.data;
//        			}
//        			Node n=this.getnd((size)/2);
//        			return n.data;
//        		}
        	public int getfirst()
        	{
        		return this.head.data;
        	}
        	public int getlast()
        	{
        		return this.tail.data;
        	}
        	public int getat(int index)
        	{
        		return this.getnd(index).data;
        	}
        	
             
        		
        	 public void disp()
        	 {
        		 Node temp=this.head;
        		 while(temp!=null)
        		 {
        			 System.out.print(temp.data+"=>");
        			 temp=temp.next;
        		 }
        		 System.out.println("End");
        		 
        	 }
        	 
        	 
         }


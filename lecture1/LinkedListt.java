package lecture1;

import java.util.Scanner;

public class LinkedListt {
	private class Node {
		int data;
		Node next;

		Node(int data, Node next) {
			this.data = data;
			this.next = next;
		}
	}

	private Node head;
	private Node tail;
	private int size;

	public LinkedListt() {
		this.head = null;
		this.tail = null;
		this.size = 0;
	}

	public int size() {
		return this.size;
	}

	public boolean isEmpty() {
		return this.size() == 0;
	}

	public void addFirst(int data) {
		Node node = new Node(data, this.head);
		this.head = node;
		if (this.isEmpty()) {
			this.tail = node;
		}
		this.size++;

	}

	public void addLast(int data) {
		Node node = new Node(data, null);
		if (this.isEmpty()) {
			this.head = node;
			this.tail = node;
		} else {
			this.tail.next = node;
			this.tail = node;
		}
		this.size++;
	}

	private Node getNodeAt(int index) throws Exception {
		if (index < 0 || index >= this.size) {
			throw new Exception("Invalid Index");
		}

		int count = 0;
		Node temp = this.head;
		while (count < index) {
			temp = temp.next;
			count++;
		}
		return temp;
	}

	public void addAt(int index, int data) throws Exception {
		if (index < 0 || index > this.size) {
			throw new Exception("Invalid Index");

		}
		if (index == 0) {
			this.addFirst(data);
		} else if (index == this.size) {
			this.addLast(data);
		} else {
			Node nm1 = this.getNodeAt(index - 1);
			Node node = new Node(data, nm1.next);
			nm1.next = node;
			this.size++;
		}

	}
   
	public int getFirst() throws Exception {
		if(this.isEmpty()) {
			throw new Exception("List is Empty");
		}
		
		return this.head.data;
	}
	
	public int getLast() throws Exception {
		if(this.isEmpty()) {
			throw new Exception("List is Empty");
		}
		
		return this.tail.data;
	}
	
	public int getAt(int index) throws Exception {
		if(this.isEmpty()) {
			throw new Exception("List is Empty");
		}
		
		if(index<0||index>=this.size) {
			throw new Exception("Invalid Index");
		}
		
		return this.getNodeAt(index).data;
	}
	public int removeFirst() throws Exception {
		if (this.isEmpty()) {
			throw new Exception("List is Empty");
		}
		int rv = this.head.data;
		if (this.size() == 1) {
			this.head = null;
			this.tail = null;
		} else {
			this.head = this.head.next;
		}
		this.size--;
		return rv;
	}

	public int removeLast() throws Exception {
		if (this.isEmpty()) {
			throw new Exception("List is Empty");
		}
		int rv = this.tail.data;
		if (this.size() == 1) {
			this.head = null;
			this.tail = null;
		} else {
			Node nm2 = this.getNodeAt(this.size - 2);
			this.tail = nm2;
			this.tail.next = null;
		}
		this.size--;
		return rv;
	}

	public int removeAt(int index) throws Exception {
		if (this.isEmpty()) {
			throw new Exception("List is Empty");
		}
		if (index < 0 || index >= this.size) {
			throw new Exception("Invalid Index");
		}

		if (index == 0) {
			return this.removeFirst();
		} else if (index == this.size - 1) {
			return this.removeLast();
		} else {
			Node nm1 = this.getNodeAt(index - 1);
			int rv = nm1.next.data;
			nm1.next = nm1.next.next;
			this.size--;
			return rv;
		}
	} 

	public void display() {
		Node temp = this.head;
		while (temp != null) {
			System.out.print(temp.data + "=>");
			temp = temp.next;
		}
		System.out.println("END");
	}

	public void reverseDI() throws Exception {
		int beg = 0, end = this.size - 1;
		while (beg <= end) {
			Node left = this.getNodeAt(beg);
			Node right = this.getNodeAt(end);
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
		node.next.next = node;
	}

	public int mid() {
		return this.getMidNode().data;
	}

	private Node getMidNode() {
		Node fast = this.head;
		Node slow = this.head;
		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

	public int kthNodeFromEnd(int k) throws Exception {
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

	public void createCycle() throws Exception {
		Node temp = this.getNodeAt(2);
		this.tail.next = temp;
	}

    public static void main(String args[]) throws Exception {
        Scanner s=new Scanner(System.in);
        LinkedListt ll=new LinkedListt();
        LinkedListt l=new LinkedListt();
        LinkedListt fnl=new LinkedListt();
        int n=s.nextInt();
        int m=s.nextInt();
        for(int i=0;i<n;i++)
        {
            ll.addLast(s.nextInt());
        }
        for(int i=0;i<m;i++)
        {
            l.addLast(s.nextInt());
        }
        String str1="",str2="";
        Node temp=ll.head;
        Node tem=l.head;
        while(temp!=null)
        {
            str1=str1+temp.data;
            temp=temp.next;
        }
        int ans1=Integer.parseInt(str1);
        //System.out.println(ans1);
         while(tem!=null)
        {
            str2=str2+tem.data;
            tem=tem.next;
        }
        
        int ans2=Integer.parseInt(str2);
       // System.out.println(ans2);
        int ans=ans1+ans2;
      //  System.out.println(ans);
        int temans=ans;
        int rem=0;
        while(temans!=0)
        {rem=temans%10;
          fnl.addFirst(rem);
          temans=temans/10;
        }
        fnl.display();
     
    }
}

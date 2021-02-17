package dsa;

import java.util.Stack;

import dsa.llimpl.Node;

public class llimpl {
	public class Node
	{
	public	int data;
	public 	Node next;
		public Node() {
			this.data=0;
			this.next=null;
		}
		public Node(int data,Node next) {
			this.data=data;
			this.next=next;
		}
	}
	public Node head,tail;
	protected int size;
	public llimpl() {
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
	public void addFirst( int item)
	{
		Node node=new Node(item,null);
		if(this.isempty())
		{
			this.head=node;
			this.tail=node;			
		}
		node.next=this.head;
		this.head=node;
		this.size++;
	}
	public Node getNodeAt(int index)
	{Node temp;
	temp=this.head;
	int i=0;
		while(i!=index)
		{
			temp=temp.next;
			i++;
		}
	return temp;}
	public int  getAt(int index) throws Exception {
		if (this.isempty()) {
			throw new Exception("List is Empty");
		}

		if (index < 0 || index >= this.size) {
			throw new Exception("Invalid Index");
		}

		return this.getNodeAt(index).data;
	}
	public void addLast(int item)
	{
		Node node=new Node(item,null);
		if(this.isempty())
		{
			this.head=node;
			this.tail=node;			
		}		
		this.tail.next=node;
		this.tail=node;
		this.size++;
	}
	public void addat(int  item,int index)
	{ Node node=new Node(item,null);
	Node nm1=getNodeAt(index-1);
	Node nm2=nm1.next;
	nm1.next=node;
	node.next=nm2;
		this.size++;
	}
	public void display() {
		Node temp = this.head;
		while (temp != null) {
			System.out.print(temp.data + "=>");
			temp = temp.next;
		}
		System.out.println("END");
	}
	
	public int  removefirst() throws Exception
	{
		if(this.isempty())
		{
			throw new Exception("Empty list");
		}
		if(this.size()==1)
		{
			int rv=head.data;
			this.head=null;
			this.tail=null;
			this.size--;
			return rv;
		}
		int rv=head.data;
		this.head=head.next;
		this.size--;
	return rv;}
	public int removelast() throws Exception
	{if(this.isempty())
	{
		throw new Exception("Empty list");
	}
	if(this.size()==1)
	{
		int rv=head.data;
		this.head=null;
		this.tail=null;
		this.size--;
		return rv;
	}
	int rv=this.tail.data;
	Node nm1=getNodeAt(this.size()-2);
	nm1.next=null;
	this.tail=nm1;
this.size--;
return rv;
	}
	public int removeat(int index)throws Exception
	{
		if(this.isempty())
		{throw new Exception("Empty list");
			
		}
		if(this.size()==1)
		{
			this.removefirst();
		}
		Node ans=getNodeAt(index-1);
		int rv=ans.next.data;
		ans.next=ans.next.next;
	return rv;}
	public int mid()
	{
		Node slow=this.head,fast = this.head;
		while(fast.next!=null&&fast.next.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
		}
	return slow.data;}
	public void reverse()
	{
		int left=0,right=this.size()-1;
		while(left!=right)
		{
			Node lft=getNodeAt(left);
			Node rht=getNodeAt(right);
			int temp;
			temp=lft.data;
			lft.data=rht.data;
			rht.data=temp;
			left++;right--;
			
		}
	}
	public int find(int data)
	{
		int index=0;
		for(Node temp=this.head;temp!=null;temp=temp.next) {
			if(temp.data==(data)) {
				return index;
			}
			index++;
		}
		
		return -1;

	}
	//**********************gfg*************************//
	public  int nthfromlast(Node head,int x)
	{ 
		Node ans=getNodeAt(this.size-x);


	return (int) ans.data;}
	public  int rotatebyn(Node head,int k)
	{
		Node nwhead,q;
		Node temp=head;
		int count=1;
		while(count!=k)
		{
			temp=temp.next;
			count++;
		}
		nwhead=temp.next;
		q=nwhead;
		temp.next=null;
		while(q.next!=null)
		{
			q=q.next;
		}
		q.next=head;
		return (int) nwhead.data;
	}
	public  Node reverse(Node head,int n) throws Exception
	{
		Node tm=head;
		int l=0,r=n;
		while(l<=r)
		{
			Node lf=this.getNodeAt(l);
			Node rf=this.getNodeAt(r);
			int tem= lf.data;
			lf.data=rf.data;
			rf.data=tem;
			l++;
			r--;
		}
		
		return this.head;
	}
	public boolean ispalindrome(Node head)
	{
		Stack<Integer> s=new Stack<Integer>();
		Node tm=head;
		while(tm!=null)
		{
			s.push((Integer) tm.data);
			tm=tm.next;
		}
		Node chk=head;
		System.out.println(s);
		while(chk!=null)
		{
			if(chk.data!=s.pop())
				return false;
			chk=chk.next;
		}
		
	return true;}
	public Node mergeResult(Node node1, Node node2)
    {
        Node fl=node1,sl=node2;
        Node k=null;
        Node fnll=fl.data>sl.data?fl:sl;
        k=fnll;
		while(fl.next!=null&&sl.next!=null)
		{
		    if(fl.data<sl.data)
		    {
		        k.next=fl;
		        fl=fl.next;
		        k=k.next;
		    }
		    else
		    {
		        k.next=sl;
		        sl=sl.next;
		        k=k.next;
		    }
		}
		while(fl!=null)
		{
		    k.next=fl;
		    fl=fl.next;
		}
		while(sl!=null)
		{
		    k.next=sl;
		    sl=sl.next;
		}
    return k;}
	 Node sortedInsert(Node head1, int key) {
	       
	       Node node=head1;
	       boolean ist=istrue(head1,key);
	       if(key<head1.data)
	       {
	           Node nn=head1.next;
	           int nnd=nn.data;
	           Node tnnd=new Node(nnd,null);
	           nn.data=node.data;
	           node.data=key;
	           Node nxtnxt=nn.next;
	           nn.next=tnnd;
	           tnnd.next=nxtnxt;
	           return head1;
	       }
	       else if(ist)
	       {
	           Node ln=head1;
	           while(ln.next!=null)
	           {
	               ln=ln.next;
	           }
	           Node nos=new Node(key,null);
	           ln.next=nos;
	       }
	       else{
	           
	           Node nod=head1;
	           Node prev=null;
	           while(nod.next!=null&&nod.data<key)
	           {
	               prev=nod;
	               nod=nod.next;
	           }
	           Node nn=new Node(key,null);
	           nn.next=prev.next;
	           prev.next=nn;
	       }
	       
	   return head1;}
	   boolean istrue(Node n,int k)
	   {
	       while(n.next!=null)
	       {
	           n=n.next;
	       }
	       if(n.data<k)
	       return true;
	   return false;}
	   
	   
	   
	 public Node deleteNode(Node head, int x)
	    {  
		Node node=head;
		if(x==0)
		return head;
		if(head==null)
		return null;
		if(x==1)
		{
		    if(head.next==null)
		    {
		        head=null;
		        return head;
		    }else
		    {
		        head=head.next;
		        return head;
		    }
		}
		else
		{ x-=2;
		    while(node.next!=null&&x--!=0)
		    {
		        node=node.next;
		    }
		    if(x>=0)
		    {
		        return head;
		    }
		    else
		   {
		       if(node.next.next==null)
		       {
		           node.next=null;
		       }
		       else
		       {
		    	   node.next=node.next.next;
		       }
		       return head;
		   }
		}
		
		    }
	   
	   public void dspl(Node node)
	   {
		   while(node!=null)
		   {
			   System.out.print(node.data+" ");
			   node=node.next;
		   }
		   System.out.println();
	   }
	   public static Node deleteNodee(Node head,int d)
	    {
	        if(head==null)
	        {
	            return null;
	        }
	        if(contains(head,d))
	        {
	            Node node=head;
	            while(node.next!=null&&node.data!=d)
	            {
	                node=node.next;
	            }
	            if(node.next==null)
	            {
	                return head;
	            }
	            else
	            {
	                if(node.next.next==null)
	                {
	                    node.next=null;
	                }
	                else
	                {
	                    node.next=node.next.next;
	                }
	            }
	            return head;
	        }
	        else
	        {
	         return head;   
	        }
	    }
	    public static boolean contains(Node node,int d)
	    {
	        while(node!=null)
	        {
	            if(node.data==d)
	            return true;
	            node=node.next;
	        }
	    return false;}
	    public static Node reverse(Node head)
	    {
	        Node curr=head,prev=null,nxt=null;
	        while(curr!=null)
	        {
	            nxt=curr.next;
	            curr.next=prev;
	            prev=curr;
	            curr=nxt;
	        }
	        head=prev;
	        
	    return head;}
	    public Node moveZeroes(Node head){
	    	   Node oh=null,ot=null,node=head;
	    	   Node zh=null,zt=null;
	    	   while(node!=null)
	    	   {
	    	       if(node.data==0)
	    	       {
	    	           if(zh==null)
	    	           {
	    	               zh=zt=new Node(node.data,null);
	    	           }
	    	           else
	    	           {
	    	               zt.next=new Node(node.data,null);
	    	               zt=zt.next;
	    	           }
	    	           
	    	       }
	    	       else
	    	       {
	    	           if(oh==null)
	    	           {
	    	               oh=ot=new Node(node.data,null);
	    	           }
	    	           else
	    	           {
	    	               ot.next=new Node(node.data,null);
	    	               ot=ot.next;
	    	           }
	    	       }
	    	       node=node.next;
	    	   }
	    	  zt.next=oh;
	    	   return zh;}
	    
	    
	    
	    
	    public Node modify(Node head){
	        Node oc=null,ot=null; Node node=head;
	        while(node!=null)
	        {
	            if(oc==null)
	            {
	                oc=ot=new Node(node.data,null);
	            }
	            else
	            {
	            ot.next=new Node(node.data,null);
	            ot=ot.next;
	            node=node.next;
	            }
	        }
	        Node nn=rev(head);
	        int s=size(nn);
	        int h=s/2;
	        if(head==null)
	        {
	            return null;
	        }
	            Node nnn=nn;
	            Node nnnn=oc.next;
	            int j=0;
	            while(j!=h)
	            {
	               nnn.data=nnn.data-nnnn.data;
	                nnn=nnn.next;
	                nnnn=nnnn.next;
	                j++;
	            }
	            head=nn;
	    return head;}
	    public Node rev(Node n)
	    {
	        Node curr=n,nxt=null,prev=null;
	        while(curr!=null)
	        {
	            nxt=curr.next;
	            curr.next=prev;
	            prev=curr;
	            curr =nxt;
	        }
	        n=prev;
	    return n;}
	    public int size(Node n)
	    {
	        int c=0;
	        while(n!=null)
	        {
	            c++;
	            n=n.next;
	        }
	    return c;}
  
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//		llimpl ll=new llimpl();
//		llimpl lll=new llimpl();
//		ll.addLast(1);
//		ll.addLast(2);
//		ll.addLast(3);
//		lll.addLast(4);
//		lll.addLast(5);
//		lll.addLast(6);
//		llimpl l=new llimpl();
//		l.mergeResult(ll.head,lll.head);
//		l.display();
//		
		llimpl ll=new llimpl();
		ll.addLast(2);
		ll.addLast(9);
		ll.addLast(8);
		ll.addLast(12);
		ll.addLast(7);
		ll.addLast(10);
		ll.display();
		Node nn=ll.modify(ll.head);
		
	 ll.dspl(nn);
	//Node nn= ll.modify(ll.head);
	//	ll.dspl(nn);
	
	}
}

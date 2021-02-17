package dsa;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class btimpl {
	public class Node
	{
		public int data;
		public Node left;
		public Node right;
	}
	public Node root;
	public int size;
	public btimpl() {
Scanner s=new Scanner(System.in);
this.root=	takeinput(s,null,false);
	}	
	public Node takeinput(Scanner s,Node node,boolean hlc)
	{
		if(node==null)
		{
			System.out.println("Enter value of root node");
		}
		else if(hlc)
		{
			System.out.println("enter value of left child of ->"+node.data);
		}
		else
			System.out.println("enter value of right child of->"+node.data);
			
		int item=s.nextInt();
		Node nod=new Node();
		nod.data=item;
		System.out.println("any left child of ->"+nod.data);
		boolean clc=s.nextBoolean();
		if(clc)
		{
		 nod.left=this.takeinput(s, nod,true);	
		}
		System.out.println("any right child of->"+nod.data);
		boolean crc=s.nextBoolean();
		if(crc)
		{
		 nod.right=	this.takeinput(s, nod,false);
		}
		return nod;
	}
	public void preorder()
	{
		this.preorder(this.root);
	}
	private void preorder(Node node)
	{
		if(node==null)
			return;
		System.out.print(node.data+" ");
		this.preorder(node.left);
		this.preorder(node.right);
	}
	public void inorder()
	{
		this.inorder(this.root);
	}
	private void inorder(Node node)
	{
		if(node==null)
			return;
		this.inorder(node.left);
		System.out.print(node.data+" ");
		this.inorder(node.right);
	}
	public void postorder()
	{
		this.postorder(this.root);
	}
	private void postorder(Node node)
	{
		if(node==null)
			return;
	//	System.out.println(node.data);
		this.postorder(node.left);
		this.postorder(node.right);
		System.out.print(node.data+" ");
	}
	public void lvlorder()
	{
		this.lvlorder(this.root);
	}
	private void lvlorder(Node node)
	{
		Queue<Node>q=new LinkedList<>();
		q.add(this.root);
		while(!q.isEmpty())
		{
			Node ans=q.remove();
			System.out.print(ans.data+" ->");
			if(ans.left!=null)
			q.add(ans.left);
			if(ans.right!=null)
			q.add(ans.right);
			
		}
		System.out.println();
		
		
	}
	
	public void display()
	{
		this.display(this.root);
	}
	public void display(Node node)
	{
		if(node==null)
			return;
		if(node.left!=null)
		System.out.print(node.left.data);
		System.out.print("<-"+node.data+"->");
		if(node.right!=null)
		System.out.print(node.right.data);
		System.out.println();
		if(node.left!=null)
			this.display(node.left);
		if(node.right!=null)
			this.display(node.right);
	}
	public int height()
	{
		return this.height(this.root);
	}
	private int height(Node node)
	{
		if(node==null)
			return 0;
		int lht=height(node.left);
		int rht=height(node.right);
		return Math.max(lht,rht)+1;
		
	}
	public int diameter()
	{
		return this.diameter(this.root);
	}
	public int diameter(Node node)
	{
		if(node==null)
			return 0;
		int lh=height(node.left);
		int rh=height(node.right);
		int ld=this.diameter(node.left);
		int rd=this.diameter(node.right);
		int tt=Math.max(lh+rh+1,Math.max(ld, rd));
	return tt;}
	public int min()
	{
		
	return	this.min(this.root);
	}
	private int min(Node node)
	{  int min=Integer.MAX_VALUE;
	int rootv=node.data;
		
	        if(node==null)
			return Integer.MAX_VALUE;
		
		int lm=min(node.left);
		int rm=min(node.right);
		
		if(lm<rm)
			min=lm;
			else
				min=rm;
		if(rootv<min)
			min=rootv;
		
		return min;
		
		
	}
	public int max() {
		return this.max(this.root);

	}

	private int max(Node node) {
		if (node == null) {
			return 0;
		}
		int max = Integer.MIN_VALUE;
		int rootvv = node.data;
		int lv = this.max(node.left);
		int rv = this.max(node.right);
		if (lv > rv) {
			max = lv;
		} else {
			max = rv;
		}

		if (rootvv > max) {
			max = rootvv;
		}

		return max;

	}
	public boolean find(int data)
	{
		return this.find(data,this.root);
	}
	public boolean find(int data,Node node)
	{
		if(node==null)
			return false;
		
		boolean lv=find(data,node.left);
		boolean rv=find(data,node.right);
		if(node.data==data)
			return true;
		if(lv==false&&rv==false)
			return false;
	return true;}
	public static void main(String[] args) {
		btimpl bt=new btimpl();
		bt.display();
		bt.preorder();
		System.out.println();
		bt.inorder();
		System.out.println();
		bt.postorder();
		System.out.println();
		bt.lvlorder();
		System.out.println(bt.height());
	//	System.out.println(bt.min());
		System.out.println(bt.max());
	System.out.println(bt.find(4));
	
	}
	// 1 true 2 true 3 false false true 4 false false true 5 false false

}

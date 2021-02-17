package trees;

import java.util.Scanner;

import trees.binarytree.Node;

public class binarytree {
class Node
{ 
 int data;
 Node left;
 Node right;
 public Node(int data,Node left,Node right) {
this.data=data;
this.left=left;
this.right=right;
}
}
Node root;
int size;
public binarytree() {
	Scanner s=new Scanner(System.in);
 this.root=takeinput(s,null,false);
}
public Node takeinput(Scanner s,Node parent,boolean islftorrght)
{
	if(parent==null)
	{
		System.out.println("enter data for root node");
	}
	else
	{
		if(islftorrght)
		{
			System.out.println("Enter left child of the node  "+parent.data);
		}
		else
		{
			System.out.println("Enter right child of the node  "+parent.data);	
		}
		
	}
	int nodedata=s.nextInt();
	Node node=new Node(nodedata,null,null);
	System.out.println("is there any left child of   "+node.data);
	boolean choice=s.nextBoolean();
	if(choice)
	{
		node.left=takeinput(s,node,true);
	}
	System.out.println("is there any right child of   "+node.data);
	 choice=s.nextBoolean();
	if(choice)
	{
		node.right=takeinput(s,node,false);
	}
	return node;
	
}
public void preorder()
{System.out.println();
     preorder(root);
}
public void preorder(Node node)
{
	if(node==null)
	{
		return;
	}
	System.out.print(node.data+"->");
	preorder(node.left);
	preorder(node.right);
	
}
public boolean find(int data)
{
	return find(root,data );
}
public boolean find(Node node,int data)
{
	if(node.data==data)
	{
		return true;
	}
	else if(find(node.left , data))
	{
		return true;
	}
	else if(find(node.right, data))
	{
		return true;
	}
	return false;
}

public int min()
{
	return min(root);
}
public int min(Node node)
{
	if(node==null)
	{
		return Integer.MAX_VALUE;
}
	int lmin=min(node.left);
	int rmin=min(node.right);
	int mymin=Math.min(node.data,Math.min(lmin, rmin));
	return mymin;
}
public void postorder()
{ System.out.println();
     postorder(root);
}
public void postorder(Node node)
{
	if(node==null)
	{
		return;
	}
	postorder(node.left);
	
	postorder(node.right);
	System.out.print(node.data+"->");
	
}
public void inorder()
{ System.out.println();
     inorder(root);
}
public void inorder(Node node)
{
	if(node==null)
	{
		return;
	}
	inorder(node.left);
	System.out.print(node.data+"->");
	inorder(node.right);
	
}
public void display()
{
	this.display(this.root);
}
public void display(Node node)
{
	String str="";
	if(node.left!=null)
	{
		
		str=str+node.left.data+"->";
	}
	str=str+node.data;
	if(node.right!=null)
	{
		
		str=str+"<-"+node.right.data;
	}
	System.out.println(str);
}
	public static void main(String[] args) {
		binarytree btree=new binarytree();
		btree.display();
		btree.preorder();
		btree.inorder();
		btree.postorder();
		
		

	}

}

package trees;

import trees.BST.Node;

public class BST {
	class Node
	{
		int data;
		Node left;
		Node right;
		public Node() {
			// TODO Auto-generated constructor stub
		
		}
	}
	Node root;
	int[] arr= {1,2,3,4,5,6,7,8,9};
	public BST() {

	this.root=construct(arr,0,arr.length-1);
	}
	public Node construct(int[] arr,int low,int high)
	{
		if(low>high)
		{
			return null;
		}
		int mid=(low+high)/2;
		Node node=new Node();
		node.data=arr[mid];
		node.left=construct(arr, low,mid-1);
		node.right=construct(arr, mid+1, high);
		return node;
		
	}
	public boolean findinbst(int data)
	{
		return this.findinbst(root, data);
	}
	public boolean findinbst(Node node,int data)
	{
		if(node==null)
		{
			return false;
		}
		if(data==node.data)
		{
			return true;
		}
		else if(data>node.data)
		{
			findinbst(node.right, data);
		}
		else if(data<node.data)
		{
			findinbst(node.left, data);
		}
		return false;
		
	}
	public int givemax()
	{
		return this.givemax(root);
	}
	public int givemax(Node node)
	{
		Node temp=node;
		while(temp.right!=null)
		{
			temp=temp.right;
		}
		return temp.data;
	}
	public void display()
	{
		this.display(root);
	}
	public void display(Node node)
	{
		if(node==null)
		{
			return;
		}
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
		display(node.left);
		display(node.right);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BST bst=new BST();
		bst.display();
		System.out.println(bst.findinbst(5));
		System.out.println(bst.givemax());

	}

}

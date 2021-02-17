package dsa;

public class bstimpl {
	public class Node 
	{
	public	int data;
	public	Node left;
	public	Node right;
		public Node() {
			// TODO Auto-generated constructor stub
		}
	}
	public Node root;
	public int size;
	public bstimpl() {
		this.size=0;
	}
	public void add(int item)
	{
		this.root=this.add(this.root, item);
	}
	
	public Node add(Node node,int item)
	{
		if(node==null)
		{
			Node nn=new Node();
			nn.data=item;
			return nn;
		}
		if(item<node.data)
		{
			node.left=this.add(node.left, item);
		}
		else
		{
			node.right=this.add(node.right, item);
		}
		
	return node;}
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
	public int min()
	{
		return this.min(this.root);
	}
	public int min(Node node)
	{ 
		if(node==null)
			return 0;
		if(node.left==null)
			return node.data;
		
		int min=min(node.left);
	
	return min;}
	public int max()
	{
		return this.max(this.root);
	}
	public int max(Node node)
	{
		if(node==null)
			return 0;
		if(node.right==null)
			return node.data;
		int max=this.max(node.right);
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
	if(node.data==data)
		return true;
	else if(node.data>data)
		return this.find(data,node.left);
	else if(node.data<data)
		return this.find(data,node.right);
return false;}
public boolean isbst()
{
	return this.isbst(this.root);
}

	public static void main(String[] args) {
		bstimpl bst=new bstimpl();
		bst.add(10);
		bst.add(5);
		bst.add(15);
		bst.add(20);
		bst.add(1);
        bst.display();
        System.out.println(bst.min());
        System.out.println(bst.find(55));
        System.out.println(bst.find(22));
	}

}

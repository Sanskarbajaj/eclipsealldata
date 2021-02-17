package lecture1;

import java.util.Scanner;

public class btree {
	public class Node {
		int data;
		Node left;
		Node right;

		Node(int data, Node left, Node right) {
			this.left = left;
			this.right = right;
			this.data = data;
		}
	}

	private Node root;
	private int size;

	public btree() {
		// TODO Auto-generated constructor stub
		Scanner s = new Scanner(System.in);
		this.root = takeInput(s, null, false);
	}

	private Node takeInput(Scanner s, Node parent, boolean isLeftOrRight) {
		if (parent == null) {
			System.out.println("Enter the data for root node");
		} else {
			if (isLeftOrRight) {
				System.out.println("Enter the data for left child of" + parent.data);
			} else {
				System.out.println("Enter the data for right child of" + parent.data);

			}
		}

		int data = s.nextInt();
		Node node = new Node(data, null, null);
		this.size++;

		System.out.println("Do you have left child of" + node.data);
		boolean choice = s.nextBoolean();
		if (choice) {
			node.left = takeInput(s, node, true);
		}

		System.out.println("Do you have right child of" + node.data);
		choice = s.nextBoolean();
		if (choice) {
			node.right = takeInput(s, node, false);
		}

		return node;

	}

	public void display() {
		this.display(this.root);
	}

	private void display(Node node) {
		if (node.left != null) {
			System.out.print(node.left.data + "=>");
		} else {
			System.out.print("END=>");
		}

		System.out.print(node.data);
		if (node.right != null) {
			System.out.print("<=" + node.right.data);
		} else {
			System.out.print("<=END");
		}
		System.out.println();
		if (node.left != null) {
			this.display(node.left);
		}

		if (node.right != null) {
			this.display(node.right);
		}
	}

	public int size2() {
		return this.size2(this.root);
	}

	private int size2(Node node) {
		if (node == null) {
			return 0;
		}
		int ls = this.size2(node.left);
		int rs = this.size2(node.right);
		int ms = ls + rs + 1;
		return ms;
	}

	public int max() {
		return this.max(this.root);

	}

	private int max(Node node) {
		if (node == null) {
			return 0;
		}
		int max = Integer.MIN_VALUE;
		int rootv = node.data;
		int lv = this.max(node.left);
		int rv = this.max(node.right);
		if (lv > rv) {
			max = lv;
		} else {
			max = rv;
		}

		if (rootv > max) {
			max = rootv;
		}

		return max;

	}

	public int min() {
		return this.min(this.root);
	}

	public int min(Node node) {
		if (node == null) {
			return Integer.MAX_VALUE;
		}
		int min = Integer.MAX_VALUE;
		int rootv = node.data;
		int lv = this.min(node.left);
		int rv = this.min(node.right);
		if (lv < rv) {
			min = lv;
		} else {
			min = rv;
		}
		if (rootv < min) {
			min = rootv;
		}

		return min;

	}

	public boolean find() {
		return this.find(this.root, 81);
	}

	public boolean find(Node node, int f) {
		if (node == null) {
			return false;
		}
		int max = Integer.MIN_VALUE;
		int rootv = node.data;
		int lv = this.max(node.left);
		int rv = this.max(node.right);
		if (f == lv) {
			return true;
		} else if (f == rv) {
			return true;
		} else if (f == rootv) {
			return true;
		}
		return false;
	}
	public void preorder()
	{
		this.preorder(this.root);
	}
	public void preorder(Node node)
	{
		if(node==null)
		{
			return;
		}
		System.out.println(node.data);

	
		preorder(node.left);
	
		preorder(node.right);
		
	}
	public void postorder()
	{
		this.postorder(this.root);
	}
	public void postorder(Node node)
	{
		if(node==null)
		{
			return;
		}
		
	postorder(node.left);
	System.out.println(node.data);
		postorder(node.right);
		
	}
	public void lorder()
	{
		this.lorder(this.root);
	}

  public void lorder(Node node)
  {
	  
	  for(int i=0;i<size;i++)
	  {
		  System.out.println(node.data);
		  node=node.left;
		  System.out.println(node.data);
		  node=node.right;
		  System.out.println(node.data);
		  
	  }
  }
  public Boolean isbst()
  {
	  return this.isbst(this.root);
  }
  private Boolean isbst(Node node)
  {
	  if(node.left.data<node.data)
	  {
		  isbst(node.left);
		  if(node.left==null)
		  {
			  return true;
		  }
	  }
	  if(node.right.data>node.data)
	  {
		  isbst(node.right);
		  if(node.right==null)
		  {
			  return true;
		  }
  }
		
return false;
}
}
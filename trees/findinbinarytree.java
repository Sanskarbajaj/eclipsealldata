package trees;

public class findinbinarytree extends binarytree{
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

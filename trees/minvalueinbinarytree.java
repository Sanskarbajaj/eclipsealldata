package trees;

import trees.binarytree.Node;

public class minvalueinbinarytree {
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

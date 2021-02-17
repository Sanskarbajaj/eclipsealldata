package trees;

public class maxvalueinbinarytree extends binarytree {

	public int max()
	{
		return max(root);
	}
	public int max(Node node)
	{
		if(node==null)
		{
			return Integer.MIN_VALUE;
}
		int lmax=max(node.left);
		int rmax=max(node.right);
		int mymax=Math.max(node.data,Math.max(lmax, rmax));
		return mymax;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

package lecture1;

public class bstclient{
	public static void main(String[] args)  {
		bst bt=new bst();
		bt.add(50);
		bt.add(25);
		bt.add(75);
		bt.add(12);
		bt.add(37);
		bt.add(62);
		bt.add(87);
		bt.display();
		System.out.println(bt.max());
		System.out.println(bt.min());
//		System.out.println(bt.isbst());

	}

}

package lecture1;

import java.util.Scanner;

public class linearsrch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int[] arr= {10,20,30,140,70};
	
	ls(arr);

	}
	public static int ls(int[] arr)
	{
		int n;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		for(int i=0;i<arr.length;i++)
		{
			if(n==arr[i])
			{
				System.out.println(i);
			}
		}
	}

}

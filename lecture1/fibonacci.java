package lecture1;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int fn=0,sn=1,tn=0,n;
//		Scanner s=new Scanner(System.in);
//		n=s.nextInt();
////		System.out.println(fn);
////		System.out.println(sn);
//		for(int i=2;i<=n;i++)
//		{
//		tn=fn+sn;
//		fn=sn;
//		sn=tn;
//		}
//		System.out.println(tn);
		int fn=0,sn=1,tn=0,n,counter=0;
		System.out.println("enter n");
		Scanner s =new Scanner(System.in);
		n=s.nextInt();
	while(counter<n)
	{
		tn=fn+sn;
		fn=sn;
		sn=tn;
		counter++;
		}
		System.out.println(fn);
		

	}

}

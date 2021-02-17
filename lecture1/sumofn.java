package lecture1;

import java.util.Scanner;

public class sumofn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,sum=0;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
//		System.out.println(n*(n+1)/2);//work
		for(int i=1;i<=n;i++)
		{
			sum=sum+i;
			
		}
		System.out.println(sum);
		

	}

}

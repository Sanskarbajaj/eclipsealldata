package lecture1;

import java.util.Scanner;

public class primeornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,div=2;
		Scanner s=new Scanner(System.in);
		System.out.println("enter number");
		n=s.nextInt();//work
//		for(int i=2;i<n;i++)
		while (div < n) 
		{
			//if(n%i==0)
			if(n%div==0)
			{ System.out.println("not prime");
			return;
			}
			div++;
		}
		System.out.println("prime");
		
		

	}

}

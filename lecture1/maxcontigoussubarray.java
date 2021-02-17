package lecture1;

import java.util.Scanner;

public class maxcontigoussubarray {

	public static void main(String[] args) {
		int row=1,n,nst,value;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		nst=2*n-1;
		while(row<=2*n-1)
		{  
			int cst=1;
			value=n;
			while(cst<=nst)
			{
				System.out.print(value+"  ");
				cst++;
			}
			
			while(cst<=nst)
			{
			  System.out.print(value);
			  value--;
			  cst++;
			}
			row++;
			System.out.println();
			}
		
	}

}

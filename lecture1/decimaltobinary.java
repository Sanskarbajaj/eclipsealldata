package lecture1;

import java.util.Scanner;

public class decimaltobinary {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int t,n;
		t=s.nextInt();
		for(int j=0;j<t;j++)
		{
			n=s.nextInt();
		for(int k=1;k<=n;k++)
		{
			int dec,bin=0,rem,i=0;
		dec=k;
		
		while(dec!=0)
		{
			rem=(dec%2)*((int) Math.pow(10,i));
			 bin=bin+rem;
			dec=dec/2;
			i++;
			
		}
		System.out.print(bin+" ");
		}
		System.out.print(" ");
		}
	}

}

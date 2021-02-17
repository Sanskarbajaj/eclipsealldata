package lecture1;

import java.util.Scanner;

public class wavwprint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 long n,rem=0,rev=0,rem1=0,rev1=0;
	        Scanner s=new Scanner(System.in);
	        n=s.nextInt();
	        while(n!=0)
	        {
	            rem=n%10;
	            if(rem>=5)
	            {
	             rem=9-n;
	            }
	            rev=rev*10+rem;
	            n=n/10;
	        }
	        System.out.println(rev);
	        while(rev!=0)
	        {
	            
	            rem1=rev%10;
	            rev1=rev1*10+rem1;
	            rev=rev/10;
	        }
	        System.out.println(rev1);
	    }
}

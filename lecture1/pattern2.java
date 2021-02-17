package lecture1;

import java.util.Scanner;

public class pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int row=1;
         int n=5;
         int nsp=0;
         int nst=5;
         while(row<=2*n-1)
         {
      	   int csp=1;
      	   while(csp<=nsp)
      	   {
      		System.out.print(" ");
      		csp++;
      	   }
      	   int cst=1;
      	   while(cst<=nst)
      	   {
      		   System.out.print("*");
      		   cst++;
      	   }
      	   if(row<n)
      	   {
      	   nsp=nsp+2;
      	   nst--;}
      	   else
      	   {
      		 nsp=nsp-2;
        	   nst++;}
        	   
      	   }
      	   row++;
      	   System.out.println();
         }


	}



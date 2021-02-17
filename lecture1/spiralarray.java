package lecture1;

import java.util.Scanner;

public class spiralarray {

	public static void main(String[] args) {
		  Scanner s=new Scanner(System.in);
	        int p,q;
	        p=s.nextInt();
	        q=s.nextInt();
	      int[][] arr=new int[p][q]; 
	      for(int v=0;v<arr.length;v++)
	      {
	          for(int t=0;t<arr.length;t++)
	          {
	              arr[v][t]=s.nextInt();
	          }
	      }
	      int left = 0,top = 0,right=arr[top].length-1,bottom=arr.length-1;
			
			int dir =1;
			int count=(bottom + 1)*(right + 1);

			while (left <= right && top <= bottom) {
				if (count>0)
				{
					if (dir == 1)
					{
						for (int i = left; i <= right; i++) 
						{
							System.out.print(arr[top][i] + ", ");
							count--;
						}
						
						dir = 2;
						top++;
					}
				}
				if (count > 0)
				{
					if (dir == 2)
					{
						for (int i = top; i <= bottom; i++) 
						{
							System.out.print(arr[i][right] + ", ");
							count--;
						}
					dir = 3;
					right--;
					}
				}
				if (count > 0) 
				{
					if (dir == 3)
					{
						for (int i = right; i >= left; i--) 
						{
					System.out.print(arr[bottom][i] + ", ");
						count--;
						}
						dir = 4;
						bottom--;
					}
			}
				if (count > 0) 
				{
				if (dir == 4)
					{
						for (int i = bottom; i >= top; i--) 
						{
						System.out.print(arr[i][left] + ", ");
							count--;
						}
						dir = 1;
					left++;
					}
				}
			}
			System.out.println("END");
	    
		
           
	}

}

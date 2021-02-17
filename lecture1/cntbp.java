package lecture1;

import java.awt.JobAttributes;
import java.util.Scanner;
public class cntbp {
	static long ss=0,ee=0;
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int end=s.nextInt();
		int curr=s.nextInt();
//		int[] arr=new int[end];
//		s();
//		System.out.println(cBoardPath(end, curr, arr));
//		System.out.println(e());
//		s();
//		System.out.println(ccBoardPath(end, curr));
//		System.out.println(e());
//		
		System.out.println(cbis(end, curr));
	}
	public static int cbis(int end,int curr)
	{
		int[] strg=new int[end+1];
				strg[end]=1;
				int count=0;
				for(int i=end-1;i>=0;i--)
				{
					for(int dice=1;dice<=6;dice++)
					{
						count =count +strg[dice+i];
					}
					strg[i]=count;
				}
		
		return strg[curr];	
		
	}
	

	public static void s()
	{
		 ss=System.currentTimeMillis();
	}
	public static long e()
	{
		 ee=System.currentTimeMillis();
		return ee-ss;
	}
	public static int cBoardPath(int end, int curr,int[] arr) {
		if (end == curr) {
			return 1;
		}

		if (curr > end) {
		
			return 0;
		}
		if(arr[curr]!=0)
		{
			return arr[curr];
		}

	int count =0;
		for (int dice = 1; dice <= 6; dice++) {
			count =count+ cBoardPath(end, curr + dice,arr);
			arr[curr]=count;
			}
		
		

		return count;
	}

	
	public static int ccBoardPath(int end, int curr) {
		if (end == curr) {
			return 1;
			

		//if (curr > end) {
		//
			//return 0;
		//}  
		

	int count =0;
		for (int dice = 1; dice <= 6; dice++) {
			count =count+ ccBoardPath(end, curr + dice);
			} 
		

		return count;
		}
	}
	public static int edis(String s1,String s2)
	{
		return 0;
	}

}

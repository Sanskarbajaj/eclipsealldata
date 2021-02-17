package lecture1;

public class bnrysrch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {10,20,30,40,50};
		
		System.out.println(bs(arr));
	}
	public static int bs(int[] arr)
	{
		int start=0;
		
		int end=arr.length-1;
		int data=20;
		for(int i=start;i<=end;i++)
		{
			int mid=(start+end)/2;
			if(mid==data)
			{
				return mid;
			}
			else if(arr[mid]<data)
			{
				start=mid+1;
			}
			else
			{
				end=mid-1;
			}
			return -1;
		}
		
	}
}


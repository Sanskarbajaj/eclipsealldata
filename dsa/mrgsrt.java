package dsa;

public class mrgsrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {6,7,8,9,10,1,2,3,4,5};
		int crr[]=mergesort(arr, 0, arr.length-1);
		for(int x:crr)
			System.out.print(x+"->");
	}
	public static int[] mergesortedarray(int[] first,int sec[])
	{
		int sorted[]=new int[first.length+sec.length];
		int i=0,j=0,k=0;
		while(i!=first.length&&j!=sec.length)
		{
			if(first[i]<sec[j])
			{
				sorted[k]=first[i];
				i++;
				k++;
			}
			else
			{
				sorted[k]=sec[j];
				j++;
				k++;
			}
		}
		while(i!=first.length)
		{
			sorted[k]=first[i];
			i++;
			k++;
		}
		while(j!=sec.length)
		{
			sorted[k]=sec[j];
			j++;
			k++;
		}
		return sorted;}
	
	public static int[] mergesort(int arr[],int beg,int end)
	{
		if(beg==end)
		{
			int brr[]=new int[1];
			brr[0]=arr[beg];
			return brr;
		}
		int mid=(beg+end)/2;
		int[] fh=mergesort(arr,beg,mid);
		int sh[]=mergesort(arr,mid+1,end);
		int sorted[]=	mergesortedarray(fh, sh);
		return sorted;}
}

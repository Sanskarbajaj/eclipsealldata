package lecture1;

public class mergesort {

	public static void main(String[] args) {
		int[] arr= {3,4,2,5,1};
		int start=0,end=arr.length-1;
		int[] jj=msort(arr, start, end);
		for(int i=0;i<jj.length;i++)
		{
			System.out.println(jj[i]);
		}
		
		
	}
	public static int[] msort(int[] arr,int start,int end)
	{
		if(start==end)
		{
			int[] br=new int[1];
			br[0]=arr[start];
					return br;
		}
		int mid=(start+end)/2;
		int[] one=msort(arr, start, mid);
		int[] two=msort(arr,mid+1, end);
		int[] sorted=merge(one,two);
		return sorted;
		
	}
	public static int[] merge(int[] o,int[] t)
	{ int i=0,j=0,k=0;
	int[] rs=new int[o.length+t.length];
		while(i<o.length&&j<t.length)
		{
			if(o[i]<t[j])
			{
				rs[i]=o[i];
				i++;
				k++;
			}
			else
			{
				rs[i]=t[j];
				j++;
				k++;		
			}
			if(o[i]<t[j])
			{
				rs[i]=o[i];
				i++;
				k++;
			}
			if(t[i]<o[j])
			{
				rs[i]=t[i];
				i++;
				k++;
			}
		
		}
		return rs;
			}

}

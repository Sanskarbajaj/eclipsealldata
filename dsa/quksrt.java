package dsa;

public class quksrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,5,3,6,2,4};
		quicksrt(arr,0,arr.length-1);
    for(int x:arr)
    	System.out.println(x);

	}
  public static void quicksrt(int arr[],int beg,int end)
  {
	  if(beg>=end)
		  return;
	  int pi=partition(arr,beg, end);  
	  quicksrt(arr,beg,pi-1);
	  quicksrt(arr,pi+1, end);
	  
  }
  public static int partition(int arr[],int start,int end)
  {
	  int pivot=arr[end];
	  int pi=start;
	  for(int i=start;i<=end-1;i++)
	  {
		  if(arr[i]<=pivot)
		  {
			  swap(arr,pi,i);
			  pi++;  
		  }
	  }
	  swap(arr,pi,end);
  return pi;}
  public static void swap(int arr[],int i,int j)
  {
	  int temp=arr[i];
	  arr[i]=arr[j];
	  arr[j]=temp;
  }
}

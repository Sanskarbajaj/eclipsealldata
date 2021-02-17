package dsa;

public class insrtnsrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer arr[]= {3,4,2,5,1};
		String srr[]= {"e","d","c","b","a"};
		insertionsrt(arr);
		for(int x:arr)
			System.out.println(x);
		insertionsrt(srr);
		for(String x:srr)
			System.out.println(x);

	}
	public static <T extends Comparable<T>> void insertionsrt(T arr[])
	{
		for(int i=1;i<arr.length;i++)
		{
		  T key=arr[i];
		  int j=i-1;
		  while(j>=0&&(arr[j].compareTo(key)>0))
		  {
			  arr[j+1]=arr[j];
			  j--;
		  }
		  arr[j+1]=key;
		}
	}
	}

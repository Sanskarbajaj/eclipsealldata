package dsa;

import java.util.Comparator;

public class sltnsrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer arr[]= {3,4,2,7,8,0,5,1};
		String srr[]= {"e","d","c","b","a"};
		selectionsrt(arr);
		for(int x:arr)
			System.out.println(x);
		selectionsrt(srr);
		for(String x:srr)
			System.out.println(x);
	}
	public static <T extends Comparable<T>> void selectionsrt(T arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			int min=i;
			for(int j=min+1;j<arr.length;j++)
			{
				if(arr[j].compareTo(arr[min])<0)
				{
					min=j;
				}
				
			}
			if(min!=i)
				swap(arr,min,i);
		}
	}
	public static<T> void swap(T arr[],int i,int j)
	{
		T temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	

}

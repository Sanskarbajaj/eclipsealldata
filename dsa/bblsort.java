package dsa;

public class bblsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Integer arr[]= {3,4,2,5,1};
String srr[]= {"c","d","b","a","e"};
bubblesrt(srr);
for(String x:srr)
	System.out.println(x);
	}
	public static<T extends Comparable<T>> void bubblesrt(T arr[])
	{
		for(int counter=0;counter<arr.length-1;counter++)
		{
			for(int j=0;j<arr.length-1-counter;j++)
			{
				if(arr[j].compareTo(arr[j+1])>0)
					swap(arr,j,j+1);
			}
		}
	}
	public static<T> void swap(T arr[],int i,int j)
	{
		T temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}

}

package dsa;

public class bsrch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer arr[]= {1,2,3,4,5};
		Integer k1=5;
		Character crr[]= {'1','a','c','f','2'};
		Character k2='f';
String srr[]= {"2","as","c","sanskar"};
String k3="sanskar";
System.out.println(binarysrch(arr, k1));
System.out.println(binarysrch(crr, k2));
System.out.println(binarysrch(srr, k3));

	}
	public static<T extends Comparable<T>> int binarysrch(T arr[],T key)
	{
		int beg=0,end=arr.length-1;
		while(beg<=end)
		{
			int mid=(beg+end)/2;
			T midd=arr[mid];
			if(arr[mid].equals(key))
				return mid;
			else if(key.compareTo(arr[mid])>0)
			{
				beg=mid+1;
			}
			else if(key.compareTo(arr[mid])<0)
			{
				end=mid-1;
			}
		}
	return -1;}

}

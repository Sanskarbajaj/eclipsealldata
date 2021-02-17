package dsa;

public class ls {

	public static void main(String[] args) {
		Integer arr[]= {1,2,3,4,5};
		Integer k1=5;
		Character crr[]= {'1','a','c','f','2'};
		Character k2='f';
String srr[]= {"2","as","c","sanskar"};
String k3="sanskari";
System.out.println(linearsrch(arr, k1));
System.out.println(linearsrch(crr, k2));
System.out.println(linearsrch(srr, k3));

	}
	
	public static <T> int linearsrch( T arr[],T key)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].equals(key))
				return i;
		}
	return -1;}
}

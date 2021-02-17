package lecture1;

public class arraysort1loop {

	public static void main(String[] args) {
		int[] a={0,2,1,0,1,2,1,1};
		for(int i = 0 ; i<a.length-1;i++)
		{
		   if(a[i]>a[i+1])
		   {
			   int temp=a[i];
			   a[i]=a[i+1];
			   a[i+1]=temp;
		   }
		  
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		

	}

}

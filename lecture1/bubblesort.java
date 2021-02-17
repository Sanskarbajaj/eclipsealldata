package lecture1;

public class bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={50,40,30,20,10};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{ 
					int temp;
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			
		}
		for(int i=0;i<=arr.length;i++)
		{
			System.out.println(arr[i]);
		}

	}
	
}

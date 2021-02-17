package lecture1;

public class selectionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int[] arr={50,40,30,20,10};
         
          for(int i=0;i<arr.length;i++)
          {
        	  int min=i;
        	  for(int j=i+1;j<arr.length;j++)
        	  {
        		  if(arr[j]<arr[min])
        		  {
        			  min=j;
        		  }
        	  }
        	  int temp=arr[i];
        	  arr[i]=arr[min];
        	  arr[min]=temp;
                
        	
        	  System.out.println(arr[i]);
          }
          
	}

}

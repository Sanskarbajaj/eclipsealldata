package lecture1;

public class maxarr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,20,30,140,70};
		int max=arr[0];
	      for(int i=1;i<arr.length;i++)
	      {
	    	  if(arr[i]>max)
	    	  {
	    		  max=arr[i];
	    		  
	    	  }
	      }
	      System.out.println(max);
		
}
}

package lecture1;

public class skiprecurse {

	public static void main(String[] args) {
		skip(7);

	}

	public static void skip(int n) 
	{ 
		if(n<=0)
	       {
		return; 
	      }
		         
		
		if(n%2==1)
		{
			System.out.println(n);
			skip(n-2);
		}
	
		
		
		
		
		
	}
		
         
		
        

}

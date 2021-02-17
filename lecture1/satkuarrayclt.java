package lecture1;

public class satkuarrayclt {

	public static void main(String[] args) throws Exception {
		 stkuarray stack=new stkuarray();
		 stkuarray helper=new stkuarray();
		for(int i=0;i<5;i++)
		{
			stack.push(i*10);
		}
		stack.display();
		//stack.rev(stack,helper);
		stack.display(); 
//		System.out.println("top//");
//		System.out.println(stack.top());
//		System.out.println("size//");
//		System.out.println(stack.size());
//		System.out.println("pop//");
//		stack.pop();
//		stack.pop();
//		stack.pop();
//		stack.pop();
//		stack.pop();
//		stack.display();
	    
	}

}

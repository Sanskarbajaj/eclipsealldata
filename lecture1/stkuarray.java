package lecture1;

public class stkuarray {
	public int[] data;
	public int tos;
	public final static int decap=10;
	public stkuarray() throws Exception {
		this(decap);
	}
	public stkuarray(int capacity) throws Exception
	{
		if(capacity<=0)
		{
			throw new Exception("invalid capacity");
		}
		this.data=new int[capacity];
		tos=-1;
	}
	public boolean isempty()
	{
          if(tos==-1)
        	  return true;
          else
        	  return false;
	}
	public void push(int item) throws Exception{
		if(tos==data.length-1)
		{
			throw new Exception("hatt ");
		}
		tos++;
		this.data[tos]=item;
	}
	public int pop() throws Exception
	{
		if(tos==-1)
		{
			throw new Exception("khali hai bhai");
		}
		int res=data[tos];
		data[tos]=0;
		tos--;
		return res;
		
	}
	public int size()
	{
		return tos+1;
	}
	public int top() throws Exception
	{
		if(tos==-1)
		{
			throw new Exception("khali hai bhai");
		}
		int res=data[tos];
		return res;
		
	}
	public void display()
	{
		for(int i=tos;i>=0;i--)
		{
			System.out.print(this.data[i]+"  ");
		}
		System.out.println();
	}
	public static void reverseStack( qu2stk stack,qu2stk helper, int index) throws Exception {
		if (stack.isEmpty()) {
			return;
		}
		int element = stack.pop();
		reverseStack(stack, helper, index + 1);
		helper.push(element);
		if (index == 0) {
			while (!helper.isEmpty()) {
				stack.push(helper.pop());
			}
		}
	}
		
	}
	

}

package dsa;

public class stkimpl {
	public int[] data;
	public int top;
	public final static int defcap=10;
	public stkimpl() {
		this(defcap);
	}
	public stkimpl(int capacity)
	{
		this.data=new int[capacity];
		this.top=-1;
	}
	public boolean isempty()
	{
		return this.size()==0;
	}
	public int size()
	{
		return this.top+1;
	}
public void push(int item)throws Exception
{
	if(size()==data.length)
	{
		throw new Exception("stack overflow");
	}top++;
	this.data[top]=item;
	}
public int pop()throws Exception
{
	if(size()==0)
	{
		throw new Exception("stack underflow");
	}
	int rv=data[top];
	this.data[top]=0;
	return rv;
	}
public int top()
{
	return data[top];
}
public void display()
{
	for(int i=this.top();i>=0;i--)
	{
		System.out.print(this.data[i]+"->");
	}
	System.out.println();
}
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		stkimpl stk=new stkimpl();
		for(int i=0;i<10;i++)
		stk.push(i);
		stk.display();
		System.out.println(stk.pop());
		System.out.println(stk.pop());
		
		System.out.println(stk.pop());
		

	}

}

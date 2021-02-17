package lecture1;
public class linklistasstack  {
	
	private linklist list;
	public linklistasstack()
	{
		this.list=new linklist();
	}
	public int size()
	{
		return list.size();
	}
	public boolean isempty()
	{
		if(list.isempty())
			return true;
		else
			return false;
	}
	public void push(int data)
	{
		list.addf(data);
	}
	public int pop()throws Exception
	{
		return list.remf();
	}
	public int top()
	{
		return list.getfirst();
	}
	public void disp()
	{
		list.disp();
	}
}

package lecture1;

public class linklistasqueue {
	private linklist list;
	public linklistasqueue()
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
	public void enq(int data)
	{
		list.addl(data);
	}
	public int dq()throws Exception
	{
		return list.remf();
	}
	public int frnt()
	{
		return list.getfirst();
	}
	public void disp()
	{
		list.disp();
	}

}

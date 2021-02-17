package dsa;

import java.util.ArrayList;

public class hpimpl {
	
	ArrayList<Integer>data=new ArrayList<>();
	
	
	public void add(int item)
	{
		this.data.add(item);
		this.upheapify(this.data.size()-1);
		
	}
	public void upheapify(int ci)
	{
		int pi=(ci-1)/2;
		if(data.get(ci)<data.get(pi))
		{swap(ci,pi);
		upheapify(pi);}	
	}
	public int remove()
	{
		swap(0,data.size()-1);
		int rv=data.remove(data.size()-1);
		this.downheapify(0);
		return rv;
	}
	public void downheapify(int pi)
	{
		int lc=2*pi+1;
		int rc=2*pi+2;
		int mini=pi;
		if(lc<data.size()&&data.get(lc)<data.get(mini))
			mini=lc;
		if(rc<data.size()&&data.get(rc)<data.get(mini))
			mini=rc;
		
		if(mini!=pi)
		{
			swap(mini,pi);
			downheapify(mini);
		}
	}
	public void swap(int i,int j)
	   {int ith=data.get(i);
		int jth=data.get(j);
		data.set(i, jth);
		data.set(j, ith);}
public int size()
{
	return this.data.size();
}
public boolean isEmpty()
{
	return this.data.size()==0;
}
public void display()
{
	this.display(0);
}
public void display(int pi)
{
	int lc=2*pi+1;
	int rc=2*pi+2;
	if(lc<data.size())
		System.out.print(data.get(lc));
	System.out.print("<-"+data.get(pi)+"->");
	if(rc<data.size())
		System.out.print(data.get(rc));
	System.out.println();
if(lc<data.size())
	this.display(lc);
if(rc<data.size())
	this.display(rc);


}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hpimpl hp=new hpimpl();
		hp.add(10);
		hp.add(15);hp.add(12);hp.add(1);hp.add(29); hp.add(33);
		hp.display();
		System.out.println();
		System.out.println(hp.remove());
		System.out.println(hp.remove());
		System.out.println(hp.remove());
		System.out.println(hp.remove());
		System.out.println(hp.remove());
		System.out.println(hp.remove());
		System.out.println(hp.isEmpty());
		System.out.println(hp.size());
		
		

	}

}

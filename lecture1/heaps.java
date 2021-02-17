package lecture1;

import java.util.ArrayList;

public class heaps<T extends Comparable<T>> {
	private ArrayList<T> data;
	private boolean ismin;
	public heaps()
	{
		this(false);
	}
	public heaps(boolean ismin)
	{
		data=new ArrayList<>();
		
		
	}
	public int size()
	{
		return this.data.size();
	}
	
	public T gethp()
	{
		T r=this.data.get(0);
		return r;
	}
	public void add(T element)
	{
		this.data.add(element);
		int ci=this.data.size()-1;
		heapify(ci);
		
	}
	private void heapify(int ci)
	{
		int pi=(ci-1)/2;
		if(!islarge(pi,ci))
		{
			swap(pi, ci);
		}
		else
		{
			return;
		}	
	}
	private void swap(int i,int j)
	{
		T ith=this.data.get(i);
		T jth=this.data.get(j);	
		
		this.data.set(i,jth);
		this.data.set(j,ith);		
	}
	private boolean islarge(int i,int j)
	{
		T ith=this.data.get(i);
		T jth=this.data.get(j);
		if(ismin)
		return ith.compareTo(jth)<0;
		else
		return ith.compareTo(jth)>0;
	}
	public T remove()
	{
		T rv=this.data.get(this.size()-1);
		this.data.remove(this.size()-1);
		this.dheapify(0);
		return rv;
	}
	private void dheapify(int pi)
	{
		int lci=2*pi+1;
		int rci=2*pi+2;
		if(islarge(pi,lci))
		{
            int mi=pi;
			swap(pi,mi);
		}
	if(islarge(pi,rci))
	{
		
	}
		
		
		
	}
	public void display()
	{
		this.display(0);
	}
	public void display(int pi)
	{
		String str="";
		int lci=2*pi+1;
		int rci=2*pi+2;
		if(lci<this.data.size())
		{
			T lc=this.data.get(lci);
			str=str+lc+"-->";
		}
		else
		{
			str=str+"End-->";
		}
		str=str+this.data.get(pi);
		if(rci<this.data.size())
		{
			T rc=this.data.get(rci);
			str=str+"<--"+rc;
		}
		else
		{
			str=str+"<--End";
		}
		System.out.println(str);
		if(lci<this.data.size())
		{
			this.display(lci);
		}
		if(rci<this.data.size())
		{
			this.display(rci);
		}
		
	}
}

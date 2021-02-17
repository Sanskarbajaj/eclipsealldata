package dsa;
import java.util.*;

public class gpimpl {
	ArrayList<ArrayList<Integer>>gph=new ArrayList<ArrayList<Integer>>();
	public gpimpl(int n) {
		for(int i=0;i<n;i++)
		{
			gph.add(new ArrayList<Integer>());
		}
	}
	public void addEdge(int u,int v,boolean dir)
	{
		
		gph.get(u).add(v);
		if(!dir)
			gph.get(v).add(u);
		
	}
	public void printgraph()
	{
		for(int i=0;i<gph.size();i++)
		{
			System.out.print(i+"--->");
			for(int j=0;j<gph.get(i).size();j++)
			{
				System.out.print(gph.get(i).get(j)+",");
			}
			System.out.println();
		}
	}
	public void bfs(int s)
	{  boolean vis[]=new boolean[gph.size()];
		Queue<Integer>q=new LinkedList<Integer>();
		q.add(s);
		vis[0]=true;
		while(!q.isEmpty())
		{
			int rv=q.remove();
			//System.out.print(rv+"->");
			
		
			for(int x:gph.get(rv))
			{
				
				if(vis[x]==false)
				{
					q.add(x);
					vis[x]=true;
				}
			}
		}
		
	}
	public void dfs(int s,boolean vis[])
	{
		
		vis[s]=true;
		System.out.print(s+"->");
		
		
		for(int x:gph.get(s))
		{
			if(vis[x]==false)
			{
				dfs(x,vis);
			}
		}
	}
	public int size()
	{
		return gph.size();
	}
	public int cc(int s)
	{
		int c=0;
		boolean vis[]=new boolean[gph.size()];
		for(int i=0;i<vis.length;i++)
		{
		if(vis[i]==false)
		{
			vis[i]=true;
			bfs(i);
			c++;
		}
		}
	return c;}
	public static void main(String[] args)
	{
		gpimpl g=new gpimpl(6);
		g.addEdge(0, 1,false);
		g.addEdge(0, 2, false);
		g.addEdge(1, 3, false);
		g.addEdge(2, 5, false);
		g.addEdge(3, 4, false);
		g.addEdge(5, 4, false);
		g.printgraph();
		System.out.println();
//		g.bfs(0);
//		boolean vis[]=new boolean[g.size()];
//		System.out.println();
//		g.dfs(0,vis);
//		System.out.println();
		System.out.println(g.cc(0));
		
		
		
	}

}

package dsa;
import java.util.*;

public class wtgphimpl {

	class pair<T>
	{
		T fst;
		T scn;
		public pair(T fst,T scn) {
			this.fst=fst;
			this.scn=scn;
		}
		public String toString()
		{
			return "{"+fst+"<---->"+scn+"}";
		}
	}
	ArrayList<ArrayList<pair<Integer>>>wtg=new ArrayList<ArrayList<pair<Integer>>>();
	public wtgphimpl(int n) {
	for(int i=0;i<n;i++)
	{
		wtg.add(new ArrayList<pair<Integer>>());
	}
		
	}
	public void add(int u,int v,int wt)
	{
		if(u==v)
			return;
		wtg.get(u).add(new pair(v,wt));
	}
	public void printgraph()
	{
		for(int i=0;i<wtg.size();i++)
		{
			System.out.print(i+"--->");
			for(int j=0;j<wtg.get(i).size();j++)
			{
				System.out.print(wtg.get(i).get(j)+",");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    wtgphimpl wtg=new wtgphimpl(3);
    wtg.add(0, 1, 25);
    wtg.add(0, 0, 22);
    wtg.add(0, 3, 30);
    wtg.printgraph();
		
	}

}

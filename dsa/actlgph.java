package dsa;

import java.util.ArrayList;
import java.util.HashMap;

public class actlgph {
 public class Vertices
 {
	 HashMap<String ,Integer>nbrs=new HashMap<>();
 }
 HashMap<String ,Vertices>gph;
 public actlgph() {
	 gph=new HashMap<>();
}
 public int numofvertex()
 {
	 return gph.size();
 }
 public boolean containsvertex(String vname)
 {
	 return this.gph.containsKey(vname);
 }
 public  void addvertex(String vname)
 {
	 Vertices v=new Vertices();
	  gph.put(vname,v);
 }
 public void removeVertex(String vname)
 {
	 Vertices v=gph.get(vname);
	 if(v==null)
	 {
		 return;
	 }
	 ArrayList<String>keys=new ArrayList<String>(v.nbrs.keySet());
    for(String key:keys)
    {
    	Vertices vtx=gph.get(key);
    	vtx.nbrs.remove(vname);
    }
    gph.remove(vname);
 
 
 }
  public int numberofedges()
 {
	 int c=0;
	 ArrayList<String>keys=new ArrayList<>(gph.keySet());
	 for(String key:keys)
	 {
		 Vertices vtx=gph.get(key);
		c=c+ vtx.nbrs.size();
	 }
  
 return c/2;}
 public boolean containsedge(String vname1,String vname2)
 {
	 
	 Vertices v=gph.get(vname1);
	 Vertices vv=gph.get(vname2);
	 if(v==null||vv==null)
		 return false;
	 if(v.nbrs.containsKey(vname2))
		 return true;
	 return false;
 }
 public void addEdge(String vname1,String vname2,int cost)
 {
	 Vertices v=gph.get(vname1);
	 Vertices vv=gph.get(vname2);
	 if(v==null||vv==null)
		 return ;
	 if(v.nbrs.containsKey(vname2))
		 return;
	 v.nbrs.put(vname2,cost);
	 vv.nbrs.put(vname1,cost);
 }
 public void removeedge(String vname1,String vname2)
 {
	 Vertices v=gph.get(vname1);
	 Vertices vv=gph.get(vname2);
	 if(v==null||vv==null)
		 return ;
	 if(!v.nbrs.containsKey(vname2))
		 return;
	 
	 v.nbrs.remove(vname2);
	 vv.nbrs.remove(vname1);
 }
public void display()
{
	ArrayList<String>keys=new ArrayList<String>(gph.keySet());
	for(String key:keys)
	{
		Vertices v=gph.get(key);
		System.out.println(key+"->"+v.nbrs);
	}
}
	public static void main(String[] args) {
		actlgph gph=new actlgph();
		gph.addvertex("A");
		gph.addvertex("B");
		gph.addvertex("C");
		gph.addvertex("D");
		gph.addvertex("E");
		gph.addvertex("F");
		gph.addvertex("G");
		
		gph.addEdge("A","B", 2);
		gph.addEdge("A","D", 3);
		gph.addEdge("B","C", 1);
		gph.addEdge("C","D", 8);
		gph.addEdge("D","E", 10);
		gph.addEdge("E","F", 45);
		gph.addEdge("E","G", 7);
		gph.addEdge("F","G", 8);
		gph.display();
		

	}

}

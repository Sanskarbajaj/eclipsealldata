package lecture1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		
		
		
		int[] arr1= {3,5,1,4};
		int[] arr2= {3,1,2,7,9};
		System.out.println(getIntersection(arr1, arr2));	
	}
	
	public static ArrayList<Integer> getIntersection(int[] arr1,int[] arr2){
		ArrayList<Integer> list=new ArrayList<Integer>();
		HashMap<Integer, Boolean> map = new HashMap<>();
		for(int i=0;i<arr1.length;i++)
		{
		map.put(arr1[i],false);
		}
		for(int i=0;i<arr2.length;i++)
		{
			if(map.containsKey(arr2[i]))
			{
				map.put(arr2[i],true);
				list.add(arr2[i]);
			}
		}
		return list;
		
	}

}

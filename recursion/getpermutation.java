package recursion;

import java.util.ArrayList;

public class getpermutation {

	public static void main(String[] args) {
		

	}
	public static ArrayList<String> getpermu(String str)
	{
		char cc=str.charAt(0);
		String ros=str.substring(1);
		ArrayList<String> myres=new ArrayList<String>();
		ArrayList<String> rr=getpermu(ros);
		for(int i=0;i<rr.size();i++)
		{
			for(int j=0)
		}
		
	}

}

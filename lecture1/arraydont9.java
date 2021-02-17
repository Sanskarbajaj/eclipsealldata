package lecture1;

import java.util.Scanner;

public class arraydont9 {

	public static void main(String[] args) {
		int count;
		int[] arr = { 1, 2, 1, 3, 2 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp;
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}

		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==arr[i+1])
			{
				
			}
			else
			{
				System.out.println(arr[i]);
			}
			
		}

	}
}

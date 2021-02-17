package lecture1;

import java.util.Scanner;

public class reverseofnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int num, n, rev = 0;
		num = s.nextInt();
		n = num;
		while (num != 0) {
			n = num % 10;
//			rev = rev*10 + n;
		System.out.print(n);
			num = num / 10;
		}
		//System.out.println(rev);

	}
}
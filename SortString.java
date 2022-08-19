package in.ineuron;

import java.util.*;

public class SortString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char[] c = str.toCharArray();
		Arrays.sort(c);
		System.out.println(String.valueOf(c));
		sc.close();
	}

}

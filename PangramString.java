package in.ineuron;

import java.util.Scanner;

public class PangramString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int[] alphabetList = new int[26];
		boolean flag = true;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ' ')
				continue;
			if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				alphabetList[str.charAt(i) - 'A']++;
			} else if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				alphabetList[str.charAt(i) - 'a']++;
			}
		}
		for(int i = 0; i < alphabetList.length; i++) {
			if(alphabetList[i] == 0) {
				flag = false;
				break;
			}
		}
		if(flag) {
				System.out.println("Pangram String");
		} else {
				System.out.println("Not a Pangram String");
		}
		sc.close();
	}
}
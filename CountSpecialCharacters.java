package in.ineuron;

import java.util.Scanner;

public class CountSpecialCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		int countSpecial = 0;
        for (int i = 0; i < str.length(); i++) {
        	if(str.substring(i, i+1).matches("[^A-Za-z0-9]")) {
        		countSpecial++;
        	}
        }
		System.out.println("The number of special characters are: " + countSpecial);
		scanner.close();
	}

}

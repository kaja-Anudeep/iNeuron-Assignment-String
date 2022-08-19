package in.ineuron;

public class ReverseSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Think Twice";
		str = str.toLowerCase();
		String array[] = str.split(" ");
		for(int i = 0; i < array.length; i++) {
			for(int j = array[i].length()-1; j >= 0; j--) {
				System.out.print(array[i].charAt(j));
			}
			System.out.print(" ");
		}
	}

}

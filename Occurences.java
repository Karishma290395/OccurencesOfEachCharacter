package test5;

public class Occurences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "Karishma";

		for (int i = 0; i < input.length(); i++) {
			int count = 1;
			for (int j = 0; j < input.length(); j++) {
				if (i != j && input.charAt(i) == input.charAt(j)) {
					count++;
				}

			}
			System.out.println(input.charAt(i) + " Occured " + count + " times");
		}
	}

}
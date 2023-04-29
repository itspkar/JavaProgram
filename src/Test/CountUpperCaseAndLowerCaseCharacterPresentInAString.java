package Test;
import java.util.Scanner;

public class CountUpperCaseAndLowerCaseCharacterPresentInAString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		char[] ch = str.toCharArray();

		int lower = 0;
		int upper = 0;

		for (int i = 0; i < ch.length; i++) {

			if (ch[i] >= 'a' && ch[i] <= 'z') {
				System.out.println("lower characters are " + "\t"+ ch[i]);
				lower++;

			} else if (ch[i] >= 'A' && ch[i] <= 'Z') {
				System.out.println("Upper characters are " + "\t" + ch[i]);
				upper++;

			}
		}

		System.out.println("Total upper case letters are = " + upper);
		System.out.println("Total lower case letters are= " + lower);

	}

}

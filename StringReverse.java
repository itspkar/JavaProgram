package Test;

public class StringReverse {

	public static void main(String[] args) {

		String str = "Automation";

		char[] ch = str.toCharArray();

		for (int i = ch.length - 1; i >= 0; i--) {
			if ((ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U')
					|| (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u')) {
				System.out.print(ch[i]);
			}
		}
	}
}

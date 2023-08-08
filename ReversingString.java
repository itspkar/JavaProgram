package Test;
public class ReversingString {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "I am good";
		char[] ch = str.toCharArray();		
		for(int i=ch.length-1;i>=0;i--) {
			System.out.print(ch[i]);
		}
	}
}

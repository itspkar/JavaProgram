package Test;
import java.util.LinkedHashSet;
public class RemoveDuplicateChar {
	public static void main(String[] args) {
		String str = "Remove Duplicate Character";
		char[] ch = str.toCharArray();
		
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		
		for(int i =0;i<ch.length;i++) {
			
			set.add(ch[i]);
	}
		System.out.println(set);
		
	}
}


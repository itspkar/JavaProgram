package Test;

import java.util.HashMap;
import java.util.Map;

public class DuplicateWordsInASentense {

	public static void main(String[] args) {
		 String str = "I Love Love Love India";
		 
	        Map<String, Integer> wordcount = new HashMap<>();
	 
	        String[] words = str.split(" ");
	 
	        for (String word : words) {
	            
	            if (wordcount.containsKey(word))
	                wordcount.put(word, wordcount.get(word) + 1);
	 
	            else
	                wordcount.put(word, 1);
	        }
	 
	        System.out.println(wordcount);
	    }

	}

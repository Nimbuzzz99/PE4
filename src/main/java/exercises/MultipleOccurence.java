package main.java.exercises;

import java.util.regex.*;

public class MultipleOccurence {
		public static String findIndex(String str , String find) {
			Pattern pattern = Pattern.compile(find);
	        Matcher matcher = pattern.matcher(str);
	        String index = "";
	        while(matcher.find()) {
	        	index += matcher.start()+"-"+matcher.end()+" "; 
	        }
			return index.trim();
		}
}

package main.java.exercises;

public class ReplaceDandF {
	public static String replace(String str) {
		String replacedString = str.replaceAll("d","f");
		replacedString = replacedString.replaceAll("l","t");
		return replacedString;
	}

}

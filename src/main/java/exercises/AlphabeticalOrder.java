package main.java.exercises;

import java.util.*;

public class AlphabeticalOrder {
		public static String order(String str) {
			String order[] = str.split("\\s");
			Arrays.sort(order);  
			StringBuilder sb = new StringBuilder();  
			for(String s:order){  
			   sb.append(s);  
			   sb.append(" ");  
			} 
			return sb.toString().trim();
		}
}

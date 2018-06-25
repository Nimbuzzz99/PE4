package main.java.exercises;

public class OccurenceCount {
     public static long count(String str , char req) {
    	long c = str.chars().filter(ch -> ch == req).count();
    	 return c;
     }
}

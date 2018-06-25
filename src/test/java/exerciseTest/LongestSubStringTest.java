package test.java.exerciseTest;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.exercises.LongestSubString;

public class LongestSubStringTest {

	@Test
	public void testSubString() {
		assertEquals("aabb",LongestSubString.subString("abcaabb"));
	}

}

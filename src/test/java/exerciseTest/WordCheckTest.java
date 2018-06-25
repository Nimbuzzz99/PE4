package test.java.exerciseTest;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.exercises.WordCheck;

public class WordCheckTest {

	@Test
	public void testWordChecker() {
		assertEquals(true,WordCheck.wordChecker("This is harry","harry"));
		assertEquals(false,WordCheck.wordChecker("This is harry","henry"));
	}

}

package test.java.exerciseTest;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.exercises.MultipleOccurence;

public class MultipleOccurenceTest {

	@Test
	public void testFindIndex() {
		assertEquals("4-6 10-12 27-29", 
				 MultipleOccurence.findIndex("She sells seashells by the seashore" , "se"));
	}

}

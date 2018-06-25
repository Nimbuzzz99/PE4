package test.java.exerciseTest;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.exercises.OccurenceCount;

public class OccurenceCountTest {

	@Test
	public void testCount() {
		assertEquals(3 , OccurenceCount.count("aye aye aye", 'a'));
	}

}

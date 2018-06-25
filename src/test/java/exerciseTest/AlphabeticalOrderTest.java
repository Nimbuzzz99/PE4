package test.java.exerciseTest;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.exercises.AlphabeticalOrder;

public class AlphabeticalOrderTest {

	@Test
	public void testOrder() {
		assertEquals("Be Hey There There", AlphabeticalOrder.order("Hey There Be There"));
	}

}

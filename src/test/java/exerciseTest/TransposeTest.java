package test.java.exerciseTest;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.exercises.Transpose;

public class TransposeTest {

	@Test
	public void testTransposeTheString() {
		assertEquals("a kciuq nworb xof spmuj revo eht yzal god"
				, Transpose.transposeTheString("a quick brown fox jumps over the lazy dog"));
	}

}

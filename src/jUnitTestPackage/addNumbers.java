package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class addNumbers {

	@Test
	public void test() {
		jUnitFunctions junit = new jUnitFunctions();
		int result = junit.addNumbers(350, 150);
		assertEquals(500, result);
	}

}

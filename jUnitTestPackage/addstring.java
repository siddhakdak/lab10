package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class addstring {

	@Test
	public void test() {
		jUnitFunctions junit = new jUnitFunctions();
		String result = junit.addString("lab10","siddhak");
		assertEquals("lab10siddhak",result);
	}

}

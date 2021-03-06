package au.com.egaiuser.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import au.com.egaiuser.ToGen;
import au.com.egaiuser.ToGenImpl;
import au.com.epigai.generator.SpecUnitTest;

public class ToGenTestD implements SpecUnitTest {

	private static Object staticTestObjectInstance;
	
	private ToGen toGenInstance;
	
	public void setInstanceToTest(Object testObjectInstance) {
		staticTestObjectInstance = testObjectInstance;
	}
	
	@Before
	public void setUp() throws Exception {
		if (staticTestObjectInstance != null && staticTestObjectInstance instanceof ToGen) {
			toGenInstance = (ToGen)staticTestObjectInstance;
		} else {
			toGenInstance = new ToGenImpl();
		}
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAddThenMultiA() {
		//System.out.println("in test addThenMultiA D");
		int result = toGenInstance.addThenMulti(1, 2, 3, 4);
		assertEquals(21, result);
	}
	
	@Test
	public void testAddThenMultiB() {
		//System.out.println("in test addThenMultiB D");
		int result = toGenInstance.addThenMulti(1, 0, 3, 4);
		assertEquals(7, result);
	}
	
	@Test
	public void testAddThenMultiC() {
		//System.out.println("in test addThenMultiC D");
		int result = toGenInstance.addThenMulti(0, 0, 3, 4);
		assertEquals(0, result);
	}
	
	@Test
	public void testAddThenMultiD() {
		//System.out.println("in test addThenMultiD D");
		int result = toGenInstance.addThenMulti(8, 2, 3, 4);
		assertEquals(70, result);
	}
	
	@Test
	public void testAddThenMultiE() {
		//System.out.println("in test addThenMultiB D");
		int result = toGenInstance.addThenMulti(3, 4, 1, 0);
		assertEquals(7, result);
	}
	
	@Test
	public void testAddThenMultiF() {
		//System.out.println("in test addThenMultiC D");
		int result = toGenInstance.addThenMulti(3, 4, 0, 0);
		assertEquals(0, result);
	}
	
	@Test
	public void testAddThenMultiG() {
		//System.out.println("in test addThenMultiD D");
		int result = toGenInstance.addThenMulti(8, 2, 6, 4);
		assertEquals(100, result);
	}
	
	@Test
	public void testAddThenMultiH() {
		//System.out.println("in test addThenMultiD D");
		int result = toGenInstance.addThenMulti(1, 1, 1, 1);
		assertEquals(4, result);
	}
	
	@Test
	public void testAddThenMultiJ() {
		//System.out.println("in test addThenMultiD D");
		int result = toGenInstance.addThenMulti(4, 1, 3, 4);
		assertEquals(35, result);
	}
	
	@Test
	public void testAddThenMultiK() {
		//System.out.println("in test addThenMultiD D");
		int result = toGenInstance.addThenMulti(2, 2, 3, 3);
		assertEquals(24, result);
	}
	
}

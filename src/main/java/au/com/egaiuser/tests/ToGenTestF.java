package au.com.egaiuser.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import au.com.egaiuser.ToGen;
import au.com.egaiuser.ToGenImpl;
import au.com.epigai.generator.SpecUnitTest;

public class ToGenTestF implements SpecUnitTest {

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
	public void testAddToMaxA() {
		//System.out.println("in test addThenMultiA D"); p
		int result = toGenInstance.divide(2, 2);
		assertEquals(1, result);
	}
	
	@Test
	public void testAddToMaxB() {
		//System.out.println("in test addThenMultiA D"); p
		int result = toGenInstance.divide(10, 5);
		assertEquals(2, result);
	}
	
	@Test
	public void testAddToMaxC() {
		//System.out.println("in test addThenMultiA D"); p
		int result = toGenInstance.divide(10, 1);
		assertEquals(10, result);
	}
	
	@Test
	public void testAddToMaxD() {
		//System.out.println("in test addThenMultiA D"); p
		int result = toGenInstance.divide(10, 3);
		assertEquals(3, result);
	}
	
}

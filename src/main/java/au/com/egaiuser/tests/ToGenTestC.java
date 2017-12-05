package au.com.egaiuser.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import au.com.egaiuser.ToGen;
import au.com.egaiuser.ToGenImpl;
import au.com.epigai.generator.SpecUnitTest;

public class ToGenTestC implements SpecUnitTest {

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
	public void testAddPlusOneA() {
		//System.out.println("in test addPlusOneA C");
		int result = toGenInstance.addPlusOne(1, 2);
		assertEquals(4, result);
	}
	
	@Test
	public void testAddPlusOneB() {
		//System.out.println("in test addPlusOneB C");
		int result = toGenInstance.addPlusOne(0, 0);
		assertEquals(1, result);
	}
	
	@Test
	public void testAddPlusOneC() {
		//System.out.println("in test addPlusOneC C");
		int result = toGenInstance.addPlusOne(2, 2);
		assertEquals(5, result);
	}
	
	@Test
	public void testAddPlusOneD() {
		//System.out.println("in test addPlusOneD C");
		int result = toGenInstance.addPlusOne(5, 7);
		assertEquals(13, result);
	}
	
}

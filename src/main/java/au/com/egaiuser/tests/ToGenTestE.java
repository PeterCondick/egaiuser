package au.com.egaiuser.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import au.com.egaiuser.ToGen;
import au.com.egaiuser.ToGenImpl;
import au.com.epigai.generator.SpecUnitTest;

public class ToGenTestE implements SpecUnitTest {

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
		int result = toGenInstance.addToMax(1, 2, 4);
		assertEquals(3, result);
	}
	
	@Test
	public void testAddToMaxB() {
		//System.out.println("in test addThenMultiA D"); p
		int result = toGenInstance.addToMax(1, 2, 0);
		assertEquals(0, result);
	}
	
	@Test
	public void testAddToMaxC() {
		//System.out.println("in test addThenMultiA D"); p
		int result = toGenInstance.addToMax(40, 50, 100);
		assertEquals(90, result);
	}
	
	@Test
	public void testAddToMaxD() {
		//System.out.println("in test addThenMultiA D"); f
		int result = toGenInstance.addToMax(60, 50, 100);
		assertEquals(100, result);
	}
	
	@Test
	public void testAddToMaxE() {
		//System.out.println("in test addThenMultiA D"); p
		int result = toGenInstance.addToMax(3, 2, 100);
		assertEquals(5, result);
	}
	
	@Test
	public void testAddToMaxF() {
		//System.out.println("in test addThenMultiA D"); p
		int result = toGenInstance.addToMax(50, 50, 100);
		assertEquals(100, result);
	}
	
	@Test
	public void testAddToMaxG() {
		//System.out.println("in test addThenMultiA D"); P
		int result = toGenInstance.addToMax(50, 49, 100);
		assertEquals(99, result);
	}
	
	@Test
	public void testAddToMaxH() {
		//System.out.println("in test addThenMultiA D"); F
		int result = toGenInstance.addToMax(50, 51, 100);
		assertEquals(100, result);
	}
	
	@Test
	public void testAddToMaxI() {
		//System.out.println("in test addThenMultiA D"); F
		int result = toGenInstance.addToMax(6, 6, 6);
		assertEquals(6, result);
	}
	
	@Test
	public void testAddToMaxJ() {
		//System.out.println("in test addThenMultiA D"); F
		int result = toGenInstance.addToMax(51, 50, 100);
		assertEquals(100, result);
	}
	
	@Test
	public void testAddToMaxK() {
		//System.out.println("in test addThenMultiA D"); p
		int result = toGenInstance.addToMax(3, 2, 6);
		assertEquals(5, result);
	}
	
	@Test
	public void testAddToMaxL() {
		//System.out.println("in test addThenMultiA D"); p
		int result = toGenInstance.addToMax(3, 0, 6);
		assertEquals(3, result);
	}
}

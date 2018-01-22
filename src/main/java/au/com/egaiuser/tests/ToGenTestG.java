package au.com.egaiuser.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import au.com.egaiuser.ToGen;
import au.com.egaiuser.ToGenImpl;
import au.com.epigai.generator.SpecUnitTest;

public class ToGenTestG implements SpecUnitTest {

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
	public void testAddIfNotEqualA() {
		//System.out.println("in test addThenMultiA D"); p
		int result = toGenInstance.addIfNotEqual(2, 2);
		assertEquals(0, result);
	}
	
	@Test
	public void testAddIfNotEqualB() {
		//System.out.println("in test addThenMultiA D"); p
		int result = toGenInstance.addIfNotEqual(10, 5);
		assertEquals(15, result);
	}
	
	@Test
	public void testAddIfNotEqualC() {
		//System.out.println("in test addThenMultiA D"); p
		int result = toGenInstance.addIfNotEqual(10, 1);
		assertEquals(11, result);
	}
	
	@Test
	public void testAddIfNotEqualD() {
		//System.out.println("in test addThenMultiA D"); p
		int result = toGenInstance.addIfNotEqual(10, 3);
		assertEquals(13, result);
	}
	
	@Test
	public void testAddIfNotEqualE() {
		//System.out.println("in test addThenMultiA D"); p
		int result = toGenInstance.addIfNotEqual(3, 3);
		assertEquals(0, result);
	}
	
	@Test
	public void testAddIfNotEqualF() {
		//System.out.println("in test addThenMultiA D"); p
		int result = toGenInstance.addIfNotEqual(10, 10);
		assertEquals(0, result);
	}
	
	@Test
	public void testAddIfNotEqualG() {
		//System.out.println("in test addThenMultiA D"); p
		int result = toGenInstance.addIfNotEqual(0, 0);
		assertEquals(0, result);
	}
	
	@Test
	public void testAddIfNotEqualH() {
		//System.out.println("in test addThenMultiA D"); p
		int result = toGenInstance.addIfNotEqual(1, 0);
		assertEquals(1, result);
	}
}

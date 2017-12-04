package au.com.egaiuser.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import au.com.egaiuser.ToGen;
import au.com.egaiuser.ToGenImpl;
import au.com.epigai.generator.SpecUnitTest;

public class ToGenTest implements SpecUnitTest {

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
	public void testAdd() {
		System.out.println("In test Add");
		int result = toGenInstance.add(1, 1);
		assertEquals(2, result);
	}

	@Test
	public void testAddAgain() {
		System.out.println("In test AddAgain");
		int result = toGenInstance.add(1, 10);
		assertEquals(11, result);
	}
	
}

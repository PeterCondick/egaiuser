package au.com.egaiuser;

import java.lang.reflect.Method;

import au.com.epigai.generator.Generator;
import au.com.epigai.generator.SpecUnitTest;

public class EpigaiRunner {

	public static void main(String[] args) {
		
		System.out.println("about to call the generator");

		//generateAdd();
		//generateAddPlusOne();
		//generateAddThenMulti();
		generateAddToMax();
		//generateDivide();
		
		System.out.println("called the generator");
		
	}

	private static void generateAdd() {
		Class interfaceToImpl = ToGen.class;
		Method methodToImpl = null;
		try {
			methodToImpl = interfaceToImpl.getMethod("add", new Class[] {int.class, int.class});
		} catch (NoSuchMethodException nsme) {
			System.out.println("caught a nsme");
			nsme.printStackTrace();
		}
		
		SpecUnitTest testA = new au.com.egaiuser.tests.ToGenTest();
		SpecUnitTest testB = new au.com.egaiuser.tests.ToGenTestB();
		
		Generator.generate(interfaceToImpl, methodToImpl, testA, testB);
	}
	
	private static void generateAddPlusOne() {
		Class interfaceToImpl = ToGen.class;
		Method methodToImpl = null;
		try {
			methodToImpl = interfaceToImpl.getMethod("addPlusOne", new Class[] {int.class, int.class});
		} catch (NoSuchMethodException nsme) {
			System.out.println("caught a nsme");
			nsme.printStackTrace();
		}
		
		SpecUnitTest testA = new au.com.egaiuser.tests.ToGenTestC();
		
		Generator.generate(interfaceToImpl, methodToImpl, testA);
	}
	
	private static void generateAddThenMulti() {
		Class interfaceToImpl = ToGen.class;
		Method methodToImpl = null;
		try {
			methodToImpl = interfaceToImpl.getMethod("addThenMulti", new Class[] {int.class, int.class, int.class, int.class});
		} catch (NoSuchMethodException nsme) {
			System.out.println("caught a nsme");
			nsme.printStackTrace();
		}
		
		SpecUnitTest testA = new au.com.egaiuser.tests.ToGenTestD();
		
		Generator.generate(interfaceToImpl, methodToImpl, testA);
	}
	
	private static void generateAddToMax() {
		Class interfaceToImpl = ToGen.class;
		Method methodToImpl = null;
		try {
			methodToImpl = interfaceToImpl.getMethod("addToMax", new Class[] {int.class, int.class, int.class});
		} catch (NoSuchMethodException nsme) {
			System.out.println("caught a nsme");
			nsme.printStackTrace();
		}
		
		SpecUnitTest testA = new au.com.egaiuser.tests.ToGenTestE();
		
		Generator.generate(interfaceToImpl, methodToImpl, testA);
	}
	
	private static void generateDivide() {
		Class interfaceToImpl = ToGen.class;
		Method methodToImpl = null;
		try {
			methodToImpl = interfaceToImpl.getMethod("divide", new Class[] {int.class, int.class});
		} catch (NoSuchMethodException nsme) {
			System.out.println("caught a nsme");
			nsme.printStackTrace();
		}
		
		SpecUnitTest testA = new au.com.egaiuser.tests.ToGenTestF();
		
		Generator.generate(interfaceToImpl, methodToImpl, testA);
	}
	
	
}

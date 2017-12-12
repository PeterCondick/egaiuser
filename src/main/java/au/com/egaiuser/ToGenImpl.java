package au.com.egaiuser;

public class ToGenImpl implements ToGen {

	public int add(int arg0, int arg1) {
		System.out.println("in ToGenImpl add");
		return 0;
	}
	
	public int addPlusOne(int arg0, int arg1) {
		System.out.println("in ToGenImpl addPlusOne");
		return 0;
	}
	
	public int addThenMulti(int arg0, int arg1, int arg2, int arg3) {
		System.out.println("in ToGenImpl addThenMulti");
		return 0;
//		int var1 = arg3 + arg2;
//		int var2 = 1;
//		int var3 = arg1 + arg0;
//		int var4 = var3 * var1;
//		return var4;
	}
	
}

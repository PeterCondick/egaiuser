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
		//return 0;
//		arg3 = arg2 + arg3;
//		arg0 = arg0 * arg3;
//		int var1 = arg3 * arg1;
//		arg1 = 0;
//		arg3 = arg0 + var1;
//		return arg3;
	    int var1 = arg2 + arg3;
	    int var2 = arg0 + arg1;
	    int var3 = var1 * var2;
	    return var3;
	}
	
	public int addToMax(int arg0, int arg1, int arg2) {
		System.out.println("in ToGenImpl addToMax");
		return 0;
	}
	
	public int divide(int a, int b) {
		System.out.println("in ToGenImpl divide");
		return 0;
	}
	
}

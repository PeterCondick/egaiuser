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
//		int var1 = arg0 * arg3;
//	    var1 = arg2 + arg3;
//	    var1 = var1 * arg0;
//	    int var2 = arg1 + arg0;
//	    var1 = var1 * var2;
//	    if (var1 > var2) {
//	        int var3 = var2 / arg0;
//	        var1 = var1 / arg0;
//	        var2 = var1 * arg3;
//	    }
//	    return var1;
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

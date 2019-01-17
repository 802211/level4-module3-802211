package _02_gotta_catchem_all;

public class ExceptionMethods {
	
	public static double divide(double num, double den) throws IllegalArgumentException {
		double x;
		if(den == 0.0) {
			throw new IllegalArgumentException();
		} else {
			x = num/den;
		}
		return x;
	}
	public static String reverseString(String str) throws IllegalStateException {
		String rev = "";
		if(str.equals("")) {
			throw new IllegalStateException();
		} else {
			for(int i = str.length(); i>0; i--) {
				rev = rev + str.substring(i-1, i);
			}
		}
		return rev;
	}
	
}

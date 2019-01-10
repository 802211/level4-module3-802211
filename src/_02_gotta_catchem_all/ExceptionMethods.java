package _02_gotta_catchem_all;

public class ExceptionMethods {
	public static void divide(double num, double den) {
		if(den == 0.0) {
			throw new IllegalArgumentException();
		}
	}
}

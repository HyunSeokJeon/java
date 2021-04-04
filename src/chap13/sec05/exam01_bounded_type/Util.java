package chap13.sec05.exam01_bounded_type;

public class Util {
	public static <T extends Number> int compare(T n1, T n2) {
		double v1 = n1.doubleValue();
		double v2 = n2.doubleValue();
		return Double.compare(v1, v2);
	}
}

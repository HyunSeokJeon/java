package chap10.verify.exam00;

public class UsingEx {
	public int add(int x, int y) {
		return x + y;
	}

	public int sub(int x, int y) throws MyZeroException {
		if (y == 0) {
			throw new MyZeroException("0으로 나누지 마라");
		}
		return (x / y);
	}

	public int subs(int x, int y) throws MyZeroException {
		return sub(x, y);
	}

	public int adds(int a, int b) {
		return (a / b);
	}
}

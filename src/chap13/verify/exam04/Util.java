package chap13.verify.exam04;

public class Util {
	public static <P extends Pair<K,V>, K, V> V getValue(P p, K k) {
		if(k == p.getKey()) {
			return p.getValue();
		}
		return null;
	}
}

package chap04.sec03.exam01_for;

public class ForMultipicationTable {
	public static void main(String[] args) {
		for (int dan = 2; dan <= 9; dan++) {
			System.out.print("[" + dan + "´Ü]" + "\t");
		}
		System.out.println();
		
		
		// dan * i = dan*i tab
		for (int i = 1; i <= 9; i ++) {
			for(int dan = 2; dan <= 9; dan++) {
				System.out.print(dan + "*" + i + "=" + dan*i + "\t");
			}
			System.out.println();
		}
	}
}

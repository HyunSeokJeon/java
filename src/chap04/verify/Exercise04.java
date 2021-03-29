package chap04.verify;

public class Exercise04 {
	public static void main(String[] args) {
//		int dice1 = (int) (Math.random() * 6) + 1;
//		int dice2 = (int) (Math.random() * 6) + 1;
//		
//		while(dice1 + dice2 != 5) {
//			System.out.println("(" + dice1 + ", " + dice2 + ")");
//			dice1 = (int) (Math.random() * 6) + 1;
//			dice2 = (int) (Math.random() * 6) + 1;
//		}
//		System.out.println("(" + dice1 + ", " + dice2 + ")");
//		
		
		while(true) {
			int dice1 = (int) (Math.random() * 6) + 1;
			int dice2 = (int) (Math.random() * 6) + 1;
			System.out.println("(" + dice1 + ", " + dice2 + ")");
			if(dice1 + dice2 == 5) {
				break;
			}
		}
		
		
		
		//ceil
		int dice3 = (int) Math.ceil(Math.random() * 6);
		System.out.println(dice3);
	}
}

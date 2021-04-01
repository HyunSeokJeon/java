package chap12.verify.exam00_cake;

public class CakeEatings{
	public static void main(String[] args) {
		CakePlate cp = new CakePlate();
		
		CakeEater ce = new CakeEater(cp);
		CakeMaker cm = new CakeMaker(cp);
		
		cm.start();
		ce.start();
	}
	
	
}

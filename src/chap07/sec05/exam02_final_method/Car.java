package chap07.sec05.exam02_final_method;

public class Car {
	// ÇÊµå
	public int speed;
	
	// ¸Þ¼Òµå
	public void speedUp() {
		speed += 1;
	}
	
	public final void stop() {
		System.out.println("Â÷¸¦ ¸ØÃã");
		speed = 0;
	}
}

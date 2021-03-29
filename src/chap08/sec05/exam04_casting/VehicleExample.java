package chap08.sec05.exam04_casting;

public class VehicleExample {
	public static void main(String[] args) {
		Vehicle ve;
		ve = new Bus();
		ve.run();
		
		Bus bus = (Bus)ve;
		bus.checkFare();
		
	}
}

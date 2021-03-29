package chap07.sec07.exam05_method_polymorphism;

public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Texi text = new Texi();
		
		driver.drive(bus);
		driver.drive(text);
	}
	
}

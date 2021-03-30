package chap11.sec06.exam01_class;

public class ClassExample {
	public static void main(String[] args) {
		Car car = new Car();
		Class clazz = car.getClass(); // ��ü.getClass()�� �ش� ��ü�� Class ��ü�� ��´�.
		System.out.println(clazz.getName());
		System.out.println(clazz.getSimpleName());
		System.out.println(clazz.getPackage().getName());
		System.out.println();
		
		try {
			// Class.forName()�� �ش� ��ü�� Class ��ü�� ��´�.
			Class clazz2 = Class.forName("chap11.sec06.exam01_class.Car");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}

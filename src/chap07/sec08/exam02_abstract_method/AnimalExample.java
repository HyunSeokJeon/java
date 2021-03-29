package chap07.sec08.exam02_abstract_method;

public class AnimalExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		dog.sound();
		cat.sound();
		// 변수의 자동타입변환
		Animal animal = null;
		animal = new Dog();
		animal.sound();
		animal = new Cat();
		animal.sound();
     
	}
}

package chap10.sec02_runtime_exception;

public class ClassCastException {
	public static void main(String[] args) {
		Animal animal = new Animal();
		
		animal = new Dog();
		animal = new Cat();
		
//		Dog dog = new Cat();
	}
}

class Animal{
	
}
class Dog extends Animal{
	
}
class Cat extends Animal{
	
}
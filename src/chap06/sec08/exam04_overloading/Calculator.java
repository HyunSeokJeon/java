package chap06.sec08.exam04_overloading;

public class Calculator {
	// 클래스의 구성 맴버
	// 1. 필드
	// 2. 생성자
	// 3. 메소드
	// 정사각형의 넓이

	double areaRectangle(double width) {
		return width * width;
	}

	// 직사각형의 넓이
	double areaRectangle(double width, double height) {
		return width * height;
	}
}

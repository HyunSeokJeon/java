package chap11.sec07.exam02_method;

public class StringIndexOfExample {
	public static void main(String[] args) {
		String subject = "자바 프로그래밍";
		
		int location = subject.indexOf("프로그래밍");
		System.out.println(location);
		
		if(subject.indexOf("바다") != -1) {
			System.out.println("자바와 관련된책이군요");
		} else {
			System.out.println("자바와 관련이 없군요.");
		}
	}
}

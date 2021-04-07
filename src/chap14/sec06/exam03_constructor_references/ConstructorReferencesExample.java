package chap14.sec06.exam03_constructor_references;

import java.util.function.Function;

public class ConstructorReferencesExample {
	public static void main(String[] args) {
		//익명구현객체
		Function<String, Member> function1 = new Function<String, Member>() {

			@Override
			public Member apply(String t) {
				return new Member(t);
			}
			
		};
		// 람다식 
		function1 = t -> new Member(t);
		Function<String, Member> function3 = Member::new;
		Member member3 = function3.apply("홍길동");
		
		
	}
}

package chap11.sec05.Exam04_getproperty;

import java.util.Properties;
import java.util.Set;

public class GetPropertyExample {
	public static void main(String[] args) {
		
		// 자바 버전
		System.out.println(System.getProperty("java.version"));
		
		// JRE 파일경로
		System.out.println(System.getProperty("java.home"));
		
		// 사용자 OS이름
		System.out.println(System.getProperty("os.name"));
		
		
		System.out.println(System.getProperty("file.separator"));
		
		// 사용자 이름
		System.out.println(System.getProperty("user.name"));
		
		// 홈 디렉토리
		System.out.println(System.getProperty("user.home"));
		
		// 현재 작업 중인 디렉토리 경로
		System.out.println(System.getProperty("user.dir"));
		
		System.out.println("-----------------------------------------------------------");
		
		// map 자료구조: {key:value} 예) {String : String} <-- Properties
		Properties prop = System.getProperties();
		
		// set 자료구조: 순서가 없고, 자료가 중복할 수 없고, null 허용
		// set<Object> Properties에서 keyset()메소드로 
		// Object를 담고있는 Set을 가져옴
		Set<Object> keys = prop.keySet();
		
		for(Object key : keys) {
			//				   String key 로 		   property를 출력
			System.out.println(key.toString() + " : " +prop.getProperty(key.toString()));
		}
	}
}

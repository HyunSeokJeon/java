package chap06.verify;

import java.util.Scanner;

public class MemberInput {
	public static void main(String[] args) {
		// 객체 배열
		MemberInfo01[] m = new MemberInfo01[5];
		int i = 0;
		// 아래에 코드를 입력하세요.
		Scanner scan = new Scanner(System.in);
		System.out.println("회원수를 입력하세요 최소 2명, 최대 5명까지 입력 가능합니다.");
		boolean a = true;
		int num = 0;
		while(a) {
			num = Integer.parseInt(scan.nextLine());
			if(num >= 2 && num <= 5) {
				a = false;
				break;
			}
			scan.nextLine();
			System.out.println("다시 입력하세요 최소 2명, 최대 5명까지 입력 가능합니다.");
		}
		String str;
		int in;
		for(i = 0; i < num; i++) {	
			m[i] = new MemberInfo01();
			System.out.print("이름을 입력하세요 ");
			str = scan.nextLine();
			m[i].setName(str);
			System.out.print("나이를 입력하세요 ");
			in = Integer.parseInt(scan.nextLine());
			m[i].setAge(in);
			System.out.print("이메일을 입력하세요 ");
			str = scan.nextLine();
			m[i].setEmail(str);
			System.out.print("주소를 입력하세요 ");
			str = scan.nextLine();
			m[i].setAddress(str);
			System.out.println();
		}
		
		i = 0;
		for(i = 1; i < num+1; i++) {
			System.out.println(i + "번 이름:" + m[i].getName());
			System.out.println(i + "번 이름:" + m[i].getAge());
			System.out.println(i + "번 이름:" + m[i].getEmail());
			System.out.println(i + "번 이름:" + m[i].getAddress());
			System.out.println();
		}
		
		scan.close();
		
		
	}
}

class MemberInfo01 {
	private String name;
	private int age;
	private String email;
	private String address;
	// 아래에 코드를 입력하세요.
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
}
package chap06.verify;

import java.util.Scanner;

public class MemberInput {
	public static void main(String[] args) {
		// ��ü �迭
		MemberInfo01[] m = new MemberInfo01[5];
		int i = 0;
		// �Ʒ��� �ڵ带 �Է��ϼ���.
		Scanner scan = new Scanner(System.in);
		System.out.println("ȸ������ �Է��ϼ��� �ּ� 2��, �ִ� 5����� �Է� �����մϴ�.");
		boolean a = true;
		int num = 0;
		while(a) {
			num = Integer.parseInt(scan.nextLine());
			if(num >= 2 && num <= 5) {
				a = false;
				break;
			}
			scan.nextLine();
			System.out.println("�ٽ� �Է��ϼ��� �ּ� 2��, �ִ� 5����� �Է� �����մϴ�.");
		}
		String str;
		int in;
		for(i = 0; i < num; i++) {	
			m[i] = new MemberInfo01();
			System.out.print("�̸��� �Է��ϼ��� ");
			str = scan.nextLine();
			m[i].setName(str);
			System.out.print("���̸� �Է��ϼ��� ");
			in = Integer.parseInt(scan.nextLine());
			m[i].setAge(in);
			System.out.print("�̸����� �Է��ϼ��� ");
			str = scan.nextLine();
			m[i].setEmail(str);
			System.out.print("�ּҸ� �Է��ϼ��� ");
			str = scan.nextLine();
			m[i].setAddress(str);
			System.out.println();
		}
		
		i = 0;
		for(i = 1; i < num+1; i++) {
			System.out.println(i + "�� �̸�:" + m[i].getName());
			System.out.println(i + "�� �̸�:" + m[i].getAge());
			System.out.println(i + "�� �̸�:" + m[i].getEmail());
			System.out.println(i + "�� �̸�:" + m[i].getAddress());
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
	// �Ʒ��� �ڵ带 �Է��ϼ���.
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
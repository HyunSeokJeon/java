package chap11.sec07.exam01_contructor;

import java.io.IOException;

public class KeyBoardToStringExample {
	public static void main(String[] args) throws IOException {
		
		byte[] bytes = new byte[100];
		
		System.out.print("�Է�: ");
		int readByteNo = System.in.read(bytes);
		System.out.println(readByteNo);
		
		String str = new String(bytes, 0, readByteNo - 2);  // -2 = ĳ��������(\r) + �����ǵ�(\n)
		System.out.println(str);
	}
}

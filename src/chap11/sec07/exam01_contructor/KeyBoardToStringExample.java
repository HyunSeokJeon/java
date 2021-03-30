package chap11.sec07.exam01_contructor;

import java.io.IOException;

public class KeyBoardToStringExample {
	public static void main(String[] args) throws IOException {
		
		byte[] bytes = new byte[100];
		
		System.out.print("입력: ");
		int readByteNo = System.in.read(bytes);
		System.out.println(readByteNo);
		
		String str = new String(bytes, 0, readByteNo - 2);  // -2 = 캐리지리턴(\r) + 라인피드(\n)
		System.out.println(str);
	}
}

package chap11.sec07.exam01_contructor;

import java.io.IOException;

public class ByteToStringExample {
	public static void main(String[] args) throws IOException {
		byte[] bytes = {72, 101, 108, 108, 111, 32, 74, 97, 118, 97};
		
		String str = new String(bytes);
		System.out.println(str);
		
		String str2 = new String(bytes, 6, 4);
		System.out.println(str2);
		
		
	}
}

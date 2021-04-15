package chap18.sec02.exam04_writer_write;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample4 {
	public static void main(String[] args) throws Exception{
		Writer writer = new FileWriter("C:/Temp/test.txt");
		String data = "홍길동이 나가신다";
		writer.write(data, 1, 4);;
		writer.flush();
		writer.close();
	}
}

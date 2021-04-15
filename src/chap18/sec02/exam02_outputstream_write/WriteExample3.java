package chap18.sec02.exam02_outputstream_write;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample3 {
	public static void main(String[] args) throws Exception{
		OutputStream os = new FileOutputStream("C:/Temp/test.txt");
		byte[] data = "this is java".getBytes();
		os.write(data, 1, 3);
		os.flush();
		os.close();
	}
}

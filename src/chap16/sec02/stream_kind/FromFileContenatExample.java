package chap16.sec02.stream_kind;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FromFileContenatExample {
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("src/chap16/sec02/stream_kind/linedata.txt");
		Stream<String> stream;
		
		//Files.lines() 메소드 이용
		stream = Files.lines(path, Charset.defaultCharset());
		stream.forEach(s -> System.out.println(s));
		// 정적메소드 참조
//		stream.forEach(System.out::println);
		System.out.println();
		
		//BufferedREader의 lines()메소드 이용
		File file = path.toFile();
		FileReader fileReader = new FileReader(file);
		BufferedReader br = new BufferedReader(fileReader);
		stream = br.lines();
		stream.forEach(System.out::println);
	}
}

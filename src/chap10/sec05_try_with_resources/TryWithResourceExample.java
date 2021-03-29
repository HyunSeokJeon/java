package chap10.sec05_try_with_resources;

public class TryWithResourceExample {
	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("file.txt")) {
			fis.read();
			throw new Exception();
		} catch(Exception e) {
			System.out.println("예외 처리 코드가 발생되었습니다.");
		}
		
//		FileInputStream fis = new FileInputStream("file.txt");;
//		try {
//			
//			fis.read();
//			throw new Exception();
//		} catch(Exception e) {
//			System.out.println("예외 처리 코드가 발생되었습니다.");
//		}finally {
//			fis.close();
//		}
	}
}

package chap20.sec01.exam01_jdbc;

public class JDBC_Connect01 {
	public static void main(String[] args) {
		
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		
		try {
			Class.forName(driver);
			System.out.println("JDBC Driver Loading 성공");
		}catch(Exception e) {
			System.out.println("실패");
			e.printStackTrace();
		}
	}
}

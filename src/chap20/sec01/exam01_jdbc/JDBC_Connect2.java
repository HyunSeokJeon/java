package chap20.sec01.exam01_jdbc;

import java.sql.*;

public class JDBC_Connect2 {
	public static void main(String[] args) {
		
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		
		Connection con = null;
		
		
		try {
			Class.forName(driver);
			
			con = DriverManager.getConnection(url, "SCOTT", "TIGER");
			
			System.out.println("JDBC Driver Loading 성공");
		}catch(Exception e) {
			System.out.println("실패");
			e.printStackTrace();
		}finally {
			try {
				if(con != null) {
					con.close();
				}
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}

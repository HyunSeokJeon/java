package chap20.sec01.exam01_jdbc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBC_Insert {
	public static void main(String[] args) {

		String driver = "oracle.jdbc.driver.OracleDriver";
		
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		
		Connection con = null;
		Statement stmt = null;
		
		String sql;
		
		String name, email, tel, no;
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, "SCOTT", "TIGER");
			stmt = con.createStatement();
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println(" customer 테이블에 값 입력하기 ....");
			System.out.print(" 번호 입력: ");
			no = br.readLine();
			System.out.print(" 이름 입력: ");
			name = br.readLine();
			System.out.print(" 이메일 입력: ");
			email = br.readLine();
			System.out.print(" 전화번호 입력: ");
			tel = br.readLine();
			sql = "INSERT INTO CUSTOMER(NO, NAME, EMAIL, TEL) VALUES  (" + no + ",'" + name + "','" + email + "','" + tel + "')";
			
			int res = stmt.executeUpdate(sql);
			
			if (res == 1) {
				System.out.println("success");
			}else {
				System.out.println("failed");
			}
				
			
		}catch(Exception e) {
			System.out.println("데이터베이스 연결 실패");
		}finally {
			try {
				// if( rs != null ) rs.close();
				if (stmt != null)
				stmt.close();
				if (con != null)
				con.close();
				} catch (Exception e) {
				System.out.println(e.getMessage());
				}
		}
	}
}

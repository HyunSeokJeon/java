package chap20.sec02.exam01_statement;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBC_delete {
	public static void main(String[] args) {
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql;
		
		String name, email, tel, no;
		
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, "SCOTT", "TIGER");
			
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println(" custom 테이블에 값 입력하기.....");
			System.out.print(" 번호 입력: ");
			no = br.readLine();
			System.out.print(" 이름 입력: ");
			name = br.readLine();
			System.out.print(" 이메일 입력: ");
			email = br.readLine();
			System.out.print(" 전화번호 입력: ");
			tel = br.readLine();
			
			int ino = Integer.parseInt(no);
			
			sql = "INSERT INTO CUSTOMER (NO, NAME, EMAIL, TEL) VALUES(?,?,?,?)";
			pstmt = con .prepareStatement(sql);
			pstmt.setInt(1, ino);
			pstmt.setString(2, name);
			pstmt.setString(3, email);
			pstmt.setString(4, tel);
			int result = pstmt.executeUpdate();
			if (result == 1) {
				System.out.println("데이터 입력 성공");
			}else {
				System.out.println("실패");
			}
			
			
		}catch(Exception e) {
			System.out.println("연결 실패");
		}finally {
			try {
				if(pstmt !=null) {
					pstmt.close();
				}
				if(con != null) {
					con.close();
				}
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}

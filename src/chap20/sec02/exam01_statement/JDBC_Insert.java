package chap20.sec02.exam01_statement;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBC_Insert {
	public static void main(String[] args) {
		
		String driver = "oracle.jdbc.driver.OracleDriver";
		
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql;
		
		String no;
		
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, "SCOTT", "TIGER");
			
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println(" 삭제할 회원번호 입력");
			System.out.print(" 번호 입력: ");
			no = br.readLine();
			
			
			int ino = Integer.parseInt(no);
			
			sql = "DELETE CUSTOMER WHERE NO=(?)";
			pstmt = con .prepareStatement(sql);
			pstmt.setInt(1, ino);

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

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
			System.out.println(" ������ ȸ����ȣ �Է�");
			System.out.print(" ��ȣ �Է�: ");
			no = br.readLine();
			
			
			int ino = Integer.parseInt(no);
			
			sql = "DELETE CUSTOMER WHERE NO=(?)";
			pstmt = con .prepareStatement(sql);
			pstmt.setInt(1, ino);

			int result = pstmt.executeUpdate();
			if (result == 1) {
				System.out.println("������ �Է� ����");
			}else {
				System.out.println("����");
			}
			
			
		}catch(Exception e) {
			System.out.println("���� ����");
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

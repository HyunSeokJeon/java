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
			System.out.println(" custom ���̺� �� �Է��ϱ�.....");
			System.out.print(" ��ȣ �Է�: ");
			no = br.readLine();
			System.out.print(" �̸� �Է�: ");
			name = br.readLine();
			System.out.print(" �̸��� �Է�: ");
			email = br.readLine();
			System.out.print(" ��ȭ��ȣ �Է�: ");
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

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
			
			System.out.println(" customer ���̺� �� �Է��ϱ� ....");
			System.out.print(" ��ȣ �Է�: ");
			no = br.readLine();
			System.out.print(" �̸� �Է�: ");
			name = br.readLine();
			System.out.print(" �̸��� �Է�: ");
			email = br.readLine();
			System.out.print(" ��ȭ��ȣ �Է�: ");
			tel = br.readLine();
			sql = "INSERT INTO CUSTOMER(NO, NAME, EMAIL, TEL) VALUES  (" + no + ",'" + name + "','" + email + "','" + tel + "')";
			
			int res = stmt.executeUpdate(sql);
			
			if (res == 1) {
				System.out.println("success");
			}else {
				System.out.println("failed");
			}
				
			
		}catch(Exception e) {
			System.out.println("�����ͺ��̽� ���� ����");
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

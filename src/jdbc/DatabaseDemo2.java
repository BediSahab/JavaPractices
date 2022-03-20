package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DatabaseDemo2 {

	public static void main(String[] args) throws SQLException {
		
		Connection con = DriverManager.getConnection("jdbc:sqlite:G:\\Selenium\\sqlite-tools-win32-x86-3380100\\univ.db");
		PreparedStatement st = con.prepareStatement("select * from dept where deptno=?");

		Scanner s = new Scanner(System.in);
		System.out.println("Enter Department No: ");
		st.setInt(1, s.nextInt());
	
		ResultSet rs = st.executeQuery();
		while(rs.next())
		{
			System.out.print(rs.getInt("deptno")+" ");
			System.out.print(rs.getString("dname")+" ");
		}
		s.close();
	}

}

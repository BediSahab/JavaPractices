package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseDemo {

	public static void main(String[] args) throws SQLException {
		
		Connection con = DriverManager.getConnection("jdbc:sqlite:G:\\Selenium\\sqlite-tools-win32-x86-3380100\\univ.db");
		Statement st = con.createStatement();

		ResultSet rs = st.executeQuery("select * from dept");
		
		int dno;
		String name;
		
		while(rs.next())
		{
			dno= rs.getInt("deptno");
			name = rs.getString("dname");
			
			System.out.println(dno+" "+name);
		}
	}

}

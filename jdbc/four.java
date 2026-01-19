package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class four {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("class not found");
		}
		
		Connection cn= null;
		try {
			cn = DriverManager.getConnection("jdbc:mysql://localhost/customer", "root", "");
		} catch (SQLException e) {
			System.out.println("connection not found");
		}
		
		String datainsert= "insert into emp(ename,eadd,emob)value (?,?,?)";
		
		String dataupdate ="update emp set ename=?,eadd=?,emob=? where eid=?";
		
		String datafetch = "select * from emp";
		
		String datadelete = "delete from emp where eid=?";
		
		try {
			/*		PreparedStatement pm = cn.prepareStatement(datainsert);
			pm.setString(1, "ram");
			pm.setString(2, "max");
			pm.setString(3, "88");
			
			int a = pm.executeUpdate();
			
			if(a > 0) {
				System.out.println("data inserted");
			}

			
			PreparedStatement pr1 = cn.prepareStatement(dataupdate);
			pr1.setString(1, "lord ram");
			pr1.setString(2, "mathura");
			pr1.setString(3, "12345");
			
			pr1.setInt(4, 6);
			
			int a2 = pr1.executeUpdate();
			
			if(a2 > 0) {
				System.out.println("data upated");
			}
			
			
			PreparedStatement pr2 = cn.prepareStatement(datadelete);
			pr2.setInt(1, 6);
			
			int a3 = pr2.executeUpdate();
			
			if(a3 > 0) {
				System.out.println("data delted");
			}
			*/
			
			Statement s = cn.createStatement();
			
			ResultSet rs = s.executeQuery(datafetch);
			
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
			}
			
			
	} catch (SQLException e) {
			System.out.println("data not inserted");
		}
		
		
	}

}

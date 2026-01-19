package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
		System.out.println("class not found");
		}
		Connection cp= null;
		try {
			cp = DriverManager.getConnection("jdbc:mysql://localhost/customer", "root", "");
		} catch (SQLException e) {
			System.out.println("connection not found");
		}
		
		String datainsert = "insert into emp(ename,eadd,emob) values(?,?,?)";
		
		String dataupdate = "update emp SET ename=?,eadd=?,emob=? where eid=?";
		
		String datadelete = "delete from emp where eid=?";
		
		String datafetch = "select * from emp";
		
		try {
		/*	PreparedStatement pr= cp.prepareStatement(datainsert);
			
			pr.setString(1,"void");
			pr.setString(2,"amd");
			pr.setString(3,"94");
			
			int a= pr.executeUpdate();
			
			if(a > 0) {
				System.out.println("data insert");
			}

			PreparedStatement pr1 = cp.prepareStatement(datadelete);
			
			pr1.setInt(1, 5);
			
			int a1= pr1.executeUpdate();
			
			if(a1 > 0) {
				System.out.println("data deleted");
			}
			
			
			PreparedStatement pr2 = cp.prepareStatement(dataupdate);
			
			pr2.setString(1, "umesh suthar");
			pr2.setString(2, "158");
			pr2.setString(3, "70");
			
			pr2.setInt(4, 3);
			
			int a3 = pr2.executeUpdate();
			
			if(a3 > 0) {
				System.out.println("data updated");
			}
			*/
			
			Statement s1 = cp.createStatement();
			
			ResultSet rs = s1.executeQuery(datafetch);
			
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
			}
			
		} catch (SQLException e) {
			System.out.println("data not inserted");
		}
		
	}

}

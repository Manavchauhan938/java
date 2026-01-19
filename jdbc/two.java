package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class two {

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
			System.out.println("conn error");
		}
		
		String datainsert1 = "insert into emp(ename,eadd,emob) value (?,?,?)";
		
		String dataupdate = "update emp set ename=?,eadd=?,emob=? where eid=?";
		
		String datafetch = "select * from emp";
		
		String datadelete = "delete from emp where eid=?";
		
		try {
		/*	PreparedStatement pn= cn.prepareStatement(datainsert1);
			pn.setString(1, "krunal");
			pn.setString(2, "bihar");
			pn.setString(3, "63");
			
			int a= pn.executeUpdate();
			
			if(a > 0) 
			{
				System.out.println("data inserted");
			}
			
			
			PreparedStatement pn1 = cn.prepareStatement(datadelete);
			
			pn1.setInt(1, 4);
			
			int a= pn1.executeUpdate();
			
			if(a > 0) {
				System.out.println("data delete");
			}
			*/
			
		/*	PreparedStatement pn2 = cn.prepareStatement(dataupdate);
			
			pn2.setString(1, "akanksha");
			pn2.setString(2, "nikol");
			pn2.setString(3, "94");
			
			pn2.setInt(4, 1);
			
			int a0 = pn2.executeUpdate();
			
			if(a0 > 0) {
				System.out.println("data updated");
			}
			*/
			
			Statement s = cn.createStatement();
			
			ResultSet rs = s.executeQuery(datafetch);
			
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
			}
					
		} catch (SQLException e) {
			System.out.println("data not inserted");
		}
		
	}

}

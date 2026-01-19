package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 
 * jdbc- java database connectivity
 * 1 mysql connector
 * 
 * java + db // db-
 * 
 * third party - try and catch
 * xampp
 * step- mysql download and project add
 * step 2- xampp - db and table
 * step 3 - driver class register
 * 
 * step4- connection create
 *  step5- data insert
 * */
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("driver class not found");
		}
		Connection cn = null;
		try {
			 cn= DriverManager.getConnection("jdbc:mysql://localhost/customer", "root", "");
		} catch (SQLException e) {

           System.out.println("conn not found");
		}
		
		String datainsert = "insert into cusotmer (cname,caddress,cmobile) values (?,?,?)";
		
		String dataupdate = "update cusotmer set cname=?,caddress=?,cmobile=? where cid=?";
		
		String datafetch = "select * from cusotmer";
		
		String datadelete = "delete from cusotmer where cid=?";
		
		// prepared statment - insert,update,delete executeupdate// statment - fetch - execute query
		// prepared - its prevent sql inject prevent // prevent react
		
		/* try {
		/*	PreparedStatement ps = cn.prepareStatement(datainsert);
		   ps.setString(1, "parth");
		   ps.setString(2, "mahesana");
		   ps.setString(3, "4234");
			
		      int n= ps.executeUpdate(); // int - 0,1
			                
			  if(n > 0)
			  {
				   System.out.println("data inserted");
			  }
			  
			  
		/*	 
			  PreparedStatement ps1 = cn.prepareStatement(datadelete);
			  ps1.setInt(1, 2);
			  
			  int m= ps1.executeUpdate();
			  
			  if(m > 0) {
				  System.out.println("data deleted");
			  }
		*/
			
		/*	PreparedStatement ps2 = cn.prepareStatement(dataupdate);
			
			ps2.setString(1, "ak");
			ps2.setString(2, "up");
			ps2.setString(3, "7567");
			
			ps2.setInt(4, 3);

			int ms = ps2.executeUpdate();
		if(ms > 0) {
			System.out.println("data updated");
		}
	
		} catch (SQLException e) {
			System.out.println("data not inserted");
		}
		
		*/
		
	try {
		Statement smt = cn.createStatement();
		
		ResultSet rs= smt.executeQuery(datafetch);// multiple record // resultset
		
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
		}
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		System.out.println("data not fetch");
	}
	
		
	}

}


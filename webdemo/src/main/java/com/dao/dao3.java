package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.pojo.pojo3;

public class dao3 {

	public static Connection myconn() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("class not found");
		}
		
		Connection cn = null;
		try {
			cn = DriverManager.getConnection("jdbc:mysql://localhost/customer", "root", "");
		} catch (SQLException e) {
			System.out.println("connection not found");
		}
		return cn;
		
		
}
	
	public static int datainsert(pojo3 p3) {
		
		int status = 0;
		
		String datainsert = "insert into cusotmer(cname,caddress,cmobile) value (?,?,?)";
		
		
	Connection cn = myconn();
	
		try {
			PreparedStatement ps2 = cn.prepareStatement(datainsert);
			
			ps2.setString(1, p3.getCname());
			ps2.setString(2, p3.getCaddress());
			ps2.setString(3, p3.getCmobile());
			
			status = ps2.executeUpdate();
			
			if(status > 0) {
				System.out.println("data inserted");
			}
			
			
		} catch (SQLException e) {
			System.out.println("data not inserted");
		}
		
		
		return status;
		
	}

}

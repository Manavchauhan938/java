package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.pojo.pojo;

public class dao {

	public static Connection mycon() {
		
		try {
			Class.forName("com.mysql.jdbc.cj.Driver");
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
	
	public static int datainsert(pojo p) {
		
		int status = 0;
	
	String datainsert = "insert into cusotmer (cname,caddess,cmobile) values(?,?,?)";
    Connection cn = mycon();
	
	try {
		PreparedStatement ps = cn.prepareStatement(datainsert);
		
		ps.setString(1, p.getCname()); //we take p refrence of pojo p
		ps.setString(2, p.getCaddress());
		ps.setString(3, p.getCmobile());
		
		status = ps.executeUpdate();//123
		
		if(status > 0 ) {
			System.out.println("data inserted");
		}
		
	} catch (SQLException e) {
		System.out.println("data not inserted");
	}
	
	return status;
	}
	}


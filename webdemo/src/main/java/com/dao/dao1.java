package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.pojo.pojo1;

public class dao1 {

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
public static int datainsert(pojo1 p1) {

	int status = 0;

String datainsert = "insert into cusotmer(cname,caddress,cmobile) values (?,?,?)";

Connection cn = myconn();

try {
	PreparedStatement ps1 = cn.prepareStatement(datainsert);
	
	ps1.setString(1, p1.getCname());
	ps1.setString(2, p1.getCaddress());
	ps1.setString(3, p1.getCmobile());

	status = ps1.executeUpdate();
	
	if(status > 0 ) {
		System.out.println("data inserted");
	}
} catch (SQLException e) {
	System.out.println("data not inserted");
}

return status;
 
}

}

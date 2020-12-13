package com.hj.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Demo1 {
	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		String driverStr = "com.mysql.cj.jdbc.Driver";
		String connUrl = "jdbc:mysql://localhost:3306/demo?serverTimezone=UTC";
		
//		1.加载驱动
		Class.forName(driverStr);
		
//		2.获取数据库的连接对象
		Connection con = DriverManager.getConnection(connUrl, "root", "123456789");
		
//		3.获取执行SQL语句的对象（Statement PrepareStatement）
		PreparedStatement pstmt = con.prepareStatement("select * from cases where name = '兑换商品管理'");
		ResultSet rs = pstmt.executeQuery();
		// 定义用来检测数量的指针
		int sum = 0;
		while (rs.next()) {
				sum++;
		}
		System.out.println("名字为兑换商品管理用例数量为"+sum);
		
//		5.关闭数据库
		pstmt.close();
		con.close();

	}

}

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
		
//		1.��������
		Class.forName(driverStr);
		
//		2.��ȡ���ݿ�����Ӷ���
		Connection con = DriverManager.getConnection(connUrl, "root", "123456789");
		
//		3.��ȡִ��SQL���Ķ���Statement PrepareStatement��
		PreparedStatement pstmt = con.prepareStatement("select * from cases where name = '�һ���Ʒ����'");
		ResultSet rs = pstmt.executeQuery();
		// �����������������ָ��
		int sum = 0;
		while (rs.next()) {
				sum++;
		}
		System.out.println("����Ϊ�һ���Ʒ������������Ϊ"+sum);
		
//		5.�ر����ݿ�
		pstmt.close();
		con.close();

	}

}

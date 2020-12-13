package com.hj.dao.impI;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hj.dao.BaseDao;
import com.hj.dao.CasesDao;
import com.hj.entity.Cases;

public class CasesDaoImpl extends BaseDao implements CasesDao{
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
 
	@Override
	public int addDemo(Cases u) {
		int num = 0;
		String sql = "insert into cases(id,name,module,purpose) values(?,?,?,?)";
		try {
			num = executeUpdate(sql,u.getId(), u.getName(), u.getModule(),u.getPurpose());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return num;
	}
 
	@Override
	public int delDemo(int id) {
		int num = 0;
		String sql = "delete from cases where id=?";
		try {
			num = executeUpdate(sql, id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return num;
	}
 
	@Override
	public int updateDemo(Cases u) {
		int num = 0;
		String sql = "update cases set name=?,module=?,purpose=? where id=?";
		try {
			num = executeUpdate(sql, u.getName(), u.getModule(),u.getPurpose(), u.getId());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return num;
	}
 
	@Override
	public Cases findDemoById(int id) {
		Cases u = null;
		String sql = "select * from cases where id=?";
		rs = executeQuery(sql, id);
		try {
			if (rs.next()) {
				u = new Cases(rs.getInt(1), rs.getString(2), rs.getString(3),rs.getString(4));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return u;
	}
 
	@Override
	public List<Cases> getAllTable() {
		List<Cases> ulist = new ArrayList<Cases>();
		String sql = "select * from cases";
		rs = executeQuery(sql);
		try {
			while (rs.next()) {
				Cases u = new Cases(rs.getInt(1), rs.getString(2), rs.getString(3),rs.getString(4));
				ulist.add(u);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ulist;
	}
}

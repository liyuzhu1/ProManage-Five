package com.hj.dao;

import java.util.List;

import com.hj.entity.Cases;

public interface CasesDao {
	public int addDemo(Cases u);
	public int delDemo(int id);
	public int updateDemo(Cases u);
	public Cases findDemoById(int id);
	public List<Cases> getAllTable();
}

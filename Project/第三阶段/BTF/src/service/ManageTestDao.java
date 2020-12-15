package service;

import java.util.List;

import entity.ManageTest;

public interface ManageTestDao {
	public int addDemo(ManageTest u);
	public int delDemo(int id);
	public int updateDemo(ManageTest u);
	public ManageTest findDemoById(int id);
	public List<ManageTest> getAllTable();
}


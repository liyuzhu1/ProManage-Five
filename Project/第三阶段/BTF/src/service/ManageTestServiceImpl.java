package service;

import java.util.List;
import java.util.Map;

import dao.ManageTestDaoImpl;
import entity.ManageTest;


public class ManageTestServiceImpl {
	
	public boolean addManageTest(ManageTest managetest) {
		int count =new ManageTestDaoImpl().saveManageTest(managetest);
		return count>0;
	}
	
	public List<Map<String, Object>> listManageTest(){
		return new ManageTestDaoImpl().findAll();
	}
	
	public List<ManageTest> listAllManageTest(){
		return new ManageTestDaoImpl().findAllManageTest();
	}
	
	public ManageTest getManageTest(int id) {
		return new ManageTestDaoImpl().findById(id);
	}

	public boolean editManageTest(ManageTest managetest) {
		int count = new ManageTestDaoImpl().updateManageTest(managetest);
		return count > 0;
	}

	public boolean dropManageTest(int id) {
		int count = new ManageTestDaoImpl().deleteManageTest(id);
		return count > 0;
	}
	
	
}

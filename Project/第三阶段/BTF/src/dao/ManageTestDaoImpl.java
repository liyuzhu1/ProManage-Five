package dao;

import java.util.List;
import java.util.Map;

import util.DBUtil;
import entity.ManageTest;

public class ManageTestDaoImpl{
	public List<Map<String, Object>> findAll(){
		return DBUtil.findAll("select * from managetest");
	}
	
	public List<ManageTest> findAllManageTest(){
		return DBUtil.find(ManageTest.class, "select * from managetest", null);
	}
	
	public int saveManageTest(ManageTest managetest) {
		return DBUtil.executeUpdate("insert into managetest(id,name,domain,url,method,headers,cookies,requestBodyType,body,response) values(?,?,?,?,?,?,?,?,?,?)", 
				new Object[] {managetest.getId(), managetest.getName(), managetest.getDomain(),managetest.getUrl(),managetest.getMethod(),managetest.getHeaders(),managetest.getCookies(),
						managetest.getRequestBodyType(),managetest.getBody(),managetest.getResponse()});
	}
	
	public ManageTest findById(int id) {
		Object obj = DBUtil.findById(ManageTest.class, id);
		return obj != null? (ManageTest)obj : null;
	}
	
	public int updateManageTest(ManageTest managetest) {
		return DBUtil.executeUpdate("update managetest set name=?,domain=?,url=?,method=?,headers=?,cookies=?,requestBodyType=?,body=?,response=? where id=?",
				new Object[] { managetest.getName(), managetest.getDomain(),managetest.getUrl(),managetest.getMethod(),managetest.getHeaders(),managetest.getCookies(),
						managetest.getRequestBodyType(),managetest.getBody(),managetest.getResponse(), managetest.getId()});
	}
	
	public int deleteManageTest(int id) {
		return DBUtil.executeUpdate("delete from managetest where id=?", new Object[] {id});
	}
	

}

package com.webtest.dataprovider;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NSDataProvider {

//	
//	@DataProvider(name="zl_shop")
//	public  Object[][] getTxtData() throws IOException{
//		return new  TxtDataProvider().getTxtUser("data/user.txt");
//	}
//	@DataProvider(name="movie")
//	public  Object[][] getMovieData() throws IOException{
//		return new  ExcelDataProvider().getTestDataByExcel("data/movie.xlxs","Sheet1");
//	}
//	@Test(dataProvider="txt")
//	public void getData(String a,String b) {
//		System.out.println(a+" "+b);
//		
//	}

	@DataProvider(name="excel1")
	public Object[][] getExcelDada1() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("data/excel1.xlsx","Sheet1");
	}
	
	@DataProvider(name="excel2")
	public Object[][] getExcelDada2() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("data/excel2.xlsx","Sheet1");
	}
	
	@DataProvider(name="excel3")
	public Object[][] getExcelDada3() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("data/excel3.xlsx","Sheet1");
	}
	
	@DataProvider(name="excel4")
	public Object[][] getExcelDada4() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("data/excel4.xlsx","Sheet1");
	}
	
	@DataProvider(name="excel5")
	public Object[][] getExcelDada5() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("data/excel5.xlsx","Sheet1");
	}
	
	@DataProvider(name="excel6")
	public Object[][] getExcelDada6() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("data/excel6.xlsx","Sheet1");
	}
	
	@DataProvider(name="excel7")
	public Object[][] getExcelDada7() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("data/excel7.xlsx","Sheet1");
	}
	
	@DataProvider(name="excel8")
	public Object[][] getExcelDada8() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("data/excel8.xlsx","Sheet1");
	}
	
	@DataProvider(name="excel9")
	public Object[][] getExcelDada9() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("data/excel9.xlsx","Sheet1");
	}
	
	@DataProvider(name="excel10")
	public Object[][] getExcelDada10() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("data/excel10.xlsx","Sheet1");
	}
	
	@DataProvider(name="excel11")
	public Object[][] getExcelDada11() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("data/excel11.xlsx","Sheet1");
	}
	
	@DataProvider(name="excel12")
	public Object[][] getExcelDada12() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("data/excel12.xlsx","Sheet1");
	}
	
	@DataProvider(name="excel13")
	public Object[][] getExcelDada13() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("data/excel13.xlsx","Sheet1");
	}
	
	@DataProvider(name="excel14")
	public Object[][] getExcelDada14() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("data/excel14.xlsx","Sheet1");
	}
	
	@DataProvider(name="excel15")
	public Object[][] getExcelDada15() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("data/excel15.xlsx","Sheet1");
	}
	
	@DataProvider(name="excel16")
	public Object[][] getExcelDada16() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("data/excel16.xlsx","Sheet1");
	}
	
	@DataProvider(name="excel17")
	public Object[][] getExcelDada17() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("data/excel17.xlsx","Sheet1");
	}
	
	@DataProvider(name="excel18")
	public Object[][] getExcelDada18() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("data/excel18.xlsx","Sheet1");
	}
	
	
//	@DataProvider(name="mysql")
//	public Object[][] getMysqlDada() throws IOException{
//		return new MysqlDataProvider().getTestDataByMysql("SELECT filmname, petname\r\n" + 
//				"FROM `mm_movie` ");
//	}
//	
//	@Test(dataProvider="mysql")
//	public void testDB(String a,String b) {
//		System.out.println(a+" "+b);
//	}
	
}

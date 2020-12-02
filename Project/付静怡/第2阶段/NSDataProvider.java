package com.webtest.dataprovider;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NSDataProvider {

	//后台
	@DataProvider(name="excel1")//openweb
	public Object[][] getExcelData1() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("data/excel1.xlsx","Sheet1");
	}
	
	@DataProvider(name="excel2")//test14
	public Object[][] getExcelData2() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("data/excel2.xlsx","Sheet1");
	}
	
	@DataProvider(name="excel3")//test18    数字  执行成功
	public Object[][] getExcelData3() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("data/excel3.xlsx","Sheet1");
	}
	
	@DataProvider(name="excel4")//test19      
	public Object[][] getExcelData4() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("data/excel4.xlsx","Sheet1");
	}
	
	@DataProvider(name="excel5")//test22    
	public Object[][] getExcelData5() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("data/excel5.xlsx","Sheet1");
	}
	
	@DataProvider(name="excel6")//test24    
	public Object[][] getExcelData6() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("data/excel6.xlsx","Sheet1");
	}
	
	@DataProvider(name="excel7")//test25 数字   成功执行
	public Object[][] getExcelData7() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("data/excel7.xlsx","Sheet1");
	}
	
	@DataProvider(name="excel8")//test28  
	public Object[][] getExcelData8() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("data/excel8.xlsx","Sheet1");
	}
	
	@DataProvider(name="excel9")//test29 
	public Object[][] getExcelData9() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("data/excel9.xlsx","Sheet1");
	}
	
	@DataProvider(name="excel10")//test33 
	public Object[][] getExcelData10() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("data/excel10.xlsx","Sheet1");
	}
	
	@DataProvider(name="excel11")//test35
	public Object[][] getExcelData11() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("data/excel11.xlsx","Sheet1");
	}
	
	@DataProvider(name="excel12")//test37 数字 可以执行
	public Object[][] getExcelData12() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("data/excel12.xlsx","Sheet1");
	}
	
	@DataProvider(name="excel13")//test38
	public Object[][] getExcelData13() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("data/excel13.xlsx","Sheet1");
	}
	
	@DataProvider(name="excel14")//test45 
	public Object[][] getExcelData14() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("data/excel14.xlsx","Sheet1");
	}
	
	@DataProvider(name="excel15")//test46 
	public Object[][] getExcelData15() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("data/excel15.xlsx","Sheet1");
	}
	
	@DataProvider(name="excel16")//test48 
	public Object[][] getExcelData16() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("data/excel16.xlsx","Sheet1");
	}
	
	//前端
	@DataProvider(name="excel17")//test1
	public Object[][] getExcelData17() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("data/excel17.xlsx","Sheet1");
	}
	
	@DataProvider(name="excel18")//test7、8 
	public Object[][] getExcelData18() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("data/excel18.xlsx","Sheet1");
	}
	
	@DataProvider(name="excel19")//test11 数字 成功执行
	public Object[][] getExcelData19() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("data/excel19.xlsx","Sheet1");
	}
	
	@DataProvider(name="excel20")//test12 
	public Object[][] getExcelData20() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("data/excel20.xlsx","Sheet1");
	}
	
}

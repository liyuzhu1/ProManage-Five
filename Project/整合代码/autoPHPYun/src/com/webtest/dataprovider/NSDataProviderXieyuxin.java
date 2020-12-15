package com.webtest.dataprovider;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * 
 * @author Ω‚”Ó–¿
 *
 */
public class NSDataProviderXieyuxin {

	@Test(dataProvider = "excel")
	public void getData(String a, String b) {
		System.out.print(a + " " + b);
	}
	
	@DataProvider(name="excel3")
	public Object[][] getExcelDada3() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("dataxieyuxin/excel3.xlsx","Sheet1");
	}
	
	
	@DataProvider(name="excel4")
	public Object[][] getExcelDada4() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("dataxieyuxin/excel4.xlsx","Sheet1");
	}
	
	@DataProvider(name="excel6")
	public Object[][] getExcelDada6() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("dataxieyuxin/excel6.xlsx","Sheet1");
	}
	
	@DataProvider(name="excel7")
	public Object[][] getExcelDada7() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("dataxieyuxin/excel7.xlsx","Sheet1");
	}
	
	@DataProvider(name="excel8")
	public Object[][] getExcelDada8() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("dataxieyuxin/excel8.xlsx","Sheet1");
	}
	
	@DataProvider(name="excel9")
	public Object[][] getExcelDada9() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("dataxieyuxin/excel9.xlsx","Sheet1");
	}
	
	@DataProvider(name="excel19")
	public Object[][] getExcelDada19() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("dataxieyuxin/excel19.xlsx","Sheet1");
	}
	
	@DataProvider(name="excel20")
	public Object[][] getExcelDada20() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("dataxieyuxin/excel20.xlsx","Sheet1");
	}
	
	@DataProvider(name="excel21")
	public Object[][] getExcelDada21() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("dataxieyuxin/excel21.xlsx","Sheet1");
	}
	
	@DataProvider(name="excel22")
	public Object[][] getExcelDada22() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("dataxieyuxin/excel22.xlsx","Sheet1");
	}
	
	@DataProvider(name="excel23")
	public Object[][] getExcelDada23() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("dataxieyuxin/excel23.xlsx","Sheet1");
	}
	
	@DataProvider(name="excel24")
	public Object[][] getExcelDada24() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("dataxieyuxin/excel24.xlsx","Sheet1");
	}
	
	@DataProvider(name="excel25")
	public Object[][] getExcelDada25() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("dataxieyuxin/excel25.xlsx","Sheet1");
	}
	
	@DataProvider(name="excel26")
	public Object[][] getExcelDada26() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("dataxieyuxin/excel26.xlsx","Sheet1");
	}
	
	@DataProvider(name="excel32")
	public Object[][] getExcelDada32() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("dataxieyuxin/excel32.xlsx","Sheet1");
	}
	
	@DataProvider(name="excel33")
	public Object[][] getExcelDada33() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("dataxieyuxin/excel33.xlsx","Sheet1");
	}
	
	@DataProvider(name="excel46")
	public Object[][] getExcelDada46() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("dataxieyuxin/excel46.xlsx","Sheet1");
	}
	
	@DataProvider(name="excel47")
	public Object[][] getExcelDada47() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("dataxieyuxin/excel47.xlsx","Sheet1");
	}
	
	@DataProvider(name="excel48")
	public Object[][] getExcelDada48() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("dataxieyuxin/excel48.xlsx","Sheet1");
	}
	
	@DataProvider(name="excel49")
	public Object[][] getExcelDada49() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("dataxieyuxin/excel49.xlsx","Sheet1");
	}
	
	@DataProvider(name="excel50")
	public Object[][] getExcelDada50() throws IOException{
		return new ExcelDataProvider().getTestDataByExcel("dataxieyuxin/excel50.xlsx","Sheet1");
	}
}

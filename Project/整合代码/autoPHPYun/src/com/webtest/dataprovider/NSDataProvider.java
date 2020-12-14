package com.webtest.dataprovider;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * 
 * @author ¿Ó”Í÷Ò
 *
 */
public class NSDataProvider {

	@DataProvider(name = "zl_shop")
	public Object[][] getTxtData() throws IOException {
		return new TxtDataProvider().getTxtUser("data/user.txt");
	}

	@DataProvider(name = "movie")
	public Object[][] getMovieData() throws IOException {
		return new ExcelDataProvider().getTestDataByExcel("data/movie.xlxs", "Sheet1");
	}

	@Test(dataProvider = "txt")
	public void getData(String a, String b) {
		System.out.println(a + " " + b);

	}

	// testA1
	@DataProvider(name = "excel1")
	public Object[][] getExcelDada1() throws IOException {
		return new ExcelDataProvider().getTestDataByExcel("data/excel1.xlsx", "Sheet1");
	}

	// testA2\A8\A9
	@DataProvider(name = "excel2")
	public Object[][] getExcelDada2() throws IOException {
		return new ExcelDataProvider().getTestDataByExcel("data/excel2.xlsx", "Sheet1");
	}

	// testA5
	@DataProvider(name = "excel3")
	public Object[][] getExcelDada3() throws IOException {
		return new ExcelDataProvider().getTestDataByExcel("data/excel3.xlsx", "Sheet1");
	}

	// testB0\B1
	@DataProvider(name = "excel4")
	public Object[][] getExcelDada4() throws IOException {
		return new ExcelDataProvider().getTestDataByExcel("data/excel4.xlsx", "Sheet1");
	}

	// testB2
	@DataProvider(name = "excel5")
	public Object[][] getExcelDada5() throws IOException {
		return new ExcelDataProvider().getTestDataByExcel("data/excel5.xlsx", "Sheet1");
	}

	// testB3
	@DataProvider(name = "excel6")
	public Object[][] getExcelDada6() throws IOException {
		return new ExcelDataProvider().getTestDataByExcel("data/excel6.xlsx", "Sheet1");
	}

	// testB6
	@DataProvider(name = "excel7")
	public Object[][] getExcelDada7() throws IOException {
		return new ExcelDataProvider().getTestDataByExcel("data/excel7.xlsx", "Sheet1");
	}

	// testB7
	@DataProvider(name = "excel8")
	public Object[][] getExcelDada8() throws IOException {
		return new ExcelDataProvider().getTestDataByExcel("data/excel8.xlsx", "Sheet1");
	}

	// testC1
	@DataProvider(name = "excel9")
	public Object[][] getExcelDada9() throws IOException {
		return new ExcelDataProvider().getTestDataByExcel("data/excel9.xlsx", "Sheet1");
	}

	// testC1
	@DataProvider(name = "excel10")
	public Object[][] getExcelDada10() throws IOException {
		return new ExcelDataProvider().getTestDataByExcel("data/excel10.xlsx", "Sheet1");
	}

	// test1
	@DataProvider(name = "excel11")
	public Object[][] getExcelDada11() throws IOException {
		return new ExcelDataProvider().getTestDataByExcel("data/excel11.xlsx", "Sheet1");
	}

	// test2
	@DataProvider(name = "excel12")
	public Object[][] getExcelDada12() throws IOException {
		return new ExcelDataProvider().getTestDataByExcel("data/excel12.xlsx", "Sheet1");
	}
	
	// test7
	@DataProvider(name = "excel13")
	public Object[][] getExcelDada13() throws IOException {
		return new ExcelDataProvider().getTestDataByExcel("data/excel13.xlsx", "Sheet1");
	}

	// test8
	@DataProvider(name = "excel14")
	public Object[][] getExcelDada14() throws IOException {
		return new ExcelDataProvider().getTestDataByExcel("data/excel14.xlsx", "Sheet1");
	}
	
	@DataProvider(name = "excel15")
	public Object[][] getExcelDada15() throws IOException {
		return new ExcelDataProvider().getTestDataByExcel("data/excel15.xlsx", "Sheet1");
	}
	
	@DataProvider(name = "excel16")
	public Object[][] getExcelDada16() throws IOException {
		return new ExcelDataProvider().getTestDataByExcel("data/excel16.xlsx", "Sheet1");
	}
	
	@DataProvider(name = "excel17")
	public Object[][] getExcelDada17() throws IOException {
		return new ExcelDataProvider().getTestDataByExcel("data/excel17.xlsx", "Sheet1");
	}
	
	@DataProvider(name = "excel18")
	public Object[][] getExcelDada18() throws IOException {
		return new ExcelDataProvider().getTestDataByExcel("data/excel18.xlsx", "Sheet1");
	}
	
	@DataProvider(name = "excel19")
	public Object[][] getExcelDada19() throws IOException {
		return new ExcelDataProvider().getTestDataByExcel("data/excel19.xlsx", "Sheet1");
	}
	
	@DataProvider(name = "excel20")
	public Object[][] getExcelDada20() throws IOException {
		return new ExcelDataProvider().getTestDataByExcel("data/excel20.xlsx", "Sheet1");
	}
	
	@DataProvider(name = "excel21")
	public Object[][] getExcelDada21() throws IOException {
		return new ExcelDataProvider().getTestDataByExcel("data/excel21.xlsx", "Sheet1");
	}
	
	@DataProvider(name = "excel22")
	public Object[][] getExcelDada22() throws IOException {
		return new ExcelDataProvider().getTestDataByExcel("data/excel22.xlsx", "Sheet1");
	}
	
	@DataProvider(name = "excel23")
	public Object[][] getExcelDada23() throws IOException {
		return new ExcelDataProvider().getTestDataByExcel("data/excel23.xlsx", "Sheet1");
	}
	
	@DataProvider(name = "excel24")
	public Object[][] getExcelDada24() throws IOException {
		return new ExcelDataProvider().getTestDataByExcel("data/excel24.xlsx", "Sheet1");
	}
	
	@DataProvider(name = "excel25")
	public Object[][] getExcelDada25() throws IOException {
		return new ExcelDataProvider().getTestDataByExcel("data/excel25.xlsx", "Sheet1");
	}
	
	@DataProvider(name = "excel26")
	public Object[][] getExcelDada26() throws IOException {
		return new ExcelDataProvider().getTestDataByExcel("data/excel26.xlsx", "Sheet1");
	}

	@DataProvider(name = "excel27")
	public Object[][] getExcelDada27() throws IOException {
		return new ExcelDataProvider().getTestDataByExcel("data/excel27.xlsx", "Sheet1");
	}
	
	@DataProvider(name = "excel28")
	public Object[][] getExcelDada28() throws IOException {
		return new ExcelDataProvider().getTestDataByExcel("data/excel28.xlsx", "Sheet1");
	}
	
	@DataProvider(name = "excel29")
	public Object[][] getExcelDada29() throws IOException {
		return new ExcelDataProvider().getTestDataByExcel("data/excel29.xlsx", "Sheet1");
	}
	
	@DataProvider(name = "excel30")
	public Object[][] getExcelDada30() throws IOException {
		return new ExcelDataProvider().getTestDataByExcel("data/excel30.xlsx", "Sheet1");
	}
	
	@DataProvider(name = "excel32")
	public Object[][] getExcelDada32() throws IOException {
		return new ExcelDataProvider().getTestDataByExcel("data/excel32.xlsx", "Sheet1");
	}
	
}

package com.webtest.dataprovider;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
/**
 * 
 * @author ������
 *
 */
public class NSDataProviderLixiaohan {

	@DataProvider(name = "zl_shop")
	public Object[][] getTxtData() throws IOException {
		return new TxtDataProvider().getTxtUser("datalixiaohan/user.txt");
	}

	@DataProvider(name = "movie")
	public Object[][] getMovieData() throws IOException {
		return new ExcelDataProvider().getTestDataByExcel("datalixiaohan/movie.xlxs", "Sheet1");
	}

	@Test(dataProvider = "txt")
	public void getData(String a, String b) {
		System.out.println(a + " " + b);

	}

	@DataProvider(name = "excel")
	public Object[][] getExcelDada() throws IOException {
		return new ExcelDataProvider().getTestDataByExcel("datalixiaohan/user.xlsx", "Sheet1");
	}

	@DataProvider(name = "mysql")
	public Object[][] getMysqlDada() throws IOException {
		return new MysqlDataProvider().getTestDataByMysql("SELECT filmname, petname\r\n" + "FROM `mm_movie` ");
	}

	@Test(dataProvider = "mysql")
	public void testDB(String a, String b) {
		System.out.println(a + " " + b);
	}

	@DataProvider(name = "excel9")
	public Object[][] getExcel9Dada() throws IOException {
		return new ExcelDataProvider().getTestDataByExcel("datalixiaohan/excel9.xlsx", "Sheet1");
	}

	@DataProvider(name = "excel_login")
	public Object[][] getExcel_loginDada() throws IOException {
		return new ExcelDataProvider().getTestDataByExcel("datalixiaohan/excel_login.xlsx", "Sheet1");
	}

}

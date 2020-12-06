package com.webtest.demo;

import static org.testng.Assert.assertEquals;

import org.apache.commons.compress.archivers.sevenz.CLI;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.dataprovider.NSDataProvider;

public class ExcelTest extends BaseTest{
	

	@Test(priority = 1,dataProvider="excel1",dataProviderClass=NSDataProvider.class)
	public void test_login_admin(String s1,String s2) throws InterruptedException {
		webtest.open("/admin_hj");
		Thread.sleep(1000);
		webtest.click("name=username");
		webtest.type("name=username", s1);
		webtest.click("name=password");
		webtest.type("name=password", s2);
		Thread.sleep(1000);
		webtest.click("name=login_sub");
	}
	
	
	@Test(priority = 2,dataProvider="excel2",dataProviderClass=NSDataProvider.class)
	public void test1(String s1) throws InterruptedException {
		webtest.click("xpath=//a[text()='��Ӫ']");
		Thread.sleep(1000);
		webtest.enterFrame1("name=right");
		webtest.click("name=keyword");
		webtest.type("name=keyword", s1);
		Thread.sleep(1000);
		webtest.click("name=search");
		Thread.sleep(1000);
		webtest.isDisplayed("xpath=//a[text()='�һ���Ʒ����']");
		webtest.click("xpath=//a[text()='�ؼ��֣�����']");
		Thread.sleep(1000);
	}
	
	
	@Test(priority = 3)
	public void test2() throws InterruptedException {
		webtest.click("id=_M3");
		Thread.sleep(1000);
//		webtest.enterFrame1("name=right");
		webtest.click("xpath=//a[text()='�߼�����']");
		Thread.sleep(1000);
		webtest.click("xpath=//a[text()='���Ӳ�Ʒ']");
		Thread.sleep(3000);
		webtest.isDisplayed("xpath=//a[text()='�һ���Ʒ����']");
		Thread.sleep(1000);
	}
	
	
	@Test(priority = 4,dataProvider="excel2",dataProviderClass=NSDataProvider.class)
	public void test3(String s1) throws InterruptedException {
		webtest.click("id=_M3");
		Thread.sleep(1000);
//		webtest.enterFrame1("name=right");
		webtest.click("class=admin_new_cz_tj");
		Thread.sleep(1000);
		webtest.click("name=name");
		webtest.type("name=name", s1);
		Thread.sleep(5000);
		webtest.click("xpath=/html/body/div[1]/div[3]/form/table/tbody/tr[3]/td/div/div[1]/div/div/input");
		webtest.click("xpath=/html/body/div[1]/div[3]/form/table/tbody/tr[3]/td/div/div[1]/div/dl/dd[4]");
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[1]/div[3]/form/table/tbody/tr[11]/td/input[1]");
		webtest.isDisplayed("xpath=//a[text()='�һ���Ʒ����']");
		Thread.sleep(1000);
	}
	
	
	@Test(priority = 5)
	public void test4() throws InterruptedException {
		webtest.click("id=_M3");
		Thread.sleep(1000);
//		webtest.enterFrame1("name=right");
		webtest.click("xpath=/html/body/div[1]/div[5]/div/form/table/tbody/tr[5]/td[1]/input");//��Ʒid�ڱ仯��������Ʒname��һ����
		Thread.sleep(1000);
		webtest.click("name=delsub");
		Thread.sleep(1000);
		webtest.leaveFrame(); 
		webtest.click("xpath=//a[text()='ȷ��']");
		Thread.sleep(1000);
		webtest.isDisplayed("xpath=//a[text()='�һ���Ʒ����']");
	}
	
	
	@Test(priority = 6)
	public void test5() throws InterruptedException {
		webtest.click("id=_M3");
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[3]/div[1]/div[2]/div/ul[1]/li[2]/a");
		Thread.sleep(1000);
		webtest.enterFrame1("name=right");
		webtest.click("name=keyword");
		webtest.type("name=keyword", "����");
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[3]/div[3]/form/input[3]");
		webtest.isDisplayed("xpath=//a[text()='�һ���Ʒ��¼']");
		Thread.sleep(1000);
		webtest.click("xpath=//a[text()='�ؼ��֣�����']");
		Thread.sleep(1000);
	}
	
	
	@Test(priority = 7)
	public void test6() throws InterruptedException {
		webtest.click("id=_M3");
		Thread.sleep(1000);
		webtest.click("xpath=//a[text()='�һ���Ʒ��¼']");
		Thread.sleep(1000);
//		webtest.enterFrame1("name=right");
		webtest.click("xpath=//a[text()='�߼�����']");
		Thread.sleep(1000);
		webtest.click("xpath=//a[text()='����']");
		webtest.isDisplayed("xpath=//a[text()='�һ���Ʒ��¼']");
		webtest.leaveFrame(); 
		Thread.sleep(1000);
	}
	
	
	@Test(priority = 8,dataProvider="excel3",dataProviderClass=NSDataProvider.class)
	public void test7(String s1) throws InterruptedException {
		webtest.click("id=_M3");
		Thread.sleep(1000);
		webtest.click("xpath=//a[text()='�����Ʒ']");
		Thread.sleep(1000);
		webtest.enterFrame1("name=right");
		webtest.click("name=name");
		webtest.type("name=name", s1);
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[1]/div[3]/form/table/tbody/tr[3]/td/div/div[1]/div/div/input");
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[1]/div[3]/form/table/tbody/tr[3]/td/div/div[1]/div/dl/dd[7]");
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[1]/div[3]/form/table/tbody/tr[11]/td/input[1]");
		webtest.isDisplayed("xpath=//a[text()='�����Ʒ']");
		webtest.leaveFrame(); 
		Thread.sleep(1000);
	}
	
	
	@Test(priority = 9,dataProvider="excel4",dataProviderClass=NSDataProvider.class)
	public void test8(String s1) throws InterruptedException {
		webtest.click("id=_M3");
		Thread.sleep(1000);
		webtest.click("xpath=//a[text()='��Ʒ����']");
		Thread.sleep(1000);
		webtest.enterFrame1("name=right");
		webtest.click("xpath=//a[text()='+ ������']");
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[2]/div[2]/div/div/div/form/table/tbody/tr[1]/td/div/div/div/div[1]/i");
		Thread.sleep(1000);
		webtest.click("id=classname");
		webtest.type("id=classname", s1);
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[2]/div[2]/div/div/div/form/table/tbody/tr[5]/td/input");
		webtest.isDisplayed("xpath=//a[text()='��Ʒ����']");
		Thread.sleep(1000);
	}
	
	
	@Test(priority = 10,dataProvider="excel5",dataProviderClass=NSDataProvider.class)
	public void test9(String s1) throws InterruptedException {
		webtest.click("id=_M3");
		Thread.sleep(1000);
		webtest.click("xpath=//a[text()='��Ʒ����']");
		Thread.sleep(1000);
//		webtest.enterFrame1("name=right");
		webtest.click("xpath=//a[text()='+ ������']");
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[2]/div[2]/div/div/div/form/table/tbody/tr[1]/td/div/div/div/div[2]/i");
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[2]/div[2]/div/div/div/form/table/tbody/tr[2]/td/div/div/div/div/div/input");
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[2]/div[2]/div/div/div/form/table/tbody/tr[2]/td/div/div/div/div/dl/dd[6]");
		Thread.sleep(1000);
		webtest.click("id=classname");
		webtest.type("id=classname", s1);
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[2]/div[2]/div/div/div/form/table/tbody/tr[5]/td/input");
		webtest.isDisplayed("xpath=//a[text()='��Ʒ����']");
		Thread.sleep(1000);
	}
	
	
	@Test(priority = 11)
	public void test10() throws InterruptedException {
		webtest.click("id=_M3");
		Thread.sleep(1000);
		webtest.click("xpath=//a[text()='��Ʒ����']");
		Thread.sleep(1000);
//		webtest.enterFrame1("name=right");
		webtest.click("xpath=/html/body/div[3]/div[5]/div/form/table/tbody/tr[14]/td[1]/input");
		Thread.sleep(1000);
		webtest.click("name=delsub");
		Thread.sleep(2000);
		webtest.leaveFrame(); 
		webtest.click("xpath=//a[text()='ȷ��']");
		Thread.sleep(2000);
		webtest.isDisplayed("xpath=//a[text()='��Ʒ����']");
	}
	
	
	@Test(priority = 12)
	public void test11() throws InterruptedException {
		webtest.click("id=_M3");
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[3]/div[1]/div[1]/ul[4]/li[2]/a/i");
		Thread.sleep(1000);
		webtest.enterFrame1("name=right");
		webtest.click("xpath=//a[text()='�߼�����']");
		Thread.sleep(1000);
		webtest.click("xpath=//a[text()='ͼƬ���']");
		webtest.isDisplayed("xpath=//a[text()='������']");
		Thread.sleep(1000);
		webtest.click("xpath=//a[text()='������ͣ�ͼƬ���']");
		Thread.sleep(1000);
	}
	
	
	@Test(priority = 13,dataProvider="excel6",dataProviderClass=NSDataProvider.class)
	public void test12(String s1) throws InterruptedException {	
		webtest.click("id=_M3");
		Thread.sleep(1000);
		webtest.click("xpath=//html/body/div[3]/div[1]/div[1]/ul[4]/li[2]/a/i");
		Thread.sleep(1000);
//		webtest.enterFrame1("name=right");
		webtest.click("name=name");
		webtest.type("name=name", s1);
		Thread.sleep(1000);
		webtest.click("name=comquestion");
		webtest.isDisplayed("xpath=//a[text()='������']");
		Thread.sleep(1000);
	}
	
	
	@Test(priority = 14,dataProvider="excel7",dataProviderClass=NSDataProvider.class)
	public void test13(String s1,String s2) throws InterruptedException {
		webtest.click("id=_M3");
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[3]/div[1]/div[1]/ul[4]/li[2]/a/i");
		Thread.sleep(1000);
//		webtest.enterFrame1("name=right");
		webtest.click("class=admin_new_cz_tj");
		Thread.sleep(1000);
		webtest.click("id=ad_name");
		webtest.type("id=ad_name", s1);
		Thread.sleep(1000);
		webtest.click("id=ad_time_start");
		webtest.click("xpath=/html/body/div[6]/div[1]/div[2]/table/tbody/tr[2]/td[4]");
		Thread.sleep(1000);
		webtest.click("id=ad_time_end");
		webtest.click("xpath=/html/body/div[6]/div[2]/div/span[2]");
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[1]/div[3]/form/table/tbody[3]/tr[8]/td/div/div/div[1]/i");
		Thread.sleep(1000);
		webtest.click("id=word_info");
		webtest.type("id=word_info", s2);
		Thread.sleep(1000);
		webtest.click("name=submit");
		webtest.isDisplayed("xpath=//a[text()='������']");
		Thread.sleep(1000);
	}
	
	
	@Test(priority = 15)
	public void test14() throws InterruptedException {
		webtest.click("id=_M3");
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[3]/div[1]/div[1]/ul[4]/li[2]/a/i");
		Thread.sleep(1000);
//		webtest.enterFrame1("name=right");
		webtest.click("xpath=//a[text()='���¹�滺��']");
		webtest.isDisplayed("xpath=//a[text()='������']");
		Thread.sleep(1000);
	}
	
	
	@Test(priority = 16)  
	public void test15() throws InterruptedException {
		webtest.click("id=_M3");
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[3]/div[1]/div[1]/ul[4]/li[2]/a/i");
		Thread.sleep(1000);
//		webtest.enterFrame1("name=right");
		webtest.click("xpath=/html/body/div[2]/div[5]/div/form/table/tbody/tr[4]/td[1]/input");
		Thread.sleep(1000);
		webtest.click("name=delsub");
		Thread.sleep(1000);
		webtest.leaveFrame(); 
		webtest.click("xpath=//a[text()='ȷ��']");
		Thread.sleep(2000);
		webtest.isDisplayed("xpath=//a[text()='������']");
	}
	
	
	@Test(priority = 17,dataProvider="excel7",dataProviderClass=NSDataProvider.class)
	public void test16(String s1,String s2) throws InterruptedException {
		webtest.click("id=_M3");
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[3]/div[1]/div[1]/ul[4]/li[2]/a/i");
		Thread.sleep(1000);
		webtest.click("xpath=//a[text()='��ӹ��']");
		Thread.sleep(1000);
		webtest.enterFrame1("name=right");
		webtest.click("id=ad_name");
		webtest.type("id=ad_name", s1);
		Thread.sleep(1000);
		webtest.click("id=ad_time_start");
		webtest.click("xpath=/html/body/div[6]/div[1]/div[2]/table/tbody/tr[2]/td[4]");
		Thread.sleep(1000);
		webtest.click("id=ad_time_end");
		webtest.click("xpath=/html/body/div[6]/div[2]/div/span[2]");
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[1]/div[3]/form/table/tbody[3]/tr[8]/td/div/div/div[1]/i");
		webtest.click("id=word_info");
		webtest.type("id=word_info", s2);
		Thread.sleep(1000);
		webtest.click("name=submit");
		webtest.isDisplayed("xpath=//a[text()='��ӹ��']");
		Thread.sleep(1000);
		webtest.leaveFrame();
	}
	
	
	@Test(priority = 18,dataProvider="excel8",dataProviderClass=NSDataProvider.class)
	public void test17(String s1) throws InterruptedException {
		webtest.click("id=_M3");
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[3]/div[1]/div[1]/ul[4]/li[2]/a/i");
		Thread.sleep(1000);
		webtest.click("xpath=//a[text()='������']");
		Thread.sleep(1000);
		webtest.enterFrame1("name=right");
		webtest.click("xpath=//a[text()='+ ������']");
		webtest.click("id=class_name");
		webtest.type("id=class_name", s1);
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div/div[3]/form/table/tbody/tr[3]/td/div/div/div/div[2]/i");
		Thread.sleep(1000);
		webtest.click("name=add");
		webtest.isDisplayed("xpath=//a[text()='������']");
		Thread.sleep(1000);
		webtest.leaveFrame(); 
	}
	
	
	@Test(priority = 19)  
	public void test18() throws InterruptedException {
		webtest.click("id=_M3");
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[3]/div[1]/div[1]/ul[4]/li[2]/a/i");
		Thread.sleep(1000);
		webtest.click("xpath=//a[text()='������']");
		Thread.sleep(1000);
		webtest.enterFrame1("name=right");
		webtest.click("xpath=/html/body/div[2]/div[5]/div/form/table/tbody/tr[1]/td[1]/input");
		Thread.sleep(1000);
		webtest.click("name=delsub");
		Thread.sleep(1000);
		webtest.leaveFrame(); 
		webtest.click("xpath=//a[text()='ȷ��']");
		Thread.sleep(2000);
		webtest.isDisplayed("xpath=//a[text()='������']");
	}
	
	
	@Test(priority = 20,dataProvider="excel9",dataProviderClass=NSDataProvider.class)
	public void test19(String s1) throws InterruptedException {
		webtest.click("id=_M3");
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[3]/div[1]/div[1]/ul[4]/li[2]/a/i");
		Thread.sleep(1000);
		webtest.click("xpath=//a[text()='��ӹ�����']");
		Thread.sleep(1000);
		webtest.enterFrame1("name=right");
		webtest.click("id=class_name");
		webtest.type("id=class_name", s1);
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div/div[3]/form/table/tbody/tr[3]/td/div/div/div/div[2]/i");
		Thread.sleep(1000);
		webtest.click("name=add");
		webtest.leaveFrame(); 
		Thread.sleep(1000);
		webtest.isDisplayed("xpath=//a[text()='��ӹ�����']");
	}
	
	
	@Test(priority = 21,dataProvider="excel10",dataProviderClass=NSDataProvider.class)
	public void test20(String s1) throws InterruptedException {
		webtest.click("id=_M3");
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[3]/div[1]/div[1]/ul[4]/li[3]/a/i");
		Thread.sleep(1000);
		webtest.enterFrame1("name=right");
		webtest.click("name=keyword");
		webtest.type("name=keyword", s1);
		Thread.sleep(1000);
		webtest.click("name=news_search");
		webtest.leaveFrame(); 
		Thread.sleep(1000);
//		assertEquals(webtest.isElementPresent("link=��ҳ�ö�"), false);
	}
	
	
	@Test(priority = 22)  
	public void test21() throws InterruptedException {
		webtest.click("id=_M3");
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[3]/div[1]/div[1]/ul[4]/li[3]/a/i");
		Thread.sleep(1000);
		webtest.enterFrame1("name=right");
		webtest.click("xpath=/html/body/div/div[5]/div/form/table/tbody/tr[9]/td[1]/input");
		Thread.sleep(1000);
		webtest.click("name=delsub");
		Thread.sleep(1000);
		webtest.leaveFrame(); 
		webtest.click("xpath=//a[text()='ȷ��']");
		Thread.sleep(2000);
//		assertEquals(webtest.isElementPresent("link=��ҳ�ö�"), false);
	}
	
	
	@Test(priority = 23,dataProvider="excel11",dataProviderClass=NSDataProvider.class)
	public void test22(String s1) throws InterruptedException {
		webtest.click("id=_M3");
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[3]/div[1]/div[1]/ul[4]/li[3]/a/i");
		Thread.sleep(1000);
		webtest.click("xpath=//a[text()='��ֵ����']");
		Thread.sleep(1000);
		webtest.enterFrame1("name=right");
		webtest.click("name=keyword");
		webtest.type("name=keyword", s1);
		Thread.sleep(1000);
		webtest.click("name=news_search");
		webtest.leaveFrame(); 
		Thread.sleep(1000);
//		assertEquals(webtest.isElementPresent("link=��ҳ�ö�"), false);
	}
	
	
	@Test(priority = 24,dataProvider="excel12",dataProviderClass=NSDataProvider.class)
	public void test23(String s1,String s2) throws InterruptedException {
		webtest.click("id=_M3");
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[3]/div[1]/div[1]/ul[4]/li[3]/a/i");
		Thread.sleep(1000);
		webtest.click("xpath=//a[text()='��̨��ֵ']");
		Thread.sleep(1000);
		webtest.enterFrame1("name=right");
		webtest.click("id=userarr");
		webtest.type("id=userarr", s1);
		Thread.sleep(1000);
		webtest.click("id=price_int");
		webtest.type("id=price_int", s2);
		Thread.sleep(1000);
		webtest.click("name=insert");
		webtest.leaveFrame(); 
		Thread.sleep(1000);
//		assertEquals(webtest.isElementPresent("link=��ҳ�ö�"), false);
	}
	
 
	@Test(priority = 25,dataProvider="excel11",dataProviderClass=NSDataProvider.class)
	public void test24(String s1) throws InterruptedException {
		webtest.click("id=_M3");
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[3]/div[1]/div[1]/ul[4]/li[3]/a/i");
		Thread.sleep(1000);
		webtest.click("xpath=//a[text()='��̨��ֵ']");
		Thread.sleep(1000);
		webtest.enterFrame1("name=right");
		webtest.click("xpath=//a[text()='��ҵ��Ա��ͨ�ײ�']");
		Thread.sleep(1000);
		webtest.click("id=username");
		webtest.type("id=username", s1);
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div/div[5]/form/table/tbody/tr[5]/td/div/div/div/div/input");
		webtest.click("xpath=/html/body/div/div[5]/form/table/tbody/tr[5]/td/div/div/div/dl/dd[5]");
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div/div[5]/form/table/tbody/tr[8]/td/input");
		webtest.leaveFrame(); 
		Thread.sleep(1000);
//		assertEquals(webtest.isElementPresent("link=��ҳ�ö�"), false);
	}
	
	

	@Test(priority = 26,dataProvider="excel8",dataProviderClass=NSDataProvider.class)
	public void test25(String s1) throws InterruptedException {
		webtest.click("id=_M3");
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[3]/div[1]/div[1]/ul[4]/li[4]/a");
		Thread.sleep(1000);
		webtest.click("xpath=//a[text()='���ר��']");
		Thread.sleep(1000);
		webtest.enterFrame1("name=right");
		webtest.click("id=title");
		webtest.type("id=title", s1);
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[1]/div[3]/form/table/tbody/tr[5]/td/div/div/div/div/div/input");
		webtest.click("xpath=/html/body/div[1]/div[3]/form/table/tbody/tr[5]/td/div/div/div/div/dl/dd[2]");
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[1]/div[3]/form/table/tbody/tr[16]/td/input[2]");
		webtest.leaveFrame(); 
		Thread.sleep(1000);
//		assertEquals(webtest.isElementPresent("link=��ҳ�ö�"), false);
	}
	
	
	@Test(priority = 27,dataProvider="excel8",dataProviderClass=NSDataProvider.class)
	public void test26(String s1) throws InterruptedException {
		webtest.click("id=_M3");
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[3]/div[1]/div[1]/ul[4]/li[4]/a");
		Thread.sleep(1000);
		webtest.enterFrame1("name=right");
		webtest.click("name=keyword");
		webtest.type("name=keyword", s1);
		Thread.sleep(1000);
		webtest.click("name=news_search");
		webtest.leaveFrame(); 
		Thread.sleep(1000);
//		assertEquals(webtest.isElementPresent("link=��ҳ�ö�"), false);
	}
	
	
	@Test(priority = 28)
	public void test27() throws InterruptedException {
		webtest.click("id=_M3");
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[3]/div[1]/div[1]/ul[4]/li[6]/a");
		Thread.sleep(1000);
		webtest.enterFrame1("name=right");
		webtest.click("id=apost");
		webtest.leaveFrame(); 
		Thread.sleep(1000);
//		assertEquals(webtest.isElementPresent("link=��ҳ�ö�"), false);
	}
	
	
	@Test(priority = 29)
	public void test28() throws InterruptedException {
		webtest.click("xpath=//a[text()='��ҳ']");
		Thread.sleep(1000);
		webtest.enterFrame1("name=right");
		webtest.click("xpath=//a[text()='��ҵ��Ա']");
		Thread.sleep(1000);
		webtest.leaveFrame(); 
		Thread.sleep(1000);
//		assertEquals(webtest.isElementPresent("link=��ҳ�ö�"), false);
		
		
	}
	
	
	@Test(priority = 30)
	public void test29() throws InterruptedException {
		webtest.click("xpath=//a[text()='��ҳ']");
		Thread.sleep(1000);
		webtest.enterFrame1("name=right");
		webtest.click("xpath=//a[text()='����ְλ']");
		Thread.sleep(1000);
		webtest.leaveFrame(); 
		Thread.sleep(1000);
//		assertEquals(webtest.isElementPresent("link=��ҳ�ö�"), false);
	}
	
	
	@Test(priority = 31)
	public void test30() throws InterruptedException {
		webtest.click("xpath=//a[text()='��ҳ']");
		Thread.sleep(1000);
		webtest.enterFrame1("name=right");
		webtest.click("xpath=//a[text()='��������']");
		Thread.sleep(1000);
		webtest.leaveFrame(); 
		Thread.sleep(1000);
//		assertEquals(webtest.isElementPresent("link=��ҳ�ö�"), false);
	}
	
	
	//webtest.leaveFrame();     --�����������
	
	
	
	@Test(priority = 32)
	public void test_login() throws InterruptedException {
		webtest.open("");
//		webtest.click("xpath=//a[text()='�û���¼']");
//		Thread.sleep(3000);
//		webtest.click("id=username");
//		webtest.type("id=username", "kkkhj");
//		Thread.sleep(3000);
//		webtest.click("id=password2");
//		webtest.type("name=password", "kkkhj123");
//		webtest.click("id=sublogin");
//		Thread.sleep(3000);
//		webtest.click("xpath=/html/body/div[2]/div/div[1]/a/img");
//		Thread.sleep(5000);
	}
	
	
	@Test(priority = 33,dataProvider="excel13",dataProviderClass=NSDataProvider.class)
	public void test31(String s1) throws InterruptedException {
		webtest.click("xpath=//a[text()='��վ����']");
		Thread.sleep(1000);
		webtest.click("xpath=//a[text()='����ҵ']");
		Thread.sleep(1000);
		webtest.click("name=keyword");
		webtest.type("name=keyword",s1);
		Thread.sleep(1000);
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[4]/div[5]/div[4]/div[6]/a");
		Thread.sleep(1000);
	}
	
	
	@Test(priority = 34)
	public void test32() throws InterruptedException {
//		webtest.click("xpath=//a[text()='��վ����']");
//		Thread.sleep(1000);
//		webtest.click("xpath=//a[text()='����ҵ']");
//		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[4]/div[5]/div[4]/div[1]/div[2]/div[2]/div/a[1]");
		Thread.sleep(1000);
		webtest.click("xpath=//a[text()='�����ص㣺����']");
		Thread.sleep(1000);
	}
	
	
	@Test(priority = 35)
	public void test33() throws InterruptedException {
//		webtest.click("xpath=//a[text()='��վ����']");
//		Thread.sleep(1000);
//		webtest.click("xpath=//a[text()='����ҵ']");
//		Thread.sleep(1000);
		webtest.click("xpath=//a[text()='�����/������']");
		Thread.sleep(1000);
		webtest.click("xpath=//a[text()='��ҵ�������/������']");
		Thread.sleep(1000);
	}
	
	
	@Test(priority = 36)
	public void test34() throws InterruptedException {
//		webtest.click("xpath=//a[text()='��վ����']");
//		Thread.sleep(1000);
//		webtest.click("xpath=//a[text()='����ҵ']");
//		Thread.sleep(1000);
		webtest.click("xpath=//a[text()='50-200��']");
		Thread.sleep(1000);
		webtest.click("xpath=//a[text()='��ģ��50-200��']");
		Thread.sleep(1000);
	}

	
	@Test(priority = 37,dataProvider="excel14",dataProviderClass=NSDataProvider.class)   
	public void test35(String s1,String s2) throws InterruptedException {
//		webtest.click("xpath=//a[text()='��վ����']");
//		Thread.sleep(1000);
//		webtest.click("xpath=//a[text()='����ҵ']");
//		Thread.sleep(1000);
		webtest.click("xpath=//a[text()='������ҵ']");
		Thread.sleep(1000);
		webtest.click("xpath=//a[text()='+ ��ע']");
		Thread.sleep(1000);
		webtest.click("name=username");
		webtest.type("name=username", s1);
		webtest.click("name=password");
		webtest.type("name=password", s2);
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id=\"sublogin\"]");
		Thread.sleep(1000);
		webtest.click("xpath=//*[@id=\"atn_5\"]");
		Thread.sleep(1000);
	}
	
	
	@Test(priority = 38)
	public void test36() throws InterruptedException {
//		webtest.click("xpath=//a[text()='��վ����']");
//		Thread.sleep(1000);
//		webtest.click("xpath=//a[text()='����ҵ']");
//		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[4]/div[5]/div[4]/div[1]/div[2]/div[2]/div/a[1]");
		webtest.click("xpath=//a[text()='������ҵ']");
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[4]/div[5]/div[4]/div[6]/div/div/a");
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[2]/div/div[1]/div/a/img");
		Thread.sleep(1000);
		webtest.click("xpath=//a[text()='[��ȫ�˳�]']");
		Thread.sleep(1000);
	}
	
	
	@Test(priority = 39,dataProvider="excel15",dataProviderClass=NSDataProvider.class)   
	public void test37(String s1,String s2,String s3) throws InterruptedException {
		webtest.click("xpath=//a[text()='��վ����']");
		Thread.sleep(1000);
		webtest.click("xpath=//a[text()='��ְְλ']");
		Thread.sleep(1000);
		webtest.click("xpath=//a[text()='������ְ']");
		Thread.sleep(1000);
		webtest.click("name=username");
		webtest.type("name=username", s1);
		webtest.click("name=password");
		webtest.type("name=password", s2);
		Thread.sleep(1000);
		webtest.click("xpath=//*[@id=\"sublogin\"]");
		Thread.sleep(1000);
		webtest.click("xpath=//a[text()='������ְ']");
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div/div[1]/div/div[1]/div/ul[4]/li[2]/span/a");
		Thread.sleep(1000);
		webtest.click("name=keyword");
		webtest.type("name=keyword", s3);
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[1]/div[1]/div/div[3]/div[1]/div[2]/div[2]/form/div/input[5]");
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div/header/div[1]/div/div[1]/a/img");
		Thread.sleep(1000);
		webtest.getWindow(1);
	}
	
	
	@Test(priority = 40,dataProvider="excel16",dataProviderClass=NSDataProvider.class) 
	public void test38(String s1) throws InterruptedException {
//		webtest.click("xpath=/html/body/div/header/div[1]/div/div[1]/a/img");
//		Thread.sleep(1000);
		webtest.click("xpath=//a[text()='��վ����']");
		Thread.sleep(1000);
		webtest.click("xpath=//a[text()='��ְְλ']");
		Thread.sleep(1000);
		webtest.click("name=keyword");
		webtest.type("name=keyword", s1);
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[5]/div[2]/div[1]/form/div[3]/input[2]");
		Thread.sleep(1000);
		webtest.click("xpath=//a[text()='ģ��']");
		Thread.sleep(1000);
	}
	
	
	@Test(priority = 41)
	public void test39() throws InterruptedException {
//		webtest.click("xpath=//a[text()='��վ����']");
//		Thread.sleep(1000);
//		webtest.click("xpath=//a[text()='��ְְλ']");
//		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[5]/div[2]/div[1]/form/div[1]/div[2]/div[2]/div/a[1]");
		Thread.sleep(1000);
		webtest.click("xpath=//a[text()='�����ص㣺����']");
		Thread.sleep(1000);
	}
	
	
	@Test(priority = 42)
	public void test40() throws InterruptedException {
//		webtest.click("xpath=//a[text()='��վ����']");
//		Thread.sleep(1000);
//		webtest.click("xpath=//a[text()='��ְְλ']");
//		Thread.sleep(1000);
		webtest.click("xpath=//a[text()='ƽ��ģ��']");
		Thread.sleep(10000);
		webtest.click("xpath=/html/body/div[2]/div/div[2]/ul/li[6]/a");
		Thread.sleep(1000);
		webtest.getWindow(0);
	}
	
	
	@Test(priority = 43,dataProvider="excel17",dataProviderClass=NSDataProvider.class) 
	public void test41(String s1,String s2,String s3,String s4,String s5,String s6) throws InterruptedException {
//		webtest.click("xpath=//a[text()='��վ����']");
//		Thread.sleep(1000);
//		webtest.click("xpath=//a[text()='�չ�']");
//		Thread.sleep(1000);
		webtest.click("xpath=//a[text()='�����չ�����']");
		Thread.sleep(10000);
		webtest.click("name=username");
		webtest.type("name=username", s1);
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[4]/form/div/div[2]/div[3]/div/span[2]/i");
		Thread.sleep(1000);
		webtest.click("name=mobile");
		webtest.type("name=mobile", s2);
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[4]/form/div/div[2]/div[5]/div/div/div/div/input");
		webtest.click("xpath=/html/body/div[4]/form/div/div[2]/div[5]/div/div/div/dl/dd[2]");
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[4]/form/div/div[2]/div[6]/div[1]/div/div/input");
		webtest.click("xpath=/html/body/div[4]/form/div/div[2]/div[6]/div[1]/div/dl/dd[2]");
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[4]/form/div/div[2]/div[6]/div[2]/div/div/input");
		webtest.click("xpath=/html/body/div[4]/form/div/div[2]/div[6]/div[2]/div/dl/dd[2]");
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[4]/form/div/div[2]/div[6]/div[3]/div/div/input");
		webtest.click("xpath=/html/body/div[4]/form/div/div[2]/div[6]/div[3]/div/dl/dd[2]");
		Thread.sleep(1000);
		webtest.click("name=job");
		webtest.type("name=job", s3);
		Thread.sleep(1000);
		webtest.click("name=production");
		webtest.type("name=production", s4);
		Thread.sleep(1000);
		webtest.click("name=password");
		webtest.type("name=password", s5);
		Thread.sleep(1000);
		webtest.click("name=authcode");
		webtest.type("name=authcode", s6);
		Thread.sleep(1000);
		webtest.click("id=botton");
		Thread.sleep(10000);
	}
	
	
	@Test(priority = 44) 
	public void test42() throws InterruptedException {
//		webtest.click("xpath=//a[text()='��վ����']");
//		Thread.sleep(1000);
//		webtest.click("xpath=//a[text()='�չ�ר��']");
//		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[9]/div/div/div/div[2]/div[2]/div[1]/a");
		Thread.sleep(10000);
		webtest.click("xpath=/html/body/div[2]/div/div[2]/ul/li[6]/a");
		Thread.sleep(1000);
	}
	
	
	@Test(priority = 45)
	public void test43() throws InterruptedException {
//		webtest.click("xpath=//a[text()='��վ����']");
//		Thread.sleep(1000);
//		webtest.click("xpath=//a[text()='�չ�ר��']");
//		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[9]/div/form/div/div[2]/div[2]/div[2]/div/a[1]");
		Thread.sleep(10000);
	}

	
	@Test(priority = 46,dataProvider="excel18",dataProviderClass=NSDataProvider.class)
	public void test44(String s1) throws InterruptedException {
		webtest.click("name=keyword");
		webtest.type("name=keyword", s1);
		Thread.sleep(1000);
		webtest.click("id=search_button");
		Thread.sleep(1000);
	}
	
	
	@Test(priority = 47)
	public void test45() throws InterruptedException {
		webtest.click("xpath=/html/body/div[2]/div/div[1]/div/a/img");
		Thread.sleep(1000);
		webtest.click("xpath=//a[text()='��վ����']");
		Thread.sleep(1000);
		webtest.click("xpath=//a[text()='HR������']");
		Thread.sleep(1000);
		webtest.click("xpath=//a[text()='��Ƹ/����']");
		Thread.sleep(10000);
	}
	
	
	@Test(priority = 48)
	public void test46() throws InterruptedException {
	//	webtest.click("xpath=//a[text()='��վ����']");
	//	Thread.sleep(1000);
	//	webtest.click("xpath=//a[text()='HR������']");
	//	Thread.sleep(1000);
		webtest.click("xpath=//a[text()='н���ƶ�']");
		Thread.sleep(10000);
	}
	
	
	@Test(priority = 49)
	public void test47() throws InterruptedException {
	//	webtest.click("xpath=//a[text()='��վ����']");
	//	Thread.sleep(1000);
	//	webtest.click("xpath=//a[text()='HR������']");
	//	Thread.sleep(1000);
		webtest.click("xpath=//a[text()='�Ӱ�/����']");
		Thread.sleep(10000);
	}
	
	
	@Test(priority = 50)
	public void test48() throws InterruptedException {
	//	webtest.click("xpath=//a[text()='��վ����']");
	//	Thread.sleep(1000);
	//	webtest.click("xpath=//a[text()='HR������']");
	//	Thread.sleep(1000);
		webtest.click("xpath=//a[text()='Ա������']");
		Thread.sleep(10000);
	}
	
	
	@Test(priority = 51)
	public void test49() throws InterruptedException {
	//	webtest.click("xpath=//a[text()='��վ����']");
	//	Thread.sleep(1000);
	//	webtest.click("xpath=//a[text()='HR������']");
	//	Thread.sleep(1000);
		webtest.click("xpath=//a[text()='��ͬ/����']");
		Thread.sleep(10000);
	}
	
	
	@Test(priority = 52)
	public void test50() throws InterruptedException {
		webtest.click("xpath=/html/body/div[2]/div/div[1]/div/a/img");
		Thread.sleep(1000);
		webtest.click("xpath=//a[text()='��վ����']");
		Thread.sleep(1000);
		webtest.click("xpath=//a[text()='����ְλ']");
		Thread.sleep(1000);
	}
	
	
	
}  

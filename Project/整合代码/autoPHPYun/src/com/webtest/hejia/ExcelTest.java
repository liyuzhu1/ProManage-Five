package com.webtest.hejia;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.apache.commons.compress.archivers.sevenz.CLI;
import org.apache.poi.ss.formula.functions.T;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.dataprovider.NSDataProviderHejia;


/*
 * �μ� �����ࣨ��̨��
 * ��̨��Ӫģ�飬��ҳ���棨test1-test30��
 * */

public class ExcelTest extends BaseTest{
	@BeforeClass
	public void testLogin_admin() throws InterruptedException {
		System.out.println("testadmin");
		webtest.open1("/admin");
		Thread.sleep(2000);
		webtest.type("id=username", "admin");
		webtest.type("id=password", "admin");
		webtest.click("xpath=//input[@type='submit']");
	}

//	@Test(priority = 1,dataProvider="excel1",dataProviderClass=NSDataProviderHejia.class)
//	public void test_login_admin(String s1,String s2) throws InterruptedException {
//		webtest.open("/admin");
//		Thread.sleep(1000);
//		webtest.click("name=username");
//		webtest.type("name=username", s1);
//		webtest.click("name=password");
//		webtest.type("name=password", s2);
//		Thread.sleep(1000);
//		webtest.click("name=login_sub");
//	}
	
	
	
	
	@Test
	public void test01() throws InterruptedException {
		webtest.click("xpath=//a[text()='��ҳ']");
		Thread.sleep(1000);
		webtest.enterFrame1("name=right");
		webtest.click("xpath=//a[text()='��ҵ��Ա']");
		Thread.sleep(1000);
		assertTrue(webtest.isTextPresent("��ҵ����"));
		webtest.leaveFrame(); 
		Thread.sleep(1000);
//		assertEquals(webtest.isElementPresent("link=��ҳ�ö�"), false);
		
		
	}
	
	
	@Test
	public void test02() throws InterruptedException {
		webtest.click("xpath=//a[text()='��ҳ']");
		Thread.sleep(1000);
		webtest.enterFrame1("name=right");
		webtest.click("xpath=//a[text()='����ְλ']");
		Thread.sleep(1000);
		assertTrue(webtest.isTextPresent("��˾����"));
		webtest.leaveFrame(); 
		Thread.sleep(1000);
//		assertEquals(webtest.isElementPresent("link=��ҳ�ö�"), false);
	}
	
	
	@Test
	public void test03() throws InterruptedException {
		webtest.click("xpath=//a[text()='��ҳ']");
		Thread.sleep(1000);
		webtest.enterFrame1("name=right");
		webtest.click("xpath=//a[text()='��������']");
		Thread.sleep(1000);
		assertTrue(webtest.isTextPresent("��������"));
		webtest.leaveFrame(); 
		Thread.sleep(1000);
//		assertEquals(webtest.isElementPresent("link=��ҳ�ö�"), false);
	}
	
	
	@Test(priority = 2,dataProvider="excel2",dataProviderClass=NSDataProviderHejia.class)
	public void test1(String s1) throws InterruptedException {
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()='��Ӫ']");
		Thread.sleep(3000);
		webtest.enterFrame1("id=rightMain");
		webtest.click("name=keyword");
		webtest.type("name=keyword", s1);
		Thread.sleep(1000);
		webtest.click("name=search");
		Thread.sleep(1000);
		assertTrue(webtest.isTextPresent(s1));
		Thread.sleep(3000);
		//webtest.click("xpath=//a[text()='�ؼ��֣�����']");
		//Thread.sleep(5000);
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
		assertTrue(webtest.isTextPresent("���Ӳ�Ʒ"));
		Thread.sleep(1000);
	}
	
	
	@Test(priority = 4,dataProvider="excel2",dataProviderClass=NSDataProviderHejia.class)
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
		assertTrue(webtest.isTextPresent("����"));
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
		assertTrue(webtest.isTextPresent("����"));
		Thread.sleep(1000);
//		webtest.click("xpath=//a[text()='�ؼ��֣�����']");
//		Thread.sleep(1000);
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
		assertTrue(webtest.isTextPresent("����"));
		webtest.leaveFrame(); 
		Thread.sleep(1000);
	}
	
	
	@Test(priority = 8,dataProvider="excel3",dataProviderClass=NSDataProviderHejia.class)
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
		assertTrue(webtest.isTextPresent("����˪"));
		webtest.leaveFrame(); 
		Thread.sleep(1000);
	}
	
	
	@Test(priority = 9,dataProvider="excel4",dataProviderClass=NSDataProviderHejia.class)
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
		assertTrue(webtest.isTextPresent("��ױ����"));
		Thread.sleep(1000);
	}
	
	
	@Test(priority = 10,dataProvider="excel5",dataProviderClass=NSDataProviderHejia.class)
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
		assertTrue(webtest.isTextPresent("���"));
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
		webtest.click("xpath=/html/body/div[2]/div[3]/div[3]/div[1]/a[3]");
		assertTrue(webtest.isTextPresent("ͼƬ���"));
		Thread.sleep(1000);
//		webtest.click("xpath=//a[text()='������ͣ�ͼƬ���']");
//		Thread.sleep(1000);
	}
	
	
	@Test(priority = 13,dataProvider="excel6",dataProviderClass=NSDataProviderHejia.class)
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
		assertTrue(webtest.isTextPresent("wap�ʴ�"));
		Thread.sleep(1000);
	}
	
	
	@Test(priority = 14,dataProvider="excel7",dataProviderClass=NSDataProviderHejia.class)
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
		assertTrue(webtest.isTextPresent("�������ͣ�"));
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
		assertTrue(webtest.isTextPresent("�������ͣ�"));
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
	
	
	@Test(priority = 17,dataProvider="excel7",dataProviderClass=NSDataProviderHejia.class)
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
		Thread.sleep(1000);
		assertTrue(webtest.isTextPresent("�������ͣ�"));
		webtest.leaveFrame();
	}
	
	
	@Test(priority = 18,dataProvider="excel8",dataProviderClass=NSDataProviderHejia.class)
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
		assertTrue(webtest.isTextPresent("������ƣ�"));
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
	
	
	@Test(priority = 20,dataProvider="excel9",dataProviderClass=NSDataProviderHejia.class)
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
	
	
	@Test(priority = 21,dataProvider="excel10",dataProviderClass=NSDataProviderHejia.class)
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
		webtest.isDisplayed("xpath=//input[text()='����']");
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
		assertTrue(webtest.isTextPresent("���Ѽ�¼"));
//		assertEquals(webtest.isElementPresent("link=��ҳ�ö�"), false);
	}
	
	
	@Test(priority = 23,dataProvider="excel11",dataProviderClass=NSDataProviderHejia.class)
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
		assertTrue(webtest.isTextPresent("�ؼ��֣�kkkhj"));
		webtest.leaveFrame(); 
		Thread.sleep(1000);
//		assertEquals(webtest.isElementPresent("link=��ҳ�ö�"), false);
	}
	
	
	@Test(priority = 24,dataProvider="excel12",dataProviderClass=NSDataProviderHejia.class)
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
		assertTrue(webtest.isTextPresent("��̨��ֵ"));
//		assertEquals(webtest.isElementPresent("link=��ҳ�ö�"), false);
	}
	
 
	@Test(priority = 25,dataProvider="excel11",dataProviderClass=NSDataProviderHejia.class)
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
		assertTrue(webtest.isTextPresent("��̨��ֵ"));
//		assertEquals(webtest.isElementPresent("link=��ҳ�ö�"), false);
	}
	
	

	@Test(priority = 26,dataProvider="excel8",dataProviderClass=NSDataProviderHejia.class)
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
		assertTrue(webtest.isTextPresent("����ר�⣺"));
		webtest.leaveFrame(); 
		Thread.sleep(1000);
//		assertEquals(webtest.isElementPresent("link=��ҳ�ö�"), false);
	}
	
	
	@Test(priority = 27,dataProvider="excel8",dataProviderClass=NSDataProviderHejia.class)
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
		assertTrue(webtest.isTextPresent("�ؼ��֣�test"));
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
		assertTrue(webtest.isTextPresent("�ƹ�Ӫ�� "));
//		assertEquals(webtest.isElementPresent("link=��ҳ�ö�"), false);
	}
	

	
	//webtest.leaveFrame();     --�����������
	
	
	

	
	
}  

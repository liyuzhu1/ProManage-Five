package com.webtest.hejia;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.dataprovider.NSDataProviderHejia;


/*
 *  �μ� �����ࣨǰ̨��
 * ǰ̨����ҵ����ְְλ���չ�ר����HR�����䡢����ְλ��test31-test50��
 * */
public class ExcelFrontTest extends BaseTest{
	@BeforeClass
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
	
	
	@Test(priority = 33,dataProvider="excel13",dataProviderClass=NSDataProviderHejia.class)
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
		assertTrue(webtest.isTextPresent(s1));
	}
	
	
	@Test(priority = 34)
	public void test32() throws InterruptedException {
//		webtest.click("xpath=//a[text()='��վ����']");
//		Thread.sleep(1000);
//		webtest.click("xpath=//a[text()='����ҵ']");
//		Thread.sleep(1000);
		webtest.click("xpath=//a[@class='city_name  ']");
		Thread.sleep(1000);
		assertTrue(webtest.isTextPresent("�����ص㣺����"));
		webtest.click("xpath=//a[text()='�����ص㣺����']");
		Thread.sleep(1000);
	}
	
	
	@Test(priority = 35)
	public void test33() throws InterruptedException {
//		webtest.click("xpath=//a[text()='��վ����']");
//		Thread.sleep(1000);
//		webtest.click("xpath=//a[text()='����ҵ']");
//		Thread.sleep(1000);
		webtest.click("xpath=//a[text()='������ҵ']");
		Thread.sleep(1000);
		assertTrue(webtest.isTextPresent("���ʣ�������ҵ"));
		webtest.click("xpath=//a[text()='���ʣ�������ҵ']");
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
		assertTrue(webtest.isTextPresent("��ģ��50-200��"));
		webtest.click("xpath=//a[text()='��ģ��50-200��']");
		Thread.sleep(1000);
	}

	
	@Test(priority = 37,dataProvider="excel14",dataProviderClass=NSDataProviderHejia.class)   
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
		webtest.click("xpath=//*[@id=\"company7\"]/div/div[3]/a");
		Thread.sleep(1000);
		assertTrue(webtest.isTextPresent("hj"));
	}
	
	
	//�����ѡ�ļ�������
	@Test(priority = 38)
	public void test36() throws InterruptedException {
//		webtest.click("xpath=//a[text()='��վ����']");
//		Thread.sleep(1000);
//		webtest.click("xpath=//a[text()='����ҵ']");
//		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[4]/div[5]/div[4]/div[1]/div[2]/div[2]/div/a[1]");
		webtest.click("xpath=//a[text()='������ҵ']");
		Thread.sleep(1000);
		webtest.click("xpath=//a[text()=' �����ѡ']");
		Thread.sleep(1000);
		assertTrue(webtest.isTextPresent("hj"));
		webtest.click("xpath=/html/body/div[2]/div/div[1]/div/a/img");
		Thread.sleep(1000);
		webtest.click("xpath=//a[text()='[��ȫ�˳�]']");
		Thread.sleep(1000);
	}
	
	
	@Test(priority = 39,dataProvider="excel15",dataProviderClass=NSDataProviderHejia.class)   
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
		assertTrue(webtest.isTextPresent(s3));
		webtest.click("xpath=/html/body/div/header/div[1]/div/div[1]/a/img");
		Thread.sleep(1000);
		webtest.getWindow(1);
	}
	
	
	@Test(priority = 40,dataProvider="excel16",dataProviderClass=NSDataProviderHejia.class) 
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
		webtest.click("xpath=/html/body/div[4]/div[2]/div[1]/form/div[3]/input[2]");
		Thread.sleep(1000);
		assertTrue(webtest.isTextPresent(s1));
		webtest.click("xpath=/html/body/div[4]/div[2]/div[1]/div/a");
		Thread.sleep(1000);
	}
	
	
	@Test(priority = 41)
	public void test39() throws InterruptedException {
//		webtest.click("xpath=//a[text()='��վ����']");
//		Thread.sleep(1000);
//		webtest.click("xpath=//a[text()='��ְְλ']");
//		Thread.sleep(1000);
		webtest.click("xpath=//a[@class='city_name  ']");
		Thread.sleep(1000);
		assertTrue(webtest.isTextPresent("�����ص㣺����"));
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
		assertTrue(webtest.isTextPresent("����ģ��"));
		webtest.click("xpath=/html/body/div[2]/div/div[2]/ul/li[6]/a");
		Thread.sleep(1000);
		webtest.getWindow(1);
	}
	
	
	@Test(priority = 43,dataProvider="excel17",dataProviderClass=NSDataProviderHejia.class) 
	public void test41(String s1,String s2,String s3,String s4,String s5,String s6) throws InterruptedException {
//		webtest.click("xpath=//a[text()='��վ����']");
//		Thread.sleep(1000);
//		webtest.click("xpath=//a[text()='�չ�']");
//		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[7]/div/div[4]/div[3]/a");
		Thread.sleep(10000);
		webtest.click("name=username");
		webtest.type("name=username", s1);
		Thread.sleep(1000);
		webtest.click("xpath=//*[@id=\"sex2\"]/i");
		Thread.sleep(1000);
		webtest.click("name=mobile");
		webtest.type("name=mobile", s2);
		Thread.sleep(1000);
		webtest.click("xpath=//*[@id=\"subform\"]/div/div[2]/div[5]/div/div/div/div/input");
		webtest.click("xpath=//*[@id=\"subform\"]/div/div[2]/div[5]/div/div/div/dl/dd[2]");
		Thread.sleep(1000);
		webtest.click("xpath=//*[@id=\"subform\"]/div/div[2]/div[6]/div[1]/div/div/input");
		webtest.click("xpath=//*[@id=\"subform\"]/div/div[2]/div[6]/div[1]/div/dl/dd[2]");
		Thread.sleep(1000);
		webtest.click("xpath=//*[@id=\"subform\"]/div/div[2]/div[6]/div[2]/div/div/input");
		webtest.click("xpath=//*[@id=\"subform\"]/div/div[2]/div[6]/div[2]/div/dl/dd[2]");
		Thread.sleep(1000);
		webtest.click("xpath=//*[@id=\"subform\"]/div/div[2]/div[6]/div[3]/div/div/input");
		webtest.click("xpath=//*[@id=\"subform\"]/div/div[2]/div[6]/div[3]/div/dl/dd[2]");
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
		assertTrue(webtest.isTextPresent("��Ҫ��������"));
	}
	
	
	@Test(priority = 44) 
	public void test42() throws InterruptedException {
		webtest.click("xpath=//a[text()='��վ����']");
		Thread.sleep(1000);
		webtest.click("xpath=//a[text()='�չ�ר��']");
		Thread.sleep(1000);
		webtest.click("xpath=//a[text()=' ��װ��������']");
		Thread.sleep(10000);
		assertTrue(webtest.isTextPresent("����ܸ���Ȥ���չ�"));
		webtest.click("xpath=/html/body/div[2]/div/div[2]/ul/li[6]/a");
		Thread.sleep(1000);
	}
	
	
	@Test(priority = 45)
	public void test43() throws InterruptedException {
//		webtest.click("xpath=//a[text()='��վ����']");
//		Thread.sleep(1000);
//		webtest.click("xpath=//a[text()='�չ�ר��']");
//		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[8]/div/form/div/div[2]/div[2]/div[2]/div/a[1]]");
//		webtest.click("xpath=/html/body/div[8]/div/form/div/div[2]/div[2]/div[2]/div/a[1]");
		Thread.sleep(10000);
		assertTrue(webtest.isTextPresent("����"));
	}

	
	@Test(priority = 46,dataProvider="excel18",dataProviderClass=NSDataProviderHejia.class)
	public void test44(String s1) throws InterruptedException {
		webtest.click("name=keyword");
		webtest.type("name=keyword", s1);
		Thread.sleep(1000);
		webtest.click("id=search_button");
		Thread.sleep(1000);
		assertTrue(webtest.isTextPresent("����"));
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
		Thread.sleep(1000);
		assertTrue(webtest.isTextPresent("��Ƹ/����"));
	}
	
	
	@Test(priority = 48)
	public void test46() throws InterruptedException {
	//	webtest.click("xpath=//a[text()='��վ����']");
	//	Thread.sleep(1000);
	//	webtest.click("xpath=//a[text()='HR������']");
	//	Thread.sleep(1000);
		webtest.click("xpath=//a[text()='н���ƶ�']");
		Thread.sleep(1000);
		assertTrue(webtest.isTextPresent("н���ƶ�"));
	}
	
	
	@Test(priority = 49)
	public void test47() throws InterruptedException {
	//	webtest.click("xpath=//a[text()='��վ����']");
	//	Thread.sleep(1000);
	//	webtest.click("xpath=//a[text()='HR������']");
	//	Thread.sleep(1000);
		webtest.click("xpath=//a[text()='�Ӱ�/����']");
		Thread.sleep(1000);
		assertTrue(webtest.isTextPresent("�Ӱ�/����"));
	}
	
	
	@Test(priority = 50)
	public void test48() throws InterruptedException {
	//	webtest.click("xpath=//a[text()='��վ����']");
	//	Thread.sleep(1000);
	//	webtest.click("xpath=//a[text()='HR������']");
	//	Thread.sleep(1000);
		webtest.click("xpath=//a[text()='Ա������']");
		Thread.sleep(1000);
		assertTrue(webtest.isTextPresent("Ա������"));
	}
	
	
	@Test(priority = 51)
	public void test49() throws InterruptedException {
	//	webtest.click("xpath=//a[text()='��վ����']");
	//	Thread.sleep(1000);
	//	webtest.click("xpath=//a[text()='HR������']");
	//	Thread.sleep(1000);
		webtest.click("xpath=//a[text()='��ͬ/����']");
		Thread.sleep(1000);
		assertTrue(webtest.isTextPresent("��ͬ/����"));
	}
	
	
	@Test(priority = 52)
	public void test50() throws InterruptedException {
		webtest.click("xpath=/html/body/div[2]/div/div[1]/div/a/img");
		Thread.sleep(1000);
		webtest.click("xpath=//a[text()='��վ����']");
		Thread.sleep(1000);
		webtest.click("xpath=//a[text()='����ְλ']");
		Thread.sleep(1000);
		assertTrue(webtest.isTextPresent("��������ְλ"));
	}
	
}

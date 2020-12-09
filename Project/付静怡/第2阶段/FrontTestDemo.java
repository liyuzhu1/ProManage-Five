package com.webtest.demo;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
//import com.webtest.dataprovider.NSDataProvider;
import com.webtest.dataprovider.NSDataProvider;

public class FrontTestDemo extends BaseTest{
	//ǰ̨������������Ҫ��¼
	@BeforeMethod
	public void openWeb() throws InterruptedException {
		webtest.open("");
		Thread.sleep(1000);
	}
	
	@Test(priority=1,dataProvider="excel17",dataProviderClass=NSDataProvider.class)  //ְ���ʴ�- ����
	public void test1(String s1) throws InterruptedException {
		webtest.click("xpath=//a[text()='��վ����']");
		Thread.sleep(1000);
		webtest.click("xpath=//a[text()='ְ���ʴ�']");
		Thread.sleep(3000);
		webtest.type("id=askkeyword", s1);
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(3000);
	}

	@Test(priority=2)  //ְ���ʴ�-��Ҫ����
	public void test2() throws InterruptedException {
		webtest.click("xpath=//a[text()='��վ����']");
		webtest.click("xpath=//a[text()='ְ���ʴ�']");
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/div[5]/div/div[2]/div/div[2]/a");
		Thread.sleep(3000);
	}
	
	@Test(priority=3) //ְ���ʴ�-ѡ����
	public void test3() throws InterruptedException {
		webtest.click("xpath=//a[text()='��վ����']");
		webtest.click("xpath=//*[@id=\"login_head_div\"]/div/div/div/ul[1]/li[10]/a");
		Thread.sleep(1000);
		webtest.click("xpath=//a[text()='����']");
		webtest.click("xpath=//a[text()='����']");
		Thread.sleep(3000);
	}
	
	@Test(priority=4) //ְ���ʴ�-һ���ȵ�
	public void test4() throws InterruptedException {
		webtest.click("xpath=//a[text()='��վ����']");
		Thread.sleep(1000);
		webtest.click("xpath=//a[text()='ְ���ʴ�']");
		webtest.click("xpath=//a[text()='һ���ȵ�']");
		Thread.sleep(3000);
	}
	
	@Test(priority=5) //ְ���ʴ�-�����˲�����ҳ
	public void test5() throws InterruptedException {
		webtest.click("xpath=//a[text()='��վ����']");
		Thread.sleep(1000);
		webtest.click("xpath=//*[@id=\"login_head_div\"]/div/div/div/ul[1]/li[10]/a");
		webtest.click("xpath=//a[text()='�����˲�����ҳ']");
		Thread.sleep(3000);
	}
	
	@Test(priority=6)  //���а�
	public void test6() throws InterruptedException {
		webtest.runJs("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(1000);
		webtest.click("xpath=//a[text()='���а�']");
		Thread.sleep(3000);
	}
	
	@Test(priority=7,dataProvider="excel18",dataProviderClass=NSDataProvider.class) //�ҹ���-����ְλ��˾
	public void test7(String s1) throws InterruptedException {
		webtest.click("xpath=//a[text()='��վ����']");
		Thread.sleep(1000);
		webtest.click("xpath=//a[text()='�ҹ���']");
		Thread.sleep(1000);
		webtest.click("xpath=//input[@name='keyword']");
		webtest.type("name=keyword",s1);
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(3000);
	}
	
	@Test(priority=8,dataProvider="excel18",dataProviderClass=NSDataProvider.class) //�ҹ���-����ؼ���
	public void test8(String s1) throws InterruptedException {
		webtest.click("xpath=//a[text()='��վ����']");
		Thread.sleep(1000);
		webtest.click("xpath=//a[text()='�ҹ���']");
		Thread.sleep(1000);
		webtest.click("xpath=//input[@name='keyword']");
		webtest.type("name=keyword",s1);
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(1000);
		webtest.click("xpath=//a[text()=' �����ѡ']");
		Thread.sleep(3000);
	}
	
	@Test(priority=9) //�ҹ���-����
	public void test9() throws InterruptedException {
		webtest.click("xpath=//a[text()='��վ����']");
		Thread.sleep(1000);
		webtest.click("xpath=//*[@id=\"login_head_div\"]/div/div/div/ul[1]/li[1]/a");
		Thread.sleep(1000);
		Thread.sleep(1000);
		webtest.click("xpath=//a[text()='����Ա']");
		Thread.sleep(3000);
	}
	
	@Test(priority=10) //���˲�-��Ƭ�˲�
	public void test10() throws InterruptedException {
		webtest.click("xpath=//a[text()='��վ����']");
		Thread.sleep(1000);
		webtest.click("xpath=//*[@id=\"login_head_div\"]/div/div/div/ul[1]/li[2]/a");
		Thread.sleep(1000);
		Thread.sleep(1000);
		webtest.click("xpath=//a[text()='��Ƭ�˲�']");
		Thread.sleep(3000);
	}
	
	@Test(priority=11,dataProvider="excel19",dataProviderClass=NSDataProvider.class) //������Ƹ-������Ƹ��Ϣ
	public void test11(String s1,String s2,String s3,String s4,String s5,String s6,String s7,String s8,String s9,String s10) throws InterruptedException {
		webtest.click("xpath=//a[text()='��վ����']");
		webtest.click("xpath=//a[text()='������Ƹ']");
		webtest.click("xpath=//a[text()='����������Ƹ']");
		webtest.click("xpath=//a[text()='ȷ��']");
		Thread.sleep(1000);
		webtest.typeAndClear("xpath=//input[@name='title']", s1);
		webtest.typeAndClear("xpath=//input[@name='salary']", s2);
		webtest.typeAndClear("xpath=//input[@name='edate']", s3);
		webtest.click("xpath=//*[@id=\"subform\"]/div/div[2]/div[5]/div/div[1]/div/div/input");
		webtest.click("xpath=//dd[text()='����']");
		webtest.click("xpath=//*[@id=\"subform\"]/div/div[2]/div[5]/div/div[2]/div/div/i");
		webtest.click("xpath=//*[@id=\"subform\"]/div/div[2]/div[5]/div/div[2]/div/dl/dd[2]");
		webtest.click("xpath=//*[@id=\"subform\"]/div/div[2]/div[5]/div/div[3]/div/div/i");
		webtest.click("xpath=//*[@id=\"subform\"]/div/div[2]/div[5]/div/div[3]/div/dl/dd[2]");
		Thread.sleep(3000);
		webtest.typeAndClear("xpath=//input[@name='address']", s4);
		webtest.typeAndClear("xpath=//textarea[@id='require']", s5);
		webtest.typeAndClear("xpath=//input[@name='companyname']", s6);
		webtest.typeAndClear("xpath=//input[@name='phone']", s7);
		webtest.typeAndClear("xpath=//input[@name='linkman']", s8);
		webtest.typeAndClear("xpath=//input[@name='authcode']", s9);
		webtest.typeAndClear("xpath=//input[@name='password']", s10);
		Thread.sleep(3000);
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(3000);
	}
	
	@Test(priority=12,dataProvider="excel20",dataProviderClass=NSDataProvider.class) //������Ϣ-ɸѡ������Ϣ
	public void test12(String s1) throws InterruptedException {
		webtest.click("xpath=//a[text()='��վ����']");
		Thread.sleep(1000);
		webtest.click("xpath=//*[@id=\"login_head_div\"]/div/div/div/ul[1]/li[4]/a");
		Thread.sleep(1000);
		webtest.click("xpath=//input[@id='key_word']");
		webtest.typeAndClear("xpath=//input[@id='key_word']", s1);
		webtest.click("xpath=//input[@id='search_button']");
		Thread.sleep(3000);
	}
	

}

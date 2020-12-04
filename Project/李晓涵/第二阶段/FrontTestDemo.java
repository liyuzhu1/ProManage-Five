package com.webtest.demo;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class FrontTestDemo extends BaseTest {
//	��վ��¼
	@BeforeClass
	public void test_login() throws InterruptedException {
		webtest.open("");
		Thread.sleep(2000);
	}

//	43��ְ����Ѷ���鿴����
	@Test
	public void test1() throws InterruptedException {
		Thread.sleep(2000);
		webtest.mouseToElement("xpath=//a[text()='��վ����']");
		webtest.mouseToElementandClick("xpath=//a[text()='ְ����Ѷ']");
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()='����һ������']");
		Thread.sleep(1000);
		webtest.isDisplayed("class=news_index_today_hot_s");
		webtest.click("xpath=//a[text()=' ��ҳ ']");
	}

//	44��ְ����Ѷ��������ҳ
	@Test
	public void test2() throws InterruptedException {
		Thread.sleep(2000);
		webtest.mouseToElement("xpath=//a[text()='��վ����']");
		webtest.mouseToElementandClick("xpath=//a[text()='ְ����Ѷ']");
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()=' ��ҳ ']");
		Thread.sleep(1000);
		webtest.isDisplayed("class=yun_new_left");
	}

//	45����Ƹ�ᣬ���ڻع�
	@Test
	public void test3() throws InterruptedException {
		Thread.sleep(2000);
		webtest.mouseToElement("xpath=//a[text()='��վ����']");
		webtest.mouseToElementandClick("xpath=//a[text()='��Ƹ��']");
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()='�������ڻع�>>']");
		Thread.sleep(1000);
		webtest.isDisplayed("xpath=//a[text()=' ��ҳ ']");
		webtest.click("xpath=//a[text()=' ��ҳ ']");
	}

//	46��ר����Ƹ
	@Test
	public void test4() throws InterruptedException {
		Thread.sleep(2000);
		webtest.mouseToElement("xpath=//a[text()='��վ����']");
		webtest.mouseToElementandClick("xpath=//a[text()='ר����Ƹ']");
		Thread.sleep(2000);
		webtest.isDisplayed("xpath=//a[text()=' ��ҳ ']");
		webtest.click("xpath=//a[text()=' ��ҳ ']");
	}

//	47��ְҵ����
	@Test
	public void test5() throws InterruptedException {
		Thread.sleep(2000);
		webtest.mouseToElement("xpath=//a[text()='��վ����']");
		webtest.mouseToElementandClick("xpath=//a[text()='ְҵ����']");
		Thread.sleep(2000);
		webtest.isDisplayed("xpath=//a[text()=' ��ҳ ']");
		webtest.click("xpath=//a[text()=' ��ҳ ']");
	}

//	48�������̳�
	@Test
	public void test6() throws InterruptedException {
		Thread.sleep(2000);
		webtest.mouseToElement("xpath=//a[text()='��վ����']");
		webtest.mouseToElementandClick("xpath=//a[text()='�����̳�']");
		Thread.sleep(2000);
		webtest.isDisplayed("xpath=//a[text()=' ��ҳ ']");
		webtest.click("xpath=//a[text()=' ��ҳ ']");
	}

//	49�������̳ǣ��ҹ���
	@Test
	public void test7() throws InterruptedException {
		Thread.sleep(2000);
		webtest.mouseToElement("xpath=//a[text()='��վ����']");
		webtest.mouseToElementandClick("xpath=//a[text()='�����̳�']");
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()=' �ҹ��� ']");
		Thread.sleep(1000);
		webtest.click("xpath=//a[text()='����Ա/����/����']");
		Thread.sleep(1000);
		webtest.isDisplayed("xpath=//a[text()=' ��ҳ ']");
		webtest.click("xpath=//a[text()=' ��ҳ ']");
	}

//	50�������̳ǣ����˲�
	@Test
	public void test8() throws InterruptedException {
		Thread.sleep(2000);
		webtest.mouseToElement("xpath=//a[text()='��վ����']");
		webtest.mouseToElementandClick("xpath=//a[text()='�����̳�']");
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()=' ���˲� ']");
		Thread.sleep(1000);
		webtest.click("xpath=//a[text()='����Ա/����/����']");
		Thread.sleep(1000);
		webtest.isDisplayed("xpath=//a[text()=' ��ҳ ']");
		webtest.click("xpath=//a[text()=' ��ҳ ']");
	}

//	42����¼ǰ��
	@Test
	public void test9() throws InterruptedException {
		webtest.mouseToElementandClick("xpath=//a[text()='�û���¼']");
		Thread.sleep(1000);
		webtest.type("id=username", "aaa");
		Thread.sleep(1000);
		webtest.click("id=password2");
		webtest.type("id=password", "123456");
		Thread.sleep(1000);
		webtest.click("xpath=//input[@type='button']");
		Thread.sleep(1000);
		webtest.click("xpath=//a[text()='�ݲ�ˢ��']");
		Thread.sleep(1000);
		webtest.click("xpath=//a[text()='�˲�����ҳ']");
	}

}

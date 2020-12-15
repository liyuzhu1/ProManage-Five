package com.webtest.xieyuxin;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.dataprovider.NSDataProviderXieyuxin;;

/**
 * 
 * @author ������
 *
 */
public class ExcelTestBack extends BaseTest {

	// ��̨-��Ա-��Ա�б�-�޸�-�޸�����
	@Test(dataProvider = "excel19", dataProviderClass = NSDataProviderXieyuxin.class)
	public void test19(String s1, String s2, String s3, String s4) throws InterruptedException {
		webtest.open("/admin");
		Thread.sleep(1000);
		webtest.type("id=username", s1);
		webtest.type("id=password", s2);
		webtest.click("xpath=//input[@type='submit']");
		webtest.click("xpath=//a[text()='��Ա']");
		Thread.sleep(2000);

		webtest.enterFrame1("name=right");
		webtest.click("name=keyword");
		webtest.type("name=keyword", s3);
		webtest.click("name=search");
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()='�޸�']");

		webtest.type("name=password", s4);
		Thread.sleep(2000);
		webtest.runJs("window.scrollTo(0,document.body.scrollHeight)");
		webtest.click("name=submit");
		assertTrue(webtest.isTextPresent("�޸�"));
		Thread.sleep(2000);
	}

	// ��̨-��Ա-��Ա�б�-�޸�-�޸�����
	@Test(dataProvider = "excel20", dataProviderClass = NSDataProviderXieyuxin.class)
	public void test20(String s1, String s2, String s3, String s4) throws InterruptedException {
		webtest.open("/admin");
		Thread.sleep(1000);
		webtest.type("id=username", s1);
		webtest.type("id=password", s2);
		webtest.click("xpath=//input[@type='submit']");
		webtest.click("xpath=//a[text()='��Ա']");
		Thread.sleep(2000);

		webtest.enterFrame1("name=right");
		webtest.click("name=keyword");
		webtest.type("name=keyword", s3);
		webtest.click("name=search");
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()='�޸�']");

		webtest.typeAndClear("name=email", "");
		Thread.sleep(2000);
		webtest.type("name=email", s4);
		Thread.sleep(2000);
		webtest.runJs("window.scrollTo(0,document.body.scrollHeight)");
		webtest.click("name=submit");
		assertTrue(webtest.isTextPresent("�޸�"));
		Thread.sleep(2000);
	}

	// ��̨-��Ա-��Ա�б�-�޸�-�رղ�����ʾ
	@Test(dataProvider = "excel21", dataProviderClass = NSDataProviderXieyuxin.class)
	public void test21(String s1, String s2) throws InterruptedException {
		webtest.open("/admin");
		Thread.sleep(1000);
		webtest.type("id=username", s1);
		webtest.type("id=password", s2);
		webtest.click("xpath=//input[@type='submit']");
		webtest.click("xpath=//a[text()='��Ա']");
		Thread.sleep(2000);

		webtest.enterFrame1("name=right");
		webtest.click("class=admin_new_tip_close");
		assertTrue(webtest.isTextPresent("�޸�"));
		Thread.sleep(2000);
	}

	// ��̨-��Ա-��Ա�б�-�޸�-�����޸�
	@Test(dataProvider = "excel22", dataProviderClass = NSDataProviderXieyuxin.class)
	public void test22(String s1, String s2, String s3, String s4) throws InterruptedException {
		webtest.open("/admin");
		Thread.sleep(1000);
		webtest.type("id=username", s1);
		webtest.type("id=password", s2);
		webtest.click("xpath=//input[@type='submit']");
		webtest.click("xpath=//a[text()='��Ա']");
		Thread.sleep(2000);

		webtest.enterFrame1("name=right");
		webtest.click("name=keyword");
		webtest.type("name=keyword", s3);
		webtest.click("name=search");
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()='�޸�']");

		webtest.typeAndClear("name=username", "");
		Thread.sleep(2000);
		webtest.type("id=username", s4);
		Thread.sleep(2000);
		webtest.runJs("window.scrollTo(0,document.body.scrollHeight)");
		webtest.click("name=reset");
		webtest.runJs("window.scrollTo(0,0)");
		assertTrue(webtest.isTextPresent("�û���"));
		Thread.sleep(2000);
	}

	// ��̨-��Ա-��Ա�б�-��������
	@Test(dataProvider = "excel23", dataProviderClass = NSDataProviderXieyuxin.class)
	public void test23(String s1, String s2, String s3) throws InterruptedException {
		webtest.open("/admin");
		Thread.sleep(1000);
		webtest.type("id=username", s1);
		webtest.type("id=password", s2);
		webtest.click("xpath=//input[@type='submit']");
		webtest.click("xpath=//a[text()='��Ա']");
		Thread.sleep(2000);

		webtest.enterFrame1("name=right");
		webtest.click("name=keyword");
		webtest.type("name=keyword", s3);
		webtest.click("name=search");
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()='����']");

		webtest.leaveFrame();
		webtest.click("xpath=//a[text()='ȷ��']");
		assertTrue(webtest.isTextPresent("����"));
		Thread.sleep(2000);
	}

	// ��̨-��Ա-��ҵ-��ҵ����-�û�������
	@Test(dataProvider = "excel24", dataProviderClass = NSDataProviderXieyuxin.class)
	public void test24(String s1, String s2, String s3) throws InterruptedException {
		webtest.open("/admin");
		Thread.sleep(1000);
		webtest.type("id=username", s1);
		webtest.type("id=password", s2);
		webtest.click("xpath=//input[@type='submit']");
		webtest.click("xpath=//a[text()='��Ա']");
		webtest.click("xpath=//span[text()='��ҵ']");
		Thread.sleep(2000);

		webtest.enterFrame1("name=right");
		webtest.click("name=keyword");
		webtest.type("name=keyword", s3);
		Thread.sleep(2000);
		webtest.click("class=admin_new_bth");
		assertTrue(webtest.isTextPresent("����"));
		Thread.sleep(2000);
	}

	// ��̨-��Ա-��ҵ-��ҵ����-��־
	@Test(dataProvider = "excel25", dataProviderClass = NSDataProviderXieyuxin.class)
	public void test25(String s1, String s2, String s3) throws InterruptedException {
		webtest.open("/admin");
		Thread.sleep(1000);
		webtest.type("id=username", s1);
		webtest.type("id=password", s2);
		webtest.click("xpath=//input[@type='submit']");
		webtest.click("xpath=//a[text()='��Ա']");
		webtest.click("xpath=//span[text()='��ҵ']");
		Thread.sleep(2000);

		webtest.enterFrame1("name=right");
		webtest.click("name=keyword");
		webtest.type("name=keyword", s3);
		Thread.sleep(2000);
		webtest.runJs("window.scrollTo(0,document.body.scrollHeight)");
		webtest.click("xpath=//a[text()='��־']");
		assertTrue(webtest.isTextPresent("��Ա��־"));
		Thread.sleep(2000);
	}

	// ��̨-��Ա-��ҵ-��ҵ����-����
	@Test(dataProvider = "excel26", dataProviderClass = NSDataProviderXieyuxin.class)
	public void test26(String s1, String s2, String s3) throws InterruptedException {
		webtest.open("/admin");
		Thread.sleep(1000);
		webtest.type("id=username", s1);
		webtest.type("id=password", s2);
		webtest.click("xpath=//input[@type='submit']");
		webtest.click("xpath=//a[text()='��Ա']");
		webtest.click("xpath=//span[text()='��ҵ']");
		Thread.sleep(2000);

		webtest.enterFrame1("name=right");
		webtest.click("name=keyword");
		webtest.type("name=keyword", s3);
		Thread.sleep(2000);
		webtest.runJs("window.scrollTo(0,document.body.scrollHeight)");
		webtest.click("xpath=//a[text()='����']");
		assertTrue(webtest.isTextPresent("��ϵ��ʽ"));
		Thread.sleep(2000);
	}

	// ��̨-�û�������
	@Test(dataProvider = "excel46", dataProviderClass = NSDataProviderXieyuxin.class)
	public void test46(String s1, String s2, String s3) throws InterruptedException {
		webtest.open("/admin");
		Thread.sleep(1000);
		webtest.type("id=username", s1);
		webtest.type("id=password", s2);
		webtest.click("xpath=//input[@type='submit']");
		webtest.click("xpath=//a[text()='��Ա']");
		Thread.sleep(2000);
		webtest.enterFrame1("name=right");
		webtest.click("name=keyword");
		webtest.type("name=keyword", s3);
		webtest.click("name=search");
		assertTrue(webtest.isTextPresent("����"));
		Thread.sleep(2000);
	}

	// ��̨-�ֻ�������
	@Test(dataProvider = "excel47", dataProviderClass = NSDataProviderXieyuxin.class)
	public void test47(String s1, String s2, String s3) throws InterruptedException {
		webtest.open("/admin");
		Thread.sleep(1000);
		webtest.type("id=username", s1);
		webtest.type("id=password", s2);
		webtest.click("xpath=//input[@type='submit']");
		webtest.click("xpath=//a[text()='��Ա']");
		Thread.sleep(2000);
		webtest.enterFrame1("name=right");
		webtest.mouseToElement("id=bkeytype");
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()='�ֻ���']");
		webtest.click("name=keyword");
		webtest.type("name=keyword", s3);
		webtest.click("name=search");
		assertTrue(webtest.isTextPresent("180"));
		Thread.sleep(2000);
	}

	// ��̨-ɾ����Ա
	@Test(dataProvider = "excel48", dataProviderClass = NSDataProviderXieyuxin.class)
	public void test48(String s1, String s2, String s3) throws InterruptedException {
		webtest.open("/admin");
		Thread.sleep(1000);
		webtest.type("id=username", s1);
		webtest.type("id=password", s2);
		webtest.click("xpath=//input[@type='submit']");
		webtest.click("xpath=//a[text()='��Ա']");
		Thread.sleep(2000);

		webtest.enterFrame1("name=right");
		webtest.click("name=keyword");
		webtest.type("name=keyword", s3);
		webtest.click("name=search");
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()='ɾ��']");
		webtest.leaveFrame();
		webtest.click("xpath=//a[text()='ȷ��']");
		assertTrue(webtest.isTextPresent("�û�"));
		Thread.sleep(2000);

	}

	// ��̨-ȫѡ
	@Test(dataProvider = "excel49", dataProviderClass = NSDataProviderXieyuxin.class)
	public void test49(String s1, String s2) throws InterruptedException {
		webtest.open("/admin");
		Thread.sleep(1000);
		webtest.type("id=username", s1);
		webtest.type("id=password", s2);
		webtest.click("xpath=//input[@type='submit']");
		webtest.click("xpath=//a[text()='��Ա']");
		Thread.sleep(2000);
		webtest.enterFrame1("name=right");
		webtest.runJs("window.scrollTo(0,document.body.scrollHeight)");
		webtest.click("id=chkAll2");
		assertTrue(webtest.isTextPresent("�û�"));
		Thread.sleep(2000);
	}

	// ��̨-�߼�����
	@Test(dataProvider = "excel50", dataProviderClass = NSDataProviderXieyuxin.class)
	public void test50(String s1, String s2) throws InterruptedException {
		webtest.open("/admin");
		Thread.sleep(1000);
		webtest.type("id=username", s1);
		webtest.type("id=password", s2);
		webtest.click("xpath=//input[@type='submit']");
		webtest.click("xpath=//a[text()='��Ա']");
		Thread.sleep(2000);
		webtest.enterFrame1("name=right");
		webtest.click("xpath=//a[text()='�߼�����']");
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()='�����������']");
		Thread.sleep(2000);
	}
}

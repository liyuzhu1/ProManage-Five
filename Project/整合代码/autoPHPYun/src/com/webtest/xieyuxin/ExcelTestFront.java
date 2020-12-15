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
public class ExcelTestFront extends BaseTest {

	// �����ҳ���Ĺ���,��ת���ֻ���PHPYUN����ҳ��
	@Test
	public void test1() throws InterruptedException {
		webtest.open("");
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[11]/div[1]/div[1]/a/img");
		assertTrue(webtest.isTextPresent("��ҳ"));
		Thread.sleep(2000);
	}

	// ����ر���ҳ������
	@Test
	public void test2() throws InterruptedException {
		webtest.open("");
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[11]/div[1]/div[2]/div");
		assertTrue(webtest.isTextPresent("��ҳ"));
		Thread.sleep(2000);
	}

	// ע��ɹ�-userttt
	@Test(dataProvider = "excel6", dataProviderClass = NSDataProviderXieyuxin.class)
	public void test6(String s1, String s2, String s3, String s4) throws InterruptedException {
		webtest.open("");
		Thread.sleep(1000);
		webtest.click("class=tip_bottom_login");
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()='ע���˺�']");
		Thread.sleep(2000);
		webtest.type("id=username1", s1);
		webtest.type("id=CheckCode", s2);
		webtest.type("id=password", s3);
		webtest.type("id=passconfirm", s4);
		webtest.click("id=subreg");
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()='������ҳ']");
		assertTrue(webtest.isTextPresent("��ҳ"));
		Thread.sleep(2000);
	}

	// ��¼ʧ��-username
	@Test(dataProvider = "excel4", dataProviderClass = NSDataProviderXieyuxin.class)
	public void test4(String s1, String s2) throws InterruptedException {
		webtest.open("");
		Thread.sleep(1000);

		webtest.click("xpath=//a[text()='[��ȫ�˳�]']");
		Thread.sleep(2000);

		webtest.click("class=tip_bottom_login");
		Thread.sleep(2000);
		webtest.type("id=username", s1);
		Thread.sleep(2000);
		webtest.click("id=password2");
		webtest.type("id=password", s2);
		webtest.click("id=sublogin");
		assertTrue(webtest.isTextPresent("��ҳ"));
		Thread.sleep(2000);
	}

	// ������ҳ
	@Test
	public void test5() throws InterruptedException {
		webtest.open("");
		Thread.sleep(1000);
		webtest.click("class=tip_bottom_login");
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()='������վ��ҳ>>']");
		assertTrue(webtest.isTextPresent("��ҳ"));
		Thread.sleep(2000);
	}

	// ��½�ɹ�-username3
	@Test(dataProvider = "excel3", dataProviderClass = NSDataProviderXieyuxin.class)
	public void test3(String s1, String s2) throws InterruptedException {
		webtest.open("");
		Thread.sleep(1000);
		webtest.click("class=tip_bottom_login");
		Thread.sleep(2000);
		webtest.type("id=username", s1);
		Thread.sleep(2000);
		webtest.click("id=password2");
		webtest.type("id=password", s2);
		webtest.click("id=sublogin");
		assertTrue(webtest.isTextPresent("��ҳ"));
		Thread.sleep(2000);

		webtest.click("xpath=//a[text()='[��ȫ�˳�]']");
		Thread.sleep(2000);

	}

	// ��¼-ע���˺�-ֱ�ӵ�¼
	@Test(dataProvider = "excel7", dataProviderClass = NSDataProviderXieyuxin.class)
	public void test7(String s1, String s2) throws InterruptedException {
		webtest.open("");
		Thread.sleep(1000);
		webtest.click("class=tip_bottom_login");
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()='ע���˺�']");
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()='ֱ�ӵ�¼>']");
		Thread.sleep(2000);
		webtest.type("id=username", s1);
		Thread.sleep(2000);
		webtest.click("id=password2");
		webtest.type("id=password", s2);
		webtest.click("id=sublogin");
		assertTrue(webtest.isTextPresent("��ҳ"));
		Thread.sleep(2000);
	}

	// ����ע��ɹ�
	@Test(dataProvider = "excel8", dataProviderClass = NSDataProviderXieyuxin.class)
	public void test8(String s1, String s2, String s3, String s4) throws InterruptedException {
		webtest.open("");
		Thread.sleep(1000);
		webtest.click("class=tip_bottom_reg");
		Thread.sleep(2000);
		webtest.type("id=username1", s1);
		Thread.sleep(2000);
		webtest.type("id=CheckCode", s2);
		Thread.sleep(2000);
		webtest.type("id=password", s3);
		Thread.sleep(2000);
		webtest.type("id=passconfirm", s4);
		Thread.sleep(2000);
		webtest.click("id=subreg");
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()='������ҳ']");
		assertTrue(webtest.isTextPresent("��ҳ"));
		Thread.sleep(2000);
	}

	// ��ʾ����
	@Test(dataProvider = "excel9", dataProviderClass = NSDataProviderXieyuxin.class)
	public void test9(String s1) throws InterruptedException {
		webtest.open("");
		Thread.sleep(1000);
		webtest.click("class=tip_bottom_reg");
		Thread.sleep(2000);
		webtest.runJs("window.scrollTo(0,200)");
		Thread.sleep(2000);
		webtest.type("id=password", s1);
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()='��ʾ����']");
		assertTrue(webtest.isTextPresent("����"));
		Thread.sleep(2000);
	}

	// �رյײ�����
	@Test
	public void test10() throws InterruptedException {
		webtest.open("");
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[7]/div/div[2]/div/div[2]/a");
		assertTrue(webtest.isTextPresent("��ҳ"));
		Thread.sleep(2000);
	}

	// �ײ�������ת-��������-��������
	@Test
	public void test11() throws InterruptedException {
		webtest.open("");
		Thread.sleep(1000);
		webtest.runJs("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()='��������']");
		
		Thread.sleep(2000);
	}

	// �ײ�������ת-��������-ע��Э��
	@Test
	public void test12() throws InterruptedException {
		webtest.open("");
		Thread.sleep(1000);
		webtest.runJs("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()='ע��Э��']");
		
		Thread.sleep(2000);
	}

	// �ײ�������ת-��վ��ɫ-���а�
	@Test
	public void test13() throws InterruptedException {
		webtest.open("");
		Thread.sleep(1000);
		webtest.runJs("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()='���а�']");
		assertTrue(webtest.isTextPresent("���а�"));
		Thread.sleep(2000);
	}

	// �ײ�������ת-��վ��ɫ-���а�-�鿴��˾����
	@Test
	public void test14() throws InterruptedException {
		webtest.open("");
		Thread.sleep(1000);
		webtest.runJs("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()='���а�']");
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()='�����Ƽ����޹�˾']");
		assertTrue(webtest.isTextPresent("����"));
		Thread.sleep(2000);
	}

	// �ײ�������ת-��վ��ɫ-��ְ����
	@Test
	public void test15() throws InterruptedException {
		webtest.open("");
		Thread.sleep(1000);
		webtest.runJs("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()='��ְ����']");
		assertTrue(webtest.isTextPresent("����"));
		Thread.sleep(2000);
	}

	// �ײ�������ת-��վ��ɫ-���ķ���
	@Test
	public void test16() throws InterruptedException {
		webtest.open("");
		Thread.sleep(1000);
		webtest.runJs("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()='���ķ���']");
		
		Thread.sleep(2000);
	}

	// �ײ�������ת-��ѯ����-�ͷ�����
	@Test
	public void test17() throws InterruptedException {
		webtest.open("");
		Thread.sleep(1000);
		webtest.runJs("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()='�ͷ�����']");
		
		Thread.sleep(2000);
	}

	// �ײ�������ת-��ѯ����-��������
	@Test
	public void test18() throws InterruptedException {
		webtest.open("");
		Thread.sleep(1000);
		webtest.runJs("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()='��������']");
		
		Thread.sleep(2000);
	}

	// LOGO��ת
	@Test
	public void test27() throws InterruptedException {
		webtest.open("");
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[4]/div[1]/div[1]/div/a/img");
		assertTrue(webtest.isTextPresent("��ҳ"));
		Thread.sleep(2000);
	}

	// banner��ת
	@Test
	public void test28() throws InterruptedException {
		webtest.open("");
		Thread.sleep(1000);
		webtest.click("id=test1");
		assertTrue(webtest.isTextPresent("��ҳ"));
		Thread.sleep(2000);
	}

	// ��������-PHPYUN�˲�ϵͳ
	@Test
	public void test29() throws InterruptedException {
		webtest.open("");
		Thread.sleep(1000);
		webtest.runJs("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()='PHPYUN�˲�ϵͳ']");
		assertTrue(webtest.isTextPresent("��ҳ"));
		Thread.sleep(2000);
	}

	// ��������-HR135�˲���
	@Test
	public void test30() throws InterruptedException {
		webtest.open("");
		Thread.sleep(1000);
		webtest.runJs("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()='HR135�˲���']");
		assertTrue(webtest.isTextPresent("��ҳ"));
		Thread.sleep(2000);
	}

	// ��������-PHPYUN��̳
	@Test
	public void test31() throws InterruptedException {
		webtest.open("");
		Thread.sleep(1000);
		webtest.runJs("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()='PHPYUN��̳']");
		assertTrue(webtest.isTextPresent("��ҳ"));
		Thread.sleep(2000);
	}

	// ��������-��������
	@Test(dataProvider = "excel32", dataProviderClass = NSDataProviderXieyuxin.class)
	public void test32(String s1, String s2, String s3) throws InterruptedException {
		webtest.open("");
		Thread.sleep(1000);
		webtest.runJs("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		webtest.click("xpath=/html/body/div[6]/div[18]/div[1]/span[2]/a[1]");
		Thread.sleep(2000);
		webtest.runJs("window.scrollTo(0,200)");
		Thread.sleep(2000);
		webtest.click("id=linktype");
		webtest.click("xpath=//a[text()='��������']");
		webtest.type("name=title", s1);
		webtest.type("name=url", s2);
		webtest.type("id=txt_CheckCode", s3);
		webtest.click("class=login_button2");
		assertTrue(webtest.isTextPresent("����"));
		Thread.sleep(2000);
	}

	// ��������-����
	@Test(dataProvider = "excel33", dataProviderClass = NSDataProviderXieyuxin.class)
	public void test33(String s1, String s2, String s3) throws InterruptedException {
		webtest.open("");
		Thread.sleep(1000);
		webtest.runJs("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		webtest.click("xpath=/html/body/div[6]/div[18]/div[1]/span[2]/a[2]");
		Thread.sleep(2000);
		webtest.runJs("window.scrollTo(0,200)");
		Thread.sleep(2000);
		webtest.click("id=linktype");
		webtest.click("xpath=//a[text()='��������']");
		webtest.type("name=title", s1);
		webtest.type("name=url", s2);
		webtest.type("id=txt_CheckCode", s3);
		webtest.click("class=login_button2");
		assertTrue(webtest.isTextPresent("����"));
		Thread.sleep(2000);
	}

	// ���ض��� (�ر��Ҳ����
	@Test
	public void test02() throws InterruptedException {
		webtest.open("");
		Thread.sleep(1000);
		webtest.runJs("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		webtest.click("xpath=/html/body/div[16]/a[3]");
		assertTrue(webtest.isTextPresent("��ҳ"));
		Thread.sleep(2000);
	}

	// �������
	@Test
	public void test03() throws InterruptedException {
		webtest.open("");
		Thread.sleep(1000);
		webtest.runJs("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		webtest.click("xpath=/html/body/div[16]/a[2]");
		Thread.sleep(2000);
		assertTrue(webtest.isTextPresent("��ҳ"));
		Thread.sleep(2000);
	}

	// ��ά��
	@Test
	public void test01() throws InterruptedException {
		webtest.open("");
		Thread.sleep(1000);
		webtest.runJs("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		webtest.click("xpath=/html/body/div[16]/a[1]");
		assertTrue(webtest.isTextPresent("PHPYUN"));
		
		Thread.sleep(2000);
	}

	// ����banner��ת
	@Test
	public void test37() throws InterruptedException {
		webtest.open("");
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[4]/div[1]/div[1]/div/a/img");
		assertTrue(webtest.isTextPresent("��ҳ"));
		Thread.sleep(2000);
	}

	// ������Ƹ-�鿴����ְλ
	@Test
	public void test38() throws InterruptedException {
		webtest.open("");
		Thread.sleep(1000);
		webtest.runJs("window.scrollTo(0,100)");
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()='�鿴����ְλ>']");

		Thread.sleep(2000);
	}

	// ��վ����-����
	@Test
	public void test39() throws InterruptedException {
		webtest.open("");
		Thread.sleep(1000);
		webtest.runJs("window.scrollTo(0,100)");
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()='����>>']");
		assertTrue(webtest.isTextPresent("��վ����"));
		Thread.sleep(2000);
	}

	// ������Ƹ-��������
	@Test
	public void test40() throws InterruptedException {
		webtest.open("");
		Thread.sleep(1000);
		webtest.runJs("window.scrollTo(0,300)");
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()='�������� >']");
		assertTrue(webtest.isTextPresent("����ҵ"));
		Thread.sleep(2000);
	}

	// ������Ƹ-����ְλ-����
	@Test
	public void test41() throws InterruptedException {
		webtest.open("");
		Thread.sleep(1000);
		webtest.runJs("window.scrollTo(0,800)");
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()='�鿴����>']");
		assertTrue(webtest.isTextPresent("��ҳ"));
		Thread.sleep(2000);
	}

	// ������Ƹ-img��ת
	@Test
	public void test42() throws InterruptedException {
		webtest.open("");
		Thread.sleep(1000);
		webtest.runJs("window.scrollTo(0,200)");
		Thread.sleep(2000);
		webtest.click("class=layui-this");
		assertTrue(webtest.isTextPresent("��ҳ"));
		Thread.sleep(2000);
	}

	// ����ְλ-����
	@Test
	public void test43() throws InterruptedException {
		webtest.open("");
		Thread.sleep(1000);
		webtest.runJs("window.scrollTo(0,1000)");
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()='����ְλ >']");
		assertTrue(webtest.isTextPresent("�ҹ���"));
		Thread.sleep(2000);
	}

	// ����ְλ-ְλ����
	@Test
	public void test44() throws InterruptedException {
		webtest.open("");
		Thread.sleep(1000);
		webtest.runJs("window.scrollTo(0,1200)");
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()='�������繤��ʦ']");
		assertTrue(webtest.isTextPresent("��ҳ"));
		Thread.sleep(2000);
	}

	// �����˲�-��ҳ
	@Test
	public void test45() throws InterruptedException {
		webtest.open("");
		Thread.sleep(1000);
		webtest.runJs("window.scrollTo(0,2000)");
		Thread.sleep(2000);
		webtest.click("id=btnr");
		assertTrue(webtest.isTextPresent("���¼���"));
		Thread.sleep(2000);
	}
}

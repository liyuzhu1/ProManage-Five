package com.webtest.demo;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class AdminTestDemo extends BaseTest {
//	��¼��̨,��������ҳ��
	@BeforeClass
	public void testLogin_admin() throws InterruptedException {
//		webtest.open("http://localhost/admin/index.php");
		webtest.open("/admin/index.php");
		Thread.sleep(2000);
		webtest.type("id=username", "admin");
		webtest.type("id=password", "admin");
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(2000);
		webtest.mouseToElementandClick("xpath=//a[text()='����']");
	}

//	1���޸����ű���
	@Test
	public void test_a1() throws InterruptedException {
		Thread.sleep(2000);
		webtest.enterFrame("rightMain");
		webtest.click("xpath=//*[@id='list9']/td[10]/a");
		Thread.sleep(2000);
		webtest.typeAndClear("id=title", "����һ���ܺõ�����");
		Thread.sleep(2000);
		webtest.runJs("window.scrollTo(0,500);");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id='newsform']/table/tbody[3]/tr[12]/td/input[4]");
		Thread.sleep(3000);
		webtest.isDisplayed("xpath=//input[text()='����']");
		webtest.leaveFrame();
		webtest.click("xpath=//a[text()='���Ź���']");
	}

//	2��ɾ������(�ɹ�)
	@Test
	public void test_a2() throws InterruptedException {
		Thread.sleep(1000);
		webtest.enterFrame("rightMain");
		webtest.click("xpath=//*[@id='list9']/td[10]/a[2]");
		Thread.sleep(2000);
		webtest.leaveFrame();
		webtest.click("xpath=//a[text()='ȷ��']");
		webtest.click("class=layui-layer-btn0");
		Thread.sleep(1000);
	}

//	3����������(�ɹ�)
	@Test
	public void test_a3() throws InterruptedException {
		Thread.sleep(1000);
		webtest.enterFrame("rightMain");
		webtest.type("class=admin_Filter_search", "����һ������");
		Thread.sleep(1000);
		webtest.mouseToElementandClick("name=news_search");
		Thread.sleep(1000);
		// ����
		String actual = webtest.getText("class=Search_jobs_c_a");
		Assert.assertEquals(actual, "�ؼ��֣�����һ������");
		System.out.println("����test_a3");
		webtest.leaveFrame();
	}

//	4����������
	@Test
	public void test_a4() throws InterruptedException {
		Thread.sleep(2000);
		webtest.enterFrame("rightMain");
		webtest.runJs("window.scrollTo(0,100);");
		webtest.click("xpath=//*[@id=\"chkAll2\"]");// ȫѡ
		Thread.sleep(1000);
		webtest.click("xpath=//*[@id=\"myform\"]/table/tbody/tr[11]/td[2]/input[2]");// ����
		webtest.leaveFrame();
		webtest.click("xpath=//input[text()='ͷ��']");
		Thread.sleep(1000);
		webtest.click("xpath=//*[@id=\"property\"]/form/div/table/tbody/tr[3]/td/input");// ȷ��

		webtest.isDisplayed("xpath=//a[text()='��ӷ���']");
		System.out.println("����test_a4");
	}

//	5�����·���վ��
	@Test
	public void test_a5() throws InterruptedException {
		Thread.sleep(1000);
		webtest.enterFrame("rightMain");
		webtest.click("xpath=//*[@id='list10']/td[9]/div[2]/a");
		Thread.sleep(1000);
		webtest.leaveFrame();
	}

//	6�������߼���������(�ɹ�)
	@Test
	public void test_a6() throws InterruptedException {
		webtest.click("xpath=//a[text()='���Ź���']");
		Thread.sleep(1000);
		webtest.enterFrame("rightMain");
		webtest.mouseToElementandClick("xpath=//a[text()='�߼�����']");
		Thread.sleep(1000);
		webtest.click("class=admin_screenlist");
		webtest.click("xpath=//a[text()='ְҵָ��']");
		// ����
		Boolean flag = webtest.isElementPresent("class=Search_jobs_c_a");
		System.out.println(flag);
		Assert.assertTrue(flag);
		webtest.leaveFrame();
	}

//	7����ʱ��߼���������(�ɹ�)
	@Test
	public void test_a7() throws InterruptedException {
		webtest.click("xpath=//a[text()='���Ź���']");
		Thread.sleep(1000);
		webtest.enterFrame("rightMain");
		webtest.mouseToElementandClick("xpath=//a[text()='�߼�����']");
		Thread.sleep(1000);
		webtest.click("class=admin_screenlist");
		webtest.click("xpath=//a[text()='���һ����']");
		// ����
		Boolean flag = webtest.isElementPresent("class=Search_jobs_c_a");
		System.out.println(flag);
		Assert.assertTrue(flag);

		webtest.leaveFrame();
	}

	// 8����ҳ
	@Test
	public void test_a8() throws InterruptedException {
		webtest.click("xpath=//a[text()='���Ź���']");
		Thread.sleep(1000);
		webtest.enterFrame("rightMain");
		webtest.runJs("window.scrollTo(0,400);");
		Thread.sleep(3000);
		webtest.mouseToElementandClick("xpath=//a[text()='��һҳ']");
		Thread.sleep(1000);
		webtest.leaveFrame();
	}

	// 9�������Ž�������(�ɹ�)
	@Test
	public void test_a9() throws InterruptedException {
		webtest.enterFrame("rightMain");
		webtest.mouseToElementandClick("xpath=//*[@id='myform']/table/thead/tr/th[2]/a");
		Thread.sleep(1000);
		// ����
		Boolean flag = webtest.isElementPresent("name=news_search");
		System.out.println(flag);
		Assert.assertTrue(flag);
		webtest.leaveFrame();
	}

	// 10���������ʱ���������(�ɹ�)
	@Test
	public void test_b1() throws InterruptedException {
		webtest.enterFrame("rightMain");
		webtest.mouseToElementandClick("xpath=//*[@id='myform']/table/thead/tr/th[6]/a");
		Thread.sleep(1000);
		// ����
		Boolean flag = webtest.isElementPresent("name=news_search");
		System.out.println(flag);
		Assert.assertTrue(flag);
		webtest.leaveFrame();
	}

	// 11������������������(�ɹ�)
	@Test
	public void test_b2() throws InterruptedException {
		webtest.enterFrame("rightMain");
		webtest.mouseToElementandClick("xpath=//*[@id='myform']/table/thead/tr/th[7]/a");
		Thread.sleep(1000);
		// ����
		Boolean flag = webtest.isElementPresent("name=news_search");
		System.out.println(flag);
		Assert.assertTrue(flag);
		webtest.leaveFrame();
	}

	// 12���������(�ɹ�)
	@Test
	public void test_b3() throws InterruptedException {
		webtest.enterFrame("rightMain");
		webtest.mouseToElementandClick("xpath=//*[@id='myform']/table/thead/tr/th[8]/a");
		Thread.sleep(1000);
		// ����
		Boolean flag = webtest.isElementPresent("name=news_search");
		System.out.println(flag);
		Assert.assertTrue(flag);
		webtest.leaveFrame();
	}

	// 13��ɾ����������
	@Test
	public void test_b4() throws InterruptedException {
		// ȫѡ
		webtest.enterFrame("rightMain");
		webtest.runJs("window.scrollTo(0,400);");
		Thread.sleep(3000);
		webtest.mouseToElementandClick("xpath=//*[@id=\"chkAll2\"]");
		Thread.sleep(1000);
		// ɾ����ѡ
		webtest.click("name=delsub");
		Thread.sleep(2000);
		// ȡ��ɾ��
		webtest.leaveFrame();
		webtest.click("xpath=//a[text()='ȡ��']");
		Thread.sleep(2000);
		webtest.isDisplayed("xpath=//a[text()='��ҳ']");
	}

	// 14��ȡ������
	@Test
	public void test_b5() throws InterruptedException {
		Thread.sleep(2000);
		webtest.enterFrame("rightMain");
		webtest.runJs("window.scrollTo(0,100);");
		webtest.click("xpath=//*[@id=\"chkAll2\"]");// ȫѡ
		Thread.sleep(1000);
		webtest.click("xpath=//*[@id=\"myform\"]/table/tbody/tr[11]/td[2]/input[3]");// ȡ������
		webtest.leaveFrame();
		webtest.click("xpath=//input[text()='ͷ��']");
		Thread.sleep(1000);
		webtest.click("xpath=//*[@id=\"property\"]/form/div/table/tbody/tr[3]/td/input");// ȷ��
	}

//	15����̨��½�����ã�
	@Test
	public void test_b6() throws InterruptedException {
		webtest.click("xpath=//a[@title='��ȫ�˳���������']");
		webtest.type("id=username", "admin");
		Thread.sleep(2000);
		webtest.click("xpath=//input[@value='����']");
		webtest.isDisplayed("id=username");
	}

//	16����̨��½��δ��д�û�����
	@Test
	public void test_b7() throws InterruptedException {
		webtest.type("id=username", "admin");
		webtest.type("id=password", "admin");
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(2000);
		webtest.click("xpath=//a[@title='��ȫ�˳���������']");
		webtest.type("id=password", "admin");
		Thread.sleep(2000);
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(1000);
		webtest.click("xpath=//input[@value='����']");
		webtest.isDisplayed("id=username");
	}

//	17����̨��½��δ��д���룩
	@Test
	public void test_b8() throws InterruptedException {
		webtest.type("id=username", "admin");
		webtest.type("id=password", "admin");
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(2000);
		webtest.click("xpath=//a[@title='��ȫ�˳���������']");
		webtest.type("id=username", "admin");
		Thread.sleep(2000);
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(1000);
		webtest.click("xpath=//input[@value='����']");
		webtest.isDisplayed("id=username");
	}

//	18����̨��½���û�������
	@Test
	public void test_b9() throws InterruptedException {
		webtest.type("id=username", "admin");
		webtest.type("id=password", "admin");
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(2000);
		webtest.click("xpath=//a[@title='��ȫ�˳���������']");
		webtest.type("id=username", "test");
		webtest.type("id=password", "admin");
		Thread.sleep(2000);
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(1000);
		webtest.click("xpath=//input[@value='����']");
		webtest.isDisplayed("id=username");
	}

//	19����̨��½���������
	@Test
	public void test_c1() throws InterruptedException {
		webtest.type("id=username", "admin");
		webtest.type("id=password", "admin");
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(2000);
		webtest.click("xpath=//a[@title='��ȫ�˳���������']");
		webtest.type("id=username", "admin");
		webtest.type("id=password", "123456");
		Thread.sleep(2000);
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(1000);
		webtest.click("xpath=//input[@value='����']");
		webtest.isDisplayed("id=username");
	}

//	20���ʴ���������Ƽ���
	@Test
	public void test_c2() throws InterruptedException {
		webtest.type("id=username", "admin");
		webtest.type("id=password", "admin");
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(2000);
		webtest.mouseToElementandClick("xpath=//a[text()='����']");
		webtest.click("xpath=//span[text()='�ʴ�']");
		Thread.sleep(1000);
		webtest.click("id=supportiframe");
		webtest.click("xpath=//*[@id='is_recom1']/a");
	}

//	21�������������ʴ�
	@Test
	public void test_c3() throws InterruptedException {
		webtest.click("xpath=//span[text()='�ʴ�']");
		Thread.sleep(1000);
		webtest.enterFrame("rightMain");
		webtest.type("class=admin_Filter_search", "���Թ���ʦ");
		Thread.sleep(1000);
		webtest.click("class=admin_Filter_bth");
		Thread.sleep(1000);
		webtest.isDisplayed("class=admin_Filter_bth");
	}

//	22�������������������ʴ�
	@Test
	public void test_c4() throws InterruptedException {
		webtest.leaveFrame();
		webtest.click("xpath=//span[text()='�ʴ�']");
		Thread.sleep(1000);
		webtest.enterFrame("rightMain");
		webtest.mouseToElement("class=admin_Filter_but");
		webtest.mouseToElementandClick("xpath=//a[text()='�������ǳ�']");
		Thread.sleep(1000);
		webtest.type("class=admin_Filter_search", "test01");
		Thread.sleep(1000);
		webtest.click("class=admin_Filter_bth");
		Thread.sleep(1000);
		webtest.isDisplayed("class=admin_Filter_bth");
	}

//	23���߼��������ʴ𣬰��Ƿ��Ƽ���
	@Test
	public void test_c5() throws InterruptedException {
		webtest.leaveFrame();
		webtest.click("xpath=//span[text()='�ʴ�']");
		Thread.sleep(1000);
		webtest.enterFrame("rightMain");
		webtest.mouseToElementandClick("class=admin_new_search_gj");
		Thread.sleep(1000);
		webtest.click("class=admin_screenlist");
		webtest.click("xpath=//a[text()='���Ƽ�']");
		Thread.sleep(1000);
		webtest.isDisplayed("class=admin_Filter_bth");
	}

//	24���߼��������ʴ𣬰��Ƿ���ˣ�
	@Test
	public void test_c6() throws InterruptedException {
		webtest.leaveFrame();
		webtest.click("xpath=//span[text()='�ʴ�']");
		Thread.sleep(1000);
		webtest.enterFrame("rightMain");
		webtest.mouseToElementandClick("class=admin_new_search_gj");
		Thread.sleep(1000);
		webtest.click("class=admin_screenlist");
		webtest.click("xpath=//a[text()='δ���']");
		Thread.sleep(1000);
		webtest.isDisplayed("class=admin_Filter_bth");
	}

//	25�������ʴ𣬰�����ʱ�䣩
	@Test
	public void test_c7() throws InterruptedException {
		webtest.leaveFrame();
		webtest.click("xpath=//span[text()='�ʴ�']");
		Thread.sleep(1000);
		webtest.enterFrame("rightMain");
		webtest.mouseToElementandClick("xpath=//*[@id='myform']/table/thead/tr/th[6]/a");
		Thread.sleep(1000);
		webtest.isDisplayed("class=admin_Filter_bth");
	}

//	26���ʴ������ύ
	@Test
	public void test_c8() throws InterruptedException {
		webtest.leaveFrame();
		webtest.click("xpath=//span[text()='�ʴ�']");
		Thread.sleep(1000);
		webtest.mouseToElementandClick("xpath=//a[text()='�ʴ�����']");
		webtest.enterFrame("rightMain");
		Thread.sleep(3000);
		webtest.click("xpath=//*[@id='config']");
		Thread.sleep(3000);
		webtest.isDisplayed("xpath=//*[@id='config']");
	}

//	27���ʴ���������
	@Test
	public void test_c9() throws InterruptedException {
		webtest.leaveFrame();
		webtest.click("xpath=//span[text()='�ʴ�']");
		Thread.sleep(1000);
		webtest.mouseToElementandClick("xpath=//a[text()='�ʴ�����']");
		webtest.enterFrame("rightMain");
		Thread.sleep(3000);
//		webtest.click("xpath=//a[@value='����']");
		webtest.click("xpath=/tag_box/div/table/tbody/tr[5]/td/input[3]");
		Thread.sleep(3000);
		webtest.isDisplayed("xpath=/tag_box/div/table/tbody/tr[5]/td/input[3]");
	}

//	28���ʴ����ùر����
	@Test
	public void test_d1() throws InterruptedException {
		webtest.leaveFrame();
		webtest.click("xpath=//span[text()='�ʴ�']");
		Thread.sleep(1000);
		webtest.mouseToElementandClick("xpath=//a[text()='�ʴ�����']");
		webtest.enterFrame("rightMain");
		Thread.sleep(1000);
		webtest.click("xpath=//em[text()='����']");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id='config']");
		Thread.sleep(2000);
		webtest.isDisplayed("xpath=//*[@id='config']");
	}

//	29���ʴ�����ǰ̨�ʾ�������
	@Test
	public void test_d2() throws InterruptedException {
		webtest.leaveFrame();
		webtest.click("xpath=//span[text()='�ʴ�']");
		Thread.sleep(1000);
		webtest.mouseToElementandClick("xpath=//a[text()='�ʴ�����']");
		webtest.enterFrame("rightMain");
		Thread.sleep(1000);
		webtest.typeAndClear("xpath=//*[@id='sy_day_ask_num']", "20");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id='config']");
		Thread.sleep(2000);
		webtest.isDisplayed("xpath=//*[@id='config']");
	}

//	30���ʴ��޸�
	@Test
	public void test_d3() throws InterruptedException {
		webtest.leaveFrame();
		webtest.click("xpath=//span[text()='�ʴ�']");
		Thread.sleep(1000);
		webtest.mouseToElementandClick("xpath=//a[text()='�ʴ����']");
		Thread.sleep(2000);
		webtest.enterFrame("rightMain");
		webtest.click("xpath=//*[@id='list53']/td[5]/a[2]");// �޸�
		Thread.sleep(1000);
		webtest.typeAndClear("xpath=//*[@id='qform']/table/tbody/tr[3]/td/input", "20");// ��������
		Thread.sleep(2000);
		webtest.runJs("window.scrollTo(0,550);");// ����������
		webtest.click("xpath=//*[@id='qform']/table/tbody/tr[7]/td/input[2]");// ����
		Thread.sleep(2000);
		webtest.isDisplayed("xpath=//*[@id='config']");
	}

	// 31���ʴ�������
	@Test
	public void test_d4() throws InterruptedException {
		webtest.leaveFrame();
		webtest.click("xpath=//span[text()='�ʴ�']");
		Thread.sleep(1000);
		webtest.mouseToElementandClick("xpath=//a[text()='�ʴ����']");
		Thread.sleep(2000);
		webtest.enterFrame("rightMain");
		webtest.click("xpath=//a[text()=' + ������']");// �޸�
		Thread.sleep(2000);
		webtest.typeAndClear("xpath=//*[@id='name']", "aaa");// �����������
		Thread.sleep(1000);
		webtest.runJs("window.scrollTo(0,550);");// ����������
		webtest.click("xpath=//*[@id='qform']/table/tbody/tr[7]/td/input[1]");// ���
		Thread.sleep(2000);
		webtest.isDisplayed("xpath=//a[text()=' + ������']");
	}

	// 32�������䣬�����ĵ�����������
	@Test
	public void test_d5() throws InterruptedException {
		webtest.leaveFrame();
		webtest.click("xpath=//span[text()='������']");
		Thread.sleep(1000);
		webtest.enterFrame("rightMain");
		webtest.type("class=admin_Filter_search", "test");
		Thread.sleep(2000);
		webtest.click("class=admin_Filter_bth");// ����
		Thread.sleep(2000);
		webtest.isDisplayed("class=admin_Filter_bth");
	}

	// 33�������䣬�����������������
	@Test
	public void test_d6() throws InterruptedException {
		webtest.leaveFrame();
		webtest.click("xpath=//span[text()='������']");
		Thread.sleep(1000);
		webtest.enterFrame("rightMain");
		webtest.mouseToElement("id=btype");
		webtest.mouseToElementandClick("xpath=//a[text()='�����']");
		Thread.sleep(1000);
		webtest.type("class=admin_Filter_search", "test");
		Thread.sleep(2000);
		webtest.click("class=admin_Filter_bth");// ����
		Thread.sleep(2000);
		webtest.isDisplayed("class=admin_Filter_bth");
	}

	// 34�������䣬�߼�������ǰ̨��ʾ
	@Test
	public void test_d7() throws InterruptedException {
		webtest.leaveFrame();
		webtest.click("xpath=//span[text()='������']");
		Thread.sleep(1000);
		webtest.enterFrame("rightMain");
		webtest.click("xpath=//a[text()='�߼�����']");
		Thread.sleep(1000);
		webtest.click("class=admin_screenlist");
		webtest.click("xpath=//a[text()='��ʾ']");
		Thread.sleep(2000);
		webtest.isDisplayed("class=admin_Filter_bth");
	}

	// 35�������䣬�߼��������ϴ�����
	@Test
	public void test_d8() throws InterruptedException {
		webtest.leaveFrame();
		webtest.click("xpath=//span[text()='������']");
		Thread.sleep(1000);
		webtest.enterFrame("rightMain");
		webtest.click("xpath=//a[text()='�߼�����']");
		Thread.sleep(1000);
		webtest.click("class=admin_screenlist");
		webtest.click("xpath=//a[text()='���һ����']");
		Thread.sleep(2000);
		webtest.isDisplayed("class=admin_Filter_bth");
	}

	// 36�������䣬��������𣬱༭�޸�
	@Test
	public void test_d9() throws InterruptedException {
		webtest.leaveFrame();
		webtest.click("xpath=//span[text()='������']");
		Thread.sleep(1000);
		webtest.click("xpath=//a[text()='���������']");
		Thread.sleep(1000);
		webtest.enterFrame("rightMain");
		webtest.click("xpath=//*[@id='list7']/td[5]/a[1]");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@name='myform']/table/tbody/tr[6]/td/input[2]");
		Thread.sleep(2000);
		webtest.isDisplayed("class=admin_new_cz_tj");
	}

	// 37�������䣬��������𣬱༭����
	@Test
	public void test_e1() throws InterruptedException {
		webtest.leaveFrame();
		webtest.click("xpath=//span[text()='������']");
		Thread.sleep(1000);
		webtest.click("xpath=//a[text()='���������']");
		Thread.sleep(1000);
		webtest.enterFrame("rightMain");
		webtest.click("xpath=//*[@id='list7']/td[5]/a[1]");
		Thread.sleep(2000);
		webtest.type("xpath=//*[@id='name']", "��Ƹ");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@name='myform']/table/tbody/tr[6]/td/input[3]");
		webtest.isDisplayed("xpath=//*[@name='myform']/table/tbody/tr[6]/td/input[2]");
	}

	// 38�������䣬����ĵ�������
	@Test
	public void test_e2() throws InterruptedException {
		webtest.leaveFrame();
		webtest.click("xpath=//span[text()='������']");
		Thread.sleep(1000);
		webtest.click("xpath=//a[text()='����ĵ�']");
		Thread.sleep(1000);
		webtest.enterFrame("rightMain");
		webtest.click("xpath=//*[@name='myform']/table/tbody/tr[6]/td/input[2]");
		webtest.isDisplayed("xpath=//*[@name='myform']/table/tbody/tr[6]/td/input[2]");
	}

	// 39�����棬�����������
	@Test
	public void test_e3() throws InterruptedException {
		webtest.leaveFrame();
		webtest.click("xpath=//span[text()='����']");
		Thread.sleep(1000);
		webtest.enterFrame("rightMain");
		webtest.type("class=admin_Filter_search", "test");
		Thread.sleep(2000);
		webtest.click("class=admin_Filter_bth");// ����
		Thread.sleep(2000);
		webtest.isDisplayed("class=admin_Filter_bth");
	}

	// 40�����棬��������߼����������һ���£�
	@Test
	public void test_e4() throws InterruptedException {
		webtest.leaveFrame();
		webtest.click("xpath=//span[text()='����']");
		Thread.sleep(1000);
		webtest.enterFrame("rightMain");
		webtest.click("xpath=//a[text()='�߼�����']");
		Thread.sleep(1000);
		webtest.click("class=admin_screenlist");
		webtest.click("xpath=//a[text()='���һ����']");
		Thread.sleep(2000);
		webtest.isDisplayed("class=admin_Filter_bth");
	}

	// 41�����棬����������ձ������
	@Test
	public void test_e5() throws InterruptedException {
		webtest.leaveFrame();
		webtest.click("xpath=//span[text()='����']");
		Thread.sleep(1000);
		webtest.enterFrame("rightMain");
		webtest.click("xpath=//a[text()='���']");
		Thread.sleep(2000);
		webtest.isDisplayed("class=admin_Filter_bth");
	}

}

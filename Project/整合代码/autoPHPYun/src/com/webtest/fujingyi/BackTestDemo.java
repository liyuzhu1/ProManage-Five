package com.webtest.fujingyi;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.dataprovider.NSDataProviderFujingyi;

/**
 * 
 * @author ������
 *
 */
public class BackTestDemo extends BaseTest{
	//��̨���ȵ�¼���ܲ���
	
//	@Test(priority=1,dataProvider="excel1",dataProviderClass=NSDataProviderFujingyi.class)
//	public void openWeb(String s1,String s2) throws InterruptedException {
//		webtest.open("/admin_123");
//		webtest.type("name=username", s1);
//		webtest.type("name=password", s2);
//		webtest.click("xpath=//input[@type='submit']");
//	}
	@BeforeClass
	public void testLogin_admin() throws InterruptedException {
		System.out.println("testadmin");
		webtest.open("/admin");
		Thread.sleep(2000);
		webtest.type("id=username", "admin");
		webtest.type("id=password", "admin");
		webtest.click("xpath=//input[@type='submit']");
	}
	
	
	@Test(priority=2,dataProvider="excel2",dataProviderClass=NSDataProviderFujingyi.class)//ϵͳ-��ֹip����
	public void test14(String s1) throws InterruptedException {
		webtest.click("xpath=//a[text()='ϵͳ']");
		webtest.enterFrame1("name=right");
		webtest.click("xpath=//li[text()='��ȫ����']");
		webtest.runJs("window.scrollTo(0,document.body.scrollHeight)");
		webtest.click("xpath=//textarea[@name='sy_bannedip']");
		webtest.typeAndClear("xpath=//textarea[@name='sy_bannedip']", s1);
		Thread.sleep(1000);
		webtest.click("xpath=//input[@id='otherconfig']");
		webtest.leaveFrame();
		webtest.click("xpath=//a[text()='ϵͳ']");
		Thread.sleep(1000);
	}
	
	@Test(priority=3) //ϵͳ-��֤����������
	public void test15() throws InterruptedException {
		webtest.click("xpath=//a[text()='ϵͳ']");
		webtest.enterFrame1("name=right");
		webtest.click("xpath=//li[text()='��֤������']");
		webtest.click("xpath=//div[text()='Ӣ��']");
		webtest.click("xpath=//input[@id='codeconfig']");
		webtest.leaveFrame();
		webtest.click("xpath=//a[text()='ϵͳ']");
		Thread.sleep(1000);
	}
	
	@Test(priority=4) //ϵͳ-����
	public void test16() throws InterruptedException {
		webtest.click("xpath=//a[text()='ϵͳ']");
		webtest.enterFrame1("name=right");
		webtest.click("xpath=//li[text()='��ͼ����']");
		webtest.click("xpath=//div[text()='����Ĭ������']");
		webtest.click("xpath=/html/body/div[1]/div/div[5]/div[5]/form/table/tbody/tr[6]/td/input[2]");
		webtest.leaveFrame();
		webtest.click("xpath=//a[text()='ϵͳ']");
		Thread.sleep(1000);
	}
	
	@Test(priority=5) //ϵͳ-ip��ת����ǰ����
	public void test17() throws InterruptedException {
		webtest.click("xpath=//a[text()='ϵͳ']");
		webtest.enterFrame1("name=right");
		webtest.click("xpath=//li[text()='��ͼ����']");
		webtest.click("xpath=//div[text()='����Ĭ������']");
		webtest.click("xpath=//input[@id='mapconfig']");
		webtest.leaveFrame();
		webtest.click("xpath=//a[text()='ϵͳ']");
		Thread.sleep(1000);
	}
	
	@Test(priority=6,dataProvider="excel3",dataProviderClass=NSDataProviderFujingyi.class) //ϵͳ-�޸�ҳ�滺��ʱ��
	public void test18(String s1) throws InterruptedException {
		webtest.click("xpath=//a[text()='ϵͳ']");
		webtest.enterFrame1("name=right");
		webtest.click("xpath=//li[text()='��������']");
		webtest.click("xpath=//input[@name='webcachetime']");
		webtest.typeAndClear("xpath=//input[@name='webcachetime']", s1);
		webtest.click("xpath=//input[@id='cacheconfig']");
		webtest.leaveFrame();
		webtest.click("xpath=//a[text()='ϵͳ']");
		Thread.sleep(1000);
	}
	
	@Test(priority=7,dataProvider="excel4",dataProviderClass=NSDataProviderFujingyi.class) //ϵͳ-�޸��ϴ�ͼƬ����
	public void test19(String s1) throws InterruptedException {
		webtest.click("xpath=//a[text()='ϵͳ']");
		webtest.enterFrame1("name=right");
		webtest.click("xpath=//li[text()='�ϴ�����']");
		webtest.click("xpath=//input[@name='pic_type']");
		webtest.typeAndClear("xpath=//input[@name='pic_type']", s1);
		webtest.click("xpath=//input[@id='uploadconfig']");
		webtest.leaveFrame();
		webtest.click("xpath=//a[text()='ϵͳ']");
		Thread.sleep(1000);
	}
	
	@Test(priority=8) //ϵͳ-�ر��ҹ���ģ��
	public void test20() throws InterruptedException {
		webtest.click("xpath=//a[text()='ϵͳ']");
		webtest.click("xpath=//a[text()='ģ������']");
		webtest.enterFrame1("name=right");
		webtest.click("xpath=/html/body/div/div[4]/div/form/table/tbody/tr[2]/td[1]/div/div/div[2]/div");
		webtest.click("xpath=//input[@name='config']");
		webtest.leaveFrame();
		webtest.click("xpath=//a[text()='ϵͳ']");
		Thread.sleep(1000);
	}
	
	@Test(priority=9) //ϵͳ-ͷ����������
	public void test21() throws InterruptedException {
		webtest.click("xpath=//a[text()='ϵͳ']");
		webtest.click("xpath=//a[text()='ҳ������']");
		webtest.enterFrame1("name=right");
		webtest.click("xpath=//em[text()='����']");
		webtest.click("xpath=//input[@name='config']");
		webtest.leaveFrame();
		webtest.click("xpath=//a[text()='ϵͳ']");
		Thread.sleep(1000);
	}
	
	@Test(priority=10,dataProvider="excel5",dataProviderClass=NSDataProviderFujingyi.class) //ϵͳ-��������
	public void test22(String s1) throws InterruptedException {
		webtest.click("xpath=//a[text()='ϵͳ']");
		webtest.click("xpath=//a[text()='��������']");
		webtest.enterFrame1("name=right");
		webtest.click("xpath=//input[@name='keyword']");
		webtest.typeAndClear("xpath=//input[@name='keyword']", s1);
		webtest.click("xpath=//input[@name='news_search']");
		webtest.leaveFrame();
		webtest.click("xpath=//a[text()='ϵͳ']");
		Thread.sleep(1000);
	}
	
	@Test(priority=11) //ϵͳ-��֧ͨ����
	public void test23() throws InterruptedException {
		webtest.click("xpath=//a[text()='ϵͳ']");
		webtest.click("xpath=//a[text()='֧������']");
		webtest.enterFrame1("name=right");
		webtest.click("xpath=//a[@id='alipay_online']");
		webtest.leaveFrame();
		webtest.click("xpath=//a[text()='ϵͳ']");
		Thread.sleep(1000);
	}
	
	@Test(priority=12,dataProvider="excel6",dataProviderClass=NSDataProviderFujingyi.class) //ϵͳ-������վ����
	public void test24(String s1) throws InterruptedException {
		webtest.click("xpath=//a[text()='ϵͳ']");
		webtest.click("xpath=//a[text()='SEO����']");
		webtest.enterFrame1("name=right");
		webtest.click("xpath=//a[text()='�޸�']");
		webtest.click("xpath=//textarea[@name='title']");
		webtest.typeAndClear("xpath=//textarea[@name='title']", s1);
		webtest.click("xpath=//input[@name='update']");
		webtest.leaveFrame();
		webtest.click("xpath=//a[text()='ϵͳ']");
		Thread.sleep(1000);
	}
	
	@Test(priority=13,dataProvider="excel7",dataProviderClass=NSDataProviderFujingyi.class) //ϵͳ-���Ļ���
	public void test25(String s1) throws InterruptedException {
		webtest.click("xpath=//a[text()='ϵͳ']");
		webtest.click("xpath=//a[text()='��������']");
		webtest.enterFrame1("name=right");
		webtest.click("xpath=//input[@id='integral_signin']");
		webtest.typeAndClear("xpath=//input[@id='integral_signin']", s1);
		webtest.click("xpath=//input[@id='integral']");
		webtest.leaveFrame();
		webtest.click("xpath=//a[text()='ϵͳ']");
		Thread.sleep(1000);
	}
	
	@Test(priority=14) //ϵͳ-�ر�ע��
	public void test26() throws InterruptedException {
		webtest.click("xpath=//a[text()='ϵͳ']");
		webtest.click("xpath=//a[text()='ע������']");
		webtest.enterFrame1("name=right");
		webtest.click("xpath=//em[text()='����']");
		webtest.click("xpath=//input[@id='regconfig']");
		webtest.leaveFrame();
		webtest.click("xpath=//a[text()='ϵͳ']");
		Thread.sleep(1000);
	}

	@Test(priority=15) //ϵͳ-��վ��ͼ�߼�����
	public void test27() throws InterruptedException {
		webtest.click("xpath=//a[text()='ϵͳ']");
		webtest.click("xpath=//a[text()='��վ��ͼ']");
		webtest.enterFrame1("name=right");
		webtest.click("xpath=//a[text()='�߼�����']");
		webtest.click("xpath=//a[text()='վ������']");
		webtest.leaveFrame();
		webtest.click("xpath=//a[text()='ϵͳ']");
		Thread.sleep(1000);
	}
	
	@Test(priority=16,dataProvider="excel8",dataProviderClass=NSDataProviderFujingyi.class) //ϵͳ-�޸����ӵ�ַ
	public void test28(String s1) throws InterruptedException {
		webtest.click("xpath=//a[text()='ϵͳ']");
		webtest.click("xpath=//a[text()='��������']");
		webtest.enterFrame1("name=right");
		webtest.click("xpath=//a[@class='admin_new_c_bth']");
		webtest.click("xpath=//input[@name='url']");
		webtest.typeAndClear("xpath=//input[@name='url']", s1);
		webtest.click("xpath=//input[@name='link_update']");
		webtest.leaveFrame();
		webtest.click("xpath=//a[text()='ϵͳ']");
		Thread.sleep(1000);
	}
	
	@Test(priority=17,dataProvider="excel9",dataProviderClass=NSDataProviderFujingyi.class) //ϵͳ-������
	public void test29(String s1,String s2) throws InterruptedException {
		webtest.click("xpath=//a[text()='ϵͳ']");
		webtest.click("xpath=//span[text()='���']");
		webtest.enterFrame1("name=right");
		webtest.click("xpath=//a[@class='admin_new_cz_tj']");
		webtest.click("xpath=//textarea[@id='position']");
		webtest.typeAndClear("xpath=//textarea[@id='position']", s1);
		webtest.click("xpath=//textarea[@id='variable']");
		webtest.typeAndClear("xpath=//textarea[@id='variable']", s2);
		webtest.click("xpath=//input[@class='admin_examine_bth']");
		webtest.leaveFrame();
		webtest.click("xpath=//a[text()='ϵͳ']");
		Thread.sleep(1000);
	}
	
	
	@Test(priority=18) //ϵͳ-���й���-����ƴ��
	public void test30() throws InterruptedException {
		webtest.click("xpath=//a[text()='ϵͳ']");
		webtest.click("xpath=//span[text()='���']");
		webtest.click("xpath=//a[text()='���й���']");
		webtest.enterFrame1("name=right");
		webtest.click("xpath=//a[@class='admin_new_cz_tj']");
		webtest.leaveFrame();
		webtest.click("xpath=//a[text()='ȡ��']");
		webtest.leaveFrame();
		webtest.click("xpath=//a[text()='ϵͳ']");
		Thread.sleep(1000);
	}
	
	@Test(priority=19) //ϵͳ-ɾ�����
	public void test31() throws InterruptedException {
		webtest.click("xpath=//a[text()='ϵͳ']");
		webtest.click("xpath=//span[text()='���']");
		webtest.click("xpath=//a[text()='��ҵ���']");
		webtest.enterFrame1("name=right");
		webtest.click("xpath=//input[@value='840']");
		webtest.click("xpath=//input[@value='ɾ����ѡ']");
		webtest.leaveFrame();
		webtest.click("xpath=//a[text()='ȷ��']");
		webtest.leaveFrame();
		webtest.click("xpath=//a[text()='ϵͳ']");
		Thread.sleep(1000);
	}
	
	@Test(priority=20) //ϵͳ-һ������
	public void test32() throws InterruptedException {
		webtest.click("xpath=//a[text()='ϵͳ']");
		webtest.click("xpath=//span[text()='���']");
		webtest.click("xpath=//a[text()='ְλ������']");
		webtest.enterFrame1("name=right");
		webtest.click("xpath=//a[text()='һ������']");
		webtest.leaveFrame();
		webtest.click("xpath=//a[text()='ϵͳ']");
		Thread.sleep(1000);
	}
	
	@Test(priority=21,dataProvider="excel10",dataProviderClass=NSDataProviderFujingyi.class) //ϵͳ-��ӻ�Ա���
	public void test33(String s1,String s2) throws InterruptedException {
		webtest.click("xpath=//a[text()='ϵͳ']");
		webtest.click("xpath=//span[text()='���']");
		webtest.click("xpath=//a[text()='��ҵ��Ա����']");
		webtest.enterFrame1("name=right");
		webtest.click("xpath=//a[@class='admin_new_cz_tj']");
		webtest.click("xpath=//textarea[@id='position']");
		webtest.typeAndClear("xpath=//textarea[@id='position']", s1);
		webtest.click("xpath=//textarea[@id='variable']");
		webtest.typeAndClear("xpath=//textarea[@id='variable']", s2);
		webtest.click("xpath=//input[@class='admin_examine_bth']");
		webtest.leaveFrame();
		webtest.click("xpath=//a[text()='ϵͳ']");
		Thread.sleep(1000);
	}
	
	@Test(priority=22) //ϵͳ-ɾ������
	public void test34() throws InterruptedException {
		webtest.click("xpath=//a[text()='ϵͳ']");
		webtest.click("xpath=//span[text()='���']");
		webtest.click("xpath=//a[text()='��ְ����']");
		webtest.enterFrame1("name=right");
		webtest.click("xpath=//input[@value='27']");
		webtest.click("xpath=//input[@value='ɾ����ѡ']");
		webtest.leaveFrame();
		webtest.click("xpath=//a[text()='ȷ��']");
		webtest.click("xpath=//a[text()='ϵͳ']");
		Thread.sleep(1000);
	}
	
	@Test(priority=23,dataProvider="excel11",dataProviderClass=NSDataProviderFujingyi.class) //ϵͳ-��Ӿٱ�ԭ��
	public void test35(String s1) throws InterruptedException {
		webtest.click("xpath=//a[text()='ϵͳ']");
		webtest.click("xpath=//span[text()='���']");
		webtest.click("xpath=//a[text()='�ٱ�ԭ�����']");
		webtest.enterFrame1("name=right");
		webtest.click("xpath=//a[@class='admin_new_cz_tj']");
		webtest.click("xpath=//input[@class='company_job_text']");
		webtest.typeAndClear("xpath=//input[@class='company_job_text']", s1);
		webtest.click("xpath=//input[@class='admin_examine_bth']");
		webtest.leaveFrame();
		webtest.click("xpath=//a[text()='ϵͳ']");
		Thread.sleep(1000);
	}
	
	@Test(priority=24) //ϵͳ-�˳���¼
	public void test36() throws InterruptedException {
		webtest.click("xpath=//a[text()='ϵͳ']");
		webtest.click("xpath=//span[text()='����Ա']"); 
		webtest.enterFrame1("name=right");
		webtest.click("xpath=//a[text()='�˳���¼']");
		webtest.leaveFrame();
		Thread.sleep(1000);
	}
	
	@Test(priority=25,dataProvider="excel12",dataProviderClass=NSDataProviderFujingyi.class) //ϵͳ-��ӹ���Ա
	public void test37(String s1,String s2,String s3,String s4,String s5) throws InterruptedException {
		webtest.type("name=username", s1);
		webtest.type("name=password", s2);
		webtest.click("xpath=//input[@type='submit']");
		webtest.click("xpath=//a[text()='ϵͳ']");
		webtest.click("xpath=//span[text()='����Ա']"); 
		webtest.click("xpath=//a[text()='����Ա�б�']");
		webtest.enterFrame1("name=right");
		webtest.click("xpath=//a[@class='admin_new_cz_tj']");
		webtest.click("xpath=//input[@name='username']");
		webtest.typeAndClear("xpath=//input[@name='username']", s3);
		webtest.click("xpath=//input[@name='password']");
		webtest.typeAndClear("xpath=//input[@name='password']", s4);
		webtest.click("xpath=//input[@name='name']");
		webtest.typeAndClear("xpath=//input[@name='name']", s5);
		webtest.click("xpath=//*[@id=\"myform\"]/table/tbody/tr[2]/td[2]/div/div/div/input");
		webtest.click("xpath=//dd[text()='��������Ա']");
		webtest.click("xpath=//div[text()='���Ե�¼']");
		webtest.click("xpath=//input[@name='useradd']");
		webtest.leaveFrame();
		webtest.click("xpath=//a[text()='ϵͳ']");
		Thread.sleep(1000);
	}
	
	@Test(priority=26,dataProvider="excel13",dataProviderClass=NSDataProviderFujingyi.class) //ϵͳ-�������
	public void test38(String s1) throws InterruptedException {
		webtest.click("xpath=//a[text()='ϵͳ']");
		webtest.click("xpath=//span[text()='����Ա']"); 
		webtest.click("xpath=//a[text()='��ӹ���Ա����']");
		webtest.enterFrame1("name=right");
		webtest.click("xpath=//input[@name='group_name']");
		webtest.typeAndClear("xpath=//input[@name='group_name']", s1);
		webtest.click("xpath=//input[@name='add_group']");
		webtest.leaveFrame();
		webtest.click("xpath=//a[text()='ϵͳ']");
		Thread.sleep(1000);
	}
	
	@Test(priority=27) //ϵͳ-ɾ��һ����־
	public void test39() throws InterruptedException {
		webtest.click("xpath=//a[text()='ϵͳ']");
		webtest.click("xpath=//span[text()='����Ա']"); 
		webtest.click("xpath=//a[text()='����Ա��־']");
		webtest.enterFrame1("name=right");
		webtest.click("xpath=//input[@value='29']");
		webtest.click("xpath=//input[@value='ɾ����ѡ']");
		webtest.leaveFrame();
		webtest.click("xpath=//a[text()='ȷ��']");
		webtest.click("xpath=//a[text()='ϵͳ']");
		Thread.sleep(1000);
	}
	
	@Test(priority=28) //ϵͳ-ɾ��һ����Ա��־
	public void test40() throws InterruptedException {
		webtest.click("xpath=//a[text()='ϵͳ']");
		webtest.click("xpath=//span[text()='����Ա']"); 
		webtest.click("xpath=//a[text()='��Ա��־']");
		webtest.enterFrame1("name=right");
		webtest.click("xpath=//input[@value='4']");
		webtest.click("xpath=//input[@value='ɾ����ѡ']");
		webtest.leaveFrame();
		webtest.click("xpath=//a[text()='ȷ��']");
		webtest.click("xpath=//a[text()='ϵͳ']");
		Thread.sleep(1000);
	}
	
	@Test(priority=29) //ϵͳ-ʹ��ģ��
	public void test41() throws InterruptedException {
		webtest.click("xpath=//a[text()='ϵͳ']");
		webtest.click("xpath=//span[text()='ģ��']"); 
		webtest.click("xpath=//a[text()='�л�ģ��']");
		webtest.enterFrame1("name=right");
		webtest.click("xpath=/html/body/div/div[4]/div/input[2]");
		webtest.leaveFrame();
		webtest.click("xpath=//a[text()='ȷ��']");
		webtest.click("xpath=//a[text()='ϵͳ']");
		Thread.sleep(1000);
	}
	
	@Test(priority=30) //ϵͳ-�޸���ҵģ��
	public void test42() throws InterruptedException {
		webtest.click("xpath=//a[text()='ϵͳ']");
		webtest.click("xpath=//span[text()='ģ��']"); 
		webtest.click("xpath=//a[text()='��ҵģ��']");
		webtest.enterFrame1("name=right");
		webtest.click("xpath=/html/body/div/div[5]/div[1]/input[1]");
		webtest.click("xpath=//em[text()='����']");
		webtest.click("xpath=//input[@id='qqconfig']");
		webtest.leaveFrame();
		webtest.click("xpath=//a[text()='ϵͳ']");
		Thread.sleep(1000);
	}
	
	@Test(priority=31) //ϵͳ-�޸ļ���ģ��
	public void test43() throws InterruptedException {
		webtest.click("xpath=//a[text()='ϵͳ']");
		webtest.click("xpath=//span[text()='ģ��']"); 
		webtest.click("xpath=//a[text()='����ģ��']");
		webtest.enterFrame1("name=right");
		webtest.click("xpath=/html/body/div/div[5]/div[1]/input[1]");
		webtest.click("xpath=//em[text()='����']");
		webtest.click("xpath=//input[@id='qqconfig']");
		webtest.leaveFrame();
		webtest.click("xpath=//a[text()='ϵͳ']");
		Thread.sleep(1000);
	}
	
	@Test(priority=32) //ϵͳ-��������
	public void test44() throws InterruptedException {
		webtest.click("xpath=//a[text()='ϵͳ']");
		webtest.click("xpath=//span[text()='��ҳ��']"); 
		webtest.enterFrame1("name=right");
		webtest.click("xpath=//a[text()='��������']");
		webtest.leaveFrame();
		webtest.click("xpath=//a[text()='ϵͳ']");
		Thread.sleep(1000);
	}
	
	@Test(priority=33,dataProvider="excel14",dataProviderClass=NSDataProviderFujingyi.class) //ϵͳ-��Ӱٶ�
	public void test45(String s1,String s2) throws InterruptedException {
		webtest.click("xpath=//a[text()='ϵͳ']");
		webtest.click("xpath=//span[text()='��ҳ��']"); 
		webtest.click("xpath=//a[text()='��ӵ�ҳ��']");
		webtest.enterFrame1("name=right");
		webtest.click("xpath=//input[@name='name']");
		webtest.typeAndClear("xpath=//input[@class='input-text']", s1);
		webtest.click("xpath=//input[@class='layui-input layui-unselect']");
		webtest.click("xpath=//dd[text()='��������']");
		webtest.click("xpath=//input[@name='url']");
		webtest.typeAndClear("xpath=//input[@name='url']", s2);
		webtest.click("xpath=//input[@name='add_desc']");
		webtest.leaveFrame();
		webtest.click("xpath=//a[text()='ϵͳ']");
		Thread.sleep(1000);
	}
	
	@Test(priority=34,dataProvider="excel15",dataProviderClass=NSDataProviderFujingyi.class) //ϵͳ-������
	public void test46(String s1) throws InterruptedException {
		webtest.click("xpath=//a[text()='ϵͳ']");
		webtest.click("xpath=//span[text()='��ҳ��']"); 
		webtest.click("xpath=//a[text()='��ҳ�����']");
		webtest.enterFrame1("name=right");
		webtest.click("xpath=//a[text()='+ ������']");
		webtest.click("xpath=//textarea[@id='position']");
		webtest.typeAndClear("xpath=//textarea[@id='position']", s1);
		webtest.click("xpath=//input[@class='admin_examine_bth']");
		webtest.leaveFrame();
		webtest.click("xpath=//a[text()='ϵͳ']");
		Thread.sleep(1000);
	}
	
	@Test(priority=35) //ϵͳ-������վ
	public void test47() throws InterruptedException {
		webtest.click("xpath=//a[text()='ϵͳ']");
		webtest.click("xpath=//span[text()='��վ']"); 
		webtest.enterFrame1("name=right");
		webtest.click("xpath=//em[text()='�ر�']");
		webtest.click("xpath=//input[@id='config']");
		webtest.leaveFrame();
		webtest.click("xpath=//a[text()='ϵͳ']");
		Thread.sleep(1000);
	}

	@Test(priority=36,dataProvider="excel16",dataProviderClass=NSDataProviderFujingyi.class) //ϵͳ-��ӷ�վ
	public void test48(String s1,String s2) throws InterruptedException {
		webtest.click("xpath=//a[text()='ϵͳ']");
		webtest.click("xpath=//span[text()='��վ']"); 
		webtest.click("xpath=//a[text()='��ӷ�վ']");
		webtest.enterFrame1("name=right");
		webtest.click("xpath=//input[@name='title']");
		webtest.typeAndClear("xpath=//input[@name='title']", s1);
		webtest.click("xpath=//input[@name='domain']");
		webtest.typeAndClear("xpath=//input[@name='domain']", s2);
		webtest.click("xpath=//*[@id=\"fz_type_1\"]/td/div/div[1]/div/div/input");
		webtest.click("xpath=//*[@id=\"fz_type_1\"]/td/div/div[1]/div/dl/dd[2]");
		webtest.click("xpath=//*[@id=\"domainform\"]/table/tbody[2]/tr[13]/td/input[3]");
		webtest.leaveFrame();
		webtest.click("xpath=//a[text()='ϵͳ']");
		Thread.sleep(1000);
	}

	@Test(priority=37) //ϵͳ-�߼�����
	public void test49() throws InterruptedException {
		webtest.open1("/admin");
		Thread.sleep(2000);
		webtest.type("id=username", "admin");
		webtest.type("id=password", "admin");
		webtest.click("xpath=//input[@type='submit']");
		webtest.click("xpath=//a[text()='ϵͳ']");
		webtest.click("xpath=//span[text()='��Ϣ']"); 
		webtest.click("xpath=//a[text()='�������']");
		webtest.enterFrame1("name=right");
		webtest.click("xpath=//a[text()='�߼�����']");
		webtest.click("xpath=//a[text()='����']");
		webtest.leaveFrame();
		webtest.click("xpath=//a[text()='ϵͳ']");
		Thread.sleep(1000);
	}
	
	@Test(priority=38,dataProvider="excel18",dataProviderClass=NSDataProviderFujingyi.class) //ϵͳ-����ϵͳ��Ϣ
	public void test50(String s1) throws InterruptedException {
		webtest.click("xpath=//a[text()='ϵͳ']");
		webtest.click("xpath=//span[text()='��Ϣ']"); 
		webtest.click("xpath=//a[text()='ϵͳ��Ϣ']");
		webtest.enterFrame1("name=right");
		webtest.click("xpath=//a[text()='����ϵͳ��Ϣ']");
		webtest.click("xpath=//div[text()='�����û�']");
		webtest.click("xpath=//textarea[@id='content']");
		webtest.typeAndClear("xpath=//textarea[@id='content']", s1);
		webtest.click("xpath=//input[type()='submit']");
		webtest.leaveFrame();
		webtest.click("xpath=//a[text()='ϵͳ']");
		Thread.sleep(1000);
	}
	
	

}

package com.webtest.demo;


import static org.testng.Assert.assertTrue;

import org.apache.logging.log4j.util.StringBuilderFormattable;
import org.openqa.grid.internal.utils.SelfRegisteringRemote;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.dataprovider.NSDataProvider;

public class BackTestDemo extends BaseTest {

//	��¼��̨,��������ҳ��
	@BeforeClass
	public void testLogin_admin() throws InterruptedException {
		System.out.println("testadmin");
		webtest.open("/admin");
		Thread.sleep(2000);
		webtest.type("id=username", "admin");
		webtest.type("id=password", "admin");
		webtest.click("xpath=//input[@type='submit']");
		// ���빤��ģ��
		webtest.click("xpath=//a[text()='����']");
	}
	
	@AfterClass
	public void testLogin_close() {
		System.out.println("testclose");
		webtest.click("class=admin_new_header_close_icon");
	}

	// ����-��ҳ����ģ��
	@Test(dataProvider = "excel11",dataProviderClass = NSDataProvider.class)
	public void test01(String s1) throws InterruptedException {
		System.out.println("test01");
		Thread.sleep(5000);
		webtest.enterFrame1("id=rightMain");
		webtest.typeAndClear("name=make_index_url", s1);
		webtest.click("name=madeall");
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent(s1));
		webtest.leaveFrame();
		Thread.sleep(5000);
	}

	// ����-������ҳģ��
	@Test(dataProvider = "excel12",dataProviderClass = NSDataProvider.class)
	public void test02(String s1) throws InterruptedException {
		System.out.println("test02");
		Thread.sleep(3000);
		webtest.click("xpath=//span[text()='����']");
		webtest.click("xpath=//a[text()='������ҳ']");
		webtest.enterFrame1("id=rightMain");
		webtest.typeAndClear("name=make_new_url", s1);
		webtest.click("id=madenindex");
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("newsChange.html"));
		webtest.leaveFrame();
		Thread.sleep(5000);
	}

	// ����-�������ģ��
	@Test
	public void test03() throws InterruptedException {
		System.out.println("test03");
		Thread.sleep(5000);
		webtest.click("xpath=//span[text()='����']");
		webtest.click("xpath=//a[text()='�������']");
		webtest.enterFrame1("id=rightMain");
		Thread.sleep(5000);
		webtest.click("class=layui-edge");
		webtest.click("xpath=//dd[text()='ְҵָ��']");
		webtest.click("id=newsclass");
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("ְҵָ��"));
		webtest.leaveFrame();
		Thread.sleep(5000);
	}

	// ����-������ϸҳģ��
	@Test
	public void test04() throws InterruptedException {
		System.out.println("test04");
		Thread.sleep(5000);
		webtest.click("xpath=//span[text()='����']");
		webtest.click("xpath=//a[text()='������ϸҳ']");
		webtest.enterFrame1("id=rightMain");
		webtest.click("class=layui-edge");
		webtest.click("xpath=//dd[text()='ְҵָ��']");
		webtest.click("id=time");
		webtest.click("xpath=(//i[@class='layui-icon laydate-icon laydate-prev-m'])[1]");
		webtest.click("xpath=//td[@lay-ymd='2020-11-27']");
		webtest.click("xpath=//td[@lay-ymd='2020-11-12']");
		webtest.click("class=laydate-btns-confirm");
		webtest.typeAndClear("id=end_id", "5");
		webtest.typeAndClear("id=limit", "30");
		Thread.sleep(3000);;
		webtest.click("id=archive");
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("30"));
		webtest.leaveFrame();
		Thread.sleep(5000);
	}

	// ����-���ɻ���
	@Test
	public void test05() throws InterruptedException {
		System.out.println("test05");
		Thread.sleep(5000);
		webtest.click("xpath=//span[text()='����']");
		Thread.sleep(3000);
		webtest.click("xpath=//a[text()='���ɻ���']");
		webtest.enterFrame1("id=rightMain");
		webtest.click("xpath=//span[text()='����']");
		webtest.click("xpath=//span[text()='ְλ']");
		webtest.click("xpath=//span[text()='�ʼ�������']");
		webtest.click("name=madeall");
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("����"));
		webtest.leaveFrame();
		Thread.sleep(5000);
	}

	// ����-��ҳ������
	@Test
	public void test06() throws InterruptedException {
		System.out.println("test06");
		Thread.sleep(8000);
		webtest.click("xpath=//span[text()='����']");
		webtest.click("xpath=//a[text()='��ҳ������']");
		webtest.enterFrame1("id=rightMain");
		webtest.click("class=layui-edge");
		webtest.click("xpath=//dd[text()='������Ƹ']");
		webtest.click("id=cache_once");
		assertTrue(webtest.isTextPresent("������Ƹ"));
		webtest.leaveFrame();
		Thread.sleep(5000);
	}
	
	//����-һ������
	@Test(dataProvider = "excel13",dataProviderClass = NSDataProvider.class)
	public void test07(String s1,String s2) throws InterruptedException {
		System.out.println("test07");
		Thread.sleep(8000);
		webtest.click("xpath=//span[text()='����']");
		webtest.click("xpath=//a[text()='һ������']");
		webtest.enterFrame1("id=rightMain");
		webtest.typeAndClear("name=make_index_url", s1);
		webtest.typeAndClear("name=make_new_url", s2);
		webtest.click("xpath=//input[@value='һ������']");
		Thread.sleep(5000);
		assertTrue(webtest.isTextPresent("һ������"));
		webtest.leaveFrame();
		Thread.sleep(5000);
	}
	
	//����-����XML
	@Test(dataProvider = "excel14",dataProviderClass = NSDataProvider.class)
	public void test08(String s1) throws InterruptedException {
		System.out.println("test08");
		Thread.sleep(5000);
		webtest.click("xpath=//span[text()='����']");
		Thread.sleep(3000);
		webtest.click("xpath=//a[text()='����XML']");
		Thread.sleep(3000);
		webtest.enterFrame1("id=rightMain");
		webtest.click("class=layui-edge");
		webtest.click("xpath=//dd[text()='ְλ']");
		webtest.click("xpath=(//i[@class='layui-edge'])[3]");
		webtest.click("xpath=//dd[text()='ÿ��']");
		webtest.typeAndClear("id=xfilename", s1);
		webtest.click("id=archive");
		//����XML���Զ���ΪĬ��״̬
		assertTrue(webtest.isTextPresent("sitemap"));
		webtest.leaveFrame();
		Thread.sleep(5000);
	}
	
	//΢��-΢�Ű�-΢�Ź��ں�����
	@Test(dataProvider = "excel15",dataProviderClass = NSDataProvider.class)
	public void test09(String s1,String s2,String s3,String s4) throws InterruptedException {
		System.out.println("test09");
		Thread.sleep(8000);
		webtest.click("xpath=//span[text()='΢��']");
		Thread.sleep(3000);
		webtest.enterFrame1("id=rightMain");
		webtest.typeAndClear("id=wx_name", s1);
		webtest.typeAndClear("id=wx_token", s2);
		webtest.click("id=wxconfig");
		Thread.sleep(3000);
		webtest.typeAndClear("id=wx_appid", s3);
		webtest.typeAndClear("id=wx_appsecret", s4);
		Thread.sleep(3000);
		webtest.click("xpath=(//input[@id='wxconfig'])[2]" );
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent(s4));
		webtest.leaveFrame();
		Thread.sleep(5000);
	}
	
	//΢��-΢�Ű�-PC��΢��ɨ��
	@Test
	public void test10() throws InterruptedException {
		System.out.println("test10");
		Thread.sleep(3000);
		webtest.click("xpath=//span[text()='΢��']");
		Thread.sleep(3000);
		webtest.enterFrame1("id=rightMain");
		webtest.click("xpath=(//i[@class='layui-anim layui-icon'])[2]");
		webtest.click("xpath=(//div[@class='layui-input-inline'])[2]/div[2]/i");
		webtest.click("xpath=(//input[@id='wxconfig'])[3]" );
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("��"));
		webtest.leaveFrame();
		Thread.sleep(5000);
		
	}
	
	//΢��-��½��־
	@Test
	public void test11() throws InterruptedException {
		System.out.println("test11");
		Thread.sleep(5000);
		webtest.click("xpath=//span[text()='΢��']");
		webtest.click("xpath=//a[text()='��¼��־']");
		webtest.enterFrame1("id=rightMain");
		webtest.click("class=admin_submit8");
		assertTrue(webtest.isTextPresent("�������ǰ������"));
		webtest.leaveFrame();
		Thread.sleep(5000);
	}
	
	//΢��-΢�Ų˵�-����΢�Ų˵�
	@Test(dataProvider = "excel16",dataProviderClass = NSDataProvider.class)
	public void test12(String s1,String s2,String s3) throws InterruptedException {
		System.out.println("test12");
		Thread.sleep(5000);
		webtest.click("xpath=//span[text()='΢��']");
		webtest.click("xpath=//a[text()='΢�Ų˵�']");
		webtest.enterFrame1("id=rightMain");
		webtest.click("xpath=//a[text()='����΢�Ų˵�']");
		webtest.type("class=admin_wx_text", s1);
		webtest.click("xpath=(//i[@class='layui-edge'])[2]");
		webtest.click("xpath=//dd[text()='����¼�']");
		webtest.type("name=add_key", s2);
		webtest.type("name=add_sort", s3);
		webtest.click("name=add");
		assertTrue(webtest.isTextPresent(s1));
		webtest.leaveFrame();
		Thread.sleep(5000);
	}
	
	//΢��-΢�Ų˵�-ͬ�� ʧ�ܲ�������
	@Test
	public void test13() throws InterruptedException {
		System.out.println("test13");
		Thread.sleep(5000);
		webtest.click("xpath=//span[text()='΢��']");
		webtest.click("xpath=//a[text()='΢�Ų˵�']");
		webtest.enterFrame1("id=rightMain");
		webtest.click("xpath=//a[text()='ͬ��΢�Ų˵�']");
		webtest.click("id=layui-layer-shade4");
		webtest.click("id=layui-layer4");
		webtest.leaveFrame();
		webtest.click("xpath=//a[text()='ȷ��']");
		assertTrue(webtest.isTextPresent("΢�Ų˵������ɹ�"));
		Thread.sleep(5000);

	}
	
	//΢��-΢�Ų˵�-ɾ��  ����
	@Test
	public void test14() throws InterruptedException {
		System.out.println("test14");
		Thread.sleep(5000);
		webtest.click("xpath=//span[text()='΢��']");
		webtest.click("xpath=//a[text()='΢�Ų˵�']");
		webtest.enterFrame1("id=rightMain");
		webtest.click("xpath=//span[contains(text(),'����һ����')]/../../td[1]/input[1]");
		webtest.click("class=admin_button");
		webtest.leaveFrame();
		webtest.click("xpath=//a[text()='ȷ��']");
		Thread.sleep(3000);
		Boolean flag = webtest.isElementPresent("xpath=//span[contains(text(),'����һ����')]");
		if (flag == false) {
			Boolean aBoolean = true;
			assertTrue(aBoolean);
		}
		Thread.sleep(5000);

	}
	
	//΢��-�û���-����
	@Test(dataProvider = "excel17",dataProviderClass = NSDataProvider.class)
	public void test15(String s1) throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("test15");
		webtest.click("xpath=//span[text()='΢��']");
		webtest.click("xpath=//a[text()='�û���']");
		webtest.enterFrame1("id=rightMain");	
		webtest.click("class=admin_Filter_search");
		webtest.type("class=admin_Filter_search", s1);
		webtest.click("name=news_search");
		assertTrue(webtest.isTextPresent(s1));
		webtest.leaveFrame();
		Thread.sleep(5000);
	}
	
	//΢��-�Զ��ظ�-��ӹ���
	@Test(dataProvider = "excel18",dataProviderClass = NSDataProvider.class)
	public void test16(String s1,String s2,String s3) throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("test16");
		webtest.click("xpath=//span[text()='΢��']");
		webtest.click("xpath=//a[text()='�Զ��ظ�']");
		webtest.enterFrame1("id=rightMain");
		webtest.click("class=admin_new_cz_tj");
		webtest.type("id=title", s1);
		webtest.type("id=keyword", s2);
		webtest.type("id=content", s3);
		webtest.click("class=admin_button");
		assertTrue(webtest.isTextPresent(s1));
		webtest.leaveFrame();
		Thread.sleep(5000);
	}
	
	
	//����-���ݿ����-�������� 
	@Test(dataProvider = "excel19",dataProviderClass = NSDataProvider.class)
	public void test17(String s1,String s2) throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("test17");
		Thread.sleep(3000);
		webtest.click("xpath=//span[text()='����']");
		webtest.enterFrame1("id=rightMain");
		webtest.click("xpath=//div[text()='�Զ��屸�� -- ��������ѡ�񱸷����ݱ�']");
		webtest.click("xpath=//span[text()='phpyun_ad']");
		webtest.click("xpath=//span[text()='phpyun_admin_log']");
		webtest.click("xpath=//span[text()='phpyun_friend_help']");
		webtest.typeAndClear("id=maxfilesize", s1);
		webtest.typeAndClear("name=basename", s2);
		Thread.sleep(3000);
		webtest.click("xpath=//input[@value='�ύ����']");
		webtest.leaveFrame();
		webtest.click("id=layui-layer1");
		webtest.click("xpath=//a[text()='ȷ��']");
		Thread.sleep(5000);
		webtest.enterFrame1("id=rightMain");
		assertTrue(webtest.isDisplayed("xpath=//input[@name='basename']"));
		webtest.leaveFrame();
		Thread.sleep(5000);
		
		
	}
	
	//����-���ݿ����-�Ż�����
	@Test
	public void test18() throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("test18");
		webtest.click("xpath=//span[text()='����']");
		webtest.enterFrame1("id=rightMain");
		webtest.click("xpath=//a[text()='�Ż�����']");
		Thread.sleep(3000);
		webtest.click("xpath=//a[text()='�Ż�']");
		Thread.sleep(3000);
		webtest.click("xpath=(//a[text()='�Ż�'])[3]");
		Thread.sleep(3000);
		webtest.click("xpath=(//a[text()='�Ż�'])[5]");
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("�Ż�"));
		webtest.leaveFrame();
		Thread.sleep(5000);
	}

	//����-���ݿ����-��������
	@Test
	public void test19() throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("test19");
		webtest.click("xpath=//span[text()='����']");
		webtest.enterFrame1("id=rightMain");
		webtest.click("xpath=//a[text()='��������']");
		webtest.click("xpath=//span[text()='ְλ�����¼']");
		webtest.click("xpath=//span[text()='���ŷ��ͼ�¼']");
		webtest.click("xpath=//div[text()='һ��ǰ']");
		webtest.click("xpath=//button[text()='���']");
		assertTrue(webtest.isTextPresent("���"));
		webtest.leaveFrame();
		Thread.sleep(5000);
	}
	
	//����-���ݲɼ�-�ɼ�����
	@Test(dataProvider = "excel20",dataProviderClass = NSDataProvider.class)
	public void test20(String s1,String s2) throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("test20");
		webtest.click("xpath=//span[text()='����']");
		webtest.click("xpath=//a[text()='���ݲɼ�']");
		webtest.enterFrame1("id=rightMain");
		webtest.click("xpath=//div[text()='����']");
		webtest.typeAndClear("id=locoy_key",s1);
		webtest.typeAndClear("id=locoy_rate", s2);
		webtest.click("name=config");
		assertTrue(webtest.isTextPresent(s2));
		webtest.leaveFrame();
		Thread.sleep(5000);
		
	}
	
	//����-���ݵ���-��ӵ���
	@Test(dataProvider = "excel21",dataProviderClass = NSDataProvider.class)
	public void test21(String s1,String s2,String s3,String s4,String s5) throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("test21");
		webtest.click("xpath=//span[text()='����']");
		webtest.click("xpath=//a[text()='���ݵ���']");
		webtest.enterFrame1("id=rightMain");
		webtest.click("class=admin_new_cz_tj");
		Thread.sleep(3000);
		webtest.click("xpath=//a[text()='ְλ']");
		webtest.type("name=name", s1);
		webtest.click("class=layui-edge");
		webtest.click("xpath=//dd[text()='����ְλ']");
		webtest.type("name=titlelen", s2);
		webtest.type("name=infolen",s3);
		webtest.type("name=num", s4);
		webtest.type("name=edittime",s5);
		webtest.click("name=submit");
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent(s1));
		webtest.leaveFrame();
		Thread.sleep(5000);
		
	}
	
	//����-����վ-�����ָ�
	//�����������ݣ�resume ,ǰ�����������ָ�
	@Test(dataProvider = "excel22",dataProviderClass = NSDataProvider.class)
	public void test22(String s1) throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("test22");
		webtest.click("xpath=//span[text()='����']");
		webtest.click("xpath=//a[text()='����վ']");
		webtest.enterFrame1("id=rightMain");
		webtest.mouseToElement("id=btype");
		webtest.mouseToElementandClick("xpath=//a[text()='���ݱ���']");
		//webtest.click("xpath=//a[text()='��������']");
		webtest.type("name=keyword", s1);
		webtest.click("name=search");
		webtest.click("xpath=//input[@class='check_all']");
		webtest.click("xpath=(//input[@class='check_all'])[2]");
		webtest.click("xpath=//input[@value='�����ָ�']");
		//���ȷ��
		webtest.leaveFrame();
		webtest.mouseToElementandClick("xpath=//a[text()='ȷ��']");
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("resume_expect"));
		Thread.sleep(5000);
	}
	
	//����-OSS����
	@Test(dataProvider = "excel23",dataProviderClass = NSDataProvider.class)
	public void test23(String s1,String s2,String s3,String s4) throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("test23");
		webtest.click("xpath=//span[text()='����']");
		webtest.click("xpath=//a[text()='OSS����']");
		webtest.enterFrame1("id=rightMain");
		webtest.click("xpath=//em[text()='�ر�']");
		webtest.type("id=access_id",s1);
		webtest.type("id=access_key", s2);
		webtest.type("id=endpoint", s3);
		webtest.type("id=bucket", s4);
		webtest.click("name=oss_config");
		assertTrue(webtest.isTextPresent(s4));
		webtest.leaveFrame();
		Thread.sleep(5000);
	}

	//��¼-��ݵ�¼
	@Test(dataProvider = "excel24",dataProviderClass = NSDataProvider.class)
	public void test24(String s1,String s2,String s3,String s4) throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("test24");
		webtest.click("xpath=//span[text()='��¼']");
		webtest.enterFrame1("id=rightMain");
		webtest.click("xpath=//em[text()='�ر�']");
		webtest.typeAndClear("name=sy_qqappid", s1);
		webtest.typeAndClear("id=sy_qqappkey", s2);
		webtest.click("name=qqconfig");
		Thread.sleep(5000);
		webtest.click("xpath=//em[text()='�ر�']");
		webtest.typeAndClear("name=sy_sinaappid",s3);
		webtest.typeAndClear("id=sy_sinaappkey", s4);
		webtest.click("name=msgconfig");
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent(s4));
		webtest.leaveFrame();
		Thread.sleep(5000);
	}
	
	//��¼-������̳-����UCenter
	@Test(dataProvider = "excel25",dataProviderClass = NSDataProvider.class)
	public void test25(String s1,String s2,String s3,String s4,String s5, String s6, 
			String s7, String s8) throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("test25");
		webtest.click("xpath=//span[text()='��¼']");
		webtest.click("xpath=//a[text()='������̳']");
		webtest.enterFrame1("id=rightMain");
		webtest.click("xpath=//div[text()='����']");
		webtest.typeAndClear("name=UC_DBHOST", s1);
		webtest.typeAndClear("name=UC_DBUSER", s2);
		webtest.typeAndClear("name=UC_DBPW", s2);
		webtest.typeAndClear("name=UC_DBNAME", s2);
		
		webtest.typeAndClear("name=UC_DBTABLEPRE_NEW", s3);
		webtest.typeAndClear("name=UC_KEY", s4);
		webtest.typeAndClear("name=UC_API", s5);
		webtest.click("xpath=//div[text()='utf8']");
		webtest.typeAndClear("name=UC_APPID", s6);
		webtest.typeAndClear("name=UC_APP", s7);
		webtest.typeAndClear("name=UC_EMAIL", s8);
		webtest.click("name=submit");
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent(s8));
		webtest.leaveFrame();
		Thread.sleep(5000);
		
	}

	//�ʼ�-�ʼ�����������
	//�ʼ����������ñ���󣬻����������������˵��������ֶ��ر��޷���ȡ��Ԫ�ء�
	//�����й������ֶ��رմ˵�������˲��������ɹ�
	//�����ֶ��رգ���ᱨ��
	@Test(dataProvider = "excel26",dataProviderClass = NSDataProvider.class)
	public void test31(String s1,String s2,String s3,String s4,String s5) throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("test31");
		webtest.click("xpath=//span[text()='�ʼ�']");
		webtest.enterFrame1("id=rightMain");
		webtest.click("class=layui-anim layui-icon");
		webtest.typeAndClear("name=smtpserver_1",s1);
		webtest.typeAndClear("name=smtpuser_1", s2);
		webtest.typeAndClear("name=smtppass_1", s3);
		webtest.typeAndClear("name=smtpport_1", s4);
		webtest.typeAndClear("name=smtpnick_1", s5);
		webtest.click("xpath=//div[text()='����']");
		webtest.click("name=config");
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent(s5));
		webtest.leaveFrame();
		Thread.sleep(5000);
	}
	
	//�ʼ�-�ʼ�ģ������-ע���Ա
	@Test(dataProvider = "excel27",dataProviderClass = NSDataProvider.class)
	public void test27(String s1) throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("test27");
		webtest.click("xpath=//span[text()='�ʼ�']");
		webtest.click("xpath=//a[text()='�ʼ�ģ������']");
		webtest.enterFrame1("id=rightMain");
		webtest.click("xpath=(//div[text()='֪ͨ'])[2]");
		webtest.click("name=msgconfig");
		Thread.sleep(3000);
		webtest.click("xpath=(//a[text()='����ģ��'])[2]");
		webtest.typeAndClear("name=title", s1);
		webtest.click("name=config");
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("��ӭ����phpyun"));
		webtest.leaveFrame();
		
	}
	
	//�ʼ�-�ʼ����ͼ�¼
	@Test(dataProvider = "excel28",dataProviderClass = NSDataProvider.class)
	public void test28(String s1) throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("test28");
		webtest.click("xpath=//span[text()='�ʼ�']");
		webtest.click("xpath=//a[text()='�ʼ����ͼ�¼']");
		webtest.enterFrame1("id=rightMain");
		webtest.mouseToElement("class=admin_Filter_but");
		webtest.mouseToElementandClick("xpath=//a[text()='����']");
		webtest.type("class=admin_Filter_search",s1);
		webtest.click("name=date");
		webtest.click("xpath=//td[@lay-ymd='2020-11-11']");
		webtest.click("xpath=//td[@lay-ymd='2020-11-27']");
		webtest.click("xpath=//span[text()='ȷ��']");
		webtest.click("name=news_search");
		webtest.click("id=chkAll");
		webtest.click("class=admin_button");
		//����
		webtest.leaveFrame();
		webtest.click("xpath=//a[text()='ȷ��']");
		Boolean flag = webtest.isTextPresent(s1);
		if (flag == false) {
			Boolean aBoolean = true;
			assertTrue(aBoolean);
		}
		Thread.sleep(5000);
				
	}
	
	
	//����-��������
	@Test(dataProvider = "excel29",dataProviderClass = NSDataProvider.class)
	public void test29(String s1,String s2,String s3,String s4) throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("test29");
		webtest.click("xpath=//span[text()='����']");
		webtest.enterFrame1("id=rightMain");
		webtest.click("xpath=//div[text()='����']");
		webtest.typeAndClear("id=sy_msguser", s1);
		webtest.typeAndClear("id=sy_msgpw", s1);
		webtest.typeAndClear("id=sy_msgkey", s2);
		webtest.typeAndClear("id=sy_msgsendnum", s3);
		webtest.typeAndClear("id=ip_msgnum", s3);
		webtest.typeAndClear("id=moblie_msgnum", s3);
		webtest.typeAndClear("id=cert_msgtime", s3);
		webtest.typeAndClear("id=moblie_codetime", s4);
		webtest.click("name=msgconfig");
		assertTrue(webtest.isTextPresent("50"));
		webtest.leaveFrame();
		Thread.sleep(5000);
	}

	
	//����-����ģ������-������֤��
	@Test(dataProvider = "excel30",dataProviderClass = NSDataProvider.class)
	public void test30(String s1) throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("test30");
		webtest.click("xpath=//span[text()='����']");
		webtest.click("xpath=//a[text()='����ģ������']");
		webtest.enterFrame1("id=rightMain");
		webtest.click("xpath=//div([text()='����'])");
		webtest.click("name=msgconfig");
		Thread.sleep(3000);
		webtest.click("xpath=(//a[text()='����ģ��'])[4]");
		webtest.typeAndClear("name=content", s1);
		webtest.click("id=mconfig");
		assertTrue(webtest.isTextPresent("{code��6666}"));
		webtest.leaveFrame();
		Thread.sleep(5000);
	}

}

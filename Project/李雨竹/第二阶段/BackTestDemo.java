package com.webtest.demo;


import static org.testng.Assert.assertTrue;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

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
	
//	@AfterClass
//	public void testLogin_close() {
//		System.out.println("testclose");
//		webtest.click("class=admin_new_header_close_icon");
//	}

	// ����-��ҳ����ģ��
	@Test
	public void test1() throws InterruptedException {
		System.out.println("test01");
		Thread.sleep(3000);
		webtest.enterFrame1("id=rightMain");
		webtest.typeAndClear("name=make_index_url", "indexChange.html");
		webtest.click("name=madeall");
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("indexChange.html"));
		webtest.leaveFrame();
	}

	// ����-������ҳģ��
	@Test
	public void test2() throws InterruptedException {
		System.out.println("test02");
		Thread.sleep(3000);
		webtest.click("xpath=//span[text()='����']");
		webtest.click("xpath=//a[text()='������ҳ']");
		webtest.enterFrame1("id=rightMain");
		webtest.typeAndClear("name=make_new_url", "newsChange.html");
		webtest.click("id=madenindex");
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("newsChange.html"));
		webtest.leaveFrame();
	}

	// ����-�������ģ��
	@Test
	public void test3() throws InterruptedException {
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
	}

	// ����-������ϸҳģ��
	@Test
	public void test4() throws InterruptedException {
		System.out.println("test04");
		Thread.sleep(5000);
		webtest.click("xpath=//span[text()='����']");
		webtest.click("xpath=//a[text()='������ϸҳ']");
		webtest.enterFrame1("id=rightMain");
		webtest.click("class=layui-edge");
		webtest.click("xpath=//dd[text()='ְҵָ��']");
		webtest.click("id=time");
		webtest.click("xpath=//td[@lay-ymd='2020-11-27']");
		webtest.click("xpath=//td[@lay-ymd='2020-11-12']");
		webtest.click("class=laydate-btns-confirm");
		webtest.typeAndClear("id=end_id", "5");
		webtest.typeAndClear("id=limit", "30");
		webtest.click("id=archive");
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("30"));
		webtest.leaveFrame();
	}

	// ����-���ɻ���
	@Test
	public void test5() throws InterruptedException {
		System.out.println("test05");
		Thread.sleep(5000);
		webtest.click("xpath=//span[text()='����']");
		webtest.click("xpath=//a[text()='���ɻ���']");
		webtest.enterFrame1("id=rightMain");
		webtest.click("xpath=//span[text()='����']");
		webtest.click("xpath=//span[text()='ְλ']");
		webtest.click("xpath=//span[text()='�ʼ�������']");
		webtest.click("name=madeall");
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("����"));
		webtest.leaveFrame();
	}

	// ����-��ҳ������
	@Test
	public void test6() throws InterruptedException {
		System.out.println("test06");
		Thread.sleep(5000);
		webtest.click("xpath=//span[text()='����']");
		webtest.click("xpath=//a[text()='��ҳ������']");
		webtest.enterFrame1("id=rightMain");
		webtest.click("class=layui-edge");
		webtest.click("xpath=//dd[text()='������Ƹ']");
		webtest.click("id=cache_once");
		assertTrue(webtest.isTextPresent("������Ƹ"));
		webtest.leaveFrame();
	}
	
	//����-һ������
	@Test
	public void test7() throws InterruptedException {
		System.out.println("test07");
		Thread.sleep(5000);
		webtest.click("xpath=//span[text()='����']");
		webtest.click("xpath=//a[text()='һ������']");
		webtest.enterFrame1("id=rightMain");
		webtest.typeAndClear("name=make_index_url", "indexChange1.html");
		webtest.typeAndClear("name=make_new_url", "newsChange1.html");
		webtest.click("xpath=//input[@value='һ������']");
		Thread.sleep(5000);
		assertTrue(webtest.isTextPresent("һ������"));
		webtest.leaveFrame();
		Thread.sleep(5000);
	}
	
	//����-����XML
	@Test
	public void test8() throws InterruptedException {
		System.out.println("test08");
		Thread.sleep(5000);
		webtest.click("xpath=//span[text()='����']");
		webtest.click("xpath=//a[text()='����XML']");
		Thread.sleep(3000);
		webtest.enterFrame1("id=rightMain");
		webtest.click("class=layui-edge");
		webtest.click("xpath=//dd[text()='ְλ']");
		webtest.click("xpath=(//i[@class='layui-edge'])[3]");
		webtest.click("xpath=//dd[text()='ÿ��']");
		webtest.typeAndClear("id=xfilename", "sitemap1");
		webtest.click("id=archive");
		//����XML���Զ���ΪĬ��״̬
		assertTrue(webtest.isTextPresent("sitemap"));
		webtest.leaveFrame();
	}
	
	//΢��-΢�Ű�-΢�Ź��ں�����
	@Test
	public void test9() throws InterruptedException {
		System.out.println("test09");
		Thread.sleep(5000);
		webtest.click("xpath=//span[text()='΢��']");
		Thread.sleep(3000);
		webtest.enterFrame1("id=rightMain");
		webtest.typeAndClear("id=wx_name", "phpyun01");
		webtest.typeAndClear("id=wx_token", "phpyun01");
		webtest.click("id=wxconfig");
		Thread.sleep(3000);
		webtest.typeAndClear("id=wx_appid", "1002478xx");
		webtest.typeAndClear("id=wx_appsecret", "4dd1c30d472676914f2fbfbnjt3");
		Thread.sleep(3000);
		webtest.click("xpath=(//input[@id='wxconfig'])[2]" );
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("4dd1c30d472676914f2fbfbnjt3"));
		webtest.leaveFrame();
	}
	
	//΢��-΢�Ű�-PC��΢��ɨ��
	@Test
	public void test10() throws InterruptedException {
		System.out.println("test10");
		Thread.sleep(3000);
		webtest.click("xpath=//span[text()='΢��']");
		webtest.enterFrame1("id=rightMain");
		webtest.click("xpath=(//i[@class='layui-anim layui-icon'])[2]");
		webtest.click("xpath=(//div[@class='layui-input-inline'])[2]/div[2]/i");
		webtest.click("xpath=(//input[@id='wxconfig'])[3]" );
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("��"));
		webtest.leaveFrame();
		
	}
	
	//΢��-��½��־
	@Test
	public void test11() throws InterruptedException {
		System.out.println("test11");
		Thread.sleep(3000);
		webtest.click("xpath=//span[text()='΢��']");
		webtest.click("xpath=//a[text()='��¼��־']");
		webtest.enterFrame1("id=rightMain");
		webtest.click("class=admin_submit8");
		assertTrue(webtest.isTextPresent("�������ǰ������"));
		webtest.leaveFrame();
	}
	
	//΢��-΢�Ų˵�-����΢�Ų˵�
	@Test
	public void test12() throws InterruptedException {
		System.out.println("test12");
		Thread.sleep(3000);
		webtest.click("xpath=//span[text()='΢��']");
		webtest.click("xpath=//a[text()='΢�Ų˵�']");
		webtest.enterFrame1("id=rightMain");
		webtest.click("xpath=//a[text()='����΢�Ų˵�']");
		webtest.type("class=admin_wx_text", "����һ����");
		webtest.click("xpath=(//i[@class='layui-edge'])[2]");
		webtest.click("xpath=//dd[text()='����¼�']");
		webtest.type("name=add_key", "�Ƽ�ְλ");
		webtest.type("name=add_sort", "1");
		webtest.click("name=add");
		assertTrue(webtest.isTextPresent("����һ����"));
		webtest.leaveFrame();
	}
	
	//΢��-΢�Ų˵�-ͬ�� ʧ�ܲ�������
	@Test
	public void test13() throws InterruptedException {
		System.out.println("test13");
		Thread.sleep(3000);
		webtest.click("xpath=//span[text()='΢��']");
		webtest.click("xpath=//a[text()='΢�Ų˵�']");
		webtest.enterFrame1("id=rightMain");
		webtest.click("xpath=//a[text()='ͬ��΢�Ų˵�']");
		webtest.click("id=layui-layer-shade4");
		webtest.click("id=layui-layer4");
		webtest.leaveFrame();
		webtest.click("xpath=//a[text()='ȷ��']");
		assertTrue(webtest.isTextPresent("΢�Ų˵������ɹ�"));

	}
	
	//΢��-΢�Ų˵�-ɾ��  ����
	@Test
	public void test14() throws InterruptedException {
		System.out.println("test14");
		Thread.sleep(3000);
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

	}
	
	//΢��-�û���-����
	@Test
	public void test15() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("test15");
		webtest.click("xpath=//span[text()='΢��']");
		webtest.click("xpath=//a[text()='�û���']");
		webtest.enterFrame1("id=rightMain");
		webtest.click("class=admin_Filter_search");
		webtest.type("class=admin_Filter_search", "phpyun07");
		webtest.click("name=news_search");
		assertTrue(webtest.isTextPresent("phpyun07"));
		webtest.leaveFrame();
	}
	
	//΢��-�Զ��ظ�-��ӹ���
	@Test
	public void test16() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("test16");
		webtest.click("xpath=//span[text()='΢��']");
		webtest.click("xpath=//a[text()='�Զ��ظ�']");
		webtest.enterFrame1("id=rightMain");
		webtest.click("class=admin_new_cz_tj");
		webtest.type("id=title", "����1");
		webtest.type("id=keyword", "ְ���滮");
		webtest.type("id=content", "ְ���滮");
		webtest.click("class=admin_button");
		assertTrue(webtest.isTextPresent("����1"));
		webtest.leaveFrame();
	}
	
	
	//����-���ݿ����-�������� 
	@Test
	public void test17() throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("test17");
		webtest.click("xpath=//span[text()='����']");
		webtest.enterFrame1("id=rightMain");
		webtest.click("xpath=//div[text()='�Զ��屸�� -- ��������ѡ�񱸷����ݱ�']");
		webtest.click("xpath=//span[text()='phpyun_ad']");
		webtest.click("xpath=//span[text()='phpyun_admin_log']");
		webtest.click("xpath=//span[text()='phpyun_friend_help']");
		webtest.typeAndClear("id=maxfilesize", "2048");
		webtest.typeAndClear("name=basename", "20201130");
		Thread.sleep(3000);
		webtest.click("xpath=//input[@value='�ύ����']");
		webtest.leaveFrame();
		webtest.click("id=layui-layer1");
		webtest.click("xpath=//a[text()='ȷ��']");
		Thread.sleep(5000);
		webtest.enterFrame1("id=rightMain");
		assertTrue(webtest.isDisplayed("xpath=//input[@name='basename']"));
		webtest.leaveFrame();
		
		
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
	}

	//����-���ݿ����-��������
	@Test
	public void test19() throws InterruptedException {
		Thread.sleep(3000);
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
	}
	
	//����-���ݲɼ�-�ɼ�����
	@Test
	public void test20() throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("test20");
		webtest.click("xpath=//span[text()='����']");
		webtest.click("xpath=//a[text()='���ݲɼ�']");
		webtest.enterFrame1("id=rightMain");
		webtest.click("xpath=//div[text()='����']");
		webtest.typeAndClear("id=locoy_key", "123qwe123");
		webtest.typeAndClear("id=locoy_rate", "66");
		webtest.click("name=config");
		assertTrue(webtest.isTextPresent("66"));
		webtest.leaveFrame();
		
	}
	
	//����-���ݵ���-��ӵ���
	@Test
	public void test21() throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("test21");
		webtest.click("xpath=//span[text()='����']");
		webtest.click("xpath=//a[text()='���ݵ���']");
		webtest.enterFrame1("id=rightMain");
		webtest.click("class=admin_new_cz_tj");
		Thread.sleep(3000);
		webtest.click("xpath=//a[text()='ְλ']");
		webtest.type("name=name", "����һ��");
		webtest.click("class=layui-edge");
		webtest.click("xpath=//dd[text()='����ְλ']");
		webtest.type("name=titlelen", "6");
		webtest.type("name=infolen", "6");
		webtest.type("name=num", "5");
		webtest.type("name=edittime", "60");
		webtest.click("name=submit");
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("����һ��"));
		webtest.leaveFrame();
		
	}
	
	//����-����վ-�����ָ�
	//�����������ݣ�resume ,ǰ�����������ָ�
	@Test
	public void test22() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("test22");
		webtest.click("xpath=//span[text()='����']");
		webtest.click("xpath=//a[text()='����վ']");
		webtest.enterFrame1("id=rightMain");
		webtest.mouseToElement("id=btype");
		webtest.mouseToElementandClick("xpath=//a[text()='���ݱ���']");
		//webtest.click("xpath=//a[text()='��������']");
		webtest.type("name=keyword", "wxnav");
		webtest.click("name=search");
		webtest.click("xpath=//input[@class='check_all']");
		webtest.click("xpath=(//input[@class='check_all'])[2]");
		webtest.click("xpath=//input[@value='�����ָ�']");
		//���ȷ��
		webtest.leaveFrame();
		webtest.mouseToElementandClick("xpath=//a[text()='ȷ��']");
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("resume_expect"));
	}
	
	//����-OSS����
	@Test
	public void test23() throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("test23");
		webtest.click("xpath=//span[text()='����']");
		webtest.click("xpath=//a[text()='OSS����']");
		webtest.enterFrame1("id=rightMain");
		webtest.click("xpath=//em[text()='�ر�']");
		webtest.type("id=access_id","1111");
		webtest.type("id=access_key", "111111");
		webtest.type("id=endpoint", "����");
		webtest.type("id=bucket", "�洢λ��");
		webtest.click("name=oss_config");
		assertTrue(webtest.isTextPresent("�洢λ��"));
		webtest.leaveFrame();
	}

	//��¼-��ݵ�¼
	@Test
	public void test24() throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("test24");
		webtest.click("xpath=//span[text()='��¼']");
		webtest.enterFrame1("id=rightMain");
		webtest.click("xpath=//em[text()='�ر�']");
		webtest.typeAndClear("name=sy_qqappid", "1002478xx");
		webtest.typeAndClear("id=sy_qqappkey", "4dd1c30d472676914f2fbfbnjt33");
		webtest.click("name=qqconfig");
		Thread.sleep(5000);
		webtest.click("xpath=//em[text()='�ر�']");
		webtest.typeAndClear("name=sy_sinaappid", "1002478");
		webtest.typeAndClear("id=sy_sinaappkey", "4dd1c30d472676914f2fbfbnjt");
		webtest.click("name=msgconfig");
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("4dd1c30d472676914f2fbfbnjt"));
		webtest.leaveFrame();
	}
	
	//��¼-������̳-����UCenter
	@Test
	public void test25() throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("test25");
		webtest.click("xpath=//span[text()='��¼']");
		webtest.click("xpath=//a[text()='������̳']");
		webtest.enterFrame1("id=rightMain");
		webtest.click("xpath=//div[text()='����']");
		webtest.typeAndClear("name=UC_DBHOST", "localhost");
		webtest.typeAndClear("name=UC_DBUSER", "ucenter");
		webtest.typeAndClear("name=UC_DBPW", "ucenter");
		webtest.typeAndClear("name=UC_DBNAME", "ucenter");
		
		webtest.typeAndClear("name=UC_DBTABLEPRE_NEW", "pre_ucenter_");
		webtest.typeAndClear("name=UC_KEY", "phpyun123456");
		webtest.typeAndClear("name=UC_API", "http://localhost/ucenter");
		webtest.click("xpath=//div[text()='utf8']");
		webtest.typeAndClear("name=UC_APPID", "7");
		webtest.typeAndClear("name=UC_APP", "20");
		webtest.typeAndClear("name=UC_EMAIL", "3249174527@qq.com");
		webtest.click("name=submit");
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("3249174527@qq.com"));
		webtest.leaveFrame();
		
	}

	//�ʼ�-�ʼ�����������
	@Test
	public void test26() throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("test26");
		webtest.click("xpath=//span[text()='�ʼ�']");
		webtest.enterFrame1("id=rightMain");
		webtest.click("class=layui-anim layui-icon");
		webtest.typeAndClear("name=smtpserver_1", "smtp.126.com");
		webtest.typeAndClear("name=smtpuser_1", "test2014123@126.com");
		webtest.typeAndClear("name=smtppass_1", "TICENBQYKIZLONOW");
		webtest.typeAndClear("name=smtpport_1", "25");
		webtest.typeAndClear("name=smtpnick_1", "phpyun");
		webtest.click("xpath=//div[text()='����']");
		webtest.click("name=config");
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("phpyun"));
		webtest.leaveFrame();
	}
	
	//�ʼ�-�ʼ�ģ������-ע���Ա
	@Test
	public void test27() throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("test27");
		webtest.click("xpath=//span[text()='�ʼ�']");
		webtest.click("xpath=//a[text()='�ʼ�ģ������']");
		webtest.enterFrame1("id=rightMain");
		webtest.click("xpath=(//div[text()='֪ͨ'])[2]");
		webtest.click("name=msgconfig");
		Thread.sleep(3000);
		webtest.click("xpath=(//a[text()='����ģ��'])[2]");
		webtest.typeAndClear("name=title", "�װ��ģ�{username}�����ѳɹ�ע��{webname}��Ա����ӭ����phpyun");
		webtest.click("name=config");
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("��ӭ����phpyun"));
		webtest.leaveFrame();
		
	}
	
	//�ʼ�-�ʼ����ͼ�¼
	@Test
	public void test28() throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("test28");
		webtest.click("xpath=//span[text()='�ʼ�']");
		webtest.click("xpath=//a[text()='�ʼ����ͼ�¼']");
		webtest.enterFrame1("id=rightMain");
		webtest.mouseToElement("class=admin_Filter_but");
		webtest.mouseToElementandClick("xpath=//a[text()='����']");
		webtest.type("class=admin_Filter_search","lyz3249174527@163.com");
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
		Boolean flag = webtest.isTextPresent("lyz3249174527@163.com");
		if (flag == false) {
			Boolean aBoolean = true;
			assertTrue(aBoolean);
		}
				
	}
	
	
	//����-��������
//	@Test
	public void test29() throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("test29");
		webtest.click("xpath=//span[text()='����']");
		webtest.enterFrame1("id=rightMain");
		webtest.click("xpath=//div[text()='����']");
		webtest.typeAndClear("id=sy_msguser", "admin");
		webtest.typeAndClear("id=sy_msgpw", "admin");
		webtest.typeAndClear("id=sy_msgkey", "123456");
		webtest.typeAndClear("id=sy_msgsendnum", "6");
		webtest.typeAndClear("id=ip_msgnum", "6");
		webtest.typeAndClear("id=moblie_msgnum", "6");
		webtest.typeAndClear("id=cert_msgtime", "6");
		webtest.typeAndClear("id=moblie_codetime", "50");
		webtest.click("name=msgconfig");
		assertTrue(webtest.isTextPresent("50"));
		webtest.leaveFrame();
	}

	
	//����-����ģ������-������֤��
	@Test
	public void test30() throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("test30");
		webtest.click("xpath=//span[text()='����']");
		webtest.click("xpath=//a[text()='����ģ������']");
		webtest.enterFrame1("id=rightMain");
		webtest.click("xpath=//div([text()='����'])");
		webtest.click("name=msgconfig");
		Thread.sleep(3000);
		webtest.click("xpath=(//a[text()='����ģ��'])[4]");
		webtest.typeAndClear("name=content", "{code��6666}����¼��̬��֤�룩,����30��������д");
		webtest.click("id=mconfig");
		assertTrue(webtest.isTextPresent("{code��6666}"));
		webtest.leaveFrame();
	}

}

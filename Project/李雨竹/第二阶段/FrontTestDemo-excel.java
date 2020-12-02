package com.webtest.demo;

import static org.testng.Assert.assertTrue;




import org.testng.Assert;
import org.testng.annotations.Test;
import com.webtest.core.BaseTest;
import com.webtest.dataprovider.NSDataProvider;



public class FrontTestDemo extends BaseTest {

	// ע���˺Ź��ܡ���������
	@Test(dataProvider = "excel1",dataProviderClass = NSDataProvider.class)
	public void testA1(String s1,String s2,String s3,String s4,String s5, String s6, 
			String s7, String s8,String s9,String s10, String s11) throws InterruptedException {
		System.out.println("testA1");
		webtest.open("");
		Thread.sleep(3000);
		webtest.click("xpath=//a[text()='���ע��']");
		Thread.sleep(3000);
		webtest.type("id=username1",s1);// �û���
		webtest.type("id=CheckCode", s2);// ��֤��
		webtest.type("id=password", s3);// ����
		webtest.type("id=passconfirm", s4);// ȷ������
		Thread.sleep(3000);
		webtest.click("id=subreg");// ���������ע�ᡱ
		Thread.sleep(3000);
		// ѡ��������ְ�ߡ�
		webtest.click("class=reg_role_bth");
		Thread.sleep(3000);
		// ������������ơ���ʼ��������
		// webtest.click("id=reg_role_bth");
		// Thread.sleep(3000);
		// ��������
		// ��ְ����
		webtest.type("id=name", s5);
		// ����ְ��
		webtest.click("class=news_expect_text_new_nth");
		webtest.click("name=IT-Ʒ�ܡ�����֧�ּ�����");
		webtest.click("name=����֧��/ά������");
		webtest.click("class=queding");
		// ��������
		webtest.click("xpath=(//div[@class='news_expect_text_new_nth'])[2]");
		webtest.click("name=����");
		webtest.click("class=queding");
		Thread.sleep(3000);
		// н��
		webtest.type("id=minsalary", s6);
		webtest.type("id=maxsalary", s7);
		webtest.click("xpath=(//input[@class='layui-input layui-unselect'])[2]");
		webtest.click("xpath=//dd[text()='��ְ']");
		webtest.click("xpath=(//input[@class='layui-input layui-unselect'])[3]");
		webtest.click("xpath=//dd[text()='�����/������']");
		webtest.click("xpath=(//input[@class='layui-input layui-unselect'])[4]");
		webtest.click("xpath=//dd[text()='����']");
		Thread.sleep(3000);
		// ������Ϣ
		webtest.type("id=uname", s8);
		webtest.click("xpath=//input[@placeholder='��ѡ�����ѧ��']");
		webtest.click("xpath=//dd[text()='����']");
		webtest.click("id=1sex");// �Ա�
		webtest.typeAndClear("id=living", s9);// ��ַ
		webtest.type("id=telphone", s10);
		webtest.click("xpath=//input[@placeholder='��ѡ��������']");
		webtest.click("xpath=//dd[text()='Ӧ���ҵ��']");
		webtest.click("name=submit");
		Thread.sleep(3000);

		// ��������
		webtest.click("xpath=//div[text()='��']");
		// webtest.click("xpath=//input[@value='��һ��']");
		// webtest.click("class=news_expect_list_sub");
		webtest.click("xpath=(//input[@class='news_expect_list_sub'])[2]");
		// ѧУ
		webtest.type("id=eduname", s11);
		webtest.click("id=edusdate");
		webtest.click("xpath=//div[@class='layui-laydate-header']/i[1]");
		webtest.click("xpath=//li[text()='����']");

		webtest.click("id=eduedate");
		webtest.click("xpath=//div[@class='layui-laydate-header']/i[4]");
		Thread.sleep(3000);
		webtest.click("xpath=//li[text()='����']");
		webtest.click("xpath=//span[text()='ȷ��']");
		webtest.click("xpath=//input[@placeholder='��ѡ��ѧ��']");
		webtest.click("xpath=(//dl[@class='layui-anim layui-anim-upbit'])[7]/dd[6]");
		webtest.type("id=eduspec", "�������");
		webtest.click("xpath=(//input[@class='news_expect_list_sub'])[3]");
		Thread.sleep(3000);

		assertTrue(webtest.isTextPresent("��ϲ�������������ɹ�"));

	}

	// ���Ե�¼����
	@Test(dataProvider = "excel2",dataProviderClass = NSDataProvider.class)
	public void testA2(String s1,String s2) throws InterruptedException {
		System.out.println("testA2");
		webtest.open("");
		webtest.click("xpath=//a[text()='�û���¼']");
		Thread.sleep(3000);
		webtest.type("id=username", s1);
		Thread.sleep(3000);
		webtest.click("id=password2");
		webtest.type("id=password", s2);
		webtest.click("id=sublogin");
		Thread.sleep(3000);
	}

	// ����ǰ̨���ֻ��桱������ת
	@Test
	public void testA3() throws InterruptedException {
		System.out.println("testA3");
		webtest.open("");
		Thread.sleep(3000);
		webtest.click("xpath=//a[text()='�ֻ���']");
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("���ܲ�����"));
	}

	// ����ǰ̨��΢�Ű桱������ת
	@Test
	public void testA4() throws InterruptedException {
		System.out.println("testA4");
		webtest.open("");
		Thread.sleep(3000);
		webtest.click("xpath=//a[text()='΢�Ű�']");
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("΢�Ž�������֪ͨ"));
	}

	// ������������б���
	@Test(dataProvider = "excel3",dataProviderClass = NSDataProvider.class)
	public void testA5(String s1) throws InterruptedException {
		System.out.println("testA5");
		webtest.open("");
		Thread.sleep(3000);
		webtest.mouseToElement("id=search_name");
		webtest.mouseToElementandClick("xpath=//div[@class='hp_head_search_job fl']/div[1]/a[1]");
		Thread.sleep(3000);
		webtest.type("xpath=//input[@placeholder='������Ҫ�����Ĺؼ��֣��� ���,�ֹ�,���ʦ��']", s1);
		webtest.click("xpath=//input[@type='submit']");
		assertTrue(webtest.isTextPresent(s1));
	}

	// �ֲ�ͼ�����Ҽ�����
	@Test
	public void testA7() throws InterruptedException {
		System.out.println("testA7");
		webtest.open("");
		Thread.sleep(3000);
		webtest.click("xpath=//button[@lay-type='sub']");
		webtest.click("xpath=//button[@lay-type='add']");
		Boolean flag = webtest.isElementPresent("class=layui-this");
		System.out.println(flag);
		assertTrue(flag);
	}

	// ��������-����ˢ�¼�������
	@Test(dataProvider = "excel2",dataProviderClass = NSDataProvider.class)
	public void testA8(String s1,String s2) throws InterruptedException {
		System.out.println("testA8");
		// ��¼
		webtest.open("");
		webtest.click("xpath=//a[text()='�û���¼']");
		Thread.sleep(3000);
		webtest.type("id=username", s1);
		Thread.sleep(3000);
		webtest.click("id=password2");
		webtest.type("id=password",s2);
		webtest.click("id=sublogin");
		webtest.click("xpath=//a[text()='�����û�����>>']");
		Thread.sleep(3000);
//		// ��ʾ�������ݲ�ˢ�¡�
//		webtest.click("xpath=//a[text()='�ݲ�ˢ��']");
//		Thread.sleep(3000);
		// �����ˢ�¼�����
		webtest.click("xpath=//a[text()='ˢ�¼���']");
		webtest.click("xpath=//a[text()='ȷ��']");
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("ˢ�³ɹ�"));

	}

	// ��������-�˳���¼����
	@Test(dataProvider = "excel2",dataProviderClass = NSDataProvider.class)
	public void testA9(String s1,String s2) throws InterruptedException {
		System.out.println("testA9");
		// ��¼
		webtest.open("");
		webtest.click("xpath=//a[text()='�û���¼']");
		webtest.type("id=username", s1);
		Thread.sleep(3000);
		webtest.click("id=password2");
		webtest.type("id=password", s2);
		webtest.click("id=sublogin");
		webtest.click("xpath=//a[text()='�����û�����>>']");
		Thread.sleep(3000);
		// �˳���¼
		webtest.mouseToElement("class=yun_m_headertx_hi_icon");
		webtest.mouseToElementandClick("xpath=//a[text()='�˳���¼']");
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("�û���¼"));
	}

	// ��������-�޸ļ�������
	@Test(dataProvider = "excel4",dataProviderClass = NSDataProvider.class)
	public void testB0(String s1,String s2,String s3) throws InterruptedException {
		System.out.println("testB0");
		// ��¼
		webtest.open("");
		webtest.click("xpath=//a[text()='�û���¼']");
		webtest.type("id=username",s1);
		Thread.sleep(3000);
		webtest.click("id=password2");
		webtest.type("id=password", s2);
		webtest.click("id=sublogin");
		webtest.click("xpath=//a[text()='�����û�����>>']");
		Thread.sleep(3000);
		// ������޸ļ�����
		webtest.click("xpath=//a[text()='�޸ļ���']");
		webtest.mouseToElement("id=info_upbox");
		webtest.mouseToElementandClick("id=compile_info");
		webtest.typeAndClear("id=name",s3);
		webtest.click("xpath=//div[text()='δ��']");
		webtest.click("name=submitBtn");
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("δ��"));
	}

	// ��������-�޸ĸ�����Ϣ
	@Test(dataProvider = "excel4",dataProviderClass = NSDataProvider.class)
	public void testB1(String s1,String s2,String s3) throws InterruptedException {
		System.out.println("testB1");
		// ��¼
		webtest.open("");
		webtest.click("xpath=//a[text()='�û���¼']");
		webtest.type("id=username", s1);
		Thread.sleep(3000);
		webtest.click("id=password2");
		webtest.type("id=password", s2);
		webtest.click("id=sublogin");
		webtest.click("xpath=//a[text()='�����û�����>>']");
		Thread.sleep(3000);
		// �޸ĸ�����Ϣ
		webtest.click("xpath=//a[text()='�޸ĸ�����Ϣ>']");
		webtest.typeAndClear("id=name",s3);
		webtest.click("xpath=//input[@value='��ȫ����']");
		webtest.click("xpath=//dd[text()='��ʾ���']");
		webtest.click("xpath=//input[@value='������Ϣ']");
		Thread.sleep(3000);
		;
		assertTrue(webtest.isTextPresent("��ʾ���"));
	}

	// ��������-���������������
	// ������С��2
	@Test(dataProvider = "excel5",dataProviderClass = NSDataProvider.class)
	public void testB2(String s1,String s2,String s3,String s4,String s5) throws InterruptedException {
		System.out.println("testB2");
		// ��¼
		webtest.open("");
		webtest.click("xpath=//a[text()='�û���¼']");
		Thread.sleep(3000);
		webtest.type("id=username", s1);
		Thread.sleep(3000);
		webtest.click("id=password2");
		webtest.type("id=password", s2);
		webtest.click("id=sublogin");
		webtest.click("xpath=//a[text()='�����û�����>>']");
		Thread.sleep(3000);
		// �������������
		webtest.click("xpath=//a[text()=' ��������']");
		Thread.sleep(3000);
		// ���"�����������"
		webtest.click("xpath=//a[text()='����ճ������']");
		// ��д���ּ�������
		webtest.type("id=name", s3);
		webtest.click("xpath=//input[@placeholder='����']");
		webtest.click("xpath=//dd[text()='�����/������']");
		Thread.sleep(3000);
		webtest.click("xpath=//div[@title='ѡ��ְλ���']");
		webtest.click("name=IT-Ʒ�ܡ�����֧�ּ�����");
		webtest.click("name=����֧��/ά������");
		webtest.click("class=queding");
		webtest.click("xpath=//div[@title='ѡ�����']");
		webtest.click("name=����");
		webtest.click("class=queding");
		Thread.sleep(3000);
		// н�ʴ���
		webtest.type("id=minsalary",s4);
		webtest.type("id=maxsalary", s5);
		// ��������
		webtest.click("xpath=//input[@placeholder='��ѡ��������']");
		webtest.click("xpath=//dd[text()='ȫְ']");
		webtest.click("xpath=//input[@placeholder='��ѡ�񵽸�ʱ��']");
		webtest.click("xpath=//dd[text()='��ʱ����']");
		webtest.click("xpath=//input[@placeholder='��ѡ����ְ״̬']");
		webtest.click("xpath=//dd[text()='����']");
		Thread.sleep(3000);
		webtest.click("name=submit");
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("��ΪĬ��"));

	}

	// ��������-�����ⷢ����
	@Test(dataProvider = "excel6",dataProviderClass = NSDataProvider.class)
	public void testB3(String s1,String s2,String s3,String s4,String s5) throws InterruptedException {
		System.out.println("testB3");
		// ��¼
		webtest.open("");
		webtest.click("xpath=//a[text()='�û���¼']");
		Thread.sleep(3000);
		webtest.type("id=username", s1);
		Thread.sleep(3000);
		webtest.click("id=password2");
		webtest.type("id=password", s2);
		webtest.click("id=sublogin");
		webtest.click("xpath=//a[text()='�����û�����>>']");
		Thread.sleep(3000);
		// �������������
		webtest.click("xpath=//a[text()=' ��������']");
		// ����������ⷢ��
		webtest.click("xpath=//span[text()='�����ⷢ']");
		// ��д
		webtest.click("xpath=//input[@placeholder='��ѡ�����']");
		webtest.click("xpath=//dd[text()='����']");
		webtest.type("id=email", s3);
		webtest.type("id=comname", s4);
		webtest.type("id=jobname", s5);
		webtest.click("name=submit");
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("����"));

	}

	// ��������-����ģ�幺��
	// �����㹻���ֵļ���
	@Test(dataProvider = "excel2",dataProviderClass = NSDataProvider.class)
	public void testB4(String s1,String s2) throws InterruptedException {
		System.out.println("testB4");
		// ��¼
		webtest.open("");
		webtest.click("xpath=//a[text()='�û���¼']");
		Thread.sleep(3000);
		webtest.type("id=username", s1);
		Thread.sleep(3000);
		webtest.click("id=password2");
		webtest.type("id=password", s2);
		webtest.click("id=sublogin");
		webtest.click("xpath=//a[text()='�����û�����>>']");
		Thread.sleep(3000);
		// �������������
		webtest.click("xpath=//a[text()=' ��������']");
		// ���������ģ�塱
		webtest.click("xpath=//span[text()='����ģ��']");
		Thread.sleep(3000);
		// ���������
		webtest.click("xpath=//a[contains(@onclick,'����ģ�彫����10����')]");// �����ı�
		Thread.sleep(3000);
		webtest.click("xpath=//a[text()='ȷ��']");
		Boolean flag = webtest.isElementPresent("xpath=//a[text()='ʹ��']");
		System.out.println(flag);
		assertTrue(flag);
	}

	// ��������-����Ĭ�ϼ����Ĺ���
	// ����������
	@Test(dataProvider = "excel2",dataProviderClass = NSDataProvider.class)
	public void testB5(String s1,String s2) throws InterruptedException {
		System.out.println("testB5");
		// ��¼
		webtest.open("");
		webtest.click("xpath=//a[text()='�û���¼']");
		webtest.type("id=username", s1);
		Thread.sleep(3000);
		webtest.click("id=password2");
		webtest.type("id=password", s2);
		webtest.click("id=sublogin");
		webtest.click("xpath=//a[text()='�����û�����>>']");
		Thread.sleep(3000);
		webtest.click("xpath=//a[text()=' ��������']");
		webtest.click("xpath=//span[text()='�ҵļ���']");
		webtest.click("class=myresume_default_set_a");
		// ������ȷ��Ҫִ��
		webtest.click("class=layui-layer-btn0");
		Thread.sleep(3000);
		// ����
		Boolean flag = webtest.isElementPresent("xpath=//span[text()='Ĭ�ϼ���']");
		Assert.assertTrue(flag);
	}

	// ��ֵ����-����ְλ����������
	// ְλ����������С��2
	@Test(dataProvider = "excel7",dataProviderClass = NSDataProvider.class)
	public void testB6(String s1,String s2,String s3,String s4,String s5,String s6) throws InterruptedException {
		System.out.println("testB6");
		// ��¼
		webtest.open("");
		webtest.click("xpath=//a[text()='�û���¼']");
		Thread.sleep(3000);
		webtest.type("id=username", s1);
		Thread.sleep(3000);
		webtest.click("id=password2");
		webtest.type("id=password", s2);
		webtest.click("id=sublogin");
		webtest.click("xpath=//a[text()='�����û�����>>']");
		Thread.sleep(3000);
		// �������ְ����
		webtest.click("xpath=//a[text()='��ְ����']");
		// �����ְλ��������
		webtest.click("xpath=//span[text()='ְλ������']");
		webtest.click("xpath=//a[text()='����������']");
		Thread.sleep(3000);
		// "ְλ������"
		webtest.type("xpath=//input[@placeholder=' �磬�������']", s3);
		webtest.type("name=keyword", s4);
		webtest.click("xpath=//input[@placeholder='��ѡ����ҵ']");
		webtest.click("xpath=//dd[text()='�����/������']");
		webtest.click("xpath=//input[@placeholder='��ѡ��������']");
		webtest.click("xpath=//dd[text()='����']");
		webtest.type("id=minsalary", s5);
		webtest.type("id=maxsalary", s6);
		webtest.click("xpath=//input[@placeholder='��ѡ��ѧ��Ҫ��']");
		webtest.click("xpath=//dd[text()='����']");
		webtest.click("xpath=//input[@placeholder='��ѡ��������']");
		webtest.click("xpath=//dd[text()='Ӧ���ҵ��']");
		webtest.click("name=submitBtn");
		assertTrue(webtest.isTextPresent("����"));

	}

	// �������-��ֵ����
	// ֮ǰ��δ֧���Ķ���
	@Test(dataProvider = "excel8",dataProviderClass = NSDataProvider.class)
	public void testB7(String s1,String s2,String s3) throws InterruptedException {
		System.out.println("testB7");
		// ��¼
		webtest.open("");
		webtest.click("xpath=//a[text()='�û���¼']");
		webtest.type("id=username", s1);
		Thread.sleep(3000);
		webtest.click("id=password2");
		webtest.type("id=password", s2);
		webtest.click("id=sublogin");
		webtest.click("xpath=//a[text()='�����û�����>>']");
		Thread.sleep(3000);
		// ������������
		webtest.click("xpath=//a[text()='�������']");
		webtest.click("xpath=//span[text()='������ֵ']");
		webtest.click("class=payment_list_text_n");
		webtest.type("id=remark", s3);
		webtest.click("class=payment_list_other");
		assertTrue(webtest.isTextPresent("�������"));

	}

	// �������-ȡ����ֵ����
	@Test(dataProvider = "excel2",dataProviderClass = NSDataProvider.class)
	public void testB8(String s1,String s2) throws InterruptedException {
		System.out.println("testB8");
		// ��¼
		webtest.open("");
		webtest.click("xpath=//a[text()='�û���¼']");
		webtest.type("id=username", s1);
		Thread.sleep(3000);
		webtest.click("id=password2");
		webtest.type("id=password", s2);
		webtest.click("id=sublogin");
		webtest.click("xpath=//a[text()='�����û�����>>']");
		Thread.sleep(3000);
		// ������������
		webtest.click("xpath=//a[text()='�������']");
		webtest.click("xpath=//span[text()='������ϸ']");
		webtest.click("xpath=//a[contains(text(),'ȡ����ֵ')]");
		// ����
		webtest.click("class=layui-layer-btn0");
		assertTrue(webtest.isTextPresent("��ֵ"));
	}

	// �������-���ֹ���-��������ģ��
	// ֮ǰδǩ��
	@Test(dataProvider = "excel2",dataProviderClass = NSDataProvider.class)
	public void testB9(String s1,String s2) throws InterruptedException {
		System.out.println("testB9");
		// ��¼
		webtest.open("");
		webtest.click("xpath=//a[text()='�û���¼']");
		webtest.type("id=username", s1);
		Thread.sleep(3000);
		webtest.click("id=password2");
		webtest.type("id=password", s2);
		webtest.click("id=sublogin");
		webtest.click("xpath=//a[text()='�����û�����>>']");
		Thread.sleep(3000);
		// ������������
		webtest.click("xpath=//a[text()='�������']");
		webtest.click("xpath=//span[text()='���ֹ���']");
		webtest.click("xpath=//a[text()='ǩ��']");
		assertTrue(webtest.isTextPresent("��ǩ��"));

	}

	// �˺�����-�˻��޸Ĺ���
	@Test(dataProvider = "excel9",dataProviderClass = NSDataProvider.class)
	public void testC1(String s1,String s2,String s3,String s4,String s5,String s6) throws InterruptedException {
		System.out.println("testC1");
		// ��¼
		webtest.open("");
		webtest.click("xpath=//a[text()='�û���¼']");
		Thread.sleep(3000);
		webtest.type("id=username", s1);
		Thread.sleep(3000);
		webtest.click("id=password2");
		webtest.type("id=password", s2);
		webtest.click("id=sublogin");
		webtest.click("xpath=//a[text()='�����û�����>>']");
		Thread.sleep(3000);
		// ������˺����ġ�
		webtest.click("xpath=//a[text()='�˺�����']");
		Thread.sleep(3000);
		// ������˺Ű�ȫ��
		webtest.click("xpath=//a[text()='�˺Ű�ȫ']");
		webtest.click("xpath=//a[text()='�޸�']");
		webtest.type("id=username", s3);
		webtest.type("id=password", s4);
		webtest.click("name=submit2");
		Thread.sleep(3000);
		// ���µ�¼
		webtest.type("id=username", s5);
		Thread.sleep(3000);
		webtest.click("id=password2");
		webtest.type("id=password", s6);
		webtest.click("id=sublogin");
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("��ʹ��"));
	}

	@Test(dataProvider = "excel10",dataProviderClass = NSDataProvider.class)
	// �˺�����-�˺Ű�ȫ-�˺������޸�
	public void testC2(String s1,String s2,String s3,String s4,String s5, String s6, 
			String s7) throws InterruptedException {
		System.out.println("testC2");
		// ��¼
		webtest.open("");
		webtest.click("xpath=//a[text()='�û���¼']");
		Thread.sleep(3000);
		webtest.type("id=username", s1);
		Thread.sleep(3000);
		webtest.click("id=password2");
		webtest.type("id=password", s2);
		webtest.click("id=sublogin");
		webtest.click("xpath=//a[text()='�����û�����>>']");
		Thread.sleep(3000);
		// ������˺����ġ�
		webtest.click("xpath=//a[text()='�˺�����']");
		Thread.sleep(3000);
		// ������˺Ű�ȫ��
		webtest.click("xpath=//a[text()='�˺Ű�ȫ']");
		webtest.click("xpath=(//a[@class='account_settings_bth_hv'])[1]");
		webtest.type("id=oldpassword", s3);
		webtest.type("id=newpassword", s4);
		webtest.type("id=repassword", s5);
		webtest.click("name=submit");
		Thread.sleep(5000);
		// ���µ�¼
		webtest.type("id=username", s6);
		Thread.sleep(3000);
		webtest.click("id=password2");
		webtest.type("id=password", s7);
		webtest.click("id=sublogin");
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("�޸�"));

	}

}

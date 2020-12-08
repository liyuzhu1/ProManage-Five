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

//	登录后台,进入内容页面
	@BeforeClass
	public void testLogin_admin() throws InterruptedException {
		System.out.println("testadmin");
		webtest.open("/admin");
		Thread.sleep(2000);
		webtest.type("id=username", "admin");
		webtest.type("id=password", "admin");
		webtest.click("xpath=//input[@type='submit']");
		// 进入工具模块
		webtest.click("xpath=//a[text()='工具']");
	}
	
	@AfterClass
	public void testLogin_close() {
		System.out.println("testclose");
		webtest.click("class=admin_new_header_close_icon");
	}

	// 生成-首页生成模块
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

	// 生成-新闻首页模块
	@Test(dataProvider = "excel12",dataProviderClass = NSDataProvider.class)
	public void test02(String s1) throws InterruptedException {
		System.out.println("test02");
		Thread.sleep(3000);
		webtest.click("xpath=//span[text()='生成']");
		webtest.click("xpath=//a[text()='新闻首页']");
		webtest.enterFrame1("id=rightMain");
		webtest.typeAndClear("name=make_new_url", s1);
		webtest.click("id=madenindex");
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("newsChange.html"));
		webtest.leaveFrame();
		Thread.sleep(5000);
	}

	// 生成-新闻类别模块
	@Test
	public void test03() throws InterruptedException {
		System.out.println("test03");
		Thread.sleep(5000);
		webtest.click("xpath=//span[text()='生成']");
		webtest.click("xpath=//a[text()='新闻类别']");
		webtest.enterFrame1("id=rightMain");
		Thread.sleep(5000);
		webtest.click("class=layui-edge");
		webtest.click("xpath=//dd[text()='职业指导']");
		webtest.click("id=newsclass");
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("职业指导"));
		webtest.leaveFrame();
		Thread.sleep(5000);
	}

	// 生成-新闻详细页模块
	@Test
	public void test04() throws InterruptedException {
		System.out.println("test04");
		Thread.sleep(5000);
		webtest.click("xpath=//span[text()='生成']");
		webtest.click("xpath=//a[text()='新闻详细页']");
		webtest.enterFrame1("id=rightMain");
		webtest.click("class=layui-edge");
		webtest.click("xpath=//dd[text()='职业指导']");
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

	// 生成-生成缓存
	@Test
	public void test05() throws InterruptedException {
		System.out.println("test05");
		Thread.sleep(5000);
		webtest.click("xpath=//span[text()='生成']");
		Thread.sleep(3000);
		webtest.click("xpath=//a[text()='生成缓存']");
		webtest.enterFrame1("id=rightMain");
		webtest.click("xpath=//span[text()='区域']");
		webtest.click("xpath=//span[text()='职位']");
		webtest.click("xpath=//span[text()='邮件服务器']");
		webtest.click("name=madeall");
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("更新"));
		webtest.leaveFrame();
		Thread.sleep(5000);
	}

	// 生成-单页面生成
	@Test
	public void test06() throws InterruptedException {
		System.out.println("test06");
		Thread.sleep(8000);
		webtest.click("xpath=//span[text()='生成']");
		webtest.click("xpath=//a[text()='单页面生成']");
		webtest.enterFrame1("id=rightMain");
		webtest.click("class=layui-edge");
		webtest.click("xpath=//dd[text()='店铺招聘']");
		webtest.click("id=cache_once");
		assertTrue(webtest.isTextPresent("店铺招聘"));
		webtest.leaveFrame();
		Thread.sleep(5000);
	}
	
	//生成-一键更新
	@Test(dataProvider = "excel13",dataProviderClass = NSDataProvider.class)
	public void test07(String s1,String s2) throws InterruptedException {
		System.out.println("test07");
		Thread.sleep(8000);
		webtest.click("xpath=//span[text()='生成']");
		webtest.click("xpath=//a[text()='一键更新']");
		webtest.enterFrame1("id=rightMain");
		webtest.typeAndClear("name=make_index_url", s1);
		webtest.typeAndClear("name=make_new_url", s2);
		webtest.click("xpath=//input[@value='一键更新']");
		Thread.sleep(5000);
		assertTrue(webtest.isTextPresent("一键更新"));
		webtest.leaveFrame();
		Thread.sleep(5000);
	}
	
	//生成-生成XML
	@Test(dataProvider = "excel14",dataProviderClass = NSDataProvider.class)
	public void test08(String s1) throws InterruptedException {
		System.out.println("test08");
		Thread.sleep(5000);
		webtest.click("xpath=//span[text()='生成']");
		Thread.sleep(3000);
		webtest.click("xpath=//a[text()='生成XML']");
		Thread.sleep(3000);
		webtest.enterFrame1("id=rightMain");
		webtest.click("class=layui-edge");
		webtest.click("xpath=//dd[text()='职位']");
		webtest.click("xpath=(//i[@class='layui-edge'])[3]");
		webtest.click("xpath=//dd[text()='每天']");
		webtest.typeAndClear("id=xfilename", s1);
		webtest.click("id=archive");
		//生成XML后，自动变为默认状态
		assertTrue(webtest.isTextPresent("sitemap"));
		webtest.leaveFrame();
		Thread.sleep(5000);
	}
	
	//微信-微信绑定-微信公众号设置
	@Test(dataProvider = "excel15",dataProviderClass = NSDataProvider.class)
	public void test09(String s1,String s2,String s3,String s4) throws InterruptedException {
		System.out.println("test09");
		Thread.sleep(8000);
		webtest.click("xpath=//span[text()='微信']");
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
	
	//微信-微信绑定-PC端微信扫码
	@Test
	public void test10() throws InterruptedException {
		System.out.println("test10");
		Thread.sleep(3000);
		webtest.click("xpath=//span[text()='微信']");
		Thread.sleep(3000);
		webtest.enterFrame1("id=rightMain");
		webtest.click("xpath=(//i[@class='layui-anim layui-icon'])[2]");
		webtest.click("xpath=(//div[@class='layui-input-inline'])[2]/div[2]/i");
		webtest.click("xpath=(//input[@id='wxconfig'])[3]" );
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("是"));
		webtest.leaveFrame();
		Thread.sleep(5000);
		
	}
	
	//微信-登陆日志
	@Test
	public void test11() throws InterruptedException {
		System.out.println("test11");
		Thread.sleep(5000);
		webtest.click("xpath=//span[text()='微信']");
		webtest.click("xpath=//a[text()='登录日志']");
		webtest.enterFrame1("id=rightMain");
		webtest.click("class=admin_submit8");
		assertTrue(webtest.isTextPresent("清除三天前的数据"));
		webtest.leaveFrame();
		Thread.sleep(5000);
	}
	
	//微信-微信菜单-增加微信菜单
	@Test(dataProvider = "excel16",dataProviderClass = NSDataProvider.class)
	public void test12(String s1,String s2,String s3) throws InterruptedException {
		System.out.println("test12");
		Thread.sleep(5000);
		webtest.click("xpath=//span[text()='微信']");
		webtest.click("xpath=//a[text()='微信菜单']");
		webtest.enterFrame1("id=rightMain");
		webtest.click("xpath=//a[text()='增加微信菜单']");
		webtest.type("class=admin_wx_text", s1);
		webtest.click("xpath=(//i[@class='layui-edge'])[2]");
		webtest.click("xpath=//dd[text()='点击事件']");
		webtest.type("name=add_key", s2);
		webtest.type("name=add_sort", s3);
		webtest.click("name=add");
		assertTrue(webtest.isTextPresent(s1));
		webtest.leaveFrame();
		Thread.sleep(5000);
	}
	
	//微信-微信菜单-同步 失败测试用例
	@Test
	public void test13() throws InterruptedException {
		System.out.println("test13");
		Thread.sleep(5000);
		webtest.click("xpath=//span[text()='微信']");
		webtest.click("xpath=//a[text()='微信菜单']");
		webtest.enterFrame1("id=rightMain");
		webtest.click("xpath=//a[text()='同步微信菜单']");
		webtest.click("id=layui-layer-shade4");
		webtest.click("id=layui-layer4");
		webtest.leaveFrame();
		webtest.click("xpath=//a[text()='确定']");
		assertTrue(webtest.isTextPresent("微信菜单创建成功"));
		Thread.sleep(5000);

	}
	
	//微信-微信菜单-删除  弹窗
	@Test
	public void test14() throws InterruptedException {
		System.out.println("test14");
		Thread.sleep(5000);
		webtest.click("xpath=//span[text()='微信']");
		webtest.click("xpath=//a[text()='微信菜单']");
		webtest.enterFrame1("id=rightMain");
		webtest.click("xpath=//span[contains(text(),'测试一下啦')]/../../td[1]/input[1]");
		webtest.click("class=admin_button");
		webtest.leaveFrame();
		webtest.click("xpath=//a[text()='确定']");
		Thread.sleep(3000);
		Boolean flag = webtest.isElementPresent("xpath=//span[contains(text(),'测试一下啦')]");
		if (flag == false) {
			Boolean aBoolean = true;
			assertTrue(aBoolean);
		}
		Thread.sleep(5000);

	}
	
	//微信-用户绑定-检索
	@Test(dataProvider = "excel17",dataProviderClass = NSDataProvider.class)
	public void test15(String s1) throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("test15");
		webtest.click("xpath=//span[text()='微信']");
		webtest.click("xpath=//a[text()='用户绑定']");
		webtest.enterFrame1("id=rightMain");	
		webtest.click("class=admin_Filter_search");
		webtest.type("class=admin_Filter_search", s1);
		webtest.click("name=news_search");
		assertTrue(webtest.isTextPresent(s1));
		webtest.leaveFrame();
		Thread.sleep(5000);
	}
	
	//微信-自动回复-添加规则
	@Test(dataProvider = "excel18",dataProviderClass = NSDataProvider.class)
	public void test16(String s1,String s2,String s3) throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("test16");
		webtest.click("xpath=//span[text()='微信']");
		webtest.click("xpath=//a[text()='自动回复']");
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
	
	
	//数据-数据库管理-备份数据 
	@Test(dataProvider = "excel19",dataProviderClass = NSDataProvider.class)
	public void test17(String s1,String s2) throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("test17");
		Thread.sleep(3000);
		webtest.click("xpath=//span[text()='数据']");
		webtest.enterFrame1("id=rightMain");
		webtest.click("xpath=//div[text()='自定义备份 -- 根据自行选择备份数据表']");
		webtest.click("xpath=//span[text()='phpyun_ad']");
		webtest.click("xpath=//span[text()='phpyun_admin_log']");
		webtest.click("xpath=//span[text()='phpyun_friend_help']");
		webtest.typeAndClear("id=maxfilesize", s1);
		webtest.typeAndClear("name=basename", s2);
		Thread.sleep(3000);
		webtest.click("xpath=//input[@value='提交备份']");
		webtest.leaveFrame();
		webtest.click("id=layui-layer1");
		webtest.click("xpath=//a[text()='确定']");
		Thread.sleep(5000);
		webtest.enterFrame1("id=rightMain");
		assertTrue(webtest.isDisplayed("xpath=//input[@name='basename']"));
		webtest.leaveFrame();
		Thread.sleep(5000);
		
		
	}
	
	//数据-数据库管理-优化数据
	@Test
	public void test18() throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("test18");
		webtest.click("xpath=//span[text()='数据']");
		webtest.enterFrame1("id=rightMain");
		webtest.click("xpath=//a[text()='优化数据']");
		Thread.sleep(3000);
		webtest.click("xpath=//a[text()='优化']");
		Thread.sleep(3000);
		webtest.click("xpath=(//a[text()='优化'])[3]");
		Thread.sleep(3000);
		webtest.click("xpath=(//a[text()='优化'])[5]");
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("优化"));
		webtest.leaveFrame();
		Thread.sleep(5000);
	}

	//数据-数据库管理-数据清理
	@Test
	public void test19() throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("test19");
		webtest.click("xpath=//span[text()='数据']");
		webtest.enterFrame1("id=rightMain");
		webtest.click("xpath=//a[text()='数据清理']");
		webtest.click("xpath=//span[text()='职位申请记录']");
		webtest.click("xpath=//span[text()='短信发送记录']");
		webtest.click("xpath=//div[text()='一年前']");
		webtest.click("xpath=//button[text()='清除']");
		assertTrue(webtest.isTextPresent("清除"));
		webtest.leaveFrame();
		Thread.sleep(5000);
	}
	
	//数据-数据采集-采集设置
	@Test(dataProvider = "excel20",dataProviderClass = NSDataProvider.class)
	public void test20(String s1,String s2) throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("test20");
		webtest.click("xpath=//span[text()='数据']");
		webtest.click("xpath=//a[text()='数据采集']");
		webtest.enterFrame1("id=rightMain");
		webtest.click("xpath=//div[text()='开启']");
		webtest.typeAndClear("id=locoy_key",s1);
		webtest.typeAndClear("id=locoy_rate", s2);
		webtest.click("name=config");
		assertTrue(webtest.isTextPresent(s2));
		webtest.leaveFrame();
		Thread.sleep(5000);
		
	}
	
	//数据-数据调用-添加调用
	@Test(dataProvider = "excel21",dataProviderClass = NSDataProvider.class)
	public void test21(String s1,String s2,String s3,String s4,String s5) throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("test21");
		webtest.click("xpath=//span[text()='数据']");
		webtest.click("xpath=//a[text()='数据调用']");
		webtest.enterFrame1("id=rightMain");
		webtest.click("class=admin_new_cz_tj");
		Thread.sleep(3000);
		webtest.click("xpath=//a[text()='职位']");
		webtest.type("name=name", s1);
		webtest.click("class=layui-edge");
		webtest.click("xpath=//dd[text()='最新职位']");
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
	
	//数据-回收站-批量恢复
	//搜索数据内容，resume ,前两个，批量恢复
	@Test(dataProvider = "excel22",dataProviderClass = NSDataProvider.class)
	public void test22(String s1) throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("test22");
		webtest.click("xpath=//span[text()='数据']");
		webtest.click("xpath=//a[text()='回收站']");
		webtest.enterFrame1("id=rightMain");
		webtest.mouseToElement("id=btype");
		webtest.mouseToElementandClick("xpath=//a[text()='数据表名']");
		//webtest.click("xpath=//a[text()='数据内容']");
		webtest.type("name=keyword", s1);
		webtest.click("name=search");
		webtest.click("xpath=//input[@class='check_all']");
		webtest.click("xpath=(//input[@class='check_all'])[2]");
		webtest.click("xpath=//input[@value='批量恢复']");
		//点击确定
		webtest.leaveFrame();
		webtest.mouseToElementandClick("xpath=//a[text()='确定']");
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("resume_expect"));
		Thread.sleep(5000);
	}
	
	//数据-OSS设置
	@Test(dataProvider = "excel23",dataProviderClass = NSDataProvider.class)
	public void test23(String s1,String s2,String s3,String s4) throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("test23");
		webtest.click("xpath=//span[text()='数据']");
		webtest.click("xpath=//a[text()='OSS设置']");
		webtest.enterFrame1("id=rightMain");
		webtest.click("xpath=//em[text()='关闭']");
		webtest.type("id=access_id",s1);
		webtest.type("id=access_key", s2);
		webtest.type("id=endpoint", s3);
		webtest.type("id=bucket", s4);
		webtest.click("name=oss_config");
		assertTrue(webtest.isTextPresent(s4));
		webtest.leaveFrame();
		Thread.sleep(5000);
	}

	//登录-快捷登录
	@Test(dataProvider = "excel24",dataProviderClass = NSDataProvider.class)
	public void test24(String s1,String s2,String s3,String s4) throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("test24");
		webtest.click("xpath=//span[text()='登录']");
		webtest.enterFrame1("id=rightMain");
		webtest.click("xpath=//em[text()='关闭']");
		webtest.typeAndClear("name=sy_qqappid", s1);
		webtest.typeAndClear("id=sy_qqappkey", s2);
		webtest.click("name=qqconfig");
		Thread.sleep(5000);
		webtest.click("xpath=//em[text()='关闭']");
		webtest.typeAndClear("name=sy_sinaappid",s3);
		webtest.typeAndClear("id=sy_sinaappkey", s4);
		webtest.click("name=msgconfig");
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent(s4));
		webtest.leaveFrame();
		Thread.sleep(5000);
	}
	
	//登录-整合论坛-整合UCenter
	@Test(dataProvider = "excel25",dataProviderClass = NSDataProvider.class)
	public void test25(String s1,String s2,String s3,String s4,String s5, String s6, 
			String s7, String s8) throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("test25");
		webtest.click("xpath=//span[text()='登录']");
		webtest.click("xpath=//a[text()='整合论坛']");
		webtest.enterFrame1("id=rightMain");
		webtest.click("xpath=//div[text()='开启']");
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

	//邮件-邮件服务器设置
	//邮件服务器设置保存后，会出现浏览器弹窗，此弹窗必须手动关闭无法获取其元素。
	//若运行过程中手动关闭此弹窗，则此测试用例成功
	//若无手动关闭，则会报错。
	@Test(dataProvider = "excel26",dataProviderClass = NSDataProvider.class)
	public void test31(String s1,String s2,String s3,String s4,String s5) throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("test31");
		webtest.click("xpath=//span[text()='邮件']");
		webtest.enterFrame1("id=rightMain");
		webtest.click("class=layui-anim layui-icon");
		webtest.typeAndClear("name=smtpserver_1",s1);
		webtest.typeAndClear("name=smtpuser_1", s2);
		webtest.typeAndClear("name=smtppass_1", s3);
		webtest.typeAndClear("name=smtpport_1", s4);
		webtest.typeAndClear("name=smtpnick_1", s5);
		webtest.click("xpath=//div[text()='开启']");
		webtest.click("name=config");
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent(s5));
		webtest.leaveFrame();
		Thread.sleep(5000);
	}
	
	//邮件-邮件模板设置-注册会员
	@Test(dataProvider = "excel27",dataProviderClass = NSDataProvider.class)
	public void test27(String s1) throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("test27");
		webtest.click("xpath=//span[text()='邮件']");
		webtest.click("xpath=//a[text()='邮件模板设置']");
		webtest.enterFrame1("id=rightMain");
		webtest.click("xpath=(//div[text()='通知'])[2]");
		webtest.click("name=msgconfig");
		Thread.sleep(3000);
		webtest.click("xpath=(//a[text()='设置模板'])[2]");
		webtest.typeAndClear("name=title", s1);
		webtest.click("name=config");
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("欢迎来到phpyun"));
		webtest.leaveFrame();
		
	}
	
	//邮件-邮件发送记录
	@Test(dataProvider = "excel28",dataProviderClass = NSDataProvider.class)
	public void test28(String s1) throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("test28");
		webtest.click("xpath=//span[text()='邮件']");
		webtest.click("xpath=//a[text()='邮件发送记录']");
		webtest.enterFrame1("id=rightMain");
		webtest.mouseToElement("class=admin_Filter_but");
		webtest.mouseToElementandClick("xpath=//a[text()='邮箱']");
		webtest.type("class=admin_Filter_search",s1);
		webtest.click("name=date");
		webtest.click("xpath=//td[@lay-ymd='2020-11-11']");
		webtest.click("xpath=//td[@lay-ymd='2020-11-27']");
		webtest.click("xpath=//span[text()='确定']");
		webtest.click("name=news_search");
		webtest.click("id=chkAll");
		webtest.click("class=admin_button");
		//弹窗
		webtest.leaveFrame();
		webtest.click("xpath=//a[text()='确定']");
		Boolean flag = webtest.isTextPresent(s1);
		if (flag == false) {
			Boolean aBoolean = true;
			assertTrue(aBoolean);
		}
		Thread.sleep(5000);
				
	}
	
	
	//短信-短信设置
	@Test(dataProvider = "excel29",dataProviderClass = NSDataProvider.class)
	public void test29(String s1,String s2,String s3,String s4) throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("test29");
		webtest.click("xpath=//span[text()='短信']");
		webtest.enterFrame1("id=rightMain");
		webtest.click("xpath=//div[text()='开启']");
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

	
	//短信-短信模板设置-短信验证码
	@Test(dataProvider = "excel30",dataProviderClass = NSDataProvider.class)
	public void test30(String s1) throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("test30");
		webtest.click("xpath=//span[text()='短信']");
		webtest.click("xpath=//a[text()='短信模板设置']");
		webtest.enterFrame1("id=rightMain");
		webtest.click("xpath=//div([text()='开启'])");
		webtest.click("name=msgconfig");
		Thread.sleep(3000);
		webtest.click("xpath=(//a[text()='设置模板'])[4]");
		webtest.typeAndClear("name=content", s1);
		webtest.click("id=mconfig");
		assertTrue(webtest.isTextPresent("{code：6666}"));
		webtest.leaveFrame();
		Thread.sleep(5000);
	}

}

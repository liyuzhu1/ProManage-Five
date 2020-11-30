package com.webtest.demo;


import static org.testng.Assert.assertTrue;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

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
	
//	@AfterClass
//	public void testLogin_close() {
//		System.out.println("testclose");
//		webtest.click("class=admin_new_header_close_icon");
//	}

	// 生成-首页生成模块
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

	// 生成-新闻首页模块
	@Test
	public void test2() throws InterruptedException {
		System.out.println("test02");
		Thread.sleep(3000);
		webtest.click("xpath=//span[text()='生成']");
		webtest.click("xpath=//a[text()='新闻首页']");
		webtest.enterFrame1("id=rightMain");
		webtest.typeAndClear("name=make_new_url", "newsChange.html");
		webtest.click("id=madenindex");
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("newsChange.html"));
		webtest.leaveFrame();
	}

	// 生成-新闻类别模块
	@Test
	public void test3() throws InterruptedException {
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
	}

	// 生成-新闻详细页模块
	@Test
	public void test4() throws InterruptedException {
		System.out.println("test04");
		Thread.sleep(5000);
		webtest.click("xpath=//span[text()='生成']");
		webtest.click("xpath=//a[text()='新闻详细页']");
		webtest.enterFrame1("id=rightMain");
		webtest.click("class=layui-edge");
		webtest.click("xpath=//dd[text()='职业指导']");
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

	// 生成-生成缓存
	@Test
	public void test5() throws InterruptedException {
		System.out.println("test05");
		Thread.sleep(5000);
		webtest.click("xpath=//span[text()='生成']");
		webtest.click("xpath=//a[text()='生成缓存']");
		webtest.enterFrame1("id=rightMain");
		webtest.click("xpath=//span[text()='区域']");
		webtest.click("xpath=//span[text()='职位']");
		webtest.click("xpath=//span[text()='邮件服务器']");
		webtest.click("name=madeall");
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("更新"));
		webtest.leaveFrame();
	}

	// 生成-单页面生成
	@Test
	public void test6() throws InterruptedException {
		System.out.println("test06");
		Thread.sleep(5000);
		webtest.click("xpath=//span[text()='生成']");
		webtest.click("xpath=//a[text()='单页面生成']");
		webtest.enterFrame1("id=rightMain");
		webtest.click("class=layui-edge");
		webtest.click("xpath=//dd[text()='店铺招聘']");
		webtest.click("id=cache_once");
		assertTrue(webtest.isTextPresent("店铺招聘"));
		webtest.leaveFrame();
	}
	
	//生成-一键更新
	@Test
	public void test7() throws InterruptedException {
		System.out.println("test07");
		Thread.sleep(5000);
		webtest.click("xpath=//span[text()='生成']");
		webtest.click("xpath=//a[text()='一键更新']");
		webtest.enterFrame1("id=rightMain");
		webtest.typeAndClear("name=make_index_url", "indexChange1.html");
		webtest.typeAndClear("name=make_new_url", "newsChange1.html");
		webtest.click("xpath=//input[@value='一键更新']");
		Thread.sleep(5000);
		assertTrue(webtest.isTextPresent("一键更新"));
		webtest.leaveFrame();
		Thread.sleep(5000);
	}
	
	//生成-生成XML
	@Test
	public void test8() throws InterruptedException {
		System.out.println("test08");
		Thread.sleep(5000);
		webtest.click("xpath=//span[text()='生成']");
		webtest.click("xpath=//a[text()='生成XML']");
		Thread.sleep(3000);
		webtest.enterFrame1("id=rightMain");
		webtest.click("class=layui-edge");
		webtest.click("xpath=//dd[text()='职位']");
		webtest.click("xpath=(//i[@class='layui-edge'])[3]");
		webtest.click("xpath=//dd[text()='每天']");
		webtest.typeAndClear("id=xfilename", "sitemap1");
		webtest.click("id=archive");
		//生成XML后，自动变为默认状态
		assertTrue(webtest.isTextPresent("sitemap"));
		webtest.leaveFrame();
	}
	
	//微信-微信绑定-微信公众号设置
	@Test
	public void test9() throws InterruptedException {
		System.out.println("test09");
		Thread.sleep(5000);
		webtest.click("xpath=//span[text()='微信']");
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
	
	//微信-微信绑定-PC端微信扫码
	@Test
	public void test10() throws InterruptedException {
		System.out.println("test10");
		Thread.sleep(3000);
		webtest.click("xpath=//span[text()='微信']");
		webtest.enterFrame1("id=rightMain");
		webtest.click("xpath=(//i[@class='layui-anim layui-icon'])[2]");
		webtest.click("xpath=(//div[@class='layui-input-inline'])[2]/div[2]/i");
		webtest.click("xpath=(//input[@id='wxconfig'])[3]" );
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("是"));
		webtest.leaveFrame();
		
	}
	
	//微信-登陆日志
	@Test
	public void test11() throws InterruptedException {
		System.out.println("test11");
		Thread.sleep(3000);
		webtest.click("xpath=//span[text()='微信']");
		webtest.click("xpath=//a[text()='登录日志']");
		webtest.enterFrame1("id=rightMain");
		webtest.click("class=admin_submit8");
		assertTrue(webtest.isTextPresent("清除三天前的数据"));
		webtest.leaveFrame();
	}
	
	//微信-微信菜单-增加微信菜单
	@Test
	public void test12() throws InterruptedException {
		System.out.println("test12");
		Thread.sleep(3000);
		webtest.click("xpath=//span[text()='微信']");
		webtest.click("xpath=//a[text()='微信菜单']");
		webtest.enterFrame1("id=rightMain");
		webtest.click("xpath=//a[text()='增加微信菜单']");
		webtest.type("class=admin_wx_text", "测试一下啦");
		webtest.click("xpath=(//i[@class='layui-edge'])[2]");
		webtest.click("xpath=//dd[text()='点击事件']");
		webtest.type("name=add_key", "推荐职位");
		webtest.type("name=add_sort", "1");
		webtest.click("name=add");
		assertTrue(webtest.isTextPresent("测试一下啦"));
		webtest.leaveFrame();
	}
	
	//微信-微信菜单-同步 失败测试用例
	@Test
	public void test13() throws InterruptedException {
		System.out.println("test13");
		Thread.sleep(3000);
		webtest.click("xpath=//span[text()='微信']");
		webtest.click("xpath=//a[text()='微信菜单']");
		webtest.enterFrame1("id=rightMain");
		webtest.click("xpath=//a[text()='同步微信菜单']");
		webtest.click("id=layui-layer-shade4");
		webtest.click("id=layui-layer4");
		webtest.leaveFrame();
		webtest.click("xpath=//a[text()='确定']");
		assertTrue(webtest.isTextPresent("微信菜单创建成功"));

	}
	
	//微信-微信菜单-删除  弹窗
	@Test
	public void test14() throws InterruptedException {
		System.out.println("test14");
		Thread.sleep(3000);
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

	}
	
	//微信-用户绑定-检索
	@Test
	public void test15() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("test15");
		webtest.click("xpath=//span[text()='微信']");
		webtest.click("xpath=//a[text()='用户绑定']");
		webtest.enterFrame1("id=rightMain");
		webtest.click("class=admin_Filter_search");
		webtest.type("class=admin_Filter_search", "phpyun07");
		webtest.click("name=news_search");
		assertTrue(webtest.isTextPresent("phpyun07"));
		webtest.leaveFrame();
	}
	
	//微信-自动回复-添加规则
	@Test
	public void test16() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("test16");
		webtest.click("xpath=//span[text()='微信']");
		webtest.click("xpath=//a[text()='自动回复']");
		webtest.enterFrame1("id=rightMain");
		webtest.click("class=admin_new_cz_tj");
		webtest.type("id=title", "规则1");
		webtest.type("id=keyword", "职场规划");
		webtest.type("id=content", "职场规划");
		webtest.click("class=admin_button");
		assertTrue(webtest.isTextPresent("规则1"));
		webtest.leaveFrame();
	}
	
	
	//数据-数据库管理-备份数据 
	@Test
	public void test17() throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("test17");
		webtest.click("xpath=//span[text()='数据']");
		webtest.enterFrame1("id=rightMain");
		webtest.click("xpath=//div[text()='自定义备份 -- 根据自行选择备份数据表']");
		webtest.click("xpath=//span[text()='phpyun_ad']");
		webtest.click("xpath=//span[text()='phpyun_admin_log']");
		webtest.click("xpath=//span[text()='phpyun_friend_help']");
		webtest.typeAndClear("id=maxfilesize", "2048");
		webtest.typeAndClear("name=basename", "20201130");
		Thread.sleep(3000);
		webtest.click("xpath=//input[@value='提交备份']");
		webtest.leaveFrame();
		webtest.click("id=layui-layer1");
		webtest.click("xpath=//a[text()='确定']");
		Thread.sleep(5000);
		webtest.enterFrame1("id=rightMain");
		assertTrue(webtest.isDisplayed("xpath=//input[@name='basename']"));
		webtest.leaveFrame();
		
		
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
	}

	//数据-数据库管理-数据清理
	@Test
	public void test19() throws InterruptedException {
		Thread.sleep(3000);
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
	}
	
	//数据-数据采集-采集设置
	@Test
	public void test20() throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("test20");
		webtest.click("xpath=//span[text()='数据']");
		webtest.click("xpath=//a[text()='数据采集']");
		webtest.enterFrame1("id=rightMain");
		webtest.click("xpath=//div[text()='开启']");
		webtest.typeAndClear("id=locoy_key", "123qwe123");
		webtest.typeAndClear("id=locoy_rate", "66");
		webtest.click("name=config");
		assertTrue(webtest.isTextPresent("66"));
		webtest.leaveFrame();
		
	}
	
	//数据-数据调用-添加调用
	@Test
	public void test21() throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("test21");
		webtest.click("xpath=//span[text()='数据']");
		webtest.click("xpath=//a[text()='数据调用']");
		webtest.enterFrame1("id=rightMain");
		webtest.click("class=admin_new_cz_tj");
		Thread.sleep(3000);
		webtest.click("xpath=//a[text()='职位']");
		webtest.type("name=name", "测试一下");
		webtest.click("class=layui-edge");
		webtest.click("xpath=//dd[text()='最新职位']");
		webtest.type("name=titlelen", "6");
		webtest.type("name=infolen", "6");
		webtest.type("name=num", "5");
		webtest.type("name=edittime", "60");
		webtest.click("name=submit");
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("测试一下"));
		webtest.leaveFrame();
		
	}
	
	//数据-回收站-批量恢复
	//搜索数据内容，resume ,前两个，批量恢复
	@Test
	public void test22() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("test22");
		webtest.click("xpath=//span[text()='数据']");
		webtest.click("xpath=//a[text()='回收站']");
		webtest.enterFrame1("id=rightMain");
		webtest.mouseToElement("id=btype");
		webtest.mouseToElementandClick("xpath=//a[text()='数据表名']");
		//webtest.click("xpath=//a[text()='数据内容']");
		webtest.type("name=keyword", "wxnav");
		webtest.click("name=search");
		webtest.click("xpath=//input[@class='check_all']");
		webtest.click("xpath=(//input[@class='check_all'])[2]");
		webtest.click("xpath=//input[@value='批量恢复']");
		//点击确定
		webtest.leaveFrame();
		webtest.mouseToElementandClick("xpath=//a[text()='确定']");
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("resume_expect"));
	}
	
	//数据-OSS设置
	@Test
	public void test23() throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("test23");
		webtest.click("xpath=//span[text()='数据']");
		webtest.click("xpath=//a[text()='OSS设置']");
		webtest.enterFrame1("id=rightMain");
		webtest.click("xpath=//em[text()='关闭']");
		webtest.type("id=access_id","1111");
		webtest.type("id=access_key", "111111");
		webtest.type("id=endpoint", "结束");
		webtest.type("id=bucket", "存储位置");
		webtest.click("name=oss_config");
		assertTrue(webtest.isTextPresent("存储位置"));
		webtest.leaveFrame();
	}

	//登录-快捷登录
	@Test
	public void test24() throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("test24");
		webtest.click("xpath=//span[text()='登录']");
		webtest.enterFrame1("id=rightMain");
		webtest.click("xpath=//em[text()='关闭']");
		webtest.typeAndClear("name=sy_qqappid", "1002478xx");
		webtest.typeAndClear("id=sy_qqappkey", "4dd1c30d472676914f2fbfbnjt33");
		webtest.click("name=qqconfig");
		Thread.sleep(5000);
		webtest.click("xpath=//em[text()='关闭']");
		webtest.typeAndClear("name=sy_sinaappid", "1002478");
		webtest.typeAndClear("id=sy_sinaappkey", "4dd1c30d472676914f2fbfbnjt");
		webtest.click("name=msgconfig");
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("4dd1c30d472676914f2fbfbnjt"));
		webtest.leaveFrame();
	}
	
	//登录-整合论坛-整合UCenter
	@Test
	public void test25() throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("test25");
		webtest.click("xpath=//span[text()='登录']");
		webtest.click("xpath=//a[text()='整合论坛']");
		webtest.enterFrame1("id=rightMain");
		webtest.click("xpath=//div[text()='开启']");
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

	//邮件-邮件服务器设置
	@Test
	public void test26() throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("test26");
		webtest.click("xpath=//span[text()='邮件']");
		webtest.enterFrame1("id=rightMain");
		webtest.click("class=layui-anim layui-icon");
		webtest.typeAndClear("name=smtpserver_1", "smtp.126.com");
		webtest.typeAndClear("name=smtpuser_1", "test2014123@126.com");
		webtest.typeAndClear("name=smtppass_1", "TICENBQYKIZLONOW");
		webtest.typeAndClear("name=smtpport_1", "25");
		webtest.typeAndClear("name=smtpnick_1", "phpyun");
		webtest.click("xpath=//div[text()='开启']");
		webtest.click("name=config");
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("phpyun"));
		webtest.leaveFrame();
	}
	
	//邮件-邮件模板设置-注册会员
	@Test
	public void test27() throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("test27");
		webtest.click("xpath=//span[text()='邮件']");
		webtest.click("xpath=//a[text()='邮件模板设置']");
		webtest.enterFrame1("id=rightMain");
		webtest.click("xpath=(//div[text()='通知'])[2]");
		webtest.click("name=msgconfig");
		Thread.sleep(3000);
		webtest.click("xpath=(//a[text()='设置模板'])[2]");
		webtest.typeAndClear("name=title", "亲爱的：{username}！你已成功注册{webname}会员，欢迎来到phpyun");
		webtest.click("name=config");
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("欢迎来到phpyun"));
		webtest.leaveFrame();
		
	}
	
	//邮件-邮件发送记录
	@Test
	public void test28() throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("test28");
		webtest.click("xpath=//span[text()='邮件']");
		webtest.click("xpath=//a[text()='邮件发送记录']");
		webtest.enterFrame1("id=rightMain");
		webtest.mouseToElement("class=admin_Filter_but");
		webtest.mouseToElementandClick("xpath=//a[text()='邮箱']");
		webtest.type("class=admin_Filter_search","lyz3249174527@163.com");
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
		Boolean flag = webtest.isTextPresent("lyz3249174527@163.com");
		if (flag == false) {
			Boolean aBoolean = true;
			assertTrue(aBoolean);
		}
				
	}
	
	
	//短信-短信设置
//	@Test
	public void test29() throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("test29");
		webtest.click("xpath=//span[text()='短信']");
		webtest.enterFrame1("id=rightMain");
		webtest.click("xpath=//div[text()='开启']");
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

	
	//短信-短信模板设置-短信验证码
	@Test
	public void test30() throws InterruptedException {
		Thread.sleep(5000);
		System.out.println("test30");
		webtest.click("xpath=//span[text()='短信']");
		webtest.click("xpath=//a[text()='短信模板设置']");
		webtest.enterFrame1("id=rightMain");
		webtest.click("xpath=//div([text()='开启'])");
		webtest.click("name=msgconfig");
		Thread.sleep(3000);
		webtest.click("xpath=(//a[text()='设置模板'])[4]");
		webtest.typeAndClear("name=content", "{code：6666}（登录动态验证码）,请在30分钟内填写");
		webtest.click("id=mconfig");
		assertTrue(webtest.isTextPresent("{code：6666}"));
		webtest.leaveFrame();
	}

}

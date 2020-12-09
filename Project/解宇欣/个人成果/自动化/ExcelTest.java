package com.webtest.xieyuxin;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.dataprovider.NSDataProviderXieyuxin;;

public class ExcelTest extends BaseTest {

	// 点击主页左侧的广告框,跳转至手机版PHPYUN介绍页面
	@Test
	public void test1() throws InterruptedException {
		webtest.open("");
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[11]/div[1]/div[1]/a/img");
		assertTrue(webtest.isTextPresent("首页"));
		Thread.sleep(2000);
	}

	// 点击关闭主页左侧广告框
	@Test
	public void test2() throws InterruptedException {
		webtest.open("");
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[11]/div[1]/div[2]/div");
		assertTrue(webtest.isTextPresent("首页"));
		Thread.sleep(2000);
	}

	// 注册成功-userttt
	@Test(dataProvider = "excel6", dataProviderClass = NSDataProviderXieyuxin.class)
	public void test6(String s1, String s2,String s3, String s4) throws InterruptedException {
		webtest.open("");
		Thread.sleep(1000);
		webtest.click("class=tip_bottom_login");
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()='注册账号']");
		Thread.sleep(2000);
		webtest.type("id=username1", s1);
		webtest.type("id=CheckCode", s2);
		webtest.type("id=password", s3);
		webtest.type("id=passconfirm", s4);
		webtest.click("id=subreg");
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()='返回首页']");
		assertTrue(webtest.isTextPresent("首页"));
		Thread.sleep(2000);
	}

	// 登录失败
	@Test(dataProvider = "excel4", dataProviderClass = NSDataProviderXieyuxin.class)
	public void test4(String s1, String s2) throws InterruptedException {
		webtest.open("");
		Thread.sleep(1000);
		
		webtest.click("xpath=//a[text()='[安全退出]']");
		Thread.sleep(2000);
		
		webtest.click("class=tip_bottom_login");
		Thread.sleep(2000);
		webtest.type("id=username", s1);
		Thread.sleep(2000);
		webtest.click("id=password2");
		webtest.type("id=password", s2);
		webtest.click("id=sublogin");
		assertTrue(webtest.isTextPresent("首页"));
		Thread.sleep(2000);
	}

	// 返回首页
	@Test
	public void test5() throws InterruptedException {
		webtest.open("");
		Thread.sleep(1000);
		webtest.click("class=tip_bottom_login");
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()='返回网站首页>>']");
		assertTrue(webtest.isTextPresent("首页"));
		Thread.sleep(2000);
	}

	// 登陆成功-username3
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
		assertTrue(webtest.isTextPresent("首页"));
		Thread.sleep(2000);
		
		webtest.click("xpath=//a[text()='[安全退出]']");
		Thread.sleep(2000);
		
	}

	// 登录-注册账号-直接登录
	@Test(dataProvider = "excel7", dataProviderClass = NSDataProviderXieyuxin.class)
	public void test7(String s1, String s2) throws InterruptedException {
		webtest.open("");
		Thread.sleep(1000);
		webtest.click("class=tip_bottom_login");
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()='注册账号']");
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()='直接登录>']");
		Thread.sleep(2000);
		webtest.type("id=username", s1);
		Thread.sleep(2000);
		webtest.click("id=password2");
		webtest.type("id=password", s2);
		webtest.click("id=sublogin");
		assertTrue(webtest.isTextPresent("首页"));
		Thread.sleep(2000);
	}

	// 快速注册成功
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
		webtest.click("xpath=//a[text()='返回首页']");
		assertTrue(webtest.isTextPresent("首页"));
		Thread.sleep(2000);
	}

	// 显示密码
	@Test(dataProvider = "excel9", dataProviderClass = NSDataProviderXieyuxin.class)
	public void test9(String s1) throws InterruptedException {
		webtest.open("");
		Thread.sleep(1000);
		webtest.click("class=tip_bottom_reg");
		Thread.sleep(2000);
		webtest.type("id=password", s1);
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()='显示密码']");
		assertTrue(webtest.isTextPresent("显示"));
		Thread.sleep(2000);
	}

	// 关闭底部广告框
	@Test
	public void test10() throws InterruptedException {
		webtest.open("");
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[7]/div/div[2]/div/div[2]/a");
		assertTrue(webtest.isTextPresent("首页"));
		Thread.sleep(2000);
	}

	// 底部链接跳转-关于我们-关于我们
	@Test
	public void test11() throws InterruptedException {
		webtest.open("");
		Thread.sleep(1000);
		webtest.runJs("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()='关于我们']");
		assertTrue(webtest.isTextPresent("关于我们"));
		Thread.sleep(2000);
	}

	// 底部链接跳转-关于我们-注册协议
	@Test
	public void test12() throws InterruptedException {
		webtest.open("");
		Thread.sleep(1000);
		webtest.runJs("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()='注册协议']");
		assertTrue(webtest.isTextPresent("注册协议"));
		Thread.sleep(2000);
	}

	// 底部链接跳转-网站特色-排行榜
	@Test
	public void test13() throws InterruptedException {
		webtest.open("");
		Thread.sleep(1000);
		webtest.runJs("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()='排行榜']");
		assertTrue(webtest.isTextPresent("排行榜"));
		Thread.sleep(2000);
	}

	// 底部链接跳转-网站特色-排行榜-查看公司详情
	@Test
	public void test14() throws InterruptedException {
		webtest.open("");
		Thread.sleep(1000);
		webtest.runJs("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()='排行榜']");
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()='霸王科技有限公司']");
		assertTrue(webtest.isTextPresent("霸王"));
		Thread.sleep(2000);
	}

	// 底部链接跳转-网站特色-求职测评
	@Test
	public void test15() throws InterruptedException {
		webtest.open("");
		Thread.sleep(1000);
		webtest.runJs("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()='求职测评']");
		assertTrue(webtest.isTextPresent("测评"));
		Thread.sleep(2000);
	}

	// 底部链接跳转-网站特色-订阅服务
	@Test
	public void test16() throws InterruptedException {
		webtest.open("");
		Thread.sleep(1000);
		webtest.runJs("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()='订阅服务']");
		assertTrue(webtest.isTextPresent("Return Home"));
		Thread.sleep(2000);
	}

	// 底部链接跳转-咨询反馈-客服中心
	@Test
	public void test17() throws InterruptedException {
		webtest.open("");
		Thread.sleep(1000);
		webtest.runJs("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()='客服中心']");
		assertTrue(webtest.isTextPresent("客服中心"));
		Thread.sleep(2000);
	}

	// 底部链接跳转-咨询反馈-常见问题
	@Test
	public void test18() throws InterruptedException {
		webtest.open("");
		Thread.sleep(1000);
		webtest.runJs("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()='常见问题']");
		assertTrue(webtest.isTextPresent("常见问题"));
		Thread.sleep(2000);
	}

	// 后台-会员-会员列表-修改-修改密码
	@Test(dataProvider = "excel19", dataProviderClass = NSDataProviderXieyuxin.class)
	public void test19(String s1, String s2, String s3, String s4) throws InterruptedException {
		webtest.open("/admin");
		Thread.sleep(1000);
		webtest.type("id=username", s1);
		webtest.type("id=password", s2);
		webtest.click("xpath=//input[@type='submit']");
		webtest.click("xpath=//a[text()='会员']");
		Thread.sleep(2000);

		webtest.enterFrame1("name=right");
		webtest.click("name=keyword");
		webtest.type("name=keyword", s3);
		webtest.click("name=search");
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()='修改']");

		webtest.type("name=password", s4);
		Thread.sleep(2000);
		webtest.runJs("window.scrollTo(0,document.body.scrollHeight)");
		webtest.click("name=submit");
		assertTrue(webtest.isTextPresent("修改"));
		Thread.sleep(2000);
	}

	// 后台-会员-会员列表-修改-修改邮箱
	@Test(dataProvider = "excel20", dataProviderClass = NSDataProviderXieyuxin.class)
	public void test20(String s1, String s2, String s3, String s4) throws InterruptedException {
		webtest.open("/admin");
		Thread.sleep(1000);
		webtest.type("id=username", s1);
		webtest.type("id=password", s2);
		webtest.click("xpath=//input[@type='submit']");
		webtest.click("xpath=//a[text()='会员']");
		Thread.sleep(2000);

		webtest.enterFrame1("name=right");
		webtest.click("name=keyword");
		webtest.type("name=keyword", s3);
		webtest.click("name=search");
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()='修改']");

		webtest.typeAndClear("name=email", "");
		Thread.sleep(2000);
		webtest.type("name=email", s4);
		Thread.sleep(2000);
		webtest.runJs("window.scrollTo(0,document.body.scrollHeight)");
		webtest.click("name=submit");
		assertTrue(webtest.isTextPresent("修改"));
		Thread.sleep(2000);
	}

	// 后台-会员-会员列表-修改-关闭操作提示
	@Test(dataProvider = "excel21", dataProviderClass = NSDataProviderXieyuxin.class)
	public void test21(String s1, String s2) throws InterruptedException {
		webtest.open("/admin");
		Thread.sleep(1000);
		webtest.type("id=username", s1);
		webtest.type("id=password", s2);
		webtest.click("xpath=//input[@type='submit']");
		webtest.click("xpath=//a[text()='会员']");
		Thread.sleep(2000);

		webtest.enterFrame1("name=right");
		webtest.click("class=admin_new_tip_close");
		assertTrue(webtest.isTextPresent("修改"));
		Thread.sleep(2000);
	}

	// 后台-会员-会员列表-修改-重置修改
	@Test(dataProvider = "excel22", dataProviderClass = NSDataProviderXieyuxin.class)
	public void test22(String s1, String s2, String s3, String s4) throws InterruptedException {
		webtest.open("/admin");
		Thread.sleep(1000);
		webtest.type("id=username", s1);
		webtest.type("id=password", s2);
		webtest.click("xpath=//input[@type='submit']");
		webtest.click("xpath=//a[text()='会员']");
		Thread.sleep(2000);

		webtest.enterFrame1("name=right");
		webtest.click("name=keyword");
		webtest.type("name=keyword", s3);
		webtest.click("name=search");
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()='修改']");

		webtest.typeAndClear("name=username", "");
		Thread.sleep(2000);
		webtest.type("id=username", s4);
		Thread.sleep(2000);
		webtest.runJs("window.scrollTo(0,document.body.scrollHeight)");
		webtest.click("name=reset");
		webtest.runJs("window.scrollTo(0,0)");
		assertTrue(webtest.isTextPresent("用户名"));
		Thread.sleep(2000);
	}

	// 后台-会员-会员列表-重置密码
	@Test(dataProvider = "excel23", dataProviderClass = NSDataProviderXieyuxin.class)
	public void test23(String s1, String s2, String s3) throws InterruptedException {
		webtest.open("/admin");
		Thread.sleep(1000);
		webtest.type("id=username", s1);
		webtest.type("id=password", s2);
		webtest.click("xpath=//input[@type='submit']");
		webtest.click("xpath=//a[text()='会员']");
		Thread.sleep(2000);

		webtest.enterFrame1("name=right");
		webtest.click("name=keyword");
		webtest.type("name=keyword", s3);
		webtest.click("name=search");
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()='密码']");

		webtest.leaveFrame();
		webtest.click("xpath=//a[text()='确定']");
		assertTrue(webtest.isTextPresent("密码"));
		Thread.sleep(2000);
	}

	// 后台-会员-企业-企业管理-用户名搜索
	@Test(dataProvider = "excel24", dataProviderClass = NSDataProviderXieyuxin.class)
	public void test24(String s1, String s2, String s3) throws InterruptedException {
		webtest.open("/admin");
		Thread.sleep(1000);
		webtest.type("id=username", s1);
		webtest.type("id=password", s2);
		webtest.click("xpath=//input[@type='submit']");
		webtest.click("xpath=//a[text()='会员']");
		webtest.click("xpath=//span[text()='企业']");
		Thread.sleep(2000);

		webtest.enterFrame1("name=right");
		webtest.click("name=keyword");
		webtest.type("name=keyword", s3);
		Thread.sleep(2000);
		webtest.click("class=admin_new_bth");
		assertTrue(webtest.isTextPresent("打工人"));
		Thread.sleep(2000);
	}

	// 后台-会员-企业-企业管理-日志
	@Test(dataProvider = "excel25", dataProviderClass = NSDataProviderXieyuxin.class)
	public void test25(String s1, String s2, String s3) throws InterruptedException {
		webtest.open("/admin");
		Thread.sleep(1000);
		webtest.type("id=username", s1);
		webtest.type("id=password", s2);
		webtest.click("xpath=//input[@type='submit']");
		webtest.click("xpath=//a[text()='会员']");
		webtest.click("xpath=//span[text()='企业']");
		Thread.sleep(2000);

		webtest.enterFrame1("name=right");
		webtest.click("name=keyword");
		webtest.type("name=keyword", s3);
		Thread.sleep(2000);
		webtest.runJs("window.scrollTo(0,document.body.scrollHeight)");
		webtest.click("xpath=//a[text()='日志']");
		assertTrue(webtest.isTextPresent("会员日志"));
		Thread.sleep(2000);
	}

	// 后台-会员-企业-企业管理-更多
	@Test(dataProvider = "excel26", dataProviderClass = NSDataProviderXieyuxin.class)
	public void test26(String s1, String s2, String s3) throws InterruptedException {
		webtest.open("/admin");
		Thread.sleep(1000);
		webtest.type("id=username", s1);
		webtest.type("id=password", s2);
		webtest.click("xpath=//input[@type='submit']");
		webtest.click("xpath=//a[text()='会员']");
		webtest.click("xpath=//span[text()='企业']");
		Thread.sleep(2000);

		webtest.enterFrame1("name=right");
		webtest.click("name=keyword");
		webtest.type("name=keyword", s3);
		Thread.sleep(2000);
		webtest.runJs("window.scrollTo(0,document.body.scrollHeight)");
		webtest.click("xpath=//a[text()='更多']");
		assertTrue(webtest.isTextPresent("联系方式"));
		Thread.sleep(2000);
	}

	// LOGO跳转
	@Test
	public void test27() throws InterruptedException {
		webtest.open("");
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[4]/div[1]/div[1]/div/a/img");
		assertTrue(webtest.isTextPresent("首页"));
		Thread.sleep(2000);
	}

	// banner跳转
	@Test
	public void test28() throws InterruptedException {
		webtest.open("");
		Thread.sleep(1000);
		webtest.click("id=test1");
		assertTrue(webtest.isTextPresent("首页"));
		Thread.sleep(2000);
	}

	// 友情链接-PHPYUN人才系统
	@Test
	public void test29() throws InterruptedException {
		webtest.open("");
		Thread.sleep(1000);
		webtest.runJs("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()='PHPYUN人才系统']");
		assertTrue(webtest.isTextPresent("首页"));
		Thread.sleep(2000);
	}

	// 友情链接-HR135人才网
	@Test
	public void test30() throws InterruptedException {
		webtest.open("");
		Thread.sleep(1000);
		webtest.runJs("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()='HR135人才网']");
		assertTrue(webtest.isTextPresent("首页"));
		Thread.sleep(2000);
	}

	// 友情链接-PHPYUN论坛
	@Test
	public void test31() throws InterruptedException {
		webtest.open("");
		Thread.sleep(1000);
		webtest.runJs("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()='PHPYUN论坛']");
		assertTrue(webtest.isTextPresent("首页"));
		Thread.sleep(2000);
	}

	// 友情链接-申请链接
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
		webtest.click("xpath=//a[text()='文字链接']");
		webtest.type("name=title", s1);
		webtest.type("name=url", s2);
		webtest.type("id=txt_CheckCode", s3);
		webtest.click("class=login_button2");
		assertTrue(webtest.isTextPresent("链接"));
		Thread.sleep(2000);
	}

	// 友情链接-更多
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
		webtest.click("xpath=//a[text()='文字链接']");
		webtest.type("name=title", s1);
		webtest.type("name=url", s2);
		webtest.type("id=txt_CheckCode", s3);
		webtest.click("class=login_button2");
		assertTrue(webtest.isTextPresent("链接"));
		Thread.sleep(2000);
	}

	// 返回顶部 (关闭右侧广告框
	@Test
	public void test34() throws InterruptedException {
		webtest.open("");
		Thread.sleep(1000);
		webtest.runJs("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		webtest.click("xpath=/html/body/div[16]/a[3]");
		assertTrue(webtest.isTextPresent("首页"));
		Thread.sleep(2000);
	}

	// 意见反馈
	@Test
	public void test35() throws InterruptedException {
		webtest.open("");
		Thread.sleep(1000);
		webtest.runJs("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		webtest.click("xpath=/html/body/div[16]/a[2]");
		Thread.sleep(2000);
		assertTrue(webtest.isTextPresent("首页"));
		Thread.sleep(2000);
	}

	// 二维码
	@Test
	public void test36() throws InterruptedException {
		webtest.open("");
		Thread.sleep(1000);
		webtest.runJs("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		webtest.click("xpath=/html/body/div[16]/a[1]");
		assertTrue(webtest.isTextPresent("PHPYUN"));
		Thread.sleep(2000);
	}

	// 顶部banner跳转
	@Test
	public void test37() throws InterruptedException {
		webtest.open("");
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[4]/div[1]/div[1]/div/a/img");
		assertTrue(webtest.isTextPresent("首页"));
		Thread.sleep(2000);
	}

	// 紧急招聘-查看更多职位
	@Test
	public void test38() throws InterruptedException {
		webtest.open("");
		Thread.sleep(1000);
		webtest.runJs("window.scrollTo(0,100)");
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()='查看更多职位>']");
		
		Thread.sleep(2000);
	}

	// 网站公告-更多
	@Test
	public void test39() throws InterruptedException {
		webtest.open("");
		Thread.sleep(1000);
		webtest.runJs("window.scrollTo(0,100)");
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()='更多>>']");
		assertTrue(webtest.isTextPresent("网站公告"));
		Thread.sleep(2000);
	}

	// 名企招聘-更多名企
	@Test
	public void test40() throws InterruptedException {
		webtest.open("");
		Thread.sleep(1000);
		webtest.runJs("window.scrollTo(0,300)");
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()='更多名企 >']");
		assertTrue(webtest.isTextPresent("找企业"));
		Thread.sleep(2000);
	}

	// 名企招聘-热搜职位-更多
	@Test
	public void test41() throws InterruptedException {
		webtest.open("");
		Thread.sleep(1000);
		webtest.runJs("window.scrollTo(0,800)");
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()='查看更多>']");
		assertTrue(webtest.isTextPresent("首页"));
		Thread.sleep(2000);
	}

	// 名企招聘-img跳转
	@Test
	public void test42() throws InterruptedException {
		webtest.open("");
		Thread.sleep(1000);
		webtest.runJs("window.scrollTo(0,200)");
		Thread.sleep(2000);
		webtest.click("class=layui-this");
		assertTrue(webtest.isTextPresent("首页"));
		Thread.sleep(2000);
	}

	// 热招职位-更多
	@Test
	public void test43() throws InterruptedException {
		webtest.open("");
		Thread.sleep(1000);
		webtest.runJs("window.scrollTo(0,1000)");
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()='更多职位 >']");
		assertTrue(webtest.isTextPresent("找工作"));
		Thread.sleep(2000);
	}

	// 热招职位-职位详情
	@Test
	public void test44() throws InterruptedException {
		webtest.open("");
		Thread.sleep(1000);
		webtest.runJs("window.scrollTo(0,1200)");
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()='电信网络工程师']");
		assertTrue(webtest.isTextPresent("首页"));
		Thread.sleep(2000);
	}

	// 热招人才-翻页
	@Test
	public void test45() throws InterruptedException {
		webtest.open("");
		Thread.sleep(1000);
		webtest.runJs("window.scrollTo(0,2000)");
		Thread.sleep(2000);
		webtest.click("id=btnr");
		assertTrue(webtest.isTextPresent("最新简历"));
		Thread.sleep(2000);
	}

	// 后台-用户名搜索
	@Test(dataProvider = "excel46", dataProviderClass = NSDataProviderXieyuxin.class)
	public void test46(String s1, String s2, String s3) throws InterruptedException {
		webtest.open("/admin");
		Thread.sleep(1000);
		webtest.type("id=username", s1);
		webtest.type("id=password", s2);
		webtest.click("xpath=//input[@type='submit']");
		webtest.click("xpath=//a[text()='会员']");
		Thread.sleep(2000);
		webtest.enterFrame1("name=right");
		webtest.click("name=keyword");
		webtest.type("name=keyword", s3);
		webtest.click("name=search");
		assertTrue(webtest.isTextPresent("赵六"));
		Thread.sleep(2000);
	}

	// 后台-手机号搜索
	@Test(dataProvider = "excel47", dataProviderClass = NSDataProviderXieyuxin.class)
	public void test47(String s1, String s2, String s3) throws InterruptedException {
		webtest.open("/admin");
		Thread.sleep(1000);
		webtest.type("id=username", s1);
		webtest.type("id=password", s2);
		webtest.click("xpath=//input[@type='submit']");
		webtest.click("xpath=//a[text()='会员']");
		Thread.sleep(2000);
		webtest.enterFrame1("name=right");
		webtest.mouseToElement("id=bkeytype");
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()='手机号']");
		webtest.click("name=keyword");
		webtest.type("name=keyword", s3);
		webtest.click("name=search");
		assertTrue(webtest.isTextPresent("180"));
		Thread.sleep(2000);
	}

	// 后台-删除会员
	@Test(dataProvider = "excel48", dataProviderClass = NSDataProviderXieyuxin.class)
	public void test48(String s1, String s2, String s3) throws InterruptedException {
		webtest.open("/admin");
		Thread.sleep(1000);
		webtest.type("id=username", s1);
		webtest.type("id=password", s2);
		webtest.click("xpath=//input[@type='submit']");
		webtest.click("xpath=//a[text()='会员']");
		Thread.sleep(2000);

		webtest.enterFrame1("name=right");
		webtest.click("name=keyword");
		webtest.type("name=keyword", s3);
		webtest.click("name=search");
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()='删除']");
		webtest.leaveFrame();
		webtest.click("xpath=//a[text()='确定']");
		assertTrue(webtest.isTextPresent("用户"));
		Thread.sleep(2000);

	}

	// 后台-全选
	@Test(dataProvider = "excel49", dataProviderClass = NSDataProviderXieyuxin.class)
	public void test49(String s1, String s2) throws InterruptedException {
		webtest.open("/admin");
		Thread.sleep(1000);
		webtest.type("id=username", s1);
		webtest.type("id=password", s2);
		webtest.click("xpath=//input[@type='submit']");
		webtest.click("xpath=//a[text()='会员']");
		Thread.sleep(2000);
		webtest.enterFrame1("name=right");
		webtest.runJs("window.scrollTo(0,document.body.scrollHeight)");
		webtest.click("id=chkAll2");
		assertTrue(webtest.isTextPresent("用户"));
		Thread.sleep(2000);
	}

	// 后台-高级搜索
	@Test(dataProvider = "excel50", dataProviderClass = NSDataProviderXieyuxin.class)
	public void test50(String s1, String s2) throws InterruptedException {
		webtest.open("/admin");
		Thread.sleep(1000);
		webtest.type("id=username", s1);
		webtest.type("id=password", s2);
		webtest.click("xpath=//input[@type='submit']");
		webtest.click("xpath=//a[text()='会员']");
		Thread.sleep(2000);
		webtest.enterFrame1("name=right");
		webtest.click("xpath=//a[text()='高级搜索']");
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()='收起更多条件']");
		Thread.sleep(2000);
	}
}

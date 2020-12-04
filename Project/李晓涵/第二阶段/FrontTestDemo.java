package com.webtest.demo;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class FrontTestDemo extends BaseTest {
//	网站登录
	@BeforeClass
	public void test_login() throws InterruptedException {
		webtest.open("");
		Thread.sleep(2000);
	}

//	43、职场资讯，查看新闻
	@Test
	public void test1() throws InterruptedException {
		Thread.sleep(2000);
		webtest.mouseToElement("xpath=//a[text()='网站导航']");
		webtest.mouseToElementandClick("xpath=//a[text()='职场资讯']");
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()='这是一则新闻']");
		Thread.sleep(1000);
		webtest.isDisplayed("class=news_index_today_hot_s");
		webtest.click("xpath=//a[text()=' 首页 ']");
	}

//	44、职场资讯，返回首页
	@Test
	public void test2() throws InterruptedException {
		Thread.sleep(2000);
		webtest.mouseToElement("xpath=//a[text()='网站导航']");
		webtest.mouseToElementandClick("xpath=//a[text()='职场资讯']");
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()=' 首页 ']");
		Thread.sleep(1000);
		webtest.isDisplayed("class=yun_new_left");
	}

//	45、招聘会，往期回顾
	@Test
	public void test3() throws InterruptedException {
		Thread.sleep(2000);
		webtest.mouseToElement("xpath=//a[text()='网站导航']");
		webtest.mouseToElementandClick("xpath=//a[text()='招聘会']");
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()='更多往期回顾>>']");
		Thread.sleep(1000);
		webtest.isDisplayed("xpath=//a[text()=' 首页 ']");
		webtest.click("xpath=//a[text()=' 首页 ']");
	}

//	46、专题招聘
	@Test
	public void test4() throws InterruptedException {
		Thread.sleep(2000);
		webtest.mouseToElement("xpath=//a[text()='网站导航']");
		webtest.mouseToElementandClick("xpath=//a[text()='专题招聘']");
		Thread.sleep(2000);
		webtest.isDisplayed("xpath=//a[text()=' 首页 ']");
		webtest.click("xpath=//a[text()=' 首页 ']");
	}

//	47、职业测评
	@Test
	public void test5() throws InterruptedException {
		Thread.sleep(2000);
		webtest.mouseToElement("xpath=//a[text()='网站导航']");
		webtest.mouseToElementandClick("xpath=//a[text()='职业测评']");
		Thread.sleep(2000);
		webtest.isDisplayed("xpath=//a[text()=' 首页 ']");
		webtest.click("xpath=//a[text()=' 首页 ']");
	}

//	48、积分商城
	@Test
	public void test6() throws InterruptedException {
		Thread.sleep(2000);
		webtest.mouseToElement("xpath=//a[text()='网站导航']");
		webtest.mouseToElementandClick("xpath=//a[text()='积分商城']");
		Thread.sleep(2000);
		webtest.isDisplayed("xpath=//a[text()=' 首页 ']");
		webtest.click("xpath=//a[text()=' 首页 ']");
	}

//	49、积分商城，找工作
	@Test
	public void test7() throws InterruptedException {
		Thread.sleep(2000);
		webtest.mouseToElement("xpath=//a[text()='网站导航']");
		webtest.mouseToElementandClick("xpath=//a[text()='积分商城']");
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()=' 找工作 ']");
		Thread.sleep(1000);
		webtest.click("xpath=//a[text()='公务员/翻译/其他']");
		Thread.sleep(1000);
		webtest.isDisplayed("xpath=//a[text()=' 首页 ']");
		webtest.click("xpath=//a[text()=' 首页 ']");
	}

//	50、积分商城，找人才
	@Test
	public void test8() throws InterruptedException {
		Thread.sleep(2000);
		webtest.mouseToElement("xpath=//a[text()='网站导航']");
		webtest.mouseToElementandClick("xpath=//a[text()='积分商城']");
		Thread.sleep(2000);
		webtest.click("xpath=//a[text()=' 找人才 ']");
		Thread.sleep(1000);
		webtest.click("xpath=//a[text()='公务员/翻译/其他']");
		Thread.sleep(1000);
		webtest.isDisplayed("xpath=//a[text()=' 首页 ']");
		webtest.click("xpath=//a[text()=' 首页 ']");
	}

//	42、登录前端
	@Test
	public void test9() throws InterruptedException {
		webtest.mouseToElementandClick("xpath=//a[text()='用户登录']");
		Thread.sleep(1000);
		webtest.type("id=username", "aaa");
		Thread.sleep(1000);
		webtest.click("id=password2");
		webtest.type("id=password", "123456");
		Thread.sleep(1000);
		webtest.click("xpath=//input[@type='button']");
		Thread.sleep(1000);
		webtest.click("xpath=//a[text()='暂不刷新']");
		Thread.sleep(1000);
		webtest.click("xpath=//a[text()='人才网首页']");
	}

}

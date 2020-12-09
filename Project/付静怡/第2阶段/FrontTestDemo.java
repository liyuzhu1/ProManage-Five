package com.webtest.demo;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
//import com.webtest.dataprovider.NSDataProvider;
import com.webtest.dataprovider.NSDataProvider;

public class FrontTestDemo extends BaseTest{
	//前台测试用例不需要登录
	@BeforeMethod
	public void openWeb() throws InterruptedException {
		webtest.open("");
		Thread.sleep(1000);
	}
	
	@Test(priority=1,dataProvider="excel17",dataProviderClass=NSDataProvider.class)  //职场问答- 搜索
	public void test1(String s1) throws InterruptedException {
		webtest.click("xpath=//a[text()='网站导航']");
		Thread.sleep(1000);
		webtest.click("xpath=//a[text()='职场问答']");
		Thread.sleep(3000);
		webtest.type("id=askkeyword", s1);
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(3000);
	}

	@Test(priority=2)  //职场问答-我要提问
	public void test2() throws InterruptedException {
		webtest.click("xpath=//a[text()='网站导航']");
		webtest.click("xpath=//a[text()='职场问答']");
		Thread.sleep(3000);
		webtest.click("xpath=/html/body/div[5]/div/div[2]/div/div[2]/a");
		Thread.sleep(3000);
	}
	
	@Test(priority=3) //职场问答-选择话题
	public void test3() throws InterruptedException {
		webtest.click("xpath=//a[text()='网站导航']");
		webtest.click("xpath=//*[@id=\"login_head_div\"]/div/div/div/ul[1]/li[10]/a");
		Thread.sleep(1000);
		webtest.click("xpath=//a[text()='话题']");
		webtest.click("xpath=//a[text()='体育']");
		Thread.sleep(3000);
	}
	
	@Test(priority=4) //职场问答-一周热点
	public void test4() throws InterruptedException {
		webtest.click("xpath=//a[text()='网站导航']");
		Thread.sleep(1000);
		webtest.click("xpath=//a[text()='职场问答']");
		webtest.click("xpath=//a[text()='一周热点']");
		Thread.sleep(3000);
	}
	
	@Test(priority=5) //职场问答-进入人才网首页
	public void test5() throws InterruptedException {
		webtest.click("xpath=//a[text()='网站导航']");
		Thread.sleep(1000);
		webtest.click("xpath=//*[@id=\"login_head_div\"]/div/div/div/ul[1]/li[10]/a");
		webtest.click("xpath=//a[text()='进入人才网首页']");
		Thread.sleep(3000);
	}
	
	@Test(priority=6)  //排行榜
	public void test6() throws InterruptedException {
		webtest.runJs("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(1000);
		webtest.click("xpath=//a[text()='排行榜']");
		Thread.sleep(3000);
	}
	
	@Test(priority=7,dataProvider="excel18",dataProviderClass=NSDataProvider.class) //找工作-搜索职位或公司
	public void test7(String s1) throws InterruptedException {
		webtest.click("xpath=//a[text()='网站导航']");
		Thread.sleep(1000);
		webtest.click("xpath=//a[text()='找工作']");
		Thread.sleep(1000);
		webtest.click("xpath=//input[@name='keyword']");
		webtest.type("name=keyword",s1);
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(3000);
	}
	
	@Test(priority=8,dataProvider="excel18",dataProviderClass=NSDataProvider.class) //找工作-清除关键词
	public void test8(String s1) throws InterruptedException {
		webtest.click("xpath=//a[text()='网站导航']");
		Thread.sleep(1000);
		webtest.click("xpath=//a[text()='找工作']");
		Thread.sleep(1000);
		webtest.click("xpath=//input[@name='keyword']");
		webtest.type("name=keyword",s1);
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(1000);
		webtest.click("xpath=//a[text()=' 清除所选']");
		Thread.sleep(3000);
	}
	
	@Test(priority=9) //找工作-条件
	public void test9() throws InterruptedException {
		webtest.click("xpath=//a[text()='网站导航']");
		Thread.sleep(1000);
		webtest.click("xpath=//*[@id=\"login_head_div\"]/div/div/div/ul[1]/li[1]/a");
		Thread.sleep(1000);
		Thread.sleep(1000);
		webtest.click("xpath=//a[text()='公务员']");
		Thread.sleep(3000);
	}
	
	@Test(priority=10) //找人才-照片人才
	public void test10() throws InterruptedException {
		webtest.click("xpath=//a[text()='网站导航']");
		Thread.sleep(1000);
		webtest.click("xpath=//*[@id=\"login_head_div\"]/div/div/div/ul[1]/li[2]/a");
		Thread.sleep(1000);
		Thread.sleep(1000);
		webtest.click("xpath=//a[text()='照片人才']");
		Thread.sleep(3000);
	}
	
	@Test(priority=11,dataProvider="excel19",dataProviderClass=NSDataProvider.class) //店铺招聘-发布招聘信息
	public void test11(String s1,String s2,String s3,String s4,String s5,String s6,String s7,String s8,String s9,String s10) throws InterruptedException {
		webtest.click("xpath=//a[text()='网站导航']");
		webtest.click("xpath=//a[text()='店铺招聘']");
		webtest.click("xpath=//a[text()='发布店铺招聘']");
		webtest.click("xpath=//a[text()='确定']");
		Thread.sleep(1000);
		webtest.typeAndClear("xpath=//input[@name='title']", s1);
		webtest.typeAndClear("xpath=//input[@name='salary']", s2);
		webtest.typeAndClear("xpath=//input[@name='edate']", s3);
		webtest.click("xpath=//*[@id=\"subform\"]/div/div[2]/div[5]/div/div[1]/div/div/input");
		webtest.click("xpath=//dd[text()='北京']");
		webtest.click("xpath=//*[@id=\"subform\"]/div/div[2]/div[5]/div/div[2]/div/div/i");
		webtest.click("xpath=//*[@id=\"subform\"]/div/div[2]/div[5]/div/div[2]/div/dl/dd[2]");
		webtest.click("xpath=//*[@id=\"subform\"]/div/div[2]/div[5]/div/div[3]/div/div/i");
		webtest.click("xpath=//*[@id=\"subform\"]/div/div[2]/div[5]/div/div[3]/div/dl/dd[2]");
		Thread.sleep(3000);
		webtest.typeAndClear("xpath=//input[@name='address']", s4);
		webtest.typeAndClear("xpath=//textarea[@id='require']", s5);
		webtest.typeAndClear("xpath=//input[@name='companyname']", s6);
		webtest.typeAndClear("xpath=//input[@name='phone']", s7);
		webtest.typeAndClear("xpath=//input[@name='linkman']", s8);
		webtest.typeAndClear("xpath=//input[@name='authcode']", s9);
		webtest.typeAndClear("xpath=//input[@name='password']", s10);
		Thread.sleep(3000);
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(3000);
	}
	
	@Test(priority=12,dataProvider="excel20",dataProviderClass=NSDataProvider.class) //店铺信息-筛选店铺信息
	public void test12(String s1) throws InterruptedException {
		webtest.click("xpath=//a[text()='网站导航']");
		Thread.sleep(1000);
		webtest.click("xpath=//*[@id=\"login_head_div\"]/div/div/div/ul[1]/li[4]/a");
		Thread.sleep(1000);
		webtest.click("xpath=//input[@id='key_word']");
		webtest.typeAndClear("xpath=//input[@id='key_word']", s1);
		webtest.click("xpath=//input[@id='search_button']");
		Thread.sleep(3000);
	}
	

}

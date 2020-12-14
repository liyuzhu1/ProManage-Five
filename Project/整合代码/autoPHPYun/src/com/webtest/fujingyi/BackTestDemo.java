package com.webtest.fujingyi;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.dataprovider.NSDataProviderFujingyi;

/**
 * 
 * @author 付静怡
 *
 */
public class BackTestDemo extends BaseTest{
	//后台需先登录才能操作
	
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
	
	
	@Test(priority=2,dataProvider="excel2",dataProviderClass=NSDataProviderFujingyi.class)//系统-禁止ip访问
	public void test14(String s1) throws InterruptedException {
		webtest.click("xpath=//a[text()='系统']");
		webtest.enterFrame1("name=right");
		webtest.click("xpath=//li[text()='安全设置']");
		webtest.runJs("window.scrollTo(0,document.body.scrollHeight)");
		webtest.click("xpath=//textarea[@name='sy_bannedip']");
		webtest.typeAndClear("xpath=//textarea[@name='sy_bannedip']", s1);
		Thread.sleep(1000);
		webtest.click("xpath=//input[@id='otherconfig']");
		webtest.leaveFrame();
		webtest.click("xpath=//a[text()='系统']");
		Thread.sleep(1000);
	}
	
	@Test(priority=3) //系统-验证码生成类型
	public void test15() throws InterruptedException {
		webtest.click("xpath=//a[text()='系统']");
		webtest.enterFrame1("name=right");
		webtest.click("xpath=//li[text()='验证码设置']");
		webtest.click("xpath=//div[text()='英文']");
		webtest.click("xpath=//input[@id='codeconfig']");
		webtest.leaveFrame();
		webtest.click("xpath=//a[text()='系统']");
		Thread.sleep(1000);
	}
	
	@Test(priority=4) //系统-重置
	public void test16() throws InterruptedException {
		webtest.click("xpath=//a[text()='系统']");
		webtest.enterFrame1("name=right");
		webtest.click("xpath=//li[text()='地图设置']");
		webtest.click("xpath=//div[text()='保持默认坐标']");
		webtest.click("xpath=/html/body/div[1]/div/div[5]/div[5]/form/table/tbody/tr[6]/td/input[2]");
		webtest.leaveFrame();
		webtest.click("xpath=//a[text()='系统']");
		Thread.sleep(1000);
	}
	
	@Test(priority=5) //系统-ip跳转到当前城市
	public void test17() throws InterruptedException {
		webtest.click("xpath=//a[text()='系统']");
		webtest.enterFrame1("name=right");
		webtest.click("xpath=//li[text()='地图设置']");
		webtest.click("xpath=//div[text()='保持默认坐标']");
		webtest.click("xpath=//input[@id='mapconfig']");
		webtest.leaveFrame();
		webtest.click("xpath=//a[text()='系统']");
		Thread.sleep(1000);
	}
	
	@Test(priority=6,dataProvider="excel3",dataProviderClass=NSDataProviderFujingyi.class) //系统-修改页面缓存时间
	public void test18(String s1) throws InterruptedException {
		webtest.click("xpath=//a[text()='系统']");
		webtest.enterFrame1("name=right");
		webtest.click("xpath=//li[text()='缓存设置']");
		webtest.click("xpath=//input[@name='webcachetime']");
		webtest.typeAndClear("xpath=//input[@name='webcachetime']", s1);
		webtest.click("xpath=//input[@id='cacheconfig']");
		webtest.leaveFrame();
		webtest.click("xpath=//a[text()='系统']");
		Thread.sleep(1000);
	}
	
	@Test(priority=7,dataProvider="excel4",dataProviderClass=NSDataProviderFujingyi.class) //系统-修改上传图片类型
	public void test19(String s1) throws InterruptedException {
		webtest.click("xpath=//a[text()='系统']");
		webtest.enterFrame1("name=right");
		webtest.click("xpath=//li[text()='上传设置']");
		webtest.click("xpath=//input[@name='pic_type']");
		webtest.typeAndClear("xpath=//input[@name='pic_type']", s1);
		webtest.click("xpath=//input[@id='uploadconfig']");
		webtest.leaveFrame();
		webtest.click("xpath=//a[text()='系统']");
		Thread.sleep(1000);
	}
	
	@Test(priority=8) //系统-关闭找工作模块
	public void test20() throws InterruptedException {
		webtest.click("xpath=//a[text()='系统']");
		webtest.click("xpath=//a[text()='模块设置']");
		webtest.enterFrame1("name=right");
		webtest.click("xpath=/html/body/div/div[4]/div/form/table/tbody/tr[2]/td[1]/div/div/div[2]/div");
		webtest.click("xpath=//input[@name='config']");
		webtest.leaveFrame();
		webtest.click("xpath=//a[text()='系统']");
		Thread.sleep(1000);
	}
	
	@Test(priority=9) //系统-头部浮动导航
	public void test21() throws InterruptedException {
		webtest.click("xpath=//a[text()='系统']");
		webtest.click("xpath=//a[text()='页面设置']");
		webtest.enterFrame1("name=right");
		webtest.click("xpath=//em[text()='开启']");
		webtest.click("xpath=//input[@name='config']");
		webtest.leaveFrame();
		webtest.click("xpath=//a[text()='系统']");
		Thread.sleep(1000);
	}
	
	@Test(priority=10,dataProvider="excel5",dataProviderClass=NSDataProviderFujingyi.class) //系统-搜索导航
	public void test22(String s1) throws InterruptedException {
		webtest.click("xpath=//a[text()='系统']");
		webtest.click("xpath=//a[text()='导航设置']");
		webtest.enterFrame1("name=right");
		webtest.click("xpath=//input[@name='keyword']");
		webtest.typeAndClear("xpath=//input[@name='keyword']", s1);
		webtest.click("xpath=//input[@name='news_search']");
		webtest.leaveFrame();
		webtest.click("xpath=//a[text()='系统']");
		Thread.sleep(1000);
	}
	
	@Test(priority=11) //系统-开通支付宝
	public void test23() throws InterruptedException {
		webtest.click("xpath=//a[text()='系统']");
		webtest.click("xpath=//a[text()='支付设置']");
		webtest.enterFrame1("name=right");
		webtest.click("xpath=//a[@id='alipay_online']");
		webtest.leaveFrame();
		webtest.click("xpath=//a[text()='系统']");
		Thread.sleep(1000);
	}
	
	@Test(priority=12,dataProvider="excel6",dataProviderClass=NSDataProviderFujingyi.class) //系统-更改网站标题
	public void test24(String s1) throws InterruptedException {
		webtest.click("xpath=//a[text()='系统']");
		webtest.click("xpath=//a[text()='SEO设置']");
		webtest.enterFrame1("name=right");
		webtest.click("xpath=//a[text()='修改']");
		webtest.click("xpath=//textarea[@name='title']");
		webtest.typeAndClear("xpath=//textarea[@name='title']", s1);
		webtest.click("xpath=//input[@name='update']");
		webtest.leaveFrame();
		webtest.click("xpath=//a[text()='系统']");
		Thread.sleep(1000);
	}
	
	@Test(priority=13,dataProvider="excel7",dataProviderClass=NSDataProviderFujingyi.class) //系统-更改积分
	public void test25(String s1) throws InterruptedException {
		webtest.click("xpath=//a[text()='系统']");
		webtest.click("xpath=//a[text()='积分设置']");
		webtest.enterFrame1("name=right");
		webtest.click("xpath=//input[@id='integral_signin']");
		webtest.typeAndClear("xpath=//input[@id='integral_signin']", s1);
		webtest.click("xpath=//input[@id='integral']");
		webtest.leaveFrame();
		webtest.click("xpath=//a[text()='系统']");
		Thread.sleep(1000);
	}
	
	@Test(priority=14) //系统-关闭注册
	public void test26() throws InterruptedException {
		webtest.click("xpath=//a[text()='系统']");
		webtest.click("xpath=//a[text()='注册设置']");
		webtest.enterFrame1("name=right");
		webtest.click("xpath=//em[text()='开启']");
		webtest.click("xpath=//input[@id='regconfig']");
		webtest.leaveFrame();
		webtest.click("xpath=//a[text()='系统']");
		Thread.sleep(1000);
	}

	@Test(priority=15) //系统-网站地图高级搜索
	public void test27() throws InterruptedException {
		webtest.click("xpath=//a[text()='系统']");
		webtest.click("xpath=//a[text()='网站地图']");
		webtest.enterFrame1("name=right");
		webtest.click("xpath=//a[text()='高级搜索']");
		webtest.click("xpath=//a[text()='站内链接']");
		webtest.leaveFrame();
		webtest.click("xpath=//a[text()='系统']");
		Thread.sleep(1000);
	}
	
	@Test(priority=16,dataProvider="excel8",dataProviderClass=NSDataProviderFujingyi.class) //系统-修改链接地址
	public void test28(String s1) throws InterruptedException {
		webtest.click("xpath=//a[text()='系统']");
		webtest.click("xpath=//a[text()='友情链接']");
		webtest.enterFrame1("name=right");
		webtest.click("xpath=//a[@class='admin_new_c_bth']");
		webtest.click("xpath=//input[@name='url']");
		webtest.typeAndClear("xpath=//input[@name='url']", s1);
		webtest.click("xpath=//input[@name='link_update']");
		webtest.leaveFrame();
		webtest.click("xpath=//a[text()='系统']");
		Thread.sleep(1000);
	}
	
	@Test(priority=17,dataProvider="excel9",dataProviderClass=NSDataProviderFujingyi.class) //系统-添加类别
	public void test29(String s1,String s2) throws InterruptedException {
		webtest.click("xpath=//a[text()='系统']");
		webtest.click("xpath=//span[text()='类别']");
		webtest.enterFrame1("name=right");
		webtest.click("xpath=//a[@class='admin_new_cz_tj']");
		webtest.click("xpath=//textarea[@id='position']");
		webtest.typeAndClear("xpath=//textarea[@id='position']", s1);
		webtest.click("xpath=//textarea[@id='variable']");
		webtest.typeAndClear("xpath=//textarea[@id='variable']", s2);
		webtest.click("xpath=//input[@class='admin_examine_bth']");
		webtest.leaveFrame();
		webtest.click("xpath=//a[text()='系统']");
		Thread.sleep(1000);
	}
	
	
	@Test(priority=18) //系统-城市管理-生成拼音
	public void test30() throws InterruptedException {
		webtest.click("xpath=//a[text()='系统']");
		webtest.click("xpath=//span[text()='类别']");
		webtest.click("xpath=//a[text()='城市管理']");
		webtest.enterFrame1("name=right");
		webtest.click("xpath=//a[@class='admin_new_cz_tj']");
		webtest.leaveFrame();
		webtest.click("xpath=//a[text()='取消']");
		webtest.leaveFrame();
		webtest.click("xpath=//a[text()='系统']");
		Thread.sleep(1000);
	}
	
	@Test(priority=19) //系统-删除类别
	public void test31() throws InterruptedException {
		webtest.click("xpath=//a[text()='系统']");
		webtest.click("xpath=//span[text()='类别']");
		webtest.click("xpath=//a[text()='行业类别']");
		webtest.enterFrame1("name=right");
		webtest.click("xpath=//input[@value='840']");
		webtest.click("xpath=//input[@value='删除所选']");
		webtest.leaveFrame();
		webtest.click("xpath=//a[text()='确定']");
		webtest.leaveFrame();
		webtest.click("xpath=//a[text()='系统']");
		Thread.sleep(1000);
	}
	
	@Test(priority=20) //系统-一键查重
	public void test32() throws InterruptedException {
		webtest.click("xpath=//a[text()='系统']");
		webtest.click("xpath=//span[text()='类别']");
		webtest.click("xpath=//a[text()='职位类别管理']");
		webtest.enterFrame1("name=right");
		webtest.click("xpath=//a[text()='一键查重']");
		webtest.leaveFrame();
		webtest.click("xpath=//a[text()='系统']");
		Thread.sleep(1000);
	}
	
	@Test(priority=21,dataProvider="excel10",dataProviderClass=NSDataProviderFujingyi.class) //系统-添加会员类别
	public void test33(String s1,String s2) throws InterruptedException {
		webtest.click("xpath=//a[text()='系统']");
		webtest.click("xpath=//span[text()='类别']");
		webtest.click("xpath=//a[text()='企业会员分类']");
		webtest.enterFrame1("name=right");
		webtest.click("xpath=//a[@class='admin_new_cz_tj']");
		webtest.click("xpath=//textarea[@id='position']");
		webtest.typeAndClear("xpath=//textarea[@id='position']", s1);
		webtest.click("xpath=//textarea[@id='variable']");
		webtest.typeAndClear("xpath=//textarea[@id='variable']", s2);
		webtest.click("xpath=//input[@class='admin_examine_bth']");
		webtest.leaveFrame();
		webtest.click("xpath=//a[text()='系统']");
		Thread.sleep(1000);
	}
	
	@Test(priority=22) //系统-删除分类
	public void test34() throws InterruptedException {
		webtest.click("xpath=//a[text()='系统']");
		webtest.click("xpath=//span[text()='类别']");
		webtest.click("xpath=//a[text()='兼职分类']");
		webtest.enterFrame1("name=right");
		webtest.click("xpath=//input[@value='27']");
		webtest.click("xpath=//input[@value='删除所选']");
		webtest.leaveFrame();
		webtest.click("xpath=//a[text()='确定']");
		webtest.click("xpath=//a[text()='系统']");
		Thread.sleep(1000);
	}
	
	@Test(priority=23,dataProvider="excel11",dataProviderClass=NSDataProviderFujingyi.class) //系统-添加举报原因
	public void test35(String s1) throws InterruptedException {
		webtest.click("xpath=//a[text()='系统']");
		webtest.click("xpath=//span[text()='类别']");
		webtest.click("xpath=//a[text()='举报原因管理']");
		webtest.enterFrame1("name=right");
		webtest.click("xpath=//a[@class='admin_new_cz_tj']");
		webtest.click("xpath=//input[@class='company_job_text']");
		webtest.typeAndClear("xpath=//input[@class='company_job_text']", s1);
		webtest.click("xpath=//input[@class='admin_examine_bth']");
		webtest.leaveFrame();
		webtest.click("xpath=//a[text()='系统']");
		Thread.sleep(1000);
	}
	
	@Test(priority=24) //系统-退出登录
	public void test36() throws InterruptedException {
		webtest.click("xpath=//a[text()='系统']");
		webtest.click("xpath=//span[text()='管理员']"); 
		webtest.enterFrame1("name=right");
		webtest.click("xpath=//a[text()='退出登录']");
		webtest.leaveFrame();
		Thread.sleep(1000);
	}
	
	@Test(priority=25,dataProvider="excel12",dataProviderClass=NSDataProviderFujingyi.class) //系统-添加管理员
	public void test37(String s1,String s2,String s3,String s4,String s5) throws InterruptedException {
		webtest.type("name=username", s1);
		webtest.type("name=password", s2);
		webtest.click("xpath=//input[@type='submit']");
		webtest.click("xpath=//a[text()='系统']");
		webtest.click("xpath=//span[text()='管理员']"); 
		webtest.click("xpath=//a[text()='管理员列表']");
		webtest.enterFrame1("name=right");
		webtest.click("xpath=//a[@class='admin_new_cz_tj']");
		webtest.click("xpath=//input[@name='username']");
		webtest.typeAndClear("xpath=//input[@name='username']", s3);
		webtest.click("xpath=//input[@name='password']");
		webtest.typeAndClear("xpath=//input[@name='password']", s4);
		webtest.click("xpath=//input[@name='name']");
		webtest.typeAndClear("xpath=//input[@name='name']", s5);
		webtest.click("xpath=//*[@id=\"myform\"]/table/tbody/tr[2]/td[2]/div/div/div/input");
		webtest.click("xpath=//dd[text()='超级管理员']");
		webtest.click("xpath=//div[text()='可以登录']");
		webtest.click("xpath=//input[@name='useradd']");
		webtest.leaveFrame();
		webtest.click("xpath=//a[text()='系统']");
		Thread.sleep(1000);
	}
	
	@Test(priority=26,dataProvider="excel13",dataProviderClass=NSDataProviderFujingyi.class) //系统-添加类型
	public void test38(String s1) throws InterruptedException {
		webtest.click("xpath=//a[text()='系统']");
		webtest.click("xpath=//span[text()='管理员']"); 
		webtest.click("xpath=//a[text()='添加管理员类型']");
		webtest.enterFrame1("name=right");
		webtest.click("xpath=//input[@name='group_name']");
		webtest.typeAndClear("xpath=//input[@name='group_name']", s1);
		webtest.click("xpath=//input[@name='add_group']");
		webtest.leaveFrame();
		webtest.click("xpath=//a[text()='系统']");
		Thread.sleep(1000);
	}
	
	@Test(priority=27) //系统-删除一条日志
	public void test39() throws InterruptedException {
		webtest.click("xpath=//a[text()='系统']");
		webtest.click("xpath=//span[text()='管理员']"); 
		webtest.click("xpath=//a[text()='管理员日志']");
		webtest.enterFrame1("name=right");
		webtest.click("xpath=//input[@value='29']");
		webtest.click("xpath=//input[@value='删除所选']");
		webtest.leaveFrame();
		webtest.click("xpath=//a[text()='确定']");
		webtest.click("xpath=//a[text()='系统']");
		Thread.sleep(1000);
	}
	
	@Test(priority=28) //系统-删除一条会员日志
	public void test40() throws InterruptedException {
		webtest.click("xpath=//a[text()='系统']");
		webtest.click("xpath=//span[text()='管理员']"); 
		webtest.click("xpath=//a[text()='会员日志']");
		webtest.enterFrame1("name=right");
		webtest.click("xpath=//input[@value='4']");
		webtest.click("xpath=//input[@value='删除所选']");
		webtest.leaveFrame();
		webtest.click("xpath=//a[text()='确定']");
		webtest.click("xpath=//a[text()='系统']");
		Thread.sleep(1000);
	}
	
	@Test(priority=29) //系统-使用模板
	public void test41() throws InterruptedException {
		webtest.click("xpath=//a[text()='系统']");
		webtest.click("xpath=//span[text()='模板']"); 
		webtest.click("xpath=//a[text()='切换模板']");
		webtest.enterFrame1("name=right");
		webtest.click("xpath=/html/body/div/div[4]/div/input[2]");
		webtest.leaveFrame();
		webtest.click("xpath=//a[text()='确定']");
		webtest.click("xpath=//a[text()='系统']");
		Thread.sleep(1000);
	}
	
	@Test(priority=30) //系统-修改企业模板
	public void test42() throws InterruptedException {
		webtest.click("xpath=//a[text()='系统']");
		webtest.click("xpath=//span[text()='模板']"); 
		webtest.click("xpath=//a[text()='企业模板']");
		webtest.enterFrame1("name=right");
		webtest.click("xpath=/html/body/div/div[5]/div[1]/input[1]");
		webtest.click("xpath=//em[text()='开启']");
		webtest.click("xpath=//input[@id='qqconfig']");
		webtest.leaveFrame();
		webtest.click("xpath=//a[text()='系统']");
		Thread.sleep(1000);
	}
	
	@Test(priority=31) //系统-修改简历模板
	public void test43() throws InterruptedException {
		webtest.click("xpath=//a[text()='系统']");
		webtest.click("xpath=//span[text()='模板']"); 
		webtest.click("xpath=//a[text()='简历模板']");
		webtest.enterFrame1("name=right");
		webtest.click("xpath=/html/body/div/div[5]/div[1]/input[1]");
		webtest.click("xpath=//em[text()='开启']");
		webtest.click("xpath=//input[@id='qqconfig']");
		webtest.leaveFrame();
		webtest.click("xpath=//a[text()='系统']");
		Thread.sleep(1000);
	}
	
	@Test(priority=32) //系统-生成所有
	public void test44() throws InterruptedException {
		webtest.click("xpath=//a[text()='系统']");
		webtest.click("xpath=//span[text()='单页面']"); 
		webtest.enterFrame1("name=right");
		webtest.click("xpath=//a[text()='生成所有']");
		webtest.leaveFrame();
		webtest.click("xpath=//a[text()='系统']");
		Thread.sleep(1000);
	}
	
	@Test(priority=33,dataProvider="excel14",dataProviderClass=NSDataProviderFujingyi.class) //系统-添加百度
	public void test45(String s1,String s2) throws InterruptedException {
		webtest.click("xpath=//a[text()='系统']");
		webtest.click("xpath=//span[text()='单页面']"); 
		webtest.click("xpath=//a[text()='添加单页面']");
		webtest.enterFrame1("name=right");
		webtest.click("xpath=//input[@name='name']");
		webtest.typeAndClear("xpath=//input[@class='input-text']", s1);
		webtest.click("xpath=//input[@class='layui-input layui-unselect']");
		webtest.click("xpath=//dd[text()='关于我们']");
		webtest.click("xpath=//input[@name='url']");
		webtest.typeAndClear("xpath=//input[@name='url']", s2);
		webtest.click("xpath=//input[@name='add_desc']");
		webtest.leaveFrame();
		webtest.click("xpath=//a[text()='系统']");
		Thread.sleep(1000);
	}
	
	@Test(priority=34,dataProvider="excel15",dataProviderClass=NSDataProviderFujingyi.class) //系统-添加类别
	public void test46(String s1) throws InterruptedException {
		webtest.click("xpath=//a[text()='系统']");
		webtest.click("xpath=//span[text()='单页面']"); 
		webtest.click("xpath=//a[text()='单页面类别']");
		webtest.enterFrame1("name=right");
		webtest.click("xpath=//a[text()='+ 添加类别']");
		webtest.click("xpath=//textarea[@id='position']");
		webtest.typeAndClear("xpath=//textarea[@id='position']", s1);
		webtest.click("xpath=//input[@class='admin_examine_bth']");
		webtest.leaveFrame();
		webtest.click("xpath=//a[text()='系统']");
		Thread.sleep(1000);
	}
	
	@Test(priority=35) //系统-开启分站
	public void test47() throws InterruptedException {
		webtest.click("xpath=//a[text()='系统']");
		webtest.click("xpath=//span[text()='分站']"); 
		webtest.enterFrame1("name=right");
		webtest.click("xpath=//em[text()='关闭']");
		webtest.click("xpath=//input[@id='config']");
		webtest.leaveFrame();
		webtest.click("xpath=//a[text()='系统']");
		Thread.sleep(1000);
	}

	@Test(priority=36,dataProvider="excel16",dataProviderClass=NSDataProviderFujingyi.class) //系统-添加分站
	public void test48(String s1,String s2) throws InterruptedException {
		webtest.click("xpath=//a[text()='系统']");
		webtest.click("xpath=//span[text()='分站']"); 
		webtest.click("xpath=//a[text()='添加分站']");
		webtest.enterFrame1("name=right");
		webtest.click("xpath=//input[@name='title']");
		webtest.typeAndClear("xpath=//input[@name='title']", s1);
		webtest.click("xpath=//input[@name='domain']");
		webtest.typeAndClear("xpath=//input[@name='domain']", s2);
		webtest.click("xpath=//*[@id=\"fz_type_1\"]/td/div/div[1]/div/div/input");
		webtest.click("xpath=//*[@id=\"fz_type_1\"]/td/div/div[1]/div/dl/dd[2]");
		webtest.click("xpath=//*[@id=\"domainform\"]/table/tbody[2]/tr[13]/td/input[3]");
		webtest.leaveFrame();
		webtest.click("xpath=//a[text()='系统']");
		Thread.sleep(1000);
	}

	@Test(priority=37) //系统-高级搜索
	public void test49() throws InterruptedException {
		webtest.open1("/admin");
		Thread.sleep(2000);
		webtest.type("id=username", "admin");
		webtest.type("id=password", "admin");
		webtest.click("xpath=//input[@type='submit']");
		webtest.click("xpath=//a[text()='系统']");
		webtest.click("xpath=//span[text()='信息']"); 
		webtest.click("xpath=//a[text()='意见反馈']");
		webtest.enterFrame1("name=right");
		webtest.click("xpath=//a[text()='高级搜索']");
		webtest.click("xpath=//a[text()='建议']");
		webtest.leaveFrame();
		webtest.click("xpath=//a[text()='系统']");
		Thread.sleep(1000);
	}
	
	@Test(priority=38,dataProvider="excel18",dataProviderClass=NSDataProviderFujingyi.class) //系统-发送系统消息
	public void test50(String s1) throws InterruptedException {
		webtest.click("xpath=//a[text()='系统']");
		webtest.click("xpath=//span[text()='信息']"); 
		webtest.click("xpath=//a[text()='系统消息']");
		webtest.enterFrame1("name=right");
		webtest.click("xpath=//a[text()='发送系统消息']");
		webtest.click("xpath=//div[text()='个人用户']");
		webtest.click("xpath=//textarea[@id='content']");
		webtest.typeAndClear("xpath=//textarea[@id='content']", s1);
		webtest.click("xpath=//input[type()='submit']");
		webtest.leaveFrame();
		webtest.click("xpath=//a[text()='系统']");
		Thread.sleep(1000);
	}
	
	

}

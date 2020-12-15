package com.webtest.xieyuxin;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.dataprovider.NSDataProviderXieyuxin;;

/**
 * 
 * @author 解宇欣
 *
 */
public class ExcelTestBack extends BaseTest {

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

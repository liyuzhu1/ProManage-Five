package com.webtest.lixiaohan;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.dataprovider.NSDataProviderLixiaohan;
/**
 * 
 * @author 李晓涵
 *
 */
public class AdminTestDemo extends BaseTest {
//	登录后台,进入内容页面
	@BeforeClass
	public void testLogin_admin() throws InterruptedException {
//		webtest.open("http://localhost/admin/index.php");
		webtest.open1("/admin/index.php");
		Thread.sleep(2000);
		webtest.type("id=username", "admin");
		webtest.type("id=password", "admin");
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(2000);
		webtest.mouseToElementandClick("xpath=//a[text()='内容']");
	}

//	1、修改新闻标题
	@Test
	public void test_a1() throws InterruptedException {
		Thread.sleep(2000);
		webtest.enterFrame("rightMain");
		webtest.click("xpath=//*[@id='list12']/td[10]/a");
		Thread.sleep(2000);
		webtest.typeAndClear("id=title", "这是一条很好的新闻");
		Thread.sleep(2000);
		webtest.runJs("window.scrollTo(0,500);");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id='newsform']/table/tbody[3]/tr[12]/td/input[4]");
		Thread.sleep(3000);
		webtest.isDisplayed("xpath=//input[text()='检索']");
		webtest.leaveFrame();
		webtest.click("xpath=//a[text()='新闻管理']");
		Thread.sleep(3000);
	}

//	2、删除新闻(成功)
	@Test
	public void test_a2() throws InterruptedException {
		Thread.sleep(1000);
		webtest.enterFrame("rightMain");
		webtest.click("xpath=//*[@id='list13']/td[10]/a[2]");
		Thread.sleep(2000);
		webtest.leaveFrame();
		webtest.click("xpath=//a[text()='确定']");
		webtest.click("class=layui-layer-btn0");
		Thread.sleep(3000);
	}

//	3、检索新闻(成功)
	@Test
	public void test_a3() throws InterruptedException {
		Thread.sleep(1000);
		webtest.enterFrame("rightMain");
		webtest.type("class=admin_Filter_search", "这是一则新闻");
		Thread.sleep(1000);
		webtest.mouseToElementandClick("name=news_search");
		Thread.sleep(1000);
		// 断言
		String actual = webtest.getText("class=Search_jobs_c_a");
		Assert.assertEquals(actual, "关键字：这是一则新闻");
		System.out.println("这是test_a3");
		webtest.leaveFrame();
		Thread.sleep(3000);
	}

//	4、设置属性
	@Test
	public void test_a4() throws InterruptedException {
		Thread.sleep(2000);
		webtest.enterFrame("rightMain");
		webtest.runJs("window.scrollTo(0,100);");
		webtest.click("xpath=//*[@id=\"chkAll2\"]");// 全选
		Thread.sleep(1000);
		webtest.click("xpath=//*[@id=\"myform\"]/table/tbody/tr[11]/td[2]/input[2]");// 设置
		webtest.leaveFrame();
//		webtest.click("xpath=//input[@type='checkbox']");
//		Thread.sleep(1000);
		webtest.click("xpath=//a[@class='layui-layer-ico layui-layer-close layui-layer-close1']");// 关闭

		//webtest.isDisplayed("xpath=//a[text()='添加分类']");
		System.out.println("这是test_a4");
		Thread.sleep(3000);
	}

//	5、重新分配站点
	@Test
	public void test_a5() throws InterruptedException {
		webtest.mouseToElementandClick("xpath=//a[text()='内容']");
		Thread.sleep(3000);
		webtest.enterFrame("rightMain");
		webtest.click("xpath=//*[@id='list10']/td[9]/div[2]/a");
		Thread.sleep(3000);
		webtest.leaveFrame();
		Thread.sleep(3000);
	}

//	6、按类别高级搜索新闻(成功)（打不开页面a6）
	@Test
	public void test_a6() throws InterruptedException {
		webtest.open1("/admin/index.php");
		Thread.sleep(2000);
		webtest.type("id=username", "admin");
		webtest.type("id=password", "admin");
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(2000);
		webtest.mouseToElementandClick("xpath=//a[text()='内容']");
		Thread.sleep(3000);
		webtest.click("xpath=//a[text()='新闻管理']");
		Thread.sleep(1000);
		webtest.enterFrame("rightMain");
		webtest.mouseToElementandClick("xpath=//a[text()='高级搜索']");
		Thread.sleep(1000);
		webtest.click("class=admin_screenlist");
		webtest.click("xpath=//a[text()='职业指导']");
		// 断言
		Boolean flag = webtest.isElementPresent("class=Search_jobs_c_a");
		System.out.println(flag);
		Assert.assertTrue(flag);
		webtest.leaveFrame();
		Thread.sleep(3000);
	}

//	7、按时间高级搜索新闻(成功)（打不开页面a7）
	@Test
	public void test_a7() throws InterruptedException {
		webtest.click("xpath=//a[text()='新闻管理']");
		Thread.sleep(1000);
		webtest.enterFrame("rightMain");
		webtest.mouseToElementandClick("xpath=//a[text()='高级搜索']");
		Thread.sleep(1000);
		webtest.click("class=admin_screenlist");
		webtest.click("xpath=//a[text()='最近一个月']");
		// 断言
		Boolean flag = webtest.isElementPresent("class=Search_jobs_c_a");
		System.out.println(flag);
		Assert.assertTrue(flag);

		webtest.leaveFrame();
		Thread.sleep(3000);
	}

	// 8、翻页
	@Test
	public void test_a8() throws InterruptedException {
		webtest.click("xpath=//a[text()='新闻管理']");
		Thread.sleep(1000);
		webtest.enterFrame("rightMain");
		webtest.runJs("window.scrollTo(0,400);");
		Thread.sleep(3000);
		webtest.mouseToElementandClick("xpath=//a[text()='下一页']");
		Thread.sleep(1000);
		webtest.leaveFrame();
		Thread.sleep(3000);
	}

	// 9、点击编号进行排序(成功)（打不开页面a9）
	@Test
	public void test_a9() throws InterruptedException {
		webtest.enterFrame("rightMain");
		webtest.mouseToElementandClick("xpath=//*[@id='myform']/table/thead/tr/th[2]/a");
		Thread.sleep(1000);
		// 断言
		Boolean flag = webtest.isElementPresent("name=news_search");
		System.out.println(flag);
		Assert.assertTrue(flag);
		webtest.leaveFrame();
		Thread.sleep(3000);
	}

	// 10、点击发布时间进行排序(成功)（打不开页面b1）
	@Test
	public void test_b1() throws InterruptedException {
		webtest.enterFrame("rightMain");
		webtest.mouseToElementandClick("xpath=//*[@id='myform']/table/thead/tr/th[6]/a");
		Thread.sleep(1000);
		// 断言
		Boolean flag = webtest.isElementPresent("name=news_search");
		System.out.println(flag);
		Assert.assertTrue(flag);
		webtest.leaveFrame();
		Thread.sleep(3000);
	}

	// 11、点击浏览量进行排序(成功)（打不开页面b2）
	@Test
	public void test_b2() throws InterruptedException {
		webtest.enterFrame("rightMain");
		webtest.mouseToElementandClick("xpath=//*[@id='myform']/table/thead/tr/th[7]/a");
		Thread.sleep(1000);
		// 断言
		Boolean flag = webtest.isElementPresent("name=news_search");
		System.out.println(flag);
		Assert.assertTrue(flag);
		webtest.leaveFrame();
		Thread.sleep(3000);
	}

	// 12、点击排序(成功)（打不开页面b3）
	@Test
	public void test_b3() throws InterruptedException {
		webtest.enterFrame("rightMain");
		webtest.mouseToElementandClick("xpath=//*[@id='myform']/table/thead/tr/th[8]/a");
		Thread.sleep(1000);
		// 断言
		Boolean flag = webtest.isElementPresent("name=news_search");
		System.out.println(flag);
		Assert.assertTrue(flag);
		webtest.leaveFrame();
		Thread.sleep(3000);
	}

	// 13、删除所有新闻
	@Test
	public void test_b4() throws InterruptedException {
		// 全选
		webtest.enterFrame("rightMain");
		webtest.runJs("window.scrollTo(0,400);");
		Thread.sleep(3000);
		webtest.mouseToElementandClick("xpath=//*[@id=\"chkAll2\"]");
		Thread.sleep(1000);
		// 删除所选
		webtest.click("name=delsub");
		Thread.sleep(2000);
		// 取消删除
		webtest.leaveFrame();
		webtest.click("xpath=//a[text()='取消']");
		Thread.sleep(4000);
		webtest.isDisplayed("xpath=//a[text()='首页']");
		Thread.sleep(3000);
	}

	// 14、取消属性
	@Test
	public void test_b5() throws InterruptedException {
		Thread.sleep(2000);
		webtest.enterFrame("rightMain");
		webtest.runJs("window.scrollTo(0,100);");
		webtest.click("xpath=//*[@id=\"chkAll2\"]");// 全选
		Thread.sleep(1000);
		webtest.click("xpath=//*[@id=\"myform\"]/table/tbody/tr[11]/td[2]/input[3]");// 取消属性
		webtest.leaveFrame();
		webtest.click("xpath=//input[text()='头条']");
		Thread.sleep(1000);
		webtest.click("xpath=//*[@id=\"property\"]/form/div/table/tbody/tr[3]/td/input");// 确定
		Thread.sleep(3000);
	}

//	15、后台登陆（重置）
	@Test
	public void test_b6() throws InterruptedException {
		webtest.click("xpath=//a[@title='安全退出管理中心']");
		webtest.type("id=username", "admin");
		Thread.sleep(2000);
		webtest.click("xpath=//input[@value='重置']");
		webtest.isDisplayed("id=username");
		Thread.sleep(3000);
	}

//	16、后台登陆（未填写用户名）
	@Test
	public void test_b7() throws InterruptedException {
		webtest.type("id=username", "admin");
		webtest.type("id=password", "admin");
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(2000);
		webtest.click("xpath=//a[@title='安全退出管理中心']");
		webtest.type("id=password", "admin");
		Thread.sleep(2000);
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(1000);
		webtest.click("xpath=//input[@value='重置']");
		webtest.isDisplayed("id=username");
		Thread.sleep(3000);
	}

//	17、后台登陆（未填写密码）
	@Test
	public void test_b8() throws InterruptedException {
		webtest.type("id=username", "admin");
		webtest.type("id=password", "admin");
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(2000);
		webtest.click("xpath=//a[@title='安全退出管理中心']");
		webtest.type("id=username", "admin");
		Thread.sleep(2000);
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(1000);
		webtest.click("xpath=//input[@value='重置']");
		webtest.isDisplayed("id=username");
		Thread.sleep(3000);
	}

//	18、后台登陆（用户名错误）
	@Test(dataProvider = "excel_login", dataProviderClass = NSDataProviderLixiaohan.class)
	public void test_b9(String s1, String s2, String s3, String s4) throws InterruptedException {
		webtest.type("id=username", s1);
		webtest.type("id=password", s2);
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(2000);
		webtest.click("xpath=//a[@title='安全退出管理中心']");
		webtest.type("id=username", s3);
		webtest.type("id=password", s2);
		Thread.sleep(2000);
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(1000);
		webtest.click("xpath=//input[@value='重置']");
		webtest.isDisplayed("id=username");
		Thread.sleep(3000);
	}

//	19、后台登陆（密码错误）
	@Test(dataProvider = "excel_login", dataProviderClass = NSDataProviderLixiaohan.class)
	public void test_c1(String s1, String s2, String s3, String s4) throws InterruptedException {
		webtest.type("id=username", s1);
		webtest.type("id=password", s2);
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(2000);
		webtest.click("xpath=//a[@title='安全退出管理中心']");
		webtest.type("id=username", s1);
		webtest.type("id=password", s4);
		Thread.sleep(2000);
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(1000);
		webtest.click("xpath=//input[@value='重置']");
		webtest.isDisplayed("id=username");
		Thread.sleep(3000);
	}

//	20、问答管理（设置推荐）
	@Test
	public void test_c2() throws InterruptedException {
		webtest.type("id=username", "admin");
		webtest.type("id=password", "admin");
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(2000);
		webtest.mouseToElementandClick("xpath=//a[text()='内容']");
		webtest.click("xpath=//span[text()='问答']");
		Thread.sleep(1000);
		webtest.click("id=supportiframe");
		webtest.click("xpath=//*[@id='is_recom1']/a");
		Thread.sleep(3000);
	}

//	21、按标题搜索问答
	@Test
	public void test_c3() throws InterruptedException {
		webtest.click("xpath=//span[text()='问答']");
		Thread.sleep(1000);
		webtest.enterFrame("rightMain");
		webtest.type("class=admin_Filter_search", "测试工程师");
		Thread.sleep(1000);
		webtest.click("class=admin_Filter_bth");
		Thread.sleep(1000);
		webtest.isDisplayed("class=admin_Filter_bth");
		Thread.sleep(3000);
	}

//	22、按提问者名称搜索问答
	@Test
	public void test_c4() throws InterruptedException {
		webtest.leaveFrame();
		webtest.click("xpath=//span[text()='问答']");
		Thread.sleep(1000);
		webtest.enterFrame("rightMain");
		webtest.mouseToElement("class=admin_Filter_but");
		webtest.mouseToElementandClick("xpath=//a[text()='提问者昵称']");
		Thread.sleep(1000);
		webtest.type("class=admin_Filter_search", "test01");
		Thread.sleep(1000);
		webtest.click("class=admin_Filter_bth");
		Thread.sleep(1000);
		webtest.isDisplayed("class=admin_Filter_bth");
		Thread.sleep(3000);
	}

//	23、高级搜索（问答，按是否推荐）
	@Test
	public void test_c5() throws InterruptedException {
		webtest.leaveFrame();
		webtest.click("xpath=//span[text()='问答']");
		Thread.sleep(1000);
		webtest.enterFrame("rightMain");
		webtest.mouseToElementandClick("class=admin_new_search_gj");
		Thread.sleep(1000);
		webtest.click("class=admin_screenlist");
		webtest.click("xpath=//a[text()='已推荐']");
		Thread.sleep(1000);
		webtest.isDisplayed("class=admin_Filter_bth");
		Thread.sleep(3000);
	}

//	24、高级搜索（问答，按是否审核）
	@Test
	public void test_c6() throws InterruptedException {
		webtest.leaveFrame();
		webtest.click("xpath=//span[text()='问答']");
		Thread.sleep(1000);
		webtest.enterFrame("rightMain");
		webtest.mouseToElementandClick("class=admin_new_search_gj");
		Thread.sleep(1000);
		webtest.click("class=admin_screenlist");
		webtest.click("xpath=//a[text()='未审核']");
		Thread.sleep(1000);
		webtest.isDisplayed("class=admin_Filter_bth");
		Thread.sleep(3000);
	}

//	25、排序（问答，按提问时间）
	@Test
	public void test_c7() throws InterruptedException {
		webtest.leaveFrame();
		webtest.click("xpath=//span[text()='问答']");
		Thread.sleep(1000);
		webtest.enterFrame("rightMain");
		webtest.mouseToElementandClick("xpath=//*[@id='myform']/table/thead/tr/th[6]/a");
		Thread.sleep(1000);
		webtest.isDisplayed("class=admin_Filter_bth");
		Thread.sleep(3000);
	}

//	26、问答设置提交
	@Test
	public void test_c8() throws InterruptedException {
		webtest.leaveFrame();
		webtest.click("xpath=//span[text()='问答']");
		Thread.sleep(1000);
		webtest.mouseToElementandClick("xpath=//a[text()='问答设置']");
		webtest.enterFrame("rightMain");
		Thread.sleep(3000);
		webtest.click("xpath=//*[@id='config']");
		Thread.sleep(3000);
		webtest.isDisplayed("xpath=//*[@id='config']");
		Thread.sleep(3000);
	}

//	27、问答设置重置
	@Test
	public void test_c9() throws InterruptedException {
		webtest.leaveFrame();
		webtest.click("xpath=//span[text()='问答']");
		Thread.sleep(1000);
		webtest.mouseToElementandClick("xpath=//a[text()='问答设置']");
		webtest.enterFrame("rightMain");
		Thread.sleep(3000);
//		webtest.click("xpath=//a[@value='重置']");
		webtest.click("xpath=/tag_box/div/table/tbody/tr[5]/td/input[3]");
		Thread.sleep(3000);
		webtest.isDisplayed("xpath=/tag_box/div/table/tbody/tr[5]/td/input[3]");
		Thread.sleep(3000);
	}

//	28、问答设置关闭审核
	@Test
	public void test_d1() throws InterruptedException {
		webtest.leaveFrame();
		webtest.click("xpath=//span[text()='问答']");
		Thread.sleep(1000);
		webtest.mouseToElementandClick("xpath=//a[text()='问答设置']");
		webtest.enterFrame("rightMain");
		Thread.sleep(1000);
		webtest.click("xpath=//em[text()='开启']");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id='config']");
		Thread.sleep(2000);
		webtest.isDisplayed("xpath=//*[@id='config']");
		Thread.sleep(3000);
	}

//	29、问答设置前台问卷发布次数
	@Test
	public void test_d2() throws InterruptedException {
		webtest.leaveFrame();
		webtest.click("xpath=//span[text()='问答']");
		Thread.sleep(1000);
		webtest.mouseToElementandClick("xpath=//a[text()='问答设置']");
		webtest.enterFrame("rightMain");
		Thread.sleep(1000);
		webtest.typeAndClear("xpath=//*[@id='sy_day_ask_num']", "20");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@id='config']");
		Thread.sleep(2000);
		webtest.isDisplayed("xpath=//*[@id='config']");
		Thread.sleep(3000);
	}

//	30、问答修改
	@Test
	public void test_d3() throws InterruptedException {
		webtest.leaveFrame();
		webtest.click("xpath=//span[text()='问答']");
		Thread.sleep(1000);
		webtest.mouseToElementandClick("xpath=//a[text()='问答类别']");
		Thread.sleep(2000);
		webtest.enterFrame("rightMain");
		webtest.click("xpath=//*[@id='list53']/td[5]/a[2]");// 修改
		Thread.sleep(1000);
		webtest.typeAndClear("xpath=//*[@id='qform']/table/tbody/tr[3]/td/input", "20");// 更改排序
		Thread.sleep(2000);
		webtest.runJs("window.scrollTo(0,550);");// 下拉滚动条
		webtest.click("xpath=//*[@id='qform']/table/tbody/tr[7]/td/input[2]");// 更新
		Thread.sleep(2000);
		webtest.isDisplayed("xpath=//*[@id='config']");
		Thread.sleep(3000);
	}

	// 31、问答添加类别
	@Test
	public void test_d4() throws InterruptedException {
		webtest.leaveFrame();
		webtest.click("xpath=//span[text()='问答']");
		Thread.sleep(1000);
		webtest.mouseToElementandClick("xpath=//a[text()='问答类别']");
		Thread.sleep(2000);
		webtest.enterFrame("rightMain");
		webtest.click("xpath=//a[text()=' + 添加类别']");// 修改
		Thread.sleep(2000);
		webtest.typeAndClear("xpath=//*[@id='name']", "aaa");// 更改类别名称
		Thread.sleep(1000);
		webtest.runJs("window.scrollTo(0,550);");// 下拉滚动条
		webtest.click("xpath=//*[@id='qform']/table/tbody/tr[7]/td/input[1]");// 添加
		Thread.sleep(2000);
		webtest.isDisplayed("xpath=//a[text()=' + 添加类别']");
		Thread.sleep(3000);
	}

	// 32、工具箱，根据文档名进行搜索
	@Test
	public void test_d5() throws InterruptedException {
		webtest.leaveFrame();
		webtest.click("xpath=//span[text()='工具箱']");
		Thread.sleep(1000);
		webtest.enterFrame("rightMain");
		webtest.type("class=admin_Filter_search", "test");
		Thread.sleep(2000);
		webtest.click("class=admin_Filter_bth");// 搜索
		Thread.sleep(2000);
		webtest.isDisplayed("class=admin_Filter_bth");
		Thread.sleep(3000);
	}

	// 33、工具箱，根据类别名进行搜索
	@Test
	public void test_d6() throws InterruptedException {
		webtest.leaveFrame();
		webtest.click("xpath=//span[text()='工具箱']");
		Thread.sleep(1000);
		webtest.enterFrame("rightMain");
		webtest.mouseToElement("id=btype");
		webtest.mouseToElementandClick("xpath=//a[text()='类别名']");
		Thread.sleep(1000);
		webtest.type("class=admin_Filter_search", "test");
		Thread.sleep(2000);
		webtest.click("class=admin_Filter_bth");// 搜索
		Thread.sleep(2000);
		webtest.isDisplayed("class=admin_Filter_bth");
		Thread.sleep(3000);
	}

	// 34、工具箱，高级搜索，前台显示
	@Test
	public void test_d7() throws InterruptedException {
		webtest.leaveFrame();
		webtest.click("xpath=//span[text()='工具箱']");
		Thread.sleep(1000);
		webtest.enterFrame("rightMain");
		webtest.click("xpath=//a[text()='高级搜索']");
		Thread.sleep(1000);
		webtest.click("class=admin_screenlist");
		webtest.click("xpath=//a[text()='显示']");
		Thread.sleep(2000);
		webtest.isDisplayed("class=admin_Filter_bth");
		Thread.sleep(3000);
	}

	// 35、工具箱，高级搜索，上传日期
	@Test
	public void test_d8() throws InterruptedException {
		webtest.leaveFrame();
		webtest.click("xpath=//span[text()='工具箱']");
		Thread.sleep(1000);
		webtest.enterFrame("rightMain");
		webtest.click("xpath=//a[text()='高级搜索']");
		Thread.sleep(1000);
		webtest.click("class=admin_screenlist");
		webtest.click("xpath=//a[text()='最近一个月']");
		Thread.sleep(2000);
		webtest.isDisplayed("class=admin_Filter_bth");
		Thread.sleep(3000);
	}

	// 36、工具箱，工具箱类别，编辑修改
	@Test
	public void test_d9() throws InterruptedException {
		webtest.leaveFrame();
		webtest.click("xpath=//span[text()='工具箱']");
		Thread.sleep(1000);
		webtest.click("xpath=//a[text()='工具箱类别']");
		Thread.sleep(1000);
		webtest.enterFrame("rightMain");
		webtest.click("xpath=//*[@id='list7']/td[5]/a[1]");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@name='myform']/table/tbody/tr[6]/td/input[2]");
		Thread.sleep(2000);
		webtest.isDisplayed("class=admin_new_cz_tj");
		Thread.sleep(3000);
	}

	// 37、工具箱，工具箱类别，编辑重置
	@Test
	public void test_e1() throws InterruptedException {
		webtest.leaveFrame();
		webtest.click("xpath=//span[text()='工具箱']");
		Thread.sleep(1000);
		webtest.click("xpath=//a[text()='工具箱类别']");
		Thread.sleep(1000);
		webtest.enterFrame("rightMain");
		webtest.click("xpath=//*[@id='list7']/td[5]/a[1]");
		Thread.sleep(2000);
		webtest.type("xpath=//*[@id='name']", "招聘");
		Thread.sleep(2000);
		webtest.click("xpath=//*[@name='myform']/table/tbody/tr[6]/td/input[3]");
		webtest.isDisplayed("xpath=//*[@name='myform']/table/tbody/tr[6]/td/input[2]");
		Thread.sleep(3000);
	}

	// 38、工具箱，添加文档，重置
	@Test
	public void test_e2() throws InterruptedException {
		webtest.leaveFrame();
		webtest.click("xpath=//span[text()='工具箱']");
		Thread.sleep(1000);
		webtest.click("xpath=//a[text()='添加文档']");
		Thread.sleep(1000);
		webtest.enterFrame("rightMain");
		webtest.click("xpath=//*[@name='myform']/table/tbody/tr[6]/td/input[2]");
		webtest.isDisplayed("xpath=//*[@name='myform']/table/tbody/tr[6]/td/input[2]");
		Thread.sleep(3000);
	}

	// 39、公告，公告管理，搜索
	@Test
	public void test_e3() throws InterruptedException {
		webtest.leaveFrame();
		webtest.click("xpath=//span[text()='公告']");
		Thread.sleep(1000);
		webtest.enterFrame("rightMain");
		webtest.type("class=admin_Filter_search", "test");
		Thread.sleep(2000);
		webtest.click("class=admin_Filter_bth");// 搜索
		Thread.sleep(2000);
		webtest.isDisplayed("class=admin_Filter_bth");
		Thread.sleep(3000);
	}

	// 40、公告，公告管理，高级搜索（最近一个月）
	@Test
	public void test_e4() throws InterruptedException {
		webtest.leaveFrame();
		webtest.click("xpath=//span[text()='公告']");
		Thread.sleep(1000);
		webtest.enterFrame("rightMain");
		webtest.click("xpath=//a[text()='高级搜索']");
		Thread.sleep(1000);
		webtest.click("class=admin_screenlist");
		webtest.click("xpath=//a[text()='最近一个月']");
		Thread.sleep(2000);
		webtest.isDisplayed("class=admin_Filter_bth");
		Thread.sleep(3000);
	}

	// 41、公告，公告管理，按照编号排序
	@Test
	public void test_e5() throws InterruptedException {
		webtest.leaveFrame();
		webtest.click("xpath=//span[text()='公告']");
		Thread.sleep(1000);
		webtest.enterFrame("rightMain");
		webtest.click("xpath=//a[text()='编号']");
		Thread.sleep(2000);
		webtest.isDisplayed("class=admin_Filter_bth");
		Thread.sleep(3000);
	}

}

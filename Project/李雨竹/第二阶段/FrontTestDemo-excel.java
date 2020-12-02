package com.webtest.demo;

import static org.testng.Assert.assertTrue;




import org.testng.Assert;
import org.testng.annotations.Test;
import com.webtest.core.BaseTest;
import com.webtest.dataprovider.NSDataProvider;



public class FrontTestDemo extends BaseTest {

	// 注册账号功能、创建简历
	@Test(dataProvider = "excel1",dataProviderClass = NSDataProvider.class)
	public void testA1(String s1,String s2,String s3,String s4,String s5, String s6, 
			String s7, String s8,String s9,String s10, String s11) throws InterruptedException {
		System.out.println("testA1");
		webtest.open("");
		Thread.sleep(3000);
		webtest.click("xpath=//a[text()='免费注册']");
		Thread.sleep(3000);
		webtest.type("id=username1",s1);// 用户名
		webtest.type("id=CheckCode", s2);// 验证码
		webtest.type("id=password", s3);// 密码
		webtest.type("id=passconfirm", s4);// 确认密码
		Thread.sleep(3000);
		webtest.click("id=subreg");// 点击“立即注册”
		Thread.sleep(3000);
		// 选择“我是求职者”
		webtest.click("class=reg_role_bth");
		Thread.sleep(3000);
		// 点击“立即完善”开始创建简历
		// webtest.click("id=reg_role_bth");
		// Thread.sleep(3000);
		// 创建简历
		// 求职意向
		webtest.type("id=name", s5);
		// 工作职能
		webtest.click("class=news_expect_text_new_nth");
		webtest.click("name=IT-品管、技术支持及其它");
		webtest.click("name=技术支持/维护经理");
		webtest.click("class=queding");
		// 期望城市
		webtest.click("xpath=(//div[@class='news_expect_text_new_nth'])[2]");
		webtest.click("name=北京");
		webtest.click("class=queding");
		Thread.sleep(3000);
		// 薪资
		webtest.type("id=minsalary", s6);
		webtest.type("id=maxsalary", s7);
		webtest.click("xpath=(//input[@class='layui-input layui-unselect'])[2]");
		webtest.click("xpath=//dd[text()='兼职']");
		webtest.click("xpath=(//input[@class='layui-input layui-unselect'])[3]");
		webtest.click("xpath=//dd[text()='计算机/互联网']");
		webtest.click("xpath=(//input[@class='layui-input layui-unselect'])[4]");
		webtest.click("xpath=//dd[text()='其他']");
		Thread.sleep(3000);
		// 基本信息
		webtest.type("id=uname", s8);
		webtest.click("xpath=//input[@placeholder='请选择最高学历']");
		webtest.click("xpath=//dd[text()='本科']");
		webtest.click("id=1sex");// 性别
		webtest.typeAndClear("id=living", s9);// 地址
		webtest.type("id=telphone", s10);
		webtest.click("xpath=//input[@placeholder='请选择工作经验']");
		webtest.click("xpath=//dd[text()='应届毕业生']");
		webtest.click("name=submit");
		Thread.sleep(3000);

		// 工作经历
		webtest.click("xpath=//div[text()='无']");
		// webtest.click("xpath=//input[@value='下一步']");
		// webtest.click("class=news_expect_list_sub");
		webtest.click("xpath=(//input[@class='news_expect_list_sub'])[2]");
		// 学校
		webtest.type("id=eduname", s11);
		webtest.click("id=edusdate");
		webtest.click("xpath=//div[@class='layui-laydate-header']/i[1]");
		webtest.click("xpath=//li[text()='九月']");

		webtest.click("id=eduedate");
		webtest.click("xpath=//div[@class='layui-laydate-header']/i[4]");
		Thread.sleep(3000);
		webtest.click("xpath=//li[text()='六月']");
		webtest.click("xpath=//span[text()='确定']");
		webtest.click("xpath=//input[@placeholder='请选择学历']");
		webtest.click("xpath=(//dl[@class='layui-anim layui-anim-upbit'])[7]/dd[6]");
		webtest.type("id=eduspec", "软件工程");
		webtest.click("xpath=(//input[@class='news_expect_list_sub'])[3]");
		Thread.sleep(3000);

		assertTrue(webtest.isTextPresent("恭喜您，简历创建成功"));

	}

	// 测试登录功能
	@Test(dataProvider = "excel2",dataProviderClass = NSDataProvider.class)
	public void testA2(String s1,String s2) throws InterruptedException {
		System.out.println("testA2");
		webtest.open("");
		webtest.click("xpath=//a[text()='用户登录']");
		Thread.sleep(3000);
		webtest.type("id=username", s1);
		Thread.sleep(3000);
		webtest.click("id=password2");
		webtest.type("id=password", s2);
		webtest.click("id=sublogin");
		Thread.sleep(3000);
	}

	// 测试前台“手机版”界面跳转
	@Test
	public void testA3() throws InterruptedException {
		System.out.println("testA3");
		webtest.open("");
		Thread.sleep(3000);
		webtest.click("xpath=//a[text()='手机版']");
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("功能不打折"));
	}

	// 测试前台“微信版”界面跳转
	@Test
	public void testA4() throws InterruptedException {
		System.out.println("testA4");
		webtest.open("");
		Thread.sleep(3000);
		webtest.click("xpath=//a[text()='微信版']");
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("微信接受面试通知"));
	}

	// 搜索框的下拉列表功能
	@Test(dataProvider = "excel3",dataProviderClass = NSDataProvider.class)
	public void testA5(String s1) throws InterruptedException {
		System.out.println("testA5");
		webtest.open("");
		Thread.sleep(3000);
		webtest.mouseToElement("id=search_name");
		webtest.mouseToElementandClick("xpath=//div[@class='hp_head_search_job fl']/div[1]/a[1]");
		Thread.sleep(3000);
		webtest.type("xpath=//input[@placeholder='请输入要搜索的关键字，如 会计,仓管,设计师等']", s1);
		webtest.click("xpath=//input[@type='submit']");
		assertTrue(webtest.isTextPresent(s1));
	}

	// 轮播图的左右键功能
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

	// 个人中心-测试刷新简历功能
	@Test(dataProvider = "excel2",dataProviderClass = NSDataProvider.class)
	public void testA8(String s1,String s2) throws InterruptedException {
		System.out.println("testA8");
		// 登录
		webtest.open("");
		webtest.click("xpath=//a[text()='用户登录']");
		Thread.sleep(3000);
		webtest.type("id=username", s1);
		Thread.sleep(3000);
		webtest.click("id=password2");
		webtest.type("id=password",s2);
		webtest.click("id=sublogin");
		webtest.click("xpath=//a[text()='进入用户中心>>']");
		Thread.sleep(3000);
//		// 提示框点击“暂不刷新”
//		webtest.click("xpath=//a[text()='暂不刷新']");
//		Thread.sleep(3000);
		// 点击“刷新简历”
		webtest.click("xpath=//a[text()='刷新简历']");
		webtest.click("xpath=//a[text()='确定']");
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("刷新成功"));

	}

	// 个人中心-退出登录功能
	@Test(dataProvider = "excel2",dataProviderClass = NSDataProvider.class)
	public void testA9(String s1,String s2) throws InterruptedException {
		System.out.println("testA9");
		// 登录
		webtest.open("");
		webtest.click("xpath=//a[text()='用户登录']");
		webtest.type("id=username", s1);
		Thread.sleep(3000);
		webtest.click("id=password2");
		webtest.type("id=password", s2);
		webtest.click("id=sublogin");
		webtest.click("xpath=//a[text()='进入用户中心>>']");
		Thread.sleep(3000);
		// 退出登录
		webtest.mouseToElement("class=yun_m_headertx_hi_icon");
		webtest.mouseToElementandClick("xpath=//a[text()='退出登录']");
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("用户登录"));
	}

	// 个人中心-修改简历功能
	@Test(dataProvider = "excel4",dataProviderClass = NSDataProvider.class)
	public void testB0(String s1,String s2,String s3) throws InterruptedException {
		System.out.println("testB0");
		// 登录
		webtest.open("");
		webtest.click("xpath=//a[text()='用户登录']");
		webtest.type("id=username",s1);
		Thread.sleep(3000);
		webtest.click("id=password2");
		webtest.type("id=password", s2);
		webtest.click("id=sublogin");
		webtest.click("xpath=//a[text()='进入用户中心>>']");
		Thread.sleep(3000);
		// 点击“修改简历”
		webtest.click("xpath=//a[text()='修改简历']");
		webtest.mouseToElement("id=info_upbox");
		webtest.mouseToElementandClick("id=compile_info");
		webtest.typeAndClear("id=name",s3);
		webtest.click("xpath=//div[text()='未婚']");
		webtest.click("name=submitBtn");
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("未婚"));
	}

	// 个人中心-修改个人信息
	@Test(dataProvider = "excel4",dataProviderClass = NSDataProvider.class)
	public void testB1(String s1,String s2,String s3) throws InterruptedException {
		System.out.println("testB1");
		// 登录
		webtest.open("");
		webtest.click("xpath=//a[text()='用户登录']");
		webtest.type("id=username", s1);
		Thread.sleep(3000);
		webtest.click("id=password2");
		webtest.type("id=password", s2);
		webtest.click("id=sublogin");
		webtest.click("xpath=//a[text()='进入用户中心>>']");
		Thread.sleep(3000);
		// 修改个人信息
		webtest.click("xpath=//a[text()='修改个人信息>']");
		webtest.typeAndClear("id=name",s3);
		webtest.click("xpath=//input[@value='完全公开']");
		webtest.click("xpath=//dd[text()='显示编号']");
		webtest.click("xpath=//input[@value='保存信息']");
		Thread.sleep(3000);
		;
		assertTrue(webtest.isTextPresent("显示编号"));
	}

	// 简历管理-在线黏贴简历功能
	// 简历数小于2
	@Test(dataProvider = "excel5",dataProviderClass = NSDataProvider.class)
	public void testB2(String s1,String s2,String s3,String s4,String s5) throws InterruptedException {
		System.out.println("testB2");
		// 登录
		webtest.open("");
		webtest.click("xpath=//a[text()='用户登录']");
		Thread.sleep(3000);
		webtest.type("id=username", s1);
		Thread.sleep(3000);
		webtest.click("id=password2");
		webtest.type("id=password", s2);
		webtest.click("id=sublogin");
		webtest.click("xpath=//a[text()='进入用户中心>>']");
		Thread.sleep(3000);
		// 点击“简历管理”
		webtest.click("xpath=//a[text()=' 简历管理']");
		Thread.sleep(3000);
		// 点击"在线黏贴简历"
		webtest.click("xpath=//a[text()='在线粘贴简历']");
		// 填写部分简历内容
		webtest.type("id=name", s3);
		webtest.click("xpath=//input[@placeholder='不限']");
		webtest.click("xpath=//dd[text()='计算机/互联网']");
		Thread.sleep(3000);
		webtest.click("xpath=//div[@title='选择职位类别']");
		webtest.click("name=IT-品管、技术支持及其它");
		webtest.click("name=技术支持/维护经理");
		webtest.click("class=queding");
		webtest.click("xpath=//div[@title='选择城市']");
		webtest.click("name=北京");
		webtest.click("class=queding");
		Thread.sleep(3000);
		// 薪资待遇
		webtest.type("id=minsalary",s4);
		webtest.type("id=maxsalary", s5);
		// 工作性质
		webtest.click("xpath=//input[@placeholder='请选择工作性质']");
		webtest.click("xpath=//dd[text()='全职']");
		webtest.click("xpath=//input[@placeholder='请选择到岗时间']");
		webtest.click("xpath=//dd[text()='随时到岗']");
		webtest.click("xpath=//input[@placeholder='请选择求职状态']");
		webtest.click("xpath=//dd[text()='其他']");
		Thread.sleep(3000);
		webtest.click("name=submit");
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("设为默认"));

	}

	// 简历管理-简历外发功能
	@Test(dataProvider = "excel6",dataProviderClass = NSDataProvider.class)
	public void testB3(String s1,String s2,String s3,String s4,String s5) throws InterruptedException {
		System.out.println("testB3");
		// 登录
		webtest.open("");
		webtest.click("xpath=//a[text()='用户登录']");
		Thread.sleep(3000);
		webtest.type("id=username", s1);
		Thread.sleep(3000);
		webtest.click("id=password2");
		webtest.type("id=password", s2);
		webtest.click("id=sublogin");
		webtest.click("xpath=//a[text()='进入用户中心>>']");
		Thread.sleep(3000);
		// 点击“简历管理”
		webtest.click("xpath=//a[text()=' 简历管理']");
		// 点击“简历外发”
		webtest.click("xpath=//span[text()='简历外发']");
		// 填写
		webtest.click("xpath=//input[@placeholder='请选择简历']");
		webtest.click("xpath=//dd[text()='测试']");
		webtest.type("id=email", s3);
		webtest.type("id=comname", s4);
		webtest.type("id=jobname", s5);
		webtest.click("name=submit");
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("京东"));

	}

	// 简历管理-简历模板购买
	// 购买足够积分的简历
	@Test(dataProvider = "excel2",dataProviderClass = NSDataProvider.class)
	public void testB4(String s1,String s2) throws InterruptedException {
		System.out.println("testB4");
		// 登录
		webtest.open("");
		webtest.click("xpath=//a[text()='用户登录']");
		Thread.sleep(3000);
		webtest.type("id=username", s1);
		Thread.sleep(3000);
		webtest.click("id=password2");
		webtest.type("id=password", s2);
		webtest.click("id=sublogin");
		webtest.click("xpath=//a[text()='进入用户中心>>']");
		Thread.sleep(3000);
		// 点击“简历管理”
		webtest.click("xpath=//a[text()=' 简历管理']");
		// 点击“简历模板”
		webtest.click("xpath=//span[text()='简历模板']");
		Thread.sleep(3000);
		// 点击“购买”
		webtest.click("xpath=//a[contains(@onclick,'购买模板将花费10积分')]");// 包含文本
		Thread.sleep(3000);
		webtest.click("xpath=//a[text()='确定']");
		Boolean flag = webtest.isElementPresent("xpath=//a[text()='使用']");
		System.out.println(flag);
		assertTrue(flag);
	}

	// 简历管理-设置默认简历的功能
	// 有两个简历
	@Test(dataProvider = "excel2",dataProviderClass = NSDataProvider.class)
	public void testB5(String s1,String s2) throws InterruptedException {
		System.out.println("testB5");
		// 登录
		webtest.open("");
		webtest.click("xpath=//a[text()='用户登录']");
		webtest.type("id=username", s1);
		Thread.sleep(3000);
		webtest.click("id=password2");
		webtest.type("id=password", s2);
		webtest.click("id=sublogin");
		webtest.click("xpath=//a[text()='进入用户中心>>']");
		Thread.sleep(3000);
		webtest.click("xpath=//a[text()=' 简历管理']");
		webtest.click("xpath=//span[text()='我的简历']");
		webtest.click("class=myresume_default_set_a");
		// 弹窗，确认要执行
		webtest.click("class=layui-layer-btn0");
		Thread.sleep(3000);
		// 断言
		Boolean flag = webtest.isElementPresent("xpath=//span[text()='默认简历']");
		Assert.assertTrue(flag);
	}

	// 求值管理-新增职位搜索器功能
	// 职位管理器数量小于2
	@Test(dataProvider = "excel7",dataProviderClass = NSDataProvider.class)
	public void testB6(String s1,String s2,String s3,String s4,String s5,String s6) throws InterruptedException {
		System.out.println("testB6");
		// 登录
		webtest.open("");
		webtest.click("xpath=//a[text()='用户登录']");
		Thread.sleep(3000);
		webtest.type("id=username", s1);
		Thread.sleep(3000);
		webtest.click("id=password2");
		webtest.type("id=password", s2);
		webtest.click("id=sublogin");
		webtest.click("xpath=//a[text()='进入用户中心>>']");
		Thread.sleep(3000);
		// 点击“求职管理”
		webtest.click("xpath=//a[text()='求职管理']");
		// 点击“职位搜索器”
		webtest.click("xpath=//span[text()='职位搜索器']");
		webtest.click("xpath=//a[text()='新增搜索器']");
		Thread.sleep(3000);
		// "职位搜索器"
		webtest.type("xpath=//input[@placeholder=' 如，搜索会计']", s3);
		webtest.type("name=keyword", s4);
		webtest.click("xpath=//input[@placeholder='请选择行业']");
		webtest.click("xpath=//dd[text()='计算机/互联网']");
		webtest.click("xpath=//input[@placeholder='请选择工作地区']");
		webtest.click("xpath=//dd[text()='北京']");
		webtest.type("id=minsalary", s5);
		webtest.type("id=maxsalary", s6);
		webtest.click("xpath=//input[@placeholder='请选择学历要求']");
		webtest.click("xpath=//dd[text()='本科']");
		webtest.click("xpath=//input[@placeholder='请选择工作经验']");
		webtest.click("xpath=//dd[text()='应届毕业生']");
		webtest.click("name=submitBtn");
		assertTrue(webtest.isTextPresent("测试"));

	}

	// 财务管理-充值功能
	// 之前无未支付的订单
	@Test(dataProvider = "excel8",dataProviderClass = NSDataProvider.class)
	public void testB7(String s1,String s2,String s3) throws InterruptedException {
		System.out.println("testB7");
		// 登录
		webtest.open("");
		webtest.click("xpath=//a[text()='用户登录']");
		webtest.type("id=username", s1);
		Thread.sleep(3000);
		webtest.click("id=password2");
		webtest.type("id=password", s2);
		webtest.click("id=sublogin");
		webtest.click("xpath=//a[text()='进入用户中心>>']");
		Thread.sleep(3000);
		// 点击“财务管理”
		webtest.click("xpath=//a[text()='财务管理']");
		webtest.click("xpath=//span[text()='立即充值']");
		webtest.click("class=payment_list_text_n");
		webtest.type("id=remark", s3);
		webtest.click("class=payment_list_other");
		assertTrue(webtest.isTextPresent("订单编号"));

	}

	// 财务管理-取消充值功能
	@Test(dataProvider = "excel2",dataProviderClass = NSDataProvider.class)
	public void testB8(String s1,String s2) throws InterruptedException {
		System.out.println("testB8");
		// 登录
		webtest.open("");
		webtest.click("xpath=//a[text()='用户登录']");
		webtest.type("id=username", s1);
		Thread.sleep(3000);
		webtest.click("id=password2");
		webtest.type("id=password", s2);
		webtest.click("id=sublogin");
		webtest.click("xpath=//a[text()='进入用户中心>>']");
		Thread.sleep(3000);
		// 点击“财务管理”
		webtest.click("xpath=//a[text()='财务管理']");
		webtest.click("xpath=//span[text()='财务明细']");
		webtest.click("xpath=//a[contains(text(),'取消充值')]");
		// 弹窗
		webtest.click("class=layui-layer-btn0");
		assertTrue(webtest.isTextPresent("充值"));
	}

	// 财务管理-积分管理-积分任务模块
	// 之前未签到
	@Test(dataProvider = "excel2",dataProviderClass = NSDataProvider.class)
	public void testB9(String s1,String s2) throws InterruptedException {
		System.out.println("testB9");
		// 登录
		webtest.open("");
		webtest.click("xpath=//a[text()='用户登录']");
		webtest.type("id=username", s1);
		Thread.sleep(3000);
		webtest.click("id=password2");
		webtest.type("id=password", s2);
		webtest.click("id=sublogin");
		webtest.click("xpath=//a[text()='进入用户中心>>']");
		Thread.sleep(3000);
		// 点击“财务管理”
		webtest.click("xpath=//a[text()='财务管理']");
		webtest.click("xpath=//span[text()='积分管理']");
		webtest.click("xpath=//a[text()='签到']");
		assertTrue(webtest.isTextPresent("已签到"));

	}

	// 账号中心-账户修改功能
	@Test(dataProvider = "excel9",dataProviderClass = NSDataProvider.class)
	public void testC1(String s1,String s2,String s3,String s4,String s5,String s6) throws InterruptedException {
		System.out.println("testC1");
		// 登录
		webtest.open("");
		webtest.click("xpath=//a[text()='用户登录']");
		Thread.sleep(3000);
		webtest.type("id=username", s1);
		Thread.sleep(3000);
		webtest.click("id=password2");
		webtest.type("id=password", s2);
		webtest.click("id=sublogin");
		webtest.click("xpath=//a[text()='进入用户中心>>']");
		Thread.sleep(3000);
		// 点击“账号中心”
		webtest.click("xpath=//a[text()='账号中心']");
		Thread.sleep(3000);
		// 点击“账号安全”
		webtest.click("xpath=//a[text()='账号安全']");
		webtest.click("xpath=//a[text()='修改']");
		webtest.type("id=username", s3);
		webtest.type("id=password", s4);
		webtest.click("name=submit2");
		Thread.sleep(3000);
		// 重新登录
		webtest.type("id=username", s5);
		Thread.sleep(3000);
		webtest.click("id=password2");
		webtest.type("id=password", s6);
		webtest.click("id=sublogin");
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("已使用"));
	}

	@Test(dataProvider = "excel10",dataProviderClass = NSDataProvider.class)
	// 账号中心-账号安全-账号密码修改
	public void testC2(String s1,String s2,String s3,String s4,String s5, String s6, 
			String s7) throws InterruptedException {
		System.out.println("testC2");
		// 登录
		webtest.open("");
		webtest.click("xpath=//a[text()='用户登录']");
		Thread.sleep(3000);
		webtest.type("id=username", s1);
		Thread.sleep(3000);
		webtest.click("id=password2");
		webtest.type("id=password", s2);
		webtest.click("id=sublogin");
		webtest.click("xpath=//a[text()='进入用户中心>>']");
		Thread.sleep(3000);
		// 点击“账号中心”
		webtest.click("xpath=//a[text()='账号中心']");
		Thread.sleep(3000);
		// 点击“账号安全”
		webtest.click("xpath=//a[text()='账号安全']");
		webtest.click("xpath=(//a[@class='account_settings_bth_hv'])[1]");
		webtest.type("id=oldpassword", s3);
		webtest.type("id=newpassword", s4);
		webtest.type("id=repassword", s5);
		webtest.click("name=submit");
		Thread.sleep(5000);
		// 重新登录
		webtest.type("id=username", s6);
		Thread.sleep(3000);
		webtest.click("id=password2");
		webtest.type("id=password", s7);
		webtest.click("id=sublogin");
		Thread.sleep(3000);
		assertTrue(webtest.isTextPresent("修改"));

	}

}

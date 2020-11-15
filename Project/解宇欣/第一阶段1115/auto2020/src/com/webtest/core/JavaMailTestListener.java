package com.webtest.core;

import java.io.IOException;
import java.util.List;

import org.testng.ITestContext;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class JavaMailTestListener extends TestListenerAdapter{
	@Override
	public void onFinish(ITestContext testContext) {
		// TODO Auto-generated method stub
		//super.onFinish(testContext);
       //打印出所有的测试用例数目
		ITestNGMethod[] methods=this.getAllTestMethods();
        System.out.println("一共执行了："+methods.length);
      //成功的/失败的测试用例名称和数目
        String text="失败的测试用例：";
        List<ITestResult> failList=this.getFailedTests();//返回的是容器
		int len=failList.size();
		System.out.println("失败的测试用例:"+failList.size());
		for(int i=0;i<len;i++) {
			ITestResult tr=failList.get(i);
			text=text+tr.getInstanceName()+":"+tr.getName()+", ";
			System.out.println(tr.getInstanceName()+":"+tr.getName()+"失败了");
		}
		
		//发送邮件
		try {
			MailUtil.sendMsg(text);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//this.getPassedTests();//成功的
	}
}

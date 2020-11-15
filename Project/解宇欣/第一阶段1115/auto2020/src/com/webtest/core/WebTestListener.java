package com.webtest.core;

import java.util.List;

import org.testng.ITestContext;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

//������
public class WebTestListener extends TestListenerAdapter {

	@Override
	public void onFinish(ITestContext testContext) {
		// TODO Auto-generated method stub
		// super.onFinish(testContext);
		// ��ӡ�����еĲ���������Ŀ
		ITestNGMethod[] methods = this.getAllTestMethods();
		System.out.println("һ��ִ���ˣ�" + methods.length);
		// �ɹ���/ʧ�ܵĲ����������ƺ���Ŀ
		List<ITestResult> failList = this.getFailedTests();// ���ص�������
		int len = failList.size();
		System.out.println("ʧ�ܵĲ�������:" + failList.size());
		for (int i = 0; i < len; i++) {
			ITestResult tr = failList.get(i);
			System.out.println(tr.getInstanceName() + ":" + tr.getName() + "ʧ����");
		}
		// �����ʼ�

		// this.getPassedTests();//�ɹ���
	}

//	@Override
//	public void onTestFailure(ITestResult tr) {
	// TODO Auto-generated method stub
	// super.onTestFailure(tr);
	// ʧ�ܵĲ�����������
//		BaseTest tb=(BaseTest)tr.getInstance();
//		SeleniumScreenShot screenShot=new SeleniumScreenShot(tb.getDriver());
//		try {
//			screenShot.screenShot();
//			System.out.println("onTestFailure��"+tr.getInstanceName()+":"+tr.getName()+"ʧ����");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

//	}

}

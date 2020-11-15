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
       //��ӡ�����еĲ���������Ŀ
		ITestNGMethod[] methods=this.getAllTestMethods();
        System.out.println("һ��ִ���ˣ�"+methods.length);
      //�ɹ���/ʧ�ܵĲ����������ƺ���Ŀ
        String text="ʧ�ܵĲ���������";
        List<ITestResult> failList=this.getFailedTests();//���ص�������
		int len=failList.size();
		System.out.println("ʧ�ܵĲ�������:"+failList.size());
		for(int i=0;i<len;i++) {
			ITestResult tr=failList.get(i);
			text=text+tr.getInstanceName()+":"+tr.getName()+", ";
			System.out.println(tr.getInstanceName()+":"+tr.getName()+"ʧ����");
		}
		
		//�����ʼ�
		try {
			MailUtil.sendMsg(text);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//this.getPassedTests();//�ɹ���
	}
}

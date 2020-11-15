package com.webtest.core;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class MailUtil {
	private static String sender = "test2014123@126.com";// 发件人
	private static String auth_code = "VZWDRLIBCRCPABRM";// 授权码
	private static String to;
	public static final String filePath = "conf/config.properties";

	public static void sendMsg(String text) throws IOException {
		// 创建一个Properties
		Properties properties = new Properties();
		// 获得tomail
		FileInputStream is = new FileInputStream(filePath);
		properties.load(is);
		is.close();
		String tomail = properties.getProperty("tomail");

		properties.put("mail.transport.protocol", "smtp");
		properties.put("mail.smtp.host", "smtp.126.com");
		properties.put("mail.smtp.auth", true);

		// 1.构造session对象（邮件会话对象），设置服务器，授权码，需要Properties对象
		Session session = Session.getInstance(properties, new Authenticator() {

			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				// TODO Auto-generated method stub
				// 发件人，授权码
				return new PasswordAuthentication(sender, auth_code);
			}

		});

		// 2.创建邮件，创建message对象，子类MimeMessage
		// 设置发件人，收件人，主题正文
		for (int i = 0; i < 2; i++) {
			Message message = new MimeMessage(session);
			// 进行字符串分割，获取两个邮箱
			to = tomail.split(",")[i];
			try {
				message.setFrom(new InternetAddress(sender));// 发件人
				message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));// 收件人
				message.setSubject("开源测试work07");// 主题
				message.setText(text); // 正文
				// 3.发送邮件
				Transport.send(message);
			} catch (MessagingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}

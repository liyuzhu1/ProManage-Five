package com.hj.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hj.dao.CasesDao;
import com.hj.dao.impI.CasesDaoImpl;
import com.hj.entity.Cases;

/*
 *Cases���Ƕ�cases����ĳ�ʼ�����������������Ե�get��set����
 * index.jsp���ֽ��棬��ҳ���е����ť����edit.jsp����add.jsp�ļ���jsp�ļ����������õ�������post��ServletCases
 * ServletCases���jsp��post�����ݣ�������Ҫ���Ĳ�������dos�����ӻ�ɾ�����޸ģ�����Ҫ���������ݣ���:id��name���ݵȣ�
 * ����CasesDao�ӿ��������ķ�����add��updata��del�ȣ��������ݣ������ݿ�����޸ģ���������ʵ����CasesDaoImpl
 * add��updata��del�ȷ�����Ҫ����BaseDao���е��������ݿ⡢����sql����executeUpdate������executeQuery�������ر����ݿ�����
 
 * */

public class ServletCases extends HttpServlet{
	private static final long serialVersionUID = 1L;
	 
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		doPost(request, response);
	}
 
	public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
 
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		HttpSession session = request.getSession();
		PrintWriter out = response.getWriter();
 
		CasesDao ud = new CasesDaoImpl();
 
		String dos = request.getParameter("do");
		if (dos == null || dos.equals("")) {
			dos = "index";
		}
		// ��ҳ
		if (dos.equals("index")) {
			List<Cases> ulist = ud.getAllTable();
			session.setAttribute("ulist", ulist);
			response.sendRedirect("index.jsp");
			return;
		}
		if (dos.equals("add")) {
			String ids = request.getParameter("id");
			int id = Integer.parseInt(ids);
			String name = request.getParameter("name");
			String module = request.getParameter("module");
			String purpose = request.getParameter("purpose");
			Cases u = new Cases(id, name, module,purpose);
			ud.addDemo(u);
			out.print("<script>alert('�����ɹ���');window.location='servletcases?do=index';</script>");
		}
		if (dos.equals("del")) {
			String ids = request.getParameter("id");
			int id = Integer.parseInt(ids);
			ud.delDemo(id);
			out.print("<script>alert('ɾ���ɹ���');window.location='servletcases?do=index';</script>");
			return;
		}
		if (dos.equals("editbefore")) {
			String ids = request.getParameter("id");
			int id = Integer.parseInt(ids);
			Cases u=ud.findDemoById(id);
			session.setAttribute("editcase", u);
			response.sendRedirect("edit.jsp");
			return;
		}
		if (dos.equals("edit")) {
			String ids=request.getParameter("id");
			int id=Integer.parseInt(ids);
			String name = request.getParameter("name");
			String module = request.getParameter("module");
			String purpose = request.getParameter("purpose");
			Cases u = new Cases(id, name, module,purpose);
			ud.updateDemo(u);
			out.print("<script>alert('�޸ĳɹ���');window.location='servletcases?do=index';</script>");
			return;
		}
	}

}

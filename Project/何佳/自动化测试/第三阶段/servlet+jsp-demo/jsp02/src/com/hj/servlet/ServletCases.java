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
 *Cases类是对cases对象的初始化，包含他所有属性的get、set方法
 * index.jsp出现界面，在页面中点击按钮调用edit.jsp或者add.jsp文件，jsp文件的输入框里得到的数据post到ServletCases
 * ServletCases获得jsp中post的内容，包括需要做的操作类型dos（增加或删除或修改）和需要操作的数据（如:id、name数据等）
 * 调用CasesDao接口中声明的方法（add、updata，del等）操作数据，对数据库进行修改，方法具体实现在CasesDaoImpl
 * add、updata、del等方法需要调用BaseDao类中的连接数据库、操作sql语句的executeUpdate方法和executeQuery方法、关闭数据库连接
 
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
		// 主页
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
			out.print("<script>alert('新增成功！');window.location='servletcases?do=index';</script>");
		}
		if (dos.equals("del")) {
			String ids = request.getParameter("id");
			int id = Integer.parseInt(ids);
			ud.delDemo(id);
			out.print("<script>alert('删除成功！');window.location='servletcases?do=index';</script>");
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
			out.print("<script>alert('修改成功！');window.location='servletcases?do=index';</script>");
			return;
		}
	}

}

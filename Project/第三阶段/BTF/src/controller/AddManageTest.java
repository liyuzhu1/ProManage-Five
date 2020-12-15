package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import entity.ManageTest;
import service.ManageTestServiceImpl;

/**
 * Servlet implementation class AddEmployee
 */
//@WebServlet("/add")
public class AddManageTest extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddManageTest() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
//		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		HttpSession session = request.getSession();
		PrintWriter out = response.getWriter();
  
		//ManageTestDao ud = new ManageTestDaoImpl();

		String ids = request.getParameter("id");
		int id = Integer.parseInt(ids);
		String name = request.getParameter("name");
		String domain = request.getParameter("domain");
		String url = request.getParameter("url");
		String method = request.getParameter("method");
		String headers = request.getParameter("headers");
		String cookies = request.getParameter("cookies");
		String requestBodyType = request.getParameter("requestBodyType");
		String body = request.getParameter("body");
		String responsef = request.getParameter("response");

		ManageTest manageTest = new ManageTest(id, name, domain, url, method, headers, cookies, requestBodyType, body,
				responsef);

		manageTest.setId(id);
		manageTest.setName(name);
		manageTest.setDomain(domain);
		manageTest.setUrl(url);
		manageTest.setMethod(method);
		manageTest.setHeaders(headers);
		manageTest.setCookies(cookies);
		manageTest.setRequestBodyType(requestBodyType);
		manageTest.setBody(body);
		manageTest.setResponse(responsef);
		
		boolean isSaved = new ManageTestServiceImpl().addManageTest(manageTest);
		if (isSaved) {
			//request.setAttribute("msg", "员工新增成功！");
//			out.print("<script>alert('新增成功！');window.location='list';</script>");
			out.print("<script>alert('新增成功！');</script>");
			response.sendRedirect("list");
		} 
		
	}

}

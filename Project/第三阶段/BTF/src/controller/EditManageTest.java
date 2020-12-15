package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.ManageTestDaoImpl;
import entity.ManageTest;
import service.ManageTestServiceImpl;

//import employee.service.EmployeeServiceImpl;
//import entity.Employee;
//import entity.Job;
//import job.service.JobServiceImpl;

/**
 * Servlet implementation class EditServlet
 */
public class EditManageTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditManageTest() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		HttpSession session = request.getSession();
		PrintWriter out = response.getWriter();
		
		String dos = request.getParameter("do");
		
		if (dos.equals("before")) {
			String ids = request.getParameter("id");
			Integer id = Integer.parseInt(ids);
			ManageTest mangeTest= new ManageTestServiceImpl().getManageTest(id);
			session.setAttribute("editmanagetest", mangeTest);
			response.sendRedirect("modify.jsp");
			return;
		}
		
		if (dos.equals("edit")) {
			String ids=request.getParameter("id");
			int id=Integer.parseInt(ids);
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
			boolean isEdited = new ManageTestServiceImpl().editManageTest(manageTest);
			if(isEdited)
				response.sendRedirect("list");
			return;
		}
	
	}

}

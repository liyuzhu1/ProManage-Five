package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.ManageTestDaoImpl;
import service.ManageTestDao;
import service.ManageTestServiceImpl;



/**
 * Servlet implementation class DeleteEmployee
 */
//@WebServlet("/phpyunF/TestManagement/display")
public class DeleteManageTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteManageTest() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
//		String id = request.getParameter("id");
//		if(id!=null && !id.equals("")) {
//			new ManageTestServiceImpl().dropEmployee(Integer.parseInt(id));
//		}
//		response.sendRedirect("list");
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
		
		String ids = request.getParameter("id");
		int id = Integer.parseInt(ids);
		boolean isSaved = new ManageTestServiceImpl().dropManageTest(id);
		if (isSaved) {
			out.print("<script>alert('删除成功！');</script>");
			response.sendRedirect("list");
		}
	}

}

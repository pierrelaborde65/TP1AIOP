package fr.polytech.todo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/Hello")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		request.getRequestDispatcher("hello.jsp").forward(request, response);
//		
//		response.setContentType("text/html;charset=UTF-8");
//	    PrintWriter out = response.getWriter();
//	        try {
//	            out.println("<html>");
//	            out.println("<head>");
//	            out.println("<title>Hello Page</title>");
//	            out.println("</head>");
//	            out.println("<body>");
//	            out.println("<h1>Hello "+request.getParameter("name")+"!</h1>");
//	            out.println("</body>");
//	            out.println("</html>");
//	        } finally {
//	            out.close();
//	        }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		request.getRequestDispatcher("hello.jsp").forward(request, response);

	} 

}

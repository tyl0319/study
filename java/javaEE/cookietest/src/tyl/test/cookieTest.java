package tyl.test;
import java.io.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class cookieTest
 */
@WebServlet("/cookieTest")
public class cookieTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public cookieTest() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html;charset=gb2312");
		PrintWriter out = response.getWriter();
		String title = "Active Cookies";
		out.println("<html><head><title> 获取客户端Cookies</title></head>"
				+ "<body BGCOLOR=\"#FDF5E6\">\n"
				+ "<H1 ALIGN=\"CENTER\">"
				+ title + "</H1>\n" + "<TABLE BORDER=1 ALIGN=\"CENTER\">\n"
				+ "<TR BGCOLOR=\"#FFAD00\">\n" + " <TH>Cookie Name\n"
				+ " <TH>Cookie Value");
		Cookie[] cookies =  request.getCookies();
		if(cookies != null)
		{
			Cookie cookie;
			for(int i = 0; i < cookies.length; i++)
			{
				cookie = cookies[i];
				out.println("<TR>\n" + " <TD>" + cookie.getName() +"</TD>\n"
						+ " <TD>" + cookie.getValue() + "</TD></TR>\n") ;
			}
			
		}
		out.println("</TABLE></BODY></HTML>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

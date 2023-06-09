package pages;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CandidateListServlet
 */
@WebServlet("/candidate_list")
public class CandidateList extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		try (PrintWriter pw = response.getWriter()) {
			//get cookies/s from request header
			//API of HttpsServletRequest:Cookies []getCookies()
			Cookie [] cookies=request.getCookies();
			if(cookies!=null) {
				for(Cookie c:cookies) {
					if( c.getName().equals("user_dtls")) 
					{
				pw.print("<h3>Validated user details"+c.getValue()+"</h3>");
				break;
					}
					}
			}
					
			else {
				pw.print("<h3>Session tracking failed,No cookies!!!</h3>");
			}
		}
	}

}
	

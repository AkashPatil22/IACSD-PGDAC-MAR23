package pages;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class index
 */
@WebServlet(value="/test1",loadOnStartup = 1)
public class servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init() throws ServletException {
		System.out.println("in init by"+ Thread.currentThread());
	}
	
	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		System.out.println("in destroy by"+ Thread.currentThread());	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("in do-get by"+ Thread.currentThread());
		//set response content type(setting a resp header content-type:text/html
		response.setContentType("text/html");
		//get PW to send char, buff data (resp) to client
		try(PrintWriter pw=response.getWriter()){
			pw.print("<h3>Welcome to servlet :"+getClass()+"TS"+LocalDateTime.now()+"</h3>");
		}
	}

}

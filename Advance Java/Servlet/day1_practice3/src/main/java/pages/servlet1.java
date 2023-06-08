package pages;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value="/test1",loadOnStartup = 1)
//WC reads this only once @ web app dep time
//WC create a empty map an then populates URL map
//key:"/test1" value:pages.Servlet1
public class servlet1 extends HttpServlet 
{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("in do-get by"+ Thread.currentThread());
		//set response content type(setting a resp header content-type:text/html
		resp.setContentType("text/html");
		//get PW to send char, buff data (resp) to client
		try(PrintWriter pw=resp.getWriter()){
			pw.print("<h3>Welcome to servlet :"+getClass()+"TS"+LocalDateTime.now()+"</h3>");
		}
		//WC:pw.flush()-->buff content are sent -->pw.close

	}

	@Override
	public void destroy() {
		System.out.println("in destroy by"+ Thread.currentThread());

	}

	@Override
	public void init() throws ServletException {
		System.out.println("in init by"+ Thread.currentThread());
	}

}

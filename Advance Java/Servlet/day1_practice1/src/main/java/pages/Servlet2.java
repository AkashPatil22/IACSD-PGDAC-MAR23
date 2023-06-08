/*
 * package pages;
 * 
 * import java.io.IOException; import java.io.PrintWriter; import
 * java.time.LocalDateTime;
 * 
 * import javax.servlet.ServletConfig; import javax.servlet.ServletException;
 * import javax.servlet.annotation.WebServlet; import
 * javax.servlet.http.HttpServlet; import javax.servlet.http.HttpServletRequest;
 * import javax.servlet.http.HttpServletResponse;
 * 
 *//**
	 * Servlet implementation class Servlet2
	 */
/*
 * 
 * public class Servlet2 extends HttpServlet { private static final long
 * serialVersionUID = 1L;
 * 
 *//**
	 * @see Servlet#init(ServletConfig)
	 */
/*
 * public void init() throws ServletException { System.out.println("in init by"+
 * getClass());
 * 
 * }
 * 
 *//**
	 * @see Servlet#destroy()
	 */
/*
 * public void destroy() { System.out.println("in destroy by"+ getClass());
 * 
 * }
 * 
 *//**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 *//*
		 * protected void doGet(HttpServletRequest request, HttpServletResponse
		 * response) throws ServletException, IOException {
		 * System.out.println("in do-get by"+ getClass());//appears on std o/p:server
		 * side console response.setContentType("text/html"); try(PrintWriter
		 * pw=response.getWriter()){
		 * pw.print("<h5>Welcome to servlet :"+getClass()+"TS"+LocalDateTime.now()+
		 * "</h5>"); } //WC:pw.flush()-->buff content are sent -->pw.close
		 * 
		 * 
		 * }
		 * 
		 * }
		 */
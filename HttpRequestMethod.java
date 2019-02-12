

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HttpPractice
 */
@WebServlet("/HttpPractice")
public class HttpRequestMethod extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HttpPractice() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
				
			out.write("<body>");
			out.write("<h3>Secured or not ="+request.isSecure()+"</h3>");
			out.write("<h3>Auth Type ="+request.getAuthType()+"</h3>");
			out.write("<h3>Http Method = "+request.getMethod()+"</h3>");
			out.write("<h3>Context Path ="+request.getContextPath()+"</h3>");
			out.write("<h3>Context Path ="+request.getContextPath()+"</h3>");
			out.write("<h3>Query String ="+request.getQueryString()+"</h3>");
			out.write("<h3>Request URI ="+request.getRequestURI()+"</h3>");
			out.write("<h3>IP Address="+request.getLocalAddr()+"</h3>");
			out.write("<h3>Host Name="+request.getLocalName()+"</h3>");
			out.write("<h3>IP Port="+request.getLocalPort()+"</h3>");
			out.write("<h3>Default way the client accepts the Content(Language)="+request.getLocale()+"</h3>");
			out.write("<h3>Protocol="+request.getProtocol()+"</h3>");
			out.write("<h3>Remote Address="+request.getRemoteAddr()+"</h3>");			
			out.write("<h3>Qualtified name of the Host="+request.getRemoteHost()+"</h3>");
			out.write("<h3>Remote port number="+request.getRemotePort()+"</h3>");
			out.write("<h3>Scheme used="+request.getScheme()+"</h3>");
			out.write("<h3>Server Name="+request.getServerName()+"</h3>");
			out.write("<h3>Server Port="+request.getServerPort()+"</h3>");
			request.setAttribute("attr1", "pranesh");
			out.write("<h3>attr1="+request.getAttribute("attr1")+"</h3>");
			out.write("<h3>Character Encoding(Before Settting Up)="+request.getCharacterEncoding()+"</h3>");
//			request.setCharacterEncoding("UTF-8");
//			out.write("<h3>Character Encoding(After Settting Up)="+request.getCharacterEncoding()+"</h3>");
			out.write("<h3>Content Type="+request.getContentType()+"</h3>");
			out.write("<h3>Readding the Content(Sample first Character)="+(char)request.getInputStream().read()+"</h3>");
			out.write("<h3>Content Length ="+request.getContentLength()+"</h3>");
			out.write("</body>");
		
		
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

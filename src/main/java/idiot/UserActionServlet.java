package idiot;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import java.io.IOException;

/**
 * Servlet Filter implementation class UserActionServlet
 */
@WebFilter("/UserActionServlet")
public class UserActionServlet extends HttpFilter implements Filter {
	
	private void doGet() {
		// TODO Auto-generated method stub

	}
   
}

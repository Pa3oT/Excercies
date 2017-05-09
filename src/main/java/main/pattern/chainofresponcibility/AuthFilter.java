package main.pattern.chainofresponcibility;

public class AuthFilter implements Filter {
	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) {
		if(servletRequest.getParameter("secret_word").equals("xyz")) {
			chain.doFilter(servletRequest, servletResponse);
		} else {
			servletResponse.sendRedirect("index.jsp");
		}
	}
}

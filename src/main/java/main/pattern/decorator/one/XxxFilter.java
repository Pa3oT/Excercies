package main.pattern.decorator.one;

import main.pattern.chainofresponcibility.FilterChain;
import main.pattern.chainofresponcibility.ServletRequest;
import main.pattern.chainofresponcibility.ServletResponse;

public class XxxFilter {

	public void doFilter(
			ServletRequest servletRequest,
			ServletResponse servletResponse,
			FilterChain chain) {
		ServletRequestWrapper servletRequestWrapper = new ServletRequestSpy(servletRequest);
		chain.doFilter(new ServletRequestWrapper(servletRequest), servletResponse);

	}
}


class ServletRequestSpy extends ServletRequestWrapper {

	ServletRequestSpy(ServletRequest request) {
		super(request);
	}

	@Override
	public String getParameter(String name) {
		System.out.println("name = " + name);
		return super.getParameter(name);
	}
}
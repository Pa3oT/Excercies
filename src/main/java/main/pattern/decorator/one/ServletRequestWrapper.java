package main.pattern.decorator.one;

import main.pattern.chainofresponcibility.ServletRequest;

public class ServletRequestWrapper implements ServletRequest {

	private final ServletRequest request;

	public ServletRequestWrapper(ServletRequest request) {
		this.request = request;
	}

	@Override
	public String getParameter(String name) {
		return request.getParameter(name);
	}
}
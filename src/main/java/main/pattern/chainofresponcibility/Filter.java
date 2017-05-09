package main.pattern.chainofresponcibility;

public interface Filter {

	public void doFilter (
			ServletRequest servletRequest,
			ServletResponse servletResponse,
			FilterChain chain);
}

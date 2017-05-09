package main.pattern.chainofresponcibility;

public interface FilterChain {

	public void doFilter(
			ServletRequest servletRequest,
			ServletResponse servletResponse);
}

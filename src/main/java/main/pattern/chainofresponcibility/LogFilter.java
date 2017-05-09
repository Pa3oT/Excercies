package main.pattern.chainofresponcibility;

public class LogFilter implements Filter {
	@Override
	public void doFilter(
			ServletRequest servletRequest,
			ServletResponse servletResponse,
			FilterChain chain) {
		long tic = System.nanoTime();
		chain.doFilter(servletRequest, servletResponse);
		long tac = System.nanoTime();
		System.out.println("dT = " + (tac - tic));
	}
}

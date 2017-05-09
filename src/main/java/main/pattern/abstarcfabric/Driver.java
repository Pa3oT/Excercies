package main.pattern.abstarcfabric;

public interface Driver {

	public Connection connect(String url);

	public boolean acceptsURL(String url);
}

package main.pattern.abstarcfabric;

public interface ResultSet {

	public boolean next();

	public int getInt(int index);

	public String getString(int index);

	public Double getDouble(int index);
}

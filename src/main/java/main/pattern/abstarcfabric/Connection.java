package main.pattern.abstarcfabric;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;

public interface Connection {

	public Statement createStatement();

	public PreparedStatement preparedStatement(String sql);

	public CallableStatement prepareCall(String sql);
}

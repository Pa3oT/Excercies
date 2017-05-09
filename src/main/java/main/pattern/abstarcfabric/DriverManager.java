package main.pattern.abstarcfabric;

import java.util.ArrayList;
import java.util.List;

public class DriverManager {
	public static List<Driver> drivers = new ArrayList<>();

	public synchronized static Connection getConnection(String url) {
		for(Driver driver : drivers) {
			if(driver.acceptsURL(url)) {
				return driver.connect(url);
			}
		}
		throw new RuntimeException();
	}

	public synchronized static void registerDriver(Driver driver) {
		drivers.add(driver);
	}
}

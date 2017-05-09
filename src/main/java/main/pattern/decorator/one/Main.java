package main.pattern.decorator.one;

import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		OutputStream  outputStream = new FileOutputStream(new File("d:/"));
		DataOutput dataOutput = new DataOutputStream(outputStream);
		dataOutput.writeDouble(42.42);
		outputStream.flush();
		outputStream.close();
	}
}

package main.pattern.adapter;

import java.io.*;
import java.util.zip.GZIPOutputStream;

public class Main {
	public static void main(String[] args) throws IOException {
		OutputStream os = new GZIPOutputStream(new BufferedOutputStream(new FileOutputStream("d://")));
		os.write(42);
		os.write(42);
		os.write(42);
		os.flush();
		os.close();
	}
}



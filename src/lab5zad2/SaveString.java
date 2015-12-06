package lab5zad2;

import java.io.IOException;
import java.io.PrintWriter;

public class SaveString {
PrintWriter out;

	public SaveString (PrintWriter out) throws IOException {
		this.out = out;
	}
	
	public void writeToFile(String text) {
		out.println(text);
	}
}

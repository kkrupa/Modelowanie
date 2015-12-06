package lab5zad2;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class SaveRandom {
	Random random;
	PrintWriter out;
	private int number;
	
	public SaveRandom(PrintWriter out, Random random) throws IOException {
		this.random = random;
		this.out = out;
	}
	
	public void generateNumber() {
		number = random.nextInt();
	}
	
	public void writeToFile() {
		generateNumber();
		out.println(number);
	}
}

package lab5zad2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class MainDemo {
	
	public static void main(String[] args) throws IOException {

		String filePath = "/Users/kkrupa/Documents/plik.txt";
		
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(filePath, true)));
		Random random = new Random();
		SaveString zapiszString = new SaveString(out);
		SaveRandom zapiszRandom = new SaveRandom(out, random);
		
		System.out.println("Wybierz co chcesz zapisać:");
		System.out.println("1. Tekst.");
		System.out.println("2. Liczbę losową.");
		Scanner in = new Scanner(System.in);
		
		int i;
		String tekst;
		
        System.out.print("Twój wybór: ");
        i = in.nextInt();

        while (!(i==1 || i==2)) {
            System.out.print("Wybierz spośród dostępnych opcji: ");
            i = in.nextInt();
        }

		if(i == 2) {
			zapiszRandom.writeToFile();
		} else {

			System.out.print("Wprowadz tekst: ");
			tekst = in.next();
			zapiszString.writeToFile(tekst);
		}
		
	}

}

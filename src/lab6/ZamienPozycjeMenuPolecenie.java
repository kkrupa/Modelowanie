package lab6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by kkrupa on 16.01.2016.
 */
public class ZamienPozycjeMenuPolecenie implements Operacja {

    private ArrayList<Operacja> list;
    private Scanner in;

    public ZamienPozycjeMenuPolecenie(ArrayList<Operacja> list) {
        this.list = list;
        in = new Scanner(System.in);
    }

    @Override
    public void wykonaj() {
        int indeks1;
        int indeks2;
        System.out.print("Wybierz opcję do zamiany: ");
        indeks1 = in.nextInt();
        System.out.print("Wybierz nowy numer opcji: ");
        indeks2 = in.nextInt();
        Collections.swap(list, indeks1-1, indeks2-1);
    }

    @Override
    public String getNazwa() {
        return "Zamien pozycje";
    }

}

package lab6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by kkrupa on 16.01.2016.
 */
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        User user = new User(in);

        ArrayList<Operacja> komendy = new ArrayList<Operacja>();
        komendy.add(new UstawImiePolecenie(user));
        komendy.add(new UstawNazwiskoPolecenie(user));
        komendy.add(new UstawNumerPolecenie(user));
        komendy.add(new WyswietlDanePolecenie(user));
        komendy.add(new ZamienPozycjeMenuPolecenie(komendy));

        int wybor;

        while (true) {
            int numer = 1;

            for(Operacja oper : komendy) {
                System.out.println(numer + ". " + oper.getNazwa());
                numer++;
            }

            wybor = in.nextInt();

            komendy.get(wybor-1).wykonaj();
        }


        /*switch(wybor) {
            case 1:
                ustawImie.wykonaj(); break;
            case 2: ustawNazwisko.wykonaj(); break;
            case 3: ustawTelefon.wykonaj(); break;
            default:
                System.out.println("Zly wybor"); break;
            }*/


        }

    }




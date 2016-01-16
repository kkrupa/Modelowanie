package lab6;

import java.util.Scanner;

/**
 * Created by kkrupa on 16.01.2016.
 */
public class User {

    private int numerTel;
    private String nazwisko;
    private String imie;
    private Scanner in;

    public User(Scanner in) {
        this.in = in;
    }

    public void setNumer() {
        System.out.print("Podaj numer telefonu: ");
        numerTel = in.nextInt();
    }

    public void setNazwisko() {
        System.out.print("Podaj nazwisko: ");
        nazwisko = in.nextLine();
    }

    public void setName() {
        System.out.print("Podaj imię: ");
        imie = in.nextLine();
    }

    public int getNumerTel() {
        return numerTel;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getImie() {
        return imie;
    }
}

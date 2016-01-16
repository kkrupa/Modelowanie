package lab6;

/**
 * Created by kkrupa on 16.01.2016.
 */
public class UstawNazwiskoPolecenie implements Operacja {

    private User user;

    public UstawNazwiskoPolecenie(User user) {
        this.user = user;
    }

    @Override
    public void wykonaj() {
        user.setNazwisko();
    }

    @Override
    public String getNazwa() {
        return "Podaj nazwisko";
    }


}

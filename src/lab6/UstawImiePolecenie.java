package lab6;

/**
 * Created by kkrupa on 16.01.2016.
 */
public class UstawImiePolecenie implements Operacja {

    private User user;

    public UstawImiePolecenie(User user) {
        this.user = user;
    }

    @Override
    public void wykonaj() {
        user.setName();
    }

    @Override
    public String getNazwa() {
        return "Podaj Imie";
    }
}
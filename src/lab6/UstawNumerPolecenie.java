package lab6;

/**
 * Created by kkrupa on 16.01.2016.
 */
public class UstawNumerPolecenie implements Operacja {

    private User user;

    public UstawNumerPolecenie(User user) {
        this.user = user;
    }

    @Override
    public void wykonaj() {
        user.setNumer();
    }

    @Override
    public String getNazwa() {
        return "Podaj numer";
    }
}

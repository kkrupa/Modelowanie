package lab6;

/**
 * Created by kkrupa on 16.01.2016.
 */
public class WyswietlDanePolecenie implements Operacja {

        private User user;

        public WyswietlDanePolecenie(User user) {
            this.user = user;
        }

        @Override
        public void wykonaj() {
            System.out.println(user.getImie() + " " + user.getNazwisko() + " " + user.getNumerTel());
        }

        @Override
        public String getNazwa() {
            return "Wypisz dane";
        }

}

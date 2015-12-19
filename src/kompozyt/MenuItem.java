package kompozyt;

/**
 * Created by kkrupa on 19.12.2015.
 */
public class MenuItem implements Menu {
    private String nazwa;

    public MenuItem(String nazwa) {
        this.nazwa = nazwa;
    }

    @Override
    public void wykonaj() {
        System.out.println("Wykonano operację " + getNazwa());
    }

    public String getNazwa() {
        return nazwa;
    }

    @Override
    public boolean isNode() {
        return false;
    }


}

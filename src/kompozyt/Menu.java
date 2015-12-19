package kompozyt;

/**
 * Created by kkrupa on 19.12.2015.
 */
public interface Menu {
    public void wykonaj();
    public Menu wykonajOpcje(int opcja);
    public String getNazwa();
    public boolean isNode();
    public MenuNode getNode();
}

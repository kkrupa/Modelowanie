package kompozyt;

/**
 * Created by kkrupa on 19.12.2015.
 */
public class Main {

    public static void main(String [ ] args) {
        MenuNode menu = new MenuNode("File");
        menu.add(new MenuItem("New File"));
        menu.add(new MenuNode(""));
    }
}

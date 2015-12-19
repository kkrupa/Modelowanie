package kompozyt;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kkrupa on 19.12.2015.
 */
public class MenuNode implements Menu {
    private List<Menu> menuItems = new ArrayList<Menu>();
    private String nazwa;

    public MenuNode(String nazwa) {
        this.nazwa = nazwa;
    }

    public void wykonaj() {
        for(Menu item : menuItems) {

            if(item.isNode()) {
                System.out.print("* ");
            }
            System.out.println(item.getNazwa());
        }
    }

    public void add(Menu menuItem) {
        menuItems.add(menuItem);
    }

    public boolean isNode() {
        return true;
    }

    public String getNazwa() {
        return nazwa;
    }


}

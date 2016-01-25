package Router;

import sun.java2d.OSXOffScreenSurfaceData;

/**
 * Created by kkrupa on 17.01.2016.
 */
public class Osoba {

    private String name;
    private String lastName;

    public Osoba (String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

}

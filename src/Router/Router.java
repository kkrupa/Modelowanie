package Router;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by kkrupa on 16.01.2016.
 */
public class Router {

    private Commands komendy;
    private NetworkInterfaces interfejsy;
    private Osoba programista;
    private String version;

    public Router(Osoba programista, String version) {
        interfejsy = new NetworkInterfaces();
        komendy = new Commands();
        this.programista = new Osoba("Kamil", "Krupa");
        this.version = version;
    }

    public void addInterface(String addressIP) {
        interfejsy.add(new NetworkInterface(addressIP));
    }

    public void addCommand(Command komenda) {
        komendy.add(komenda);
    }

    public String getVersion() {
        return version;
    }

    public Osoba getProgramista() {
        return programista;
    }

    public void help() {
//        komendy.get("help");
    }

    public void show() {
        int index = 1;
        for(NetworkInterface interfejs : getInterfaces()) {
            System.out.println(index + ": " + interfejs.getAddressIP());
            index++;
        }
    }
}

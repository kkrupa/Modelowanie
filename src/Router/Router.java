package Router;

import java.util.Iterator;

/**
 * Created by kkrupa on 16.01.2016.
 */
public class Router {

    private final Commands komendy;
    private final NetworkInterfaces interfejsy;
    private final Osoba programista;
    private final String version;
    private Iterator<NetworkInterface> iteratorInterfejsow;

    public Router(Osoba programista, String version) {
        interfejsy = new NetworkInterfaces();
        komendy = new Commands();

        this.programista = programista;
        this.version = version;
    }

    public void addInterface(NetworkInterface interfejs) {
        interfejsy.add(interfejs);
    }

    public void addCommand(Command komenda) {
        komendy.add(komenda);
    }

    public Command getCommand(String nazwaKomendy) {
        return komendy.get(nazwaKomendy);
    }

    public String getVersion() {
        return version;
    }

    public Osoba getProgramista() {
        return programista;
    }

    public Iterator<NetworkInterface> getInterfaces() {
        iteratorInterfejsow = interfejsy.getInterfacesIterator();
        return iteratorInterfejsow;
    }

}

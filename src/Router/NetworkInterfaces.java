package Router;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by kkrupa on 17.01.2016.
 */
public class NetworkInterfaces {

    //TODO: dodac funkcje, ktora zwraca iterator z interfejsami
    private ArrayList<NetworkInterface> interfaces;

    public void add(NetworkInterface interfejs) {
        interfaces.add(interfejs);
    }

    public Iterator<NetworkInterface> getInterfacesIterator() {
        return interfaces.iterator();
    }

    public NetworkInterface getInterface(int index) {
        return interfaces.get(index);
    }

}

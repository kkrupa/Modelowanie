package Router;

import sun.nio.ch.Net;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by kkrupa on 17.01.2016.
 */
public class NetworkInterfaces {

    private ArrayList<NetworkInterface> interfaces;

    public NetworkInterfaces() {
        interfaces = new ArrayList<NetworkInterface>();
    }

    public void add(NetworkInterface interfejs) {
        interfaces.add(interfejs);
    }

    public Iterator<NetworkInterface> getInterfacesIterator() {
        Iterator<NetworkInterface> iterator = interfaces.iterator();
        return iterator;
    }

    public NetworkInterface getInterface(int index) {
        return interfaces.get(index);
    }

}

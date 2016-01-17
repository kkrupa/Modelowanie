package Router;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by kkrupa on 16.01.2016.
 */
public class Router {

    private ArrayList<NetworkInterface> interfaces;
    private HashMap<String, Command> komendy;

    private String name;
    private String lastName;
    private String version;

    public Router() {
        interfaces = new ArrayList<NetworkInterface>();
        komendy = new HashMap<String, Command>();
    }

    public void addInterface(String addressIP) {
        interfaces.add(new NetworkInterface(addressIP));
    }

    public void addCommand(String nazwa, Command komenda) {
        komendy.put(nazwa, komenda);
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getVersion() {
        return version;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ArrayList<NetworkInterface> getInterfaces() {
        return interfaces;
    }

    public void help() {
        System.out.println("Programista: " + getName() + " " +
                getLastName() + ", Version: " + getVersion());
    }

    public void show() {
        int index = 1;
        for(NetworkInterface interfejs : getInterfaces()) {
            System.out.println(index + ": " + interfejs.getAddressIP());
            index++;
        }
    }
}

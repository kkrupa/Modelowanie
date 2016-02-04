package Router;

import java.net.InetAddress;

/**
 * Created by kkrupa on 16.01.2016.
 */
public class NetworkInterface {
    private String addressIP;

    public NetworkInterface(String addressIP) {
        this.addressIP = addressIP;
    }

    public String getAddressIP() {
        return addressIP;
    }

    public void setAddressIP(String addressIP) {
        this.addressIP = addressIP;
    }

}

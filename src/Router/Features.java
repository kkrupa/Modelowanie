package Router;

/**
 * Created by kkrupa on 16.01.2016.
 */
public class Features {



    public void show(Router router) {
        int index = 1;
        for(NetworkInterface interfejs : router.getInterfaces()) {
            System.out.println(index + ": " + interfejs.getAddressIP());
            index++;
        }
    }
}

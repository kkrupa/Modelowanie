package Router;

import java.util.Iterator;

/**
 * Created by kkrupa on 16.01.2016.
 */
public class ShowCommand implements Command {

    private Router router;
    private Iterator<NetworkInterface> iteratorInterfejsow;

    public ShowCommand(Router router) {
        this.router = router;
        iteratorInterfejsow = this.router.getInterfaces();
    }

    @Override
    public String getNazwa() {
        return "show";
    }

    @Override
    public void execute() {
        int index = 1;

        while (iteratorInterfejsow.hasNext()) {
            System.out.println(index + ": " + iteratorInterfejsow.next().getAddressIP());
            index++;
        }
    }
}

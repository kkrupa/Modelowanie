package Router;

import java.util.HashMap;

/**
 * Created by kkrupa on 17.01.2016.
 */
public class Commands {

    private HashMap<String, Command> komendy;

    public Commands() {
        komendy = new HashMap<String, Command>();
    }

    public void add(Command komenda) {
        komendy.put(komenda.getNazwa(), komenda);
    }

    public Command get(String nazwaKomendy) {
        return komendy.get(nazwaKomendy);
    }
}

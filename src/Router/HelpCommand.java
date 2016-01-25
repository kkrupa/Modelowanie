package Router;

/**
 * Created by kkrupa on 16.01.2016.
 */
public class HelpCommand implements Command {

    private Router router;

    public HelpCommand(Router router) {
        this.router = router;
    }

    @Override
    public String getNazwa() {
        return "help";
    }

    @Override
    public void execute() {
        System.out.println("Programista: " + router.getProgramista().getName() + " " +
                router.getProgramista().getLastName() + ", Version: " + router.getVersion());
    }
}

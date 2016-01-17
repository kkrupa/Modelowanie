package Router;

/**
 * Created by kkrupa on 16.01.2016.
 */
public class HelpCommand implements Command {

    private Router router;

    public HelpCommand(Router router) {
        this.router = router;
    }

//    @Override
//    public String getName() {
//        return "help";
//    }

    @Override
    public void execute() {
        router.help();
    }
}

package Router;

/**
 * Created by kkrupa on 16.01.2016.
 */
public class ShowCommand implements Command {

    private Router router;

    public ShowCommand(Router router) {
        this.router = router;
    }

    @Override
    public String getNazwa() {
        return "show";
    }

    @Override
    public void execute() {
        router.show();
    }
}

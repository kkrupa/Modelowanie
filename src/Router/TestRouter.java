package Router;

/**
 * Created by kkrupa on 16.01.2016.
 */
public class TestRouter {

    private Router router;

    public TestRouter() {
        router = new Router();
        router.addInterface("192.168.0.1");
        router.addInterface("192.168.0.2");
        router.addInterface("192.168.0.3");
        router.addInterface("192.168.0.4");
        router.addCommand("show", new ShowCommand(router));
        router.addCommand("help", new HelpCommand(router));
        router.setName("Kamil");
        router.setLastName("Krupa");
        router.setVersion("1.0");
    }

    public Router getRouter() {
        return router;
    }
}

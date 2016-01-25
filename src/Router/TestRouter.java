package Router;

/**
 * Created by kkrupa on 16.01.2016.
 */
public class TestRouter {

    public TestRouter() {

    }

    public Router getRouter(Osoba programista, String version) {
        Router router = new Router(programista, version);
        router.addInterface("192.168.0.1");
        router.addInterface("192.168.0.2");
        router.addInterface("192.168.0.3");
        router.addInterface("192.168.0.4");
        router.addCommand(new ShowCommand(router));
        router.addCommand(new HelpCommand(router));
        return router;
    }
}

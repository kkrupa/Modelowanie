package Router;

/**
 * Created by kkrupa on 16.01.2016.
 */
public class Main {

    public static void main(String[] args) {
        TestRouter testRouter = new TestRouter();
        Router router = testRouter.getRouter();

        router.show();
        router.help();

    }

}

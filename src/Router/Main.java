package Router;

/**
 * Created by kkrupa on 16.01.2016.
 */
public class Main {

    public static void main(String[] args) {
        Osoba programista = new Osoba("Kamil", "Krupa");
        TestRouter testRouter = new TestRouter();
        Router router = testRouter.getRouter(programista, "1.0");

        router.show();
        router.help();

    }

}

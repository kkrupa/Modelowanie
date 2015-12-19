package kompozyt;

import javax.sound.midi.SysexMessage;
import java.util.Scanner;

/**
 * Created by kkrupa on 19.12.2015.
 */
public class Main {

    public static void main(String [ ] args) {
        MenuNode menu = new MenuNode("File");
        menu.add(new MenuItem("New File"));

        MenuNode openRecent = new MenuNode("Podmenu");
        openRecent.add(new MenuItem("Opcja1"));
        openRecent.add(new MenuItem("Opcja2"));

        menu.add(openRecent);

        menu.wykonaj();

       while(true) {

           Scanner in = new Scanner(System.in);

           System.out.print("Wybierz opcje: ");
           int wybor = in.nextInt();
           MenuNode node = menu.wykonajOpcje(wybor);
           if (node!=null) {
               menu = node;
           }

       }
    }
}

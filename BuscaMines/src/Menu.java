import java.util.Scanner;

public class Menu {
    public static int mostrarMenu() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("1-Mida del taulell\n2-Dificultat\n3-Jugar\n4-Sortir\nTria una opcio:");
        int opcioMenu = Integer.parseInt(entrada.nextLine());
        return opcioMenu;


    }
}

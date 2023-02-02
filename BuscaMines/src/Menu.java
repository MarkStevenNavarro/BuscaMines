import java.util.Scanner;

public class Menu {
    /**
     * Menu del joc
     * @return retorna la opcio triada per l'usuari
     */
    public static int mostrarMenu() {
        //Mostra el menu
        Scanner entrada = new Scanner(System.in);
        System.out.println("1-Mida del taulell\n2-Dificultat\n3-Jugar\n4-Sortir\nTria una opcio:");
        int opcioMenu = Integer.parseInt(entrada.nextLine());
        return opcioMenu;


    }
}
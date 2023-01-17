import java.util.Scanner;

public class Menu {
    public static int mostrarMenu(){
        Scanner entrada=new Scanner(System.in);
        System.out.println("1-Mida del taulell\nDificultat\n3-Jugar\nTria una opcio:");
        int opcioMenu=Integer.parseInt(entrada.nextLine());
        return opcioMenu;


    }
}

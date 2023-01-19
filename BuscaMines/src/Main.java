import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner llegir =new Scanner(System.in);
        int opcioMenu;
        int alçada=0;
        int base=0;
        int numMines=0;
        boolean mines[][];



        do {
             opcioMenu = Menu.mostrarMenu();


            switch (opcioMenu) {

                case 1: {
                    do {
                        System.out.println("Entra l'alçada:");
                        alçada = Integer.parseInt(llegir.nextLine());
                        System.out.println("Entra la base");
                        base = Integer.parseInt(llegir.nextLine());
                    }while (alçada < 5 || base < 5);
                    alçada++;
                    alçada++;
                    base++;
                    base++;
                    Metodes.generarTaulell(alçada, base);
                    alçada--;
                    alçada--;
                    base--;
                    base--;



                    break;
                }
                case 2: {
                   numMines=Dificultat.triarDificultat();
                   break;

                }
                case 3: {
                mines=GenerarMines.generarMines(numMines, alçada, base);
                Jugar.començarPartida(mines);
                break;
                }
            }
        }while (opcioMenu!=4);



    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner llegir = new Scanner(System.in);
        int opcioMenu = 0, alçada = 0, base = 0, numMines = 0;
        boolean[][] mines;
        String[][] taulell = new String[alçada][base];


        do {
            try {

                opcioMenu = Menu.mostrarMenu();
            } catch (Exception e) {
                System.out.println("Ha de ser un numero!!!");
            }


            switch (opcioMenu) {
                case 1 -> {
                    do {
                        System.out.println("Entra l'alçada: (minim 5)");
                        alçada = Integer.parseInt(llegir.nextLine());
                        System.out.println("Entra la base: (minim 5)");
                        base = Integer.parseInt(llegir.nextLine());
                        alçada += 2;
                        base += 2;

                    } while (alçada < 7 && base < 7);
                    taulell = Taulell.generarTaulell(alçada, base);
                    break;


                }
                case 2 -> {
                    numMines = Dificultat.triarDificultat();
                    break;

                }
                case 3 -> {
                    mines = GenerarMines.generarMines(numMines, alçada, base);
                    Jugar.començarPartida(mines, alçada, base, taulell);
                    break;
                }
            }

        } while (opcioMenu != 4);


    }
}
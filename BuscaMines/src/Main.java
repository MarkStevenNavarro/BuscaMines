import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner llegir = new Scanner(System.in);
        int opcioMenu = 0;
        int alçada = 0;
        int base = 0;
        int numMines = 0;
        boolean mines[][];
        String taulell[][] = new String[alçada][base];


        do {
            try {

                opcioMenu = Menu.mostrarMenu();


                switch (opcioMenu) {

                    case 1: {
                        do {
                            System.out.println("Entra l'alçada: (minim 5)");
                            alçada = Integer.parseInt(llegir.nextLine());
                            System.out.println("Entra la base: (minim 5)");
                            base = Integer.parseInt(llegir.nextLine());
                            alçada += 2;
                            base += 2;

                        } while (alçada < 5 || base < 5);
                        taulell = Taulell.generarTaulell(alçada, base);


                        break;
                    }
                    case 2: {
                        numMines = Dificultat.triarDificultat();
                        break;

                    }
                    case 3: {
                        mines = GenerarMines.generarMines(numMines, alçada, base);
                        Jugar.començarPartida(mines, alçada, base, taulell);
                        break;
                    }
                }
            } catch (Exception e) {
                System.out.println("Ha de ser un numero!!!");
            }
        } while (opcioMenu != 4);


    }
}
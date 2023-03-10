import java.util.Scanner;

public class Jugar {
    /**
     * Et permet començar la partida poden marcar la casella que vulguis
     *
     * @param mines   posicio de les mines
     * @param alçada  alçada del taulell
     * @param base    base del taulell
     * @param taulell taulell generat
     */
    public static void començarPartida(boolean[][] mines, int alçada, int base, String[][] taulell) {
        Scanner llegir = new Scanner(System.in);
        int X = 0, Y = 0, contadorMines = 0;

        //Comença la partida al buscamines

        do {

            for (int i = 1; i < (alçada - 1); i++) {
                for (int j = 1; j < (base - 1); j++) {
                    System.out.print(taulell[i][j]);
                    if (mines[i][j]) {
                        contadorMines++;
                    }
                }
                System.out.println();
            }

            System.out.println("Hi han " + contadorMines + " mines restans");
            contadorMines = 0;
            try {


                System.out.println("Introdueix la coordenada Y");
                Y = Integer.parseInt(llegir.nextLine());
                System.out.println("Introdueix la coordenada X");
                X = Integer.parseInt(llegir.nextLine());
                seleccionarCasella(Y, X, mines, taulell);


            } catch (Exception e) {
                System.out.println("Ha de estar dins del rang i ser un numero!!!");
            }
        } while (!mines[Y][X]);

    }

    /**
     * Mira si hi ha una mina, si hi ha mina explota sino segueixes jugant
     *
     * @param Y       alçada taulell
     * @param X       base taulell
     * @param mines   posicio de les mines
     * @param taulell taulell
     */
    public static void seleccionarCasella(int Y, int X, boolean[][] mines, String[][] taulell) {
        int minesvoltant;
        //Seleccio de la casella triada
        if (mines[Y][X] == false) {
            minesvoltant = DetectarMines.Detectar(X, Y, mines);
            if (minesvoltant == 0) {
                taulell[Y][X] = "  " + "x" + "  ";

            } else {
                taulell[Y][X] = "  " + minesvoltant + "  ";
            }

            System.out.println("No hi ha mina");


        } else {
            System.out.println("Ups has explotat ");

        }
    }

}
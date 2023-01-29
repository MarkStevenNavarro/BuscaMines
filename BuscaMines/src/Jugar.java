import java.util.Scanner;

public class Jugar {
    public static void començarPartida(boolean mines[][], int alçada, int base, String[][] taulell) {
        Scanner llegir = new Scanner(System.in);
        int X = 0;
        int Y = 0;
        int contadorMines = 0;
        int minesvoltant = 0;
        do {
            for (int i = 1; i < (alçada - 1); i++) {
                for (int j = 1; j < (base - 1); j++) {
                    System.out.print(taulell[i][j]);
                    if (mines[i][j] == true) {
                        contadorMines++;
                    }
                }
                System.out.println();
            }

            System.out.println("Hi han " + contadorMines + " mines restans");
            contadorMines = 0;
            try {


                System.out.println("Introdueix la coordenada X");
                X = Integer.parseInt(llegir.nextLine());
                System.out.println("Introdueix la coordenada Y");
                Y = Integer.parseInt(llegir.nextLine());
                if (mines[Y][X] == false) {
                    minesvoltant = DetectarMines.Detectar(X, Y, mines);
                    if (minesvoltant == 0) {
                        taulell[Y][X] = "  " + "x" + "  ";

                    } else {
                        taulell[Y][X] = "  " + minesvoltant + "  ";
                    }

                    System.out.println("No hi ha mina");
                    System.out.println("Hi han " + minesvoltant + " minaes al voltant");


                } else if (mines[Y][X]) {
                    System.out.println("Ups has explotat ");
                }
            } catch (Exception e) {
                System.out.println("Ha de ser un numero");
            }
        } while (mines[Y][X] == false);

    }
}
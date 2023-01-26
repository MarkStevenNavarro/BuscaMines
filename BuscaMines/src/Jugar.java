import java.util.Scanner;

public class Jugar {
    public static void començarPartida(boolean mines[][], int alçada, int base, String[][] taulell) {
        Scanner llegir = new Scanner(System.in);
        int X;
        int Y;
        int contadorMines = 0;
        int minesvoltant=0;
        do {
            for (int i = 0; i < alçada; i++) {
                for (int j = 0; j < base; j++) {
                    if (mines[i][j] == true) {
                        System.out.print("true   ");
                    }else {
                        System.out.print("false  ");
                    }
                }
                System.out.println();
            }
            for (int i = 0; i < alçada; i++) {
                for (int j = 0; j < base; j++) {
                    System.out.print(taulell[i][j]);
                    if (mines[i][j] == true) {
                        contadorMines++;
                    }
                }
                System.out.println();
            }

            System.out.println("Hi han " + contadorMines + " mines restans");
            contadorMines = 0;
            System.out.println("Introdueix la coordenada X");
            X = Integer.parseInt(llegir.nextLine());
            System.out.println("Introdueix la coordenada Y");
            Y = Integer.parseInt(llegir.nextLine());
            X--;
            Y--;
            if (mines[Y][X] == false) {
                minesvoltant=DetectarMines.Detectar(X, Y, mines);
                taulell[Y][X]="  " + minesvoltant + "  ";
                System.out.println("No hi ha mina");


            } else if (mines[Y][X]) {
                System.out.println("Ups has explotat ");
            }

        } while (mines[Y][X] == false);

    }
}
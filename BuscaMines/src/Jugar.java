import java.util.Scanner;

public class Jugar {
    public static void començarPartida(boolean mines[][], int alçada, int base, String[][] taulell) {
        Scanner llegir = new Scanner(System.in);
        int X;
        int Y;
        int contadorMines = 0;
        do {
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

                taulell[Y][X]="  X  ";
                System.out.println("No hi ha mina");
            } else if (mines[Y][X]) {
                System.out.println("Ups has explotat ");
            }
        } while (mines[Y][X] == false);

    }
}
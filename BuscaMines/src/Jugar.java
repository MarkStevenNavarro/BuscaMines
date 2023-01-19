import java.util.Scanner;

public class Jugar {
    public static void començarPartida(boolean mines[][]){
        Scanner llegir = new Scanner(System.in);
        int X;
        int Y;
        int contadorMines=0;
        do {
            for (int i =0; i<5; i++){
                for (int j =0; j<5; j++){
                    if (mines[i][j]==true){
                        System.out.print(" 1 ");
                        contadorMines++;
                    } else if (mines[i][j]==false) {
                        System.out.print(" 0 ");
                    }
                }
                System.out.println("");
            }
            System.out.println("Hi han " + contadorMines + " mines restans");
            System.out.println("X");
            X = Integer.parseInt(llegir.nextLine());
            System.out.println("Y");
            Y = Integer.parseInt(llegir.nextLine());
            if (mines[Y][X]==false){
                System.out.println("No hi ha mina");
            }else if (mines[Y][X]){
                System.out.println("Ups has explotat ");
            }
        }while (mines[Y][X]==false);

    }
}
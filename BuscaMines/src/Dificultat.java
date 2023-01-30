import java.util.Scanner;

public class Dificultat {
    public static int triarDificultat() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Tria una dificultat\n1-Facil\n2-Mitja\n3-Dificil");
        int opcio = Integer.parseInt(entrada.nextLine());
        int numMines = 0;
        switch (opcio) {
            case 1 -> {
                numMines = 5;
                break;
            }
            case 2 -> {
                numMines = 10;
                break;
            }
            case 3 -> {
                numMines = 15;
                break;
            }
        }

        return numMines;

    }

}
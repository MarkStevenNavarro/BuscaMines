import java.util.Random;

public class GenerarMines {
    /**
     * Genera la posicio de les mines al taulell
     * @param numMines numero de mines segons la dificultat triada
     * @param alçada   alçada del taulell
     * @param base     base del taulell
     *
     * @return posicio de les mines
     */
    public static boolean[][] generarMines(int numMines, int alçada, int base) {
        //Genera les mines al voltant


        Random random = new Random();
        boolean[][] mines = new boolean[alçada][base];

        int posicioY, posicioX;
        for (int i = 0; i < numMines; i++) {
            do {
                posicioY = random.nextInt(alçada);
                posicioX = random.nextInt(base);
            }while (posicioX==0 || posicioY==0 || posicioX==base-1 || posicioY==alçada-1);
            if (mines[posicioY][posicioX]) {
                i--;
            }
            mines[posicioY][posicioX] = true;
        }
        return mines;
    }
}
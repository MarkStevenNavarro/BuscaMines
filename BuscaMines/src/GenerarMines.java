import java.util.Random;

public class GenerarMines {
    public static boolean[][] generarMines(int numMines, int alçada, int base) {


        Random random = new Random();
        boolean[][] mines = new boolean[alçada][base];

        int posicioY, posicioX;
        for (int i = 0; i < numMines; i++) {
            do {
                posicioY = random.nextInt(alçada);
                posicioX = random.nextInt(base);
            }while (posicioX==0 || posicioY==0 || posicioX==6 || posicioY==6);
            if (mines[posicioY][posicioX]) {
                i--;
            }
            mines[posicioY][posicioX] = true;
        }
        return mines;
    }
}
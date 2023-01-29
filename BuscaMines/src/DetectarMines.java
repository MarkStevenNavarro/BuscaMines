public class DetectarMines {
    public static int Detectar(int X, int Y, boolean mines[][]) {
        int minesvoltant = 0;
        for (int j = (X-1); j < (X + 2); j++)
            for (int i = (Y-1); i < (Y + 2); i++) {
                if (mines[j][i] == true) {
                    minesvoltant++;
                }
            }

        return minesvoltant;
    }
}
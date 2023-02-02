public class DetectarMines {
    /**
     * Detecta les mines que hi ha al voltant del taulell
     * @param X base del taulell
     * @param Y alçada del taulell
     * @param mines posicio de les mines
     * @return mines que hi ha al voltant
     */
    public static int Detectar(int X, int Y, boolean[][] mines) {
        int minesvoltant = 0;
        for (int j = (X-1); j < (X + 2); j++)
            for (int i = (Y-1); i < (Y + 2); i++) {
                if (mines[j][i]) {
                    minesvoltant++;
                }
            }

        return minesvoltant;
    }
}
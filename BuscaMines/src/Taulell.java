public class Taulell {
    public static String[][] generarTaulell(int alçada, int base) {

        String[][] taulell = new String[alçada][base];
        for (int i = 0; i < alçada; i++) {
            for (int j = 0; j < base; j++) {

                taulell[i][j] = "  0  ";

                System.out.print(taulell[i][j]);
            }
            System.out.println();
        }

        return taulell;
    }
}
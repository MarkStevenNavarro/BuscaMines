public class Taulell {
    public static String[][] generarTaulell(int alçada, int base) {
        String[][] taulell = new String[alçada][base];
        System.out.println("Exemple de com sera el taulell de joc: \n");
        for (int i = 1; i < alçada-1; i++) {
            for (int j = 1; j < base-1; j++) {

                taulell[i][j] = "  0  ";

                System.out.print(taulell[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        return taulell;
    }
}
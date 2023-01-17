import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {
    Scanner llegir = new Scanner(System.in);
    public static void main(String[] args) {
        generarTaulell();

    }
    public static void generarTaulell(){
        Scanner llegir = new Scanner(System.in);
        int alçada = Integer.parseInt(llegir.nextLine());
        int base = Integer.parseInt(llegir.nextLine());
        int[][] taulell = new int[alçada][base];
        for(int i = 0; i<alçada; i++){
            for(int j = 0; j<base; j++){
                System.out.print(taulell[i][j]);
            }
            System.out.println();
        }
        System.out.println(taulell);
    }
}
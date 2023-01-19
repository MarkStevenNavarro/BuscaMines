import java.util.Scanner;
public class Metodes {
    public static void generarTaulell(int alçada, int base){




        String[][] taulell = new String[alçada][base];
        for(int i = 0; i<alçada; i++){
            for(int j = 0; j<base; j++){
                if(i==0||i==(alçada-1)||j==0||j==(base-1)){
                    taulell[i][j]=" * ";
                }else{
                    taulell[i][j]=" 0 ";
                }
                System.out.print(taulell[i][j]);
            }
            System.out.println();
        }



    }
}
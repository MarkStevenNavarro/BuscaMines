import java.util.Scanner;
public class Metodes {
    public static void generarTaulell(){
            Scanner llegir = new Scanner(System.in);
            int alçada = Integer.parseInt(llegir.nextLine());
            int base = Integer.parseInt(llegir.nextLine());
            alçada++;
            alçada++;
            base++;
            base++;
            String[][] taulell = new String[alçada][base];
            for(int i = 0; i<alçada; i++){
                for(int j = 0; j<base; j++){
                    if(i==0||i==(alçada-1)||j==0||j==(base-1)){
                        taulell[i][j]="*";
                    }else{
                        taulell[i][j]="0";
                    }
                    System.out.print(taulell[i][j]);
                }
                System.out.println();
            }
            System.out.println(taulell);
        }
}
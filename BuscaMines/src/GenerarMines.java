import java.util.Random;

public class GenerarMines {
    public static void generarMines(int opcioDificultat, int alçada, int base){

        Random random=new Random();
        boolean mines[][]=new boolean[alçada][base];
        switch (opcioDificultat){
            case 1:{
                for (int i=0;i<5;i++){
                    int alçada1=random.nextInt(1,alçada-1);
                    int base1=random.nextInt(1,base-1);
                    mines[alçada1][base1]=true;


                }


            }
            case 2:{

            }
            case 3:{

            }
        }

    }
}


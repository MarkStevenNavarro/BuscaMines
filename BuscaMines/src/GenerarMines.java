import java.util.Random;

public class GenerarMines {
    public static void generarMines(int opcioDificultat, int alçada, int base){


        Random random=new Random();
        boolean mines[][]=new boolean[alçada][base];
        int alçada1,base1;
        switch (opcioDificultat){
            case 1:{
                for (int i=0;i<5;i++){
                    do {
                         alçada1 = random.nextInt(1,alçada-1 );
                         base1 = random.nextInt(1,base-1);
                        mines[alçada1][base1] = true;

                    }while (mines[alçada1][base1]=false);


                }
                break;


            }
            case 2:{
                for (int i=0;i<10;i++){
                    do {
                        alçada1 = random.nextInt(1, alçada - 1);
                        base1 = random.nextInt(1, base - 1);
                        mines[alçada1][base1] = true;
                    }while (mines[alçada1][base1]=false);

                }
                break;

            }
            case 3:{
                for (int i=0;i<15;i++){
                    do {
                        alçada1 = random.nextInt(1, alçada - 1);
                        base1 = random.nextInt(1, base - 1);
                        mines[alçada1][base1] = true;
                    }while (mines[alçada1][base1]=false);

                }
                break;

            }
        }

    }
}


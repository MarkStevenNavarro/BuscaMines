import java.util.Random;

public class GenerarMines {
    public static boolean[][] generarMines(int opcioDificultat, int alçada, int base){


        Random random=new Random();
        boolean mines[][]=new boolean[alçada][base];
        int posicioY,posicioX;
        switch (opcioDificultat){
            case 1:{
                for (int i=0;i<5;i++){
                    do {
                         posicioY = random.nextInt(alçada );
                         posicioX = random.nextInt(base);
                        mines[posicioY][posicioX] = true;

                    }while (mines[posicioY][posicioX]=false);


                }
                break;


            }
            case 2:{
                for (int i=0;i<10;i++){
                    do {
                        posicioY = random.nextInt(1, alçada - 1);
                        posicioX = random.nextInt(1, base - 1);
                        mines[posicioY][posicioX] = true;
                    }while (mines[posicioY][posicioX]=false);

                }
                break;

            }
            case 3:{
                for (int i=0;i<15;i++){
                    do {
                        posicioY = random.nextInt(1, alçada - 1);
                        posicioX = random.nextInt(1, base - 1);
                        mines[posicioY][posicioX] = true;
                    }while (mines[posicioY][posicioX]=false);

                }
                break;

            }
        }
        return mines;
    }
}


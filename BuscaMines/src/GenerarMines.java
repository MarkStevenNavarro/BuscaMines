import java.util.Random;

public class GenerarMines {
    public static boolean[][] generarMines(int numMines, int alçada, int base){


        Random random=new Random();
        boolean mines[][]=new boolean[alçada][base];
        int posicioY,posicioX;


                for (int i=0;i<numMines;){

                        posicioY = random.nextInt(alçada - 2);
                        posicioX = random.nextInt(base - 2);
                        mines[posicioY][posicioX] = true;


                    System.out.println(posicioX);
                    System.out.println(posicioY);
                }

        return mines;
    }
}


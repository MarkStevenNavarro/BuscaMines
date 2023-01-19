import java.util.Random;

public class GenerarMines {
    public static boolean[][] generarMines(int numMines, int alçada, int base){


        Random random=new Random();
        boolean[][] mines =new boolean[alçada][base];

        int posicioY=0,posicioX=0,contadorMines=0;




                        posicioY = random.nextInt(alçada -2 );
                        posicioX = random.nextInt(base -2);
                        mines[posicioY][posicioX] = true;







                    System.out.println(mines[posicioY][posicioX]);


        return mines;
    }
}


import java.util.Random;

public class GenerarMines {
    public static boolean[][] generarMines(int opcioDificultat, int alçada, int base){


        Random random=new Random();
        boolean mines[][]=new boolean[alçada][base];
        int posicioY,posicioX;
        switch (opcioDificultat){
            case 1:{
                for (int i=0;i<5;i++){
                    
                         posicioY = random.nextInt(alçada - 2);
                         posicioX = random.nextInt(base - 2);
                        mines[posicioY][posicioX] = true;




                }
                break;


            }
            case 2:{
                for (int i=0;i<10;i++){

                        posicioY = random.nextInt( alçada - 2);
                        posicioX = random.nextInt(base - 2);
                        mines[posicioY][posicioX] = true;


                }
                break;

            }
            case 3:{

                for (int i=0;i<25;i++){


                        posicioY = random.nextInt( alçada - 2);
                        posicioX = random.nextInt( base - 2);
                        mines[posicioY][posicioX] = true;
                        System.out.println(mines[posicioY][posicioX]);


                }

                break;

            }
        }
        return mines;
    }
}


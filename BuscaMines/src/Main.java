
public class Main {
    public static void main(String[] args) {
        int opcioMenu=Menu.mostrarMenu();
        switch (opcioMenu){

            case 1:{
                Metodes.generarTaulell();
                break;
            }
            case 2:{
                Dificultat.triarDificultat();
            }
        }



    }
}
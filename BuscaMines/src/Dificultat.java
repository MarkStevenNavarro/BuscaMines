import java.util.Scanner;

public class Dificultat {
    public static int triarDificultat(){
        Scanner entrada=new Scanner(System.in);
        System.out.println("Tria una dificultat\n1-Facil\n2-Mitja\n3-Dificil");
        int opcio=Integer.parseInt(entrada.nextLine());
        return opcio;

    }
    
}

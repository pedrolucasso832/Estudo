
package programapernas;

import java.util.Scanner;


public class ProgramaPernas {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println(" Digite a quantidade de pernas: ");
        int pernas = teclado.nextInt();
        System.out.print("Isso é um(a)");
        String tipo;
        switch (pernas){
            case 1:
                tipo = "saci";
                break;
            case 2:
                tipo = "bipede";
                break;
            case 4:
                tipo = "quadrupede";
                break;
            case 6:
                tipo = "aranha";
                break;
            default:
                tipo = "ET";
        }
        System.out.println(tipo);
    }
    
}

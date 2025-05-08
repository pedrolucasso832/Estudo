
package programamedia;

import java.util.Scanner;

public class ProgramaMedia {

    public static void main(String[] args) {
        Scanner nota = new Scanner(System.in);
        
        System.out.print("Insira sua primeira nota: ");
        float nota1 = nota.nextFloat();
        System.out.print("Insira sua segunda nota: ");
        float nota2 = nota.nextFloat();
        float media = (nota1 + nota2) / 2;
        
        System.out.println("Sua média é:" + media);
        if(media >= 7){
            System.out.println("Parabéns");
        }else{
            System.out.println("Infelizmente, voce foi reprovado.");
        }
       
    }
    
}

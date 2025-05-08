
package programaidade;

import java.util.Scanner;

public class ProgramaIdade {

    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira o ano de seu nascimento: ");
        int nasc = teclado.nextInt();
        int idade = 2025 - nasc;
        System.out.println("Sua idade é: " + idade);
        if(idade >= 18){
            System.out.println(" Você é de maior.");
        }else{
            System.out.println(" Você é de menor.");
        }
        
        
    }
    
}

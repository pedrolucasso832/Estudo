
package programavoto;

import java.util.Scanner;

public class ProgramaVoto {

    
    public static void main(String[] args) {
        Scanner nascimento = new Scanner(System.in);
        System.out.print("Insira sua data de nascimento: ");
        int nasc = nascimento.nextInt();
        int idade = 2025 - nasc;
        
        if(idade < 16){
            System.out.println("Não vota");
        }else if((idade >= 16 && idade < 18) || (idade > 70)){
                System.out.println("opicional");
        }else if (idade <= 70){
                System.out.println(" voto obrigatorio");
        }
        }
    }
    


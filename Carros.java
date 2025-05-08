
package carros;
public class Carros {

    public static void main(String[] args) {
        Carro carro1 = new Carro();
        
        carro1.ano = 2016;
        carro1.cor = "Vermelho";
        carro1.modelo = "Cobalt";
        carro1.consumo = 9.3f;
        carro1.velmaxima = 193f;
        carro1.andando = true;
        carro1.ligado = true;
        
        carro1.andar();
        carro1.frear();
        
             
        
        
        
        
    }
    
}

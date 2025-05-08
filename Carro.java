
package carros;
public class Carro {
    String modelo;
    String cor;
    int ano;
    float velmaxima;
    float consumo;
    boolean andando;
    boolean ligado;
    
    void andar(){
        if(ligado == true){
            System.out.println("O carro esta andando!");
        }else{
            System.out.println("Carro desligado, impossivel andar!");
        }
    }void frear(){
        if(andando == true){
            System.out.println("O carro esta freiando");
        }else{
            System.out.println("O carro esta rápido demais!");
        }
    }
    
    
}

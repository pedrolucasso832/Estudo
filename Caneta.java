
package classeeobjetos;
public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    void status(){
        System.out.println("Uma caneta modelo: " + this.modelo);
        System.out.println("De ponta tamanho: " + this.ponta);
        System.out.println("De cor: " + this.cor);
        System.out.println("Esta tampada? " + this.tampada);
        System.out.println("E o nivel da carga é? " + this.carga);
    }
    
    void rabiscar(){
        if(tampada == true){
            System.out.println("ERRO! , não pode rabiscar!");
        }else{
            System.out.println("Estou rabiscando!");
        }
        
    }
    
    void tampar(){
        this.tampada = true;
        
    }
    
    void destampar(){
        this.tampada = false;
        
    }
}

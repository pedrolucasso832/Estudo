
package classeeobjetos;


public class ClasseEobjetos {

    
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor = "azul";
        c1.ponta = 0.5f;
        c1.tampada = false;
        c1.carga = 10;
        c1.modelo = "BIC cristal";//atributo
       
        c1.destampar();
        c1.status();// método
        c1.rabiscar();
        
        Caneta c2 = new Caneta();
        c2.cor = "Preta";
        c2.ponta = 1.0f;
        c2.tampada = true;
        c2.carga = 50;
        c2.modelo = "Hostnet";
        c2.status();
        
        c2.tampar();
        c2.rabiscar();
    }
    
}

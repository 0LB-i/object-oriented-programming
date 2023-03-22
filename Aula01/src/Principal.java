

/**
 *
 * @author gabriel.machado4
 */
public class Principal {
    
    public static void main(String[] args) {
        carro c1 = new carro();
        c1.marca = "Ford";
        c1.modelo = "Fiesta";
        c1.consumo = 10;
        c1.placa ="ABC123";
        System.out.println(c1);
        c1.calcularDistancia(35);
        
        carro c2 = new carro();
        c2.marca = "Fiat";
        c2.modelo = "Uno";
        c2.consumo = 12;
        c2.placa = "DFG456";
        System.out.println(c2);
        c2.calcularDistancia(35);
    }
    
    
}

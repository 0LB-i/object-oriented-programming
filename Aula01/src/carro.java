
/**
 *
 * @author gabriel.machado4
 */
public class carro {
    
    String marca;
    String modelo;
    String placa;
    double consumo;
    
    void calcularDistancia(double litros){
        System.out.println("Distância:" + (litros*consumo) + " km");
    }

    @Override
    public String toString() {
        return "carro{" + "marca=" + marca + ", modelo=" + modelo + ", placa=" + placa + ", consumo=" + consumo + '}';
    }
    
    
    
}

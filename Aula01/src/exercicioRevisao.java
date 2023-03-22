
/**
 *
 * @author gabriel.machado4
 */
public class exercicioRevisao {
    public static void main(String[] args) {
        
        double distanciaKm = 10;
        double velocidadeKm = Entrada.leiaDouble("Insira a velocidade em Km/H que o atleta corre.");
        
        double mediaTempo = 60 * (distanciaKm/velocidadeKm);
        
        System.out.println("O atleta percorre " + distanciaKm + " Km de distancia em " + mediaTempo + " Minutos.");
        
        System.exit(0);     
    }
}

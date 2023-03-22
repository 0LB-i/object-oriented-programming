
import java.text.DecimalFormat;


/**
 *
 * @author gabriel.machado4
 */
public class exemplo01 {
    public static void main(String[] args) {
        
        
        double valor = 0;
        valor =  Entrada.leiaDouble("Digite o valor em dólares US$");
        
        double resultado = valor * 4.97;
        
        DecimalFormat df = new DecimalFormat("#.00");
        
        
        System.out.println("Resulatado da conversção: R$ " + df.format(resultado));
    }
}

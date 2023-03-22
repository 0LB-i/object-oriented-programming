
/**
 *
 * @author gabriel.machado4
 */
public class exercicioRevisao2 {
    public static void main(String[] args) {
        
        int a, b, c;
        
        a = Entrada.leiaInt("Insira um valor");
        b = Entrada.leiaInt("Insira um valor");
        c = Entrada.leiaInt("Insira um valor");
        
        double soma = a + b;
        
        if(soma < c){
            System.out.println("A soma de A + B é: " + soma);
        }
        
        System.exit(0);
    }
}

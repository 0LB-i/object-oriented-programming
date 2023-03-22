/**
 *
 * @author gabriel.machado4
 */
public class exercicioRevisao3 {
    public static void main(String[] args) {
        
        double num = 0;
        
        num = Entrada.leiaDouble("Digite um número");
        
        if(num > 0){
            System.out.println("O dobro do número inserido é " + (num * 2));
        }else if(num < 0){
            System.out.println("O triplo do número inserido é " + (num * 3));
        }
        
        System.exit(0);
    }
}

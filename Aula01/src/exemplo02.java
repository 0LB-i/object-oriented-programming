
/**
 *
 * @author gabriel.machado4
 */
public class exemplo02 {
    public static void main(String[] args) {
        int qtde = 0;
        int n1, n2, n3, n4, n5;
        n1 = Entrada.leiaInt("Digite um número");
        
        if(n1%5==0 && n1%7==0 && n1%2!=0){
            qtde++;
        }
        
        n2 = Entrada.leiaInt("Digite um número");
        
        if(n2%5==0 && n2%7==0 && n2%2!=0){
            qtde++;
        }
        
        n3 = Entrada.leiaInt("Digite um número");
        
        if(n3%5==0 && n3%7==0 && n3%2!=0){
            qtde++;
        }
        
        n4 = Entrada.leiaInt("Digite um número");
        
        if(n4%5==0 && n4%7==0 && n4%2!=0){
            qtde++;
        }
        
        n5 = Entrada.leiaInt("Digite um número");
        
        if(n5%5==0 && n5%7==0 && n5%2!=0){
            qtde++;
        }
        
        System.out.println("A quantidade de valores aceitos é de: "+qtde);
        
        System.exit(0);
    }
}

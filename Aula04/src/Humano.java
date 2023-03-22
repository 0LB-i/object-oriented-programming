/**
 *
 * @author gabriel.machado4
 */
public class Humano {
    
    static int dentes;
    
    public static void main(String[] args) {
        Humano.dentes = 32;
        
        Humano joao = new Humano();
        Humano maria = new Humano();
        
        System.out.println("João possui " + joao.dentes + " dentes.");
        System.out.println("Maria possui " + maria.dentes + " dentes.");
        
        Humano.dentes = 28;
        
        System.out.println("João possui " + joao.dentes + " dentes.");
        System.out.println("Maria possui " + maria.dentes + " dentes.");
        
        System.exit(0);
    }
}

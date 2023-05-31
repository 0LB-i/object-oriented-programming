
/**
 * @author gabriel.machado4
 */
public class TestaPrimo {
    public static void main(String[] args) {
        int num = Entrada.leiaInt("Número?");
        int centenas = (int) num/100;
        int restoCentena = (int) num%100;
        System.out.println("Localizado divisores");
        for(int i=0; i<centenas; i++){
            new TestaValor(i*100,(i*100)+100, num).start();
        }
        new TestaValor(centenas*100,(centenas*100)+restoCentena, num).start();
        System.out.println("Fim do programa");
        System.exit(0);
    }
}

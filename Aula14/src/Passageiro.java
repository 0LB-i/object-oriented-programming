/**
 * @author gabriel.machado4
 */
public class Passageiro {
    public static void main(String[] args) {
        Passagem p1 = new Passagem("Larissa");
        Passagem p2 = new Passagem("Pedro");
        Passagem p3 = new Passagem("Lucas");
        p1.start();
        p2.start();
        p3.start();
    }
}

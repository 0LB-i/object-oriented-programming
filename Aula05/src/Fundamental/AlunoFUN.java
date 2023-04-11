
package Fundamental;

/**
 *
 * @author gabriel.machado4
 */
public class AlunoFUN {
    public static void main(String[] args) {
        
        Pessoa alunoFUN1 = new Pessoa("Maria", "529.758.060-94", 13, 123456, "A+", 8);
        System.out.println(alunoFUN1);
        alunoFUN1.tipoSanguineo = "A-";
        alunoFUN1.anoEstudo = 9;
        System.out.println(alunoFUN1);
        
        System.exit(0);
        
    }
}

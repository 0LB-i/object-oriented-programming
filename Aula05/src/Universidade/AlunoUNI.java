
package Universidade;

/**
 *
 * @author gabriel.machado4
 */

import Fundamental.Pessoa;

public class AlunoUNI extends Pessoa{
    
    public static void main(String[] args) {
        
        AlunoUNI alunoUNI1 = new AlunoUNI();
        alunoUNI1.idade = 20;
        alunoUNI1.tipoSanguineo = "AB+";
        
        System.out.println(alunoUNI1);
        
        System.exit(0);
        
    }
}

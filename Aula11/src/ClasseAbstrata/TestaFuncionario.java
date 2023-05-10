
package ClasseAbstrata;

/**
 *
 * @author gabriel.machado4
 */
public class TestaFuncionario {
    public static void main(String[] args) {
        
        Operario operario = new Operario();
        Gerente gerente = new Gerente();
        operario.setSalario(2000);
        gerente.setSalario(5000);
        
        System.out.println(operario.salario);
        System.out.println(gerente.salario);
        
        operario.alterarSalario(2500);
        gerente.alterarSalario(6000);
        
        System.out.println(operario.salario);
        System.out.println(gerente.salario);
        
        System.exit(0);
        
    }
}

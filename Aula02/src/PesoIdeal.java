/**
 *
 * @author gabriel.machado4
 */
public class PesoIdeal {
    public static double calcularPesoIdeal(double altura, char sexo){
        
        double peso = 0;
        
        if(sexo =='M' || sexo =='m'){
            peso = 62.1 * altura -44.7;
        }
        
        if(sexo == 'F' || sexo == 'f'){
            peso = 72.7 * altura - 58;
        }
        
        return peso;       
    }
    
    public static void main(String[] args) {
        double alt = Entrada.leiaDouble("Informe a altura?");
        char sexo = Entrada.leiaChar("Informe a letra M para sexo Masculino e F para sexo Feminino.");
        double pesoIdeal = calcularPesoIdeal(alt, sexo);
        System.out.println("O peso ideal é: "+pesoIdeal);
        
        System.exit(0);
    }
    
}

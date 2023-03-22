
/**
 *
 * @author gabriel.machado4
 */
public class exemplo03 {
    public static void main(String[] args) {
        int diaSemana = Entrada.leiaInt("Digite um número de 1 a 7.");
        
        String semana = "";
        
        switch(diaSemana){
            case 1:
                semana = "Domingo";
                break;
            
            case 2:
                semana = "Segunda-Feira";
                break;
                
            case 3:
                semana = "Terça-Feira";
                break;
                
            case 4:
                semana = "Quarta-Feira";
                break;
                
            case 5:
                semana = "Quinta-Feira";
                break;
                
            case 6:
                semana = "Sexta-Feira";
                break;
            
            case 7:
                semana = "Sábado";
                break;
            
            default:
                semana = "Inválido";
                break;
        }
        
        System.out.println("Dia da semana: " + semana);
        
        System.exit(0);
    }
}

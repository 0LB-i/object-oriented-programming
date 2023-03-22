/**
 *
 * @author gabriel.machado4
 */
public class Executavel {
    
    void imp100Pares(){
        
        System.out.println("Imprimir os primeiros 100 núemros pares");
         
        for(int x=1; x<=200;x++){ 
            if(x%2==0){
                System.out.println(x);
            }
        }
        
        System.out.println("Fim da Listagem \n");
    }
    
    void impMultiplos5_1_500(){
        
        System.out.println("Todos os multiplos de 5, entre 1 e 500");
        
        for(int x=1; x<=500;x++){
            if(x%5==0){
                System.out.println(x);
            }
        }
        
        System.out.println("Fim da Listagem \n");
    }
    
    void impSomar1_100(){
        
        int soma = 0;
        System.out.println("Imprimir e somar 1-100");
        
        for(int x=0; x<=100;x++){
            soma = soma + x;
        }
        
        System.out.println("Total soma: " + soma + "\n Fim da Listagem \n");
    }
    
    //************************************
    
    public static void main(String[] args){
        
        Executavel calculadora = new Executavel();
        calculadora.imp100Pares();
        calculadora.impMultiplos5_1_500();
        calculadora.impSomar1_100();
    }
    
}

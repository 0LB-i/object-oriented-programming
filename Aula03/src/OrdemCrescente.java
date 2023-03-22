/*
 * 1 - Faça um procedimento que recebe 3 valores inteiros por parâmetro e
retorna-os ordenados em ordem crescente.
 */

/**
 *
 * @author gabriel.machado4
 */
public class OrdemCrescente {
    
    public static void ordemCrescente(int vet[]){
    
        for(int x = 0; x <vet.length; x++){
            for(int y = 0; y<vet.length; y++){
                
                if (vet[x] < vet[y]) {
                    int temp = vet[x];
                    vet[x] = vet[y];
                    vet[y] = temp;
                 }
            }
        }
        
        System.out.print("Ordem crescente: ");
        
        for(int i = 0; i < vet.length; i++){
            System.out.print(vet[i]+ "  ");
        }
        
    }
    
    public static void main(String[] args) {
        
        int vet[] = new int [3];
        
        vet[0] = Entrada.leiaInt("Digite um número");
        vet[1] = Entrada.leiaInt("Digite o segundo número");
        vet[2] = Entrada.leiaInt("Digite o terceiro número");
        
       ordemCrescente(vet);
       
       System.exit(0);
        
    }
    
}

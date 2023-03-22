/* @author gabriel.machado4 */

public class TrabalhoIndependente {
    public static int preencherVetor(int vet[]){
        
        int count = 0;
        
        for(int i = 0; i < vet.length; i++){
             vet[i] = (int)(Math.random()*50);
             
             System.out.println("Número gerado: "+vet[i]);
            
            if(vet[i] % 2 == 0){
                count++;
            } 
        }
        
        return count;
    }
    
    public static void main(String[] args) {
        
        int vetor[] = new int [100];
        int count = preencherVetor(vetor);
        
        System.out.println("Total de números pares: " + count);
        
        System.exit(0);
    }
}

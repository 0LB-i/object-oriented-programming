    
public class TrabalhoIndependenteProcedimento {
    public static void preencherVetor(int vet[]){
        
        int count = 0;

        for(int i = 0; i < vet.length; i++){
             vet[i] = (int)(Math.random()*50);
             
             System.out.println("Número gerado: "+vet[i]);
            
            if(vet[i] % 2 == 0){
                count++;
            } 
        }
        
        System.out.println("Total de números pares: " + count);
    }
    
    public static void main(String[] args) {
        
        int vet[] = new int [100];
        
        preencherVetor(vet);
        System.exit(0);
    }
}

/*
 *
 * @author gabriel.machado4
 */
public class exercicioRevisao4 {
    public static void main(String[] args) {
        
        int vet[] = new int[3];
        
        for(int i = 0; i < vet.length;i++){
            vet[i] = Entrada.leiaInt("Digite um númeor inteiro");
        }
        
        for(int x = 0; x <vet.length; x++){
            for(int y = 0; y<vet.length; y++){
                
                if (vet[x] > vet[y]) {
                    int temp = vet[x];
                    vet[x] = vet[y];
                    vet[y] = temp;
                 }
            }
        }
   
        for(int i = 0; i < vet.length;i++){
            System.out.println(vet[i]);
        }
        
        System.exit(0);
    }
}

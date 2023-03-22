/**
 *
 * @author gabriel.machado4
 */
public class ExercicioExemplo {
    public static void ordenar(int vet[]){
        
        for(int x = 0; x <vet.length - 1; x++){
            for(int y =x+1; y <vet.length; y ++){
                
                if(vet[x] > vet[y]){
                int tmp = vet[x];
                    vet[x] = vet[y];
                    vet[y] = tmp;
                
                }
            }
        }
        
        for(int x=0; x<vet.length; x++){
            System.out.println(vet[x]);
        }
        
        System.exit(0);  
    }
}

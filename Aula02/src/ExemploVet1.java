

/**
 *
 * @author gabriel.machado4
 */
public class ExemploVet1 {
    public static void main(String[] args) {
        
        int gabarito[] = {10,27,34,12,49,50,1,3};
        
        int loto [] = new int [10];
        
        for(int x=0; x<loto.length; x++){
            loto[x] = (int)(Math.random()*50);
        }
        
        int acertos = 0;
        
        for(int y = 0; y<gabarito.length; y++){
            for(int i = 0; i<loto.length; i++){
                if(loto[i] == gabarito[y]){
                    acertos++;
                }
            }
        }
        
        System.out.println("O total de acertos foi: " + acertos);
        
        System.exit(0);
        
    }
}

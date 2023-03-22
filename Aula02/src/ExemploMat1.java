/**
 *
 * @author gabriel.machado4
 */
public class ExemploMat1 {
    public static void main(String[] args) {
        
        int G[][] = new int [5] [5];
        
        int SL[] = new int[5];
        int SC[] = new int[5];
        
        for(int x = 0; x < 5; x++){
            for(int y = 0; y < 5; y++){
                
                G[x][y] = (int)(Math.random()*50);
                System.out.print(G[x][y] + "\t");
            }
            System.out.println();
        }
        
        int somaL = 0;
        int somaC = 0;
        
        for(int x = 0; x < 5; x++){
            for(int y = 0; y < 5; y++){
            
                somaL = somaL + G[x][y];
                somaC = somaC + G[y][x];
                
            }
            
            SL[x] = somaL;
            SC[x] = somaC;
            
            somaC = 0;
            somaL = 0;
        }
        
        System.out.println("\t");
        
        for(int x = 0; x < 5; x++){
            System.out.println("Resultado da soma da linha "+x+": "+SL[x]);
            System.out.println("Resultado da soma da coluna "+x+": "+SC[x]);
        }
         
        System.exit(0);
    }
}

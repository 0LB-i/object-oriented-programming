
/**
 *
 * @author gabriel.machado4
 */


public class TestaMidias {
    
    static Midias[] midias = new Midias[10];
   
    public static void cadastrar(int pos, int tipo){
         
        switch(tipo){
            case 1:
                Bluray B = new Bluray();
                
                B.codigo = Entrada.leiaInt("Informe o código do item:");
                B.idBluray = Entrada.leiaInt("informe o código do BluRay");
                B.nomeFilme = Entrada.leiaString("Informe o nome do Filme");
                B.duracaoMin = Entrada.leiaInt("Informe a duração do filme (em minutos)");
                B.preco = Entrada.leiaDouble("Informe o Preço do item");
                
                midias[pos] = (Bluray) B;
                
                System.out.println("Midia cadastrada na posição " + pos);
                break;
            
            case 2:
                Usb U = new Usb();
                
                U.codigo = Entrada.leiaInt("Informe o código do item:");
                U.idUsb = Entrada.leiaInt("Informe o código do USB");
                U.tipoArquivo = Entrada.leiaString("Informe o tipo a ser armazenado: (imagens, vídeo, som, dados)");
                U.preco = Entrada.leiaDouble("Informe o preço do item");
                
                midias[pos] = (Usb) U;
                
                System.out.println("Midia cadastrada na posição " + pos);
                break;
        }
        
    }
    
    public static void listar(int pos){
            
            if(midias[pos] == null){
                return;
            }
            
            if(midias[pos] instanceof Bluray){
                
                Bluray B = new Bluray();              
                B = (Bluray) midias[pos];
                
                System.out.println("Exibindo registro do Bluray:");
                System.out.println("Código do Item...: " + B.codigo);
                System.out.println();
            }
        
    };
    
    public static void main(String[] args) {
        
        Midias m = new Midias();
        
        int n = 0;
        
        while(true){
            String menu = "1 - Cadastrar Midia \n2 - Exibir Midia \n3 - Sair";
            n = Entrada.leiaInt(menu);
            
            switch(n){
                case 1:
                    int pos = Entrada.leiaInt("Posição no vetor:");
                    
                    int tipo = Entrada.leiaInt("Informe a Midia: \n1 - BluRay \n2 - USB");
                    
                    cadastrar(pos, tipo);
                    break;
                    
                case 2:
                    
                    
                    break;
                    
                case 3:
                    System.exit(0);
                    break;
                    
            }      
        }
    } 
}

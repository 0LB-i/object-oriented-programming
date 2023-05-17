/**
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
                B.capacidadeArmazenamento = Entrada.leiaInt("Informe a capcidade de armazenamento: (GB)");
                B.nomeFilme = Entrada.leiaString("Informe o nome do Filme");
                B.duracaoMin = Entrada.leiaInt("Informe a duração do filme (em minutos)");
                B.idade = Entrada.leiaInt("Informe a classificação indicativa do filme");
                B.preco = Entrada.leiaDouble("Informe o Preço do item");
                
                midias[pos] = (Bluray) B;
                
                System.out.println("Midia cadastrada na posição " + pos + "\n");
                break;
            
            case 2:
                Usb U = new Usb();
                
                U.codigo = Entrada.leiaInt("Informe o código do item:");
                U.idUsb = Entrada.leiaInt("Informe o código do USB");
                U.tipoArquivo = Entrada.leiaString("Informe o tipo a ser armazenado: (imagens, vídeo, som, dados)");
                U.capacidadeArmazenamento = Entrada.leiaInt("Informe a capcidade de armazenamento: (GB)");
                U.preco = Entrada.leiaDouble("Informe o preço do item");
                
                midias[pos] = (Usb) U;
                
                System.out.println("Midia cadastrada na posição " + pos + "\n");
                break;
        }
    }
    
    public static void somaArmazenamento(){
        int soma = 0;
        
        for(int x = 0; x < 10; x++){
            if(midias[x] == null){
                continue;
            }else{
            soma = soma +  midias[x].capacidadeArmazenamento;
            }}
        
        System.out.println("Capacidade de armazenamento total de todas as midias: " + soma + " GB");
    }
    
    public static void precoTotal(){
        double somaPreco = 0;
        
        for(int x = 0; x < 10; x++){
            if(midias[x] == null){
                continue;
            }else{
            somaPreco = somaPreco +  midias[x].capacidadeArmazenamento;
            }}
        
        System.out.println("Capacidade de armazenamento total de todas as midias:R$ " + somaPreco);
    }
    
    public static void listar(int pos){
            
            if(midias[pos] == null){
                return;
            }
            if(midias[pos] instanceof Bluray){
                
                Bluray B = new Bluray();              
                B = (Bluray) midias[pos];
                
                System.out.println("Exibindo registro do Bluray:");
                System.out.println("Código do Item.................: " + B.codigo);
                System.out.println("Código do Bluray...............: " + B.idBluray);
                System.out.println("Capacidade de armazenamento(GB): " + B.capacidadeArmazenamento);
                System.out.println("Nome do Filme..................: " + B.nomeFilme);
                System.out.println("Duração........................: " + B.duracaoMin);
                System.out.println("Classificação indicativa(anos).: " + B.idade);
                B.informarCensura();
                System.out.println("Preço..........................: " + B.preco + "\n");        
            }else{
                Usb U = new Usb();
                U = (Usb) midias[pos];
                
                System.out.println("Exibindo Registro do USB:");
                System.out.println("Código do Item.................: " + U.codigo);
                System.out.println("Código do USB..................: " + U.idUsb);
                System.out.println("Capacidade de armazenamento(GB): " + U.capacidadeArmazenamento);
                System.out.println("Tipo de Midia Armazenada.......: " + U.tipoArquivo);
                System.out.println("Preço..........................: " + U.preco + "\n");
            }
    };
    
    public static void main(String[] args) {
        
        Midias m = new Midias();
        
        int n = 0;
        
        while(true){
            String menu = "1 - Cadastrar Midia \n2 - Exibir Midia \n3 - Capacidade total de armazenamento de todas as Midias \n4 - Soma total do Preço de todos os Produtos \n5 - Sair";
            n = Entrada.leiaInt(menu);
            
            switch(n){
                case 1:
                    int pos = Entrada.leiaInt("Posição no vetor:");
                    
                    int tipo = Entrada.leiaInt("Informe a Midia: \n1 - BluRay \n2 - USB");
                    
                    cadastrar(pos, tipo);
                    break;
                    
                case 2:
                    
                    pos = Entrada.leiaInt("Posição no vetor:");
                    listar(pos);
                    
                    break;
                 
                case 3:
                    
                    somaArmazenamento();
                    break;
                    
                case 4:
                    
                    precoTotal();
                    break;
                    
                case 5:
                    System.exit(0);
                    break;    
            }      
        }
    } 
}

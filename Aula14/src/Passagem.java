/**
 * @author gabriel.machado4
 */
public class Passagem extends Thread{
    static int qtdeC1 = 30;
    static int qtdeC2 = 30;
    String nome;
    
    public Passagem(String nome){
        super(nome);
        this.nome = nome;
    }
    
    public void venderPassagem(int qtde, int carro){
        switch(carro){
            case 1:
                if(qtdeC1-qtde >= 0){
                    qtdeC1 = qtdeC1 - qtde;
                    System.out.println("Vendida: " 
                            + qtde + ". Comprador: " + this.nome + ". Carro 1. Restam "
                    + qtdeC1);
                }else{
                    System.out.println(">> Passagem insuficiente no Carro 1");
                }
                break;
                
            case 2:
                if(qtdeC2-qtde >= 0){
                    qtdeC2 = qtdeC2 - qtde;
                    System.out.println("Vendida: " 
                            + qtde + ". Comprador: " + this.nome + ". Carro 2. Restam "
                    + qtdeC2);
                }else{
                    System.out.println(">> Passagem insuficiente no Carro 2");
                }
                break;
        }
        if(qtdeC1 == 0 && qtdeC2 == 0){
            System.out.println("Fim do Programa");
            System.exit(carro);
        }
    }
    
    @Override
    public void run(){
        while(true){
            int passagens = (int)(Math.random()*3)+1;
            int carro = (int)(Math.random()*2)+1;
            venderPassagem(passagens, carro);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){};
            yield();
            
        }
    }
   
}

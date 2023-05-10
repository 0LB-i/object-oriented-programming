package InterfaceExer;

import Interfaces.Entrada;

/**
 *
 * @author gabriel.machado4
 */
public class TestaContatos implements Contatos{

    int contato;
    String nome;
    TestaContatos[] testaContatos = new TestaContatos[5];
    
    @Override
    public void cadastrar(int pos, int contato, String nome) {
        testaContatos[pos] = new TestaContatos();
        testaContatos[pos].nome = nome;
        testaContatos[pos].contato = contato;
    }

    @Override
    public void remover(int pos) {
        testaContatos[pos].contato = 0;
        testaContatos[pos].nome = "";
        
    }

    @Override
    public void listar(){
        for(int x = 0; x < 5; x++){
            if(testaContatos[x] == null){
                continue;
            }
            System.out.println("Contato " + (x + 1));
            System.out.println("Contato: " + testaContatos[x].contato);
            System.out.println("Nome: " + testaContatos[x].nome);
        }
    }
    
    public static void main(String[] args) {
        
        TestaContatos t = new TestaContatos();
        int op = 0;
        while(true){
            String men = "1 - Cadastrar \n2 - Listar\n3 - Remover\n4 - Sair";
            op = Entrada.leiaInt(men);
            switch(op){
                case 1:
                    int p = Entrada.leiaInt("Posição?");
                    int c = Entrada.leiaInt("Num. Contato?");
                    String n = Entrada.leiaString("Nome?");
                    t.cadastrar(p, c, n);
                    break;
                
                case 2:
                    t.listar();
                    break;
                    
                case 3:
                    int pp = Entrada.leiaInt("Posição?");
                    t.remover(pp);
                    System.out.println("Contato Removido");
                    break;
                    
            }
            if(op == 4){
                System.exit(0);
                break;                
            }
            
        }
        
        System.exit(0);
        
    }
}

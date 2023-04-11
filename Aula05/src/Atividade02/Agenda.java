
package Atividade02;

/**
 *
 * @author gabriel.machado4
 */
public class Agenda {
    
    private String nome;
    private String endereco;
    private int CEP;
    private String telefone;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getCEP() {
        return CEP;
    }

    public void setCEP(int CEP) {
        this.CEP = CEP;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void Cadastar(){
        
        String nome = Entrada.leiaString("Digite o nome do contato");
        String endereco = Entrada.leiaString("Digite o endereço do contato");
        int CEP = Entrada.leiaInt("Digite o CEP do contato");
        String telefone = Entrada.leiaString("Digite o telefone do contato");
        
        this.setNome(nome);
        this.setCEP(CEP);
        this.setEndereco(endereco);
        this.setTelefone(telefone);
    }
    
    public void Excluir(){
        
        this.setNome("");
        this.setCEP(0);
        this.setEndereco("");
        this.setTelefone("");
    }
    
    public void Listar(){
       
        System.out.println("Nome: " + this.getNome());
        System.out.println("Endereço: " + this.getEndereco());
        System.out.println("CEP: " + this.getCEP());
        System.out.println("Telefone: " + this.getTelefone());
    }
    
    public static void main(String[] args) {
        
        Agenda contatos[] = new Agenda[10];
        
        for(int x = 0; x < 10; x++ ){
            
            int opc = Entrada.leiaInt("Agenda \n ========== \n 1 - Cadastrar \n 2 - Listar \n 3 - Excluir \n 4 - Sair \n Qual a sua opção:");
            
                switch(opc){
            case 1:
                int z = Entrada.leiaInt("Escolha um contato na lista de 0 - 9");
                
                contatos[z] = new Agenda();
                contatos[z].Cadastar();
                break;
            
            case 2:
                int y = Entrada.leiaInt("Escolha um contato na lista de 0 - 9");
                contatos[y].Listar();
                break;
                
            case 3:
                int j = Entrada.leiaInt("Escolha um contato na lista de 0 - 9");
                contatos[j].Excluir();
                break;
            
            case 4:
                System.exit(0);
            }
            
        }
        
        
        System.exit(0);
    }
    
}

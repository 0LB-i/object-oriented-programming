
package Fundamental;

/**
 *
 * @author gabriel.machado4
 */
public class Pessoa {
    
    private String nome;
    private String cpf;
    protected int idade;
    private int idFuncional;
    public String tipoSanguineo;
    int anoEstudo;

    public Pessoa() {
    }

    public Pessoa(String nome, String cpf, int idade, int idFuncional, String tipoSanguineo, int anoEstudo) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.idFuncional = idFuncional;
        this.tipoSanguineo = tipoSanguineo;
        this.anoEstudo = anoEstudo;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", cpf=" + cpf + ", idade=" + idade + ", idFuncional=" + idFuncional + ", tipoSanguineo=" + tipoSanguineo + ", anoEstudo=" + anoEstudo + '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdFuncional() {
        return idFuncional;
    }

    public void setIdFuncional(int idFuncional) {
        this.idFuncional = idFuncional;
    }

    public String getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }

    public int getAnoEstudo() {
        return anoEstudo;
    }

    public void setAnoEstudo(int anoEstudo) {
        this.anoEstudo = anoEstudo;
    }
    
    public static void main(String[] args) {
        Pessoa maria = new Pessoa();
        maria.setNome("Maria");
        maria.setCpf("2144235342121");
        System.out.println(maria.getNome());
        System.out.println(maria.getCpf());
        
        System.exit(0);
    }
    
    
}

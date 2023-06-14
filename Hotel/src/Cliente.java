/**
 * @author gabriel.machado4
 */
public class Cliente {
        
        int id;
        String nome;
        int idade;
        String dataEntrada;
        String dataSaida;
        int categoria;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(String dataSaida) {
        this.dataSaida = dataSaida;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public Cliente(int id, String nome, int idade, String dataEntrada, String dataSaida, int categoria) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.categoria = categoria;
    }
        
    

    public void definirCategoria(){
        if(this.idade <= 20){
            this.setCategoria(3);
        } else if(this.idade >= 21 && this.idade <= 45){
            this.setCategoria(2);
            
        } else if(this.idade > 46){
            this.setCategoria(1);
        }
    }
    
}

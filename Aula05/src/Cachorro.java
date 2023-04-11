/**
 *
 * @author gabriel.machado4
 */
public class Cachorro {
    
    private String raca;
    private String nome;
    private int idade;
    private double peso;

    public Cachorro() {
    }

    public Cachorro(String raca, String nome, int idade, double peso) {
        this.raca = raca;
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Cachorro{" + "raca=" + raca + ", nome=" + nome + ", idade=" + idade + ", peso=" + peso + '}';
    }
       
    public String verificarDesempenho(){
        
        String resposta = "";
        
        if(this.idade > 3 && this.peso < 10){
            resposta = "Cão de Caça";
        } else if(this.idade > 4 && this.peso > 15){
            resposta = "Cão de Guarda";
        }else{
            resposta = "Cão de Compania";
        }
        
        return resposta;
    }
    
    public static void main(String[] args) {
        
        Cachorro bidu = new Cachorro("Pitbull", "Bidu", 4, 9);
        Cachorro rex = new Cachorro( "Pastor Alemão", "Felix", 8, 20);
        Cachorro viralata = new Cachorro("Vira lata", "Bili", 2, 15);
        
        System.out.println(bidu.verificarDesempenho());
        System.out.println(rex.verificarDesempenho());
        System.out.println(viralata.verificarDesempenho());
        
        
        System.out.println(bidu);
        System.out.println(rex);
        System.out.println(viralata);
        
        System.exit(0);
        
    }
    
}

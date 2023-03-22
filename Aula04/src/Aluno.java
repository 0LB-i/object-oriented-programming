/**
 *
 * @author gabriel.machado4
 */
public class Aluno {
    
    String universidade;
    String curso;
    String disciplina;
    String nome;
    double n1;
    double n2;
    double n3;
    
    
    double calcularMedia(){
        
        double notaFinal;
        notaFinal = (this.n1 + this.n2 + this.n3)/3;
        
        return notaFinal;
    }
    
    double calcularMedia(int peso1, int peso2, int peso3){
        double pesoFinal;
        pesoFinal = (this.n1*peso1 + this.n2*peso2 + this.n3*peso3)/(peso1+peso2+peso3);
                
        return pesoFinal;
    }
    
    Aluno(){
        this.universidade = "Univates";
        this.curso = "Técnico em Informática";
        this.disciplina = "Programação OOP";
        this.nome = "Gabriel Brandão Machado";
    }
    
    Aluno(String disciplina, String nome){
        this();
        this.nome = nome;
        this.disciplina = disciplina;
    }
    
    Aluno(String curso, String disciplina, String nome){
        this();
        this.curso = curso;
        this.disciplina = disciplina;
        this.nome = nome;
    }

    public Aluno(String universidade, String curso, String disciplina, String nome) {
        this.universidade = universidade;
        this.curso = curso;
        this.disciplina = disciplina;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Aluno{" + "universidade=" + universidade + ", curso=" + curso + ", disciplina=" + disciplina + ", nome=" + nome + '}';
    }
    
    
    
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        
        System.out.println(a1);
        
        Aluno a2 = new Aluno("Algoritmos", "Paulo");
        System.out.println(a2);
        
        Aluno a3 = new Aluno("La Salle", "Informática", "Programação III", "Lucas");
        System.out.println(a3);
        
        Aluno a4 = new Aluno("Univates", "Engenharia", "Calculo", "Pedro");
        System.out.println(a4);
        
        Aluno a5 = new Aluno();
        a5.nome = "Maria";
        a5.n1 = 8;
        a5.n2 = 5.3;
        a5.n3 = 9;
        
        System.out.println("Media: " + a5.calcularMedia());
        System.out.println("Media: " + a5.calcularMedia(10, 2, 1));
        
        System.exit(0);
    }
}

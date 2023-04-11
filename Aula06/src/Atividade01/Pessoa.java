package Atividade01;

/**
 *
 * @author gabriel.machado4
 */
public class Pessoa {
    
    String nome;
    int idade;
    double altura;
    double peso;
    char sexo;

    public Pessoa() {
        this.nome = "Nome não informado";
        this.idade = 0;
        this.altura = 1;
        this.peso = 0;
        this.sexo = 'M';
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

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    
    
    public double calcularIMC(double peso, double altura){
        
        double IMC;
        
        IMC = (peso / ((altura/100)*2));
        
        return IMC;
        
    }
    
    public void imprimir(){
        
        double IMC = this.calcularIMC(this.peso, this.altura);
        
        if(IMC <= 18.5){
            System.out.println(this.nome + " está abaixo do peso normal. IMC = " + IMC);
        } if(18.5 < IMC && IMC <= 25){
            System.out.println(this.nome + " está com o peso normal. IMC = " + IMC);
        } if(25 < IMC && IMC <= 30){
            System.out.println(this.nome + " está acima do peso normal. IMC = " + IMC);
        } if (IMC > 30){
            System.out.println(this.nome + " está com obesidade. IMC = " + IMC);
        }
        
    }
    
}

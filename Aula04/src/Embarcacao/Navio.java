
package Embarcacao;

/**
 *
 * @author gabriel.machado4
 */
public class Navio {
    int tamanho;
    double peso;
    int capacidade;
    int velocidadeMAX;

    public Navio() {
    }

    public Navio(int tamanho, double peso) {
        this.tamanho = tamanho;
        this.peso = peso;
    }

    public Navio(int tamanho, double peso, int capacidade, int velocidadeMAX) {
        this.tamanho = tamanho;
        this.peso = peso;
        this.capacidade = capacidade;
        this.velocidadeMAX = velocidadeMAX;
    }
    
    public static void main(String[] args) {
        Navio barco = new Navio(300,15000);
        
        System.out.println("Tamanho do navio: " + barco.tamanho + " Peso do Navio: " + barco.peso);
        
        System.exit(0);
    }
    
}

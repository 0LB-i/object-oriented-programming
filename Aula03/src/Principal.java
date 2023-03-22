
/**
 *
 * @author gabriel.machado4
 */
public class Principal {
    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        Pessoa p3 = new Pessoa();
        
        p1.nome = "Gabriel";
        p1.sexo = 'M';
        p1.peso = 70;
        p1.altura = 170;
        p1.idade = 20;
        System.out.println("Seu nome é: " + p1.nome);
        System.out.println("Seu peso atual: " + p1.peso);
        System.out.println("Seu peso ideal: " + p1.calcularPesoIdeal());
        System.out.println("Sua classificação de idade: " + p1.classificarIdade());
        
        p2.nome = "João";
        p2.sexo = 'M';
        p2.peso = 140;
        p2.altura = 180;
        p2.idade = 67;
        System.out.println("\n Seu nome é: " + p2.nome);
        System.out.println("Seu peso atual: " + p2.peso);
        System.out.println("Seu peso ideal: " + p2.calcularPesoIdeal());
        System.out.println("Sua classificação de idade: " + p2.classificarIdade());
        
        p3.nome = "Maria";
        p3.sexo = 'F';
        p3.peso = 80;
        p3.altura = 160;
        p3.idade = 46;
        System.out.println("\n Seu nome é: " + p3.nome);
        System.out.println("Seu peso atual: " + p3.peso);
        System.out.println("Seu peso ideal: " + p3.calcularPesoIdeal());
        System.out.println("Sua classificação de idade: " + p3.classificarIdade());
        
        System.exit(0);
    }
}

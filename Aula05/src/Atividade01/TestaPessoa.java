package Atividade01;

/**
 *
 * @author gabriel.machado4
 */
public class TestaPessoa {
    
    public static void main(String[] args) {
        
        Pessoa pessoa1 = new Pessoa();
        
        String nome = Entrada.leiaString("Digite seu nome");
        int idade = Entrada.leiaInt("Digite a sua idade em anos");
        double peso = Entrada.leiaDouble("Digite o seu peso em kg");
        double altura = Entrada.leiaDouble("Digite sua altura em cm");
        char sexo = Entrada.leiaChar("Digite M se seu sexo for masculino e F para Feminino");
        
        pessoa1.setNome(nome);
        pessoa1.setAltura(altura);
        pessoa1.setIdade(idade);
        pessoa1.setPeso(peso);
        pessoa1.setSexo(sexo);
        
        pessoa1.imprimir();
        
        System.exit(0);
    }
}

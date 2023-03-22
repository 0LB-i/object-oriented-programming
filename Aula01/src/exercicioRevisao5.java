/**
 *Escreva um algoritmo que leia as 3 notas obtidas por um aluno nas 3 verificações e calcule
a média usando a fórmula: MA = (N1 + N2*2 + N3*3)/6 A atribuição dos conceitos obedece
a tabela abaixo. O algoritmo deve escrever a mensagem 'Aprovado' se o conceito for A, B
ou C, e 'Reprovado' se o conceito for D ou E.
>= 90 A
>= 75 e < 90 B
>= 60 e < 75 C
>= 40 e < 60 D
< 40 E
 * @author gabriel.machado4
 */
public class exercicioRevisao5 {
    public static void main(String[] args) {
        
        int a, b, c;
        
        a = Entrada.leiaInt("Insira a nota A.");
        b = Entrada.leiaInt("Insira a nota B.");
        c = Entrada.leiaInt("Insira a nota C.");
        
        double somaNotas = (a + b*2 + c*3)/6;
        
        if(somaNotas >= 90){
            System.out.println("Você foi aprovado e seu conceito é A");
        } else if(somaNotas >= 75 && somaNotas < 90){
            System.out.println("Você foi aprovado e seu conceito é B");
        } else if(somaNotas >= 60 && somaNotas < 75){
            System.out.println("Você foi aprovado e seu conceito é C");
        } else if(somaNotas >= 40 && somaNotas < 60){
            System.out.println("Você foi reprovado e seu conceito é D");
        } else {
            System.out.println("Você foi reprovado e seu conceito é E");
        }
        
        System.out.println("Soma da nota "+somaNotas);
        
        
        System.exit(0);
    }
}

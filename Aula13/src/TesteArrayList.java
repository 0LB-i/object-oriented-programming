
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gabriel.machado4
 */
public class TesteArrayList {
    public static void main(String[] args) {
        
        String n1 = "Luiza";
        String n2 = "Pedro";
        String n3 = "João";
        String n4 = "Gabriel";
        String n5 = "Anelise";
        String n6 = "Nicolas";
        String n7 = "Zé";
        String n8 = "Bruno";
        String n9 = "Paulo";
        String n10 = "kayler";
        ArrayList<String> vet = new ArrayList<String>();
        
        vet.add(n1);
        vet.add(n2);
        vet.add(n3);
        vet.add(n4);
        vet.add(n5);
        vet.add(n6);
        vet.add(n7);
        vet.add(n8);
        vet.add(n9);
        vet.add(n10);
        
        System.out.println("Resultado: " + vet);
        
        
        System.out.println("\nRemovendo o Registro 2");
        
        vet.remove(n2);
        
        System.out.println("Resultado: " + vet);
        
        System.out.println("\nRemovendo o Registro 1");
        
        vet.remove(n1);
        
        System.out.println("Resultado: " + vet);
        
        
        System.out.println("Adicionando Romeu em 1");
        
        vet.add(1, "Romeu");
        
        System.out.println("Resultado: " + vet);
        
        
        System.out.println("Localizando Registro");
        
        if(vet.contains("Paulo")){
            System.out.println("Registro localizado");
        }else{
            System.out.println("Registro não encontrado");
        }
        
        
        System.out.println("Posição de registros");
        
        int pPos = vet.indexOf("Anelise");
        System.out.println("Imprimir = " + pPos);
        int uPos = vet.indexOf("Marilia");
        System.out.println("Imprimir " + uPos);
        
        
        
        System.out.println("Collections");
        
        Collections.sort(vet);
        System.out.println("Ordenado: " + vet);
        
        
        // Aluno
  
        Aluno e1 = new Aluno("Gabriel", 20);
        Aluno e2 = new Aluno("Pedro", 22);
        Aluno e3 = new Aluno("Lucas", 17);
        Aluno e4 = new Aluno("joão", 15);
        Aluno e5 = new Aluno("Maria", 30);
        
        
        ArrayList<Aluno> alunos = new ArrayList<Aluno>();
        
        alunos.add(e1);
        alunos.add(e2);
        alunos.add(e3);
        alunos.add(e4);
        alunos.add(e5);
        
        System.out.println("\nAlunos listados:" + alunos);
        
        System.out.println("Ordenado por idade");
        
        alunos.sort(Comparator.comparing(Aluno::getIdade));
        System.out.println("Resultado: " + alunos);
        
        System.out.println("Ordenado por idade reverso");
        alunos.sort(Comparator.comparing(Aluno::getIdade, Collections.reverseOrder()));
        System.out.println("Resultado: " + alunos);
        
        int i = 0;
        
        for(Aluno al: alunos){
            System.out.println("Registro " + i);
            System.out.println("Nome: " + al.getNome());
            System.out.println("Idade: " + al.idade);
            i++;
        }
        
        
        System.exit(0);
        
    }
}

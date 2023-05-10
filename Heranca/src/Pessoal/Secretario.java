package Pessoal;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Paulo
 */
public class Secretario extends Funcionario{
    int anoFomracao;
    int linguas;
    
    public void progredir(){
        int anoAtual = 2023;
        int anosFormado = 2023-this.anoFomracao;
        int numAumentos = anosFormado/5;
    
        //Fazer o salario receber um aumento de 5% a cada 5 anos trabalhados
        
        double salario = this.getSalario();
        salario += salario*(numAumentos*0.05);
        this.setSalario(salario);
    }
    
    

    public int getAnoFomracao() {
        return anoFomracao;
    }

    public void setAnoFomracao(int anoFomracao) {
        this.anoFomracao = anoFomracao;
    }

    public int getLinguas() {
        return linguas;
    }

    public void setLinguas(int linguas) {
        this.linguas = linguas;
    }
    
    
}

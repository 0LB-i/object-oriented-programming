/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exemplo1;

/**
 *
 * @author Paulo
 */
public class Motor {
    private int potencia;
    private int velocidadeAtual;
    private boolean ligar;
    private String descricao;

    public Motor() {
        potencia = 105;//CV
        velocidadeAtual = 0;
        ligar = true;
    }

    public Motor(int potencia, int velocidadeAtual, boolean ligar) {
        this.potencia = potencia;
        this.velocidadeAtual = velocidadeAtual;
        this.ligar = ligar;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    
    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public boolean isLigar() {
        return ligar;
    }

    public void setLigar(boolean ligar) {
        this.ligar = ligar;
    }

    @Override
    public String toString() {
        return "Motor{" + "potencia=" + potencia + ", velocidadeAtual=" + velocidadeAtual + ", ligar=" + ligar + '}';
    }
    
    
}

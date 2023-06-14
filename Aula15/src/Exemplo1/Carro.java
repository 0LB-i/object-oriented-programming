/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exemplo1;

/**
 *
 * @author Paulo
 */
public class Carro {
    private String cor;
    private String marca;
    private String modelo;
    private ComputadorBordo computador;
    private Motor motor;

    public Carro(String cor, String marca, String modelo) {
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
        this.motor = new Motor();
        this.computador = new ComputadorBordo();
        this.computador.setDescricao("KONNWEI KW206");
        this.motor.setDescricao("AP-600");
    }

    public Carro() {
    }
    
    
    public void alterarVelocidade(int velocidade){
        this.motor.setVelocidadeAtual(this.motor.getVelocidadeAtual() + velocidade);
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public ComputadorBordo getComputador() {
        return computador;
    }

    public void setComputador(ComputadorBordo computador) {
        this.computador = computador;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "Carro{" + "cor=" + cor + ", marca=" + marca + ", modelo=" + modelo + ", computador=" + computador + ", motor=" + motor + '}';
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Paulo
 */
public class Veiculo {

    public String modelo;
    public float velocidade;
    public int passageiros;
    public float combustivel;

    public Veiculo() {
    }

    public Veiculo(String m, int p, float c) {
        this.modelo = m;
        this.passageiros = p;
        this.combustivel = c;
    }

    public void setVelocidade(float v) {
        velocidade = v;
    }

    public float getVelocidade() {
        return velocidade;
    }

    public void setPassageiros(int p) {
        passageiros = p;
    }

    public int getPassageiros() {
        return passageiros;
    }

    public void acelera() {
        System.out.println("Acelera");
    }

    public void freia() {
        System.out.println("Freia");
    }
}

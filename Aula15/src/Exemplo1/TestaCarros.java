/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exemplo1;

/**
 *
 * @author Paulo
 */
public class TestaCarros {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Branco","Volkswagen", "Gol");
        Carro carro2 = new Carro("Vermelho","Ford", "Fiesta");
        
        carro1.getComputador().setDescricao("WYOBD P17");
        carro1.getComputador().setLigarGPS(true);
        carro1.getMotor().setDescricao("EA-111 VHT 1.0 8V");
        carro1.getMotor().setVelocidadeAtual(80);
        System.out.println(carro1);
        
        carro2.getComputador().setDescricao("Hud Obd2 P10");
        carro2.getComputador().setLigarGPS(false);
        carro2.getComputador().setLigarMP3Player(true);
        carro2.getMotor().setDescricao("Zetec Rocam 2000");
        carro2.getMotor().setVelocidadeAtual(100);
        System.out.println(carro2);
        
    }
}

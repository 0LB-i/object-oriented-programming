/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Paulo
 */

//Tentar herdar de "NaoPodeHerdar"
//Tentar criar o metodo "imprimirMensagem" em ExemploFINAL
public class ExemploFINAL{

    public static void main(String[] args) {
        NaoPodeHerdar objeto = new NaoPodeHerdar();
    }
    
}

final class NaoPodeHerdar{
    final void imprimirMensagem(){
        System.out.println("Este método não pode ser alterado.");
    }
    public NaoPodeHerdar() {
        System.out.println("Esta Classe não pode ser Herdada!!");
    }
    
}

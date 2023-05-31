/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gabriel.machado4
 */
public class Lebre extends Thread{
    int metrosPercorridos;
    
    public Lebre(int metrosPercorridos){
        this.metrosPercorridos = metrosPercorridos;
    }
    
    public Lebre(){
        this.metrosPercorridos = 0;
    }
    
    public Lebre(String nome){
        super(nome);
        this.metrosPercorridos = 0;
    }
    
    public void saltar(){
        int pulo = (int)(Math.random()*3)+1;
        metrosPercorridos += pulo;
        System.out.println("A Lebre " + this.getName()
        + " pulou " + pulo + "m e atingiu " 
        + this.metrosPercorridos + "m.");
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){}
    }
    
    public void run(){
        while(this.metrosPercorridos < 20){
            this.saltar();
            if(this.metrosPercorridos >= 20){
                System.out.println("Vencedor: " + this.getName()
                + "(" + this.metrosPercorridos + ")");
                this.interrupt();
                System.exit(0);
            }
            yield();
        }
    }
}

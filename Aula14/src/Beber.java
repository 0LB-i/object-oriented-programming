
import static java.lang.Thread.yield;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gabriel.machado4
 */
public class Beber {
    
    public static void main(String[] args) {
        Cafe cafe = new Cafe();
        cafe.start();
        new Cha().start();
    
    }
    
    
}

class Cafe extends Thread{
        @Override
        public void run(){
            while(true){
                System.out.println("Eu gosto de beber café");
                yield();
        }
    }
}

class Cha extends Thread{
        @Override
        public void run(){
            while(true){
                System.out.println("Eu gosto de beber chá");
                yield();
        }
    }
}

/**
 * @author gabriel.machado4
 */
public class TestaValor extends Thread{
    static int numeroTestar;
    int de, ate;

    public TestaValor(int de, int ate, int num) {
        numeroTestar = num;
        if(de == 0){
            this.de = 1;
        }else{
         this.de = de;
        }
        this.ate = ate;
    }
    @Override
    public void run(){
        for(int i=de; i<=ate && i<=numeroTestar; i++){
            if(numeroTestar%i == 0){
                System.out.println("Divisor " + i
                + " encontrado pela thread "
                + this.getName());
                this.interrupt();
            }
            yield();
        }
    }
    
}

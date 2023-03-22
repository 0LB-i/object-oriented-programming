
package D1;

import D2.A2;

/**
 *
 * @author gabriel.machado4
 */
public class A1 {
    public int ValorA1;
    
    public A1(int valorA1){
        this.ValorA1= valorA1;
    }
    
    public static void main(String[] args) {
        A2 objD2 = new A2(10);
        System.out.println(objD2.valorA2);
        
        System.exit(0);
    }
}

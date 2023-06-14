
import java.util.ArrayList;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gabriel.machado4
 */
public class Cadastro {
    public static void main(String[] args) {
        
            int id1 = 1;
            int id2 = 2;
            int id3 = 3;
            int id4 = 4;
            int id5 = 5;
            int id6 = 6;
            int id7 = 7;
            int id8 = 8;
            int id9 = 9;
            int id10 = 10;
           
        ArrayList<Cliente> cli = new ArrayList<Cliente>();
        
            cli.get(id1).setId(id1);
            cli.get(id2).setId(id2);
            cli.get(id3).setId(id3);
            cli.get(id4).setId(id4);
            cli.get(id5).setId(id5);
            cli.get(id6).setId(id6);
            cli.get(id7).setId(id7);
            cli.get(id8).setId(id8);
            cli.get(id9).setId(id9);
            cli.get(id10).setId(id10);
            
            int y = 1;
            
            while(true){      
            int n = Entrada.leiaInt("Cadastro de Clientes do Hotel\n1-Cadastrar Cliente \n2-Alterar Dados do Cliente \n3-Listar Registros \n4-Excluir Registro \n5-Sair");
            
            switch(n){
                case 1:
                    
                    
                    cli.get(y).setIdade(id10);
            }
            
       
            
            
        
            }
    }
}

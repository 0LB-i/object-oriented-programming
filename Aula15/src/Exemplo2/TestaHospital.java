/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exemplo2;

/**
 *
 * @author Paulo
 */
public class TestaHospital {

    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        while (true) {
            String menu = "SISTEMA CADASTRAL - HOSPITAL TESTE\n1-Cadastrar\n2-Listar\n3-Ataulizar Dados\n4-Excluir\n5Sair";
            int op = Entrada.leiaInt(menu);
            switch (op) {
                case 1:
                    hospital.cadstrar();
                    break;
                case 2:
                    hospital.imprimirLista();
                    break;
                case 3:
                    hospital.atualizarRegistro();
                    break;
                case 4:
                    hospital.excluir();
                    break;
                case 5:
                    System.out.println("Finalizando....");
                    System.exit(0);
            }
        }
    }
}

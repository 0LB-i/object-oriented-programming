/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasseAbstrata;

/**
 *
 * @author gabriel.machado4
 */
public class Operario extends Funcionario{

    @Override
    public double alterarSalario(double s) {
        this.salario = this.salario + s;
        this.salario = this.salario * 1.005;
        return this.salario;
    }
    
}

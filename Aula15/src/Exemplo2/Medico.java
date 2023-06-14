/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exemplo2;

/**
 *
 * @author Paulo
 */
public class Medico  extends Funcionario{
    private Especialidade especialidade;

    public Medico(Especialidade especialidade) {
        this.especialidade = especialidade;
    }

    public Medico() {
    }

    public Especialidade getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(Especialidade especialidade) {
        this.especialidade = especialidade;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exemplo2;

/**
 *
 * @author Paulo
 */
public class Especialidade {
    private String especialidades; 
    private int horas;
    public static String[] tipos = {"Geriatria","Oftalmologia","Oncologia","Dermatologia","Infectologia","Patologia","Pediatria","Pneumologia","Psiquiatria","Reumatologia","Urologia"};
    
    public Especialidade() {
    }

    public Especialidade(String especialidades, int horas) {
        this.especialidades = especialidades;
        this.horas = horas;
    }

    public String getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(String especialidades) {
        this.especialidades = especialidades;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    static String exibirLista(){
        String ret = "* Especialidades\n";
        for(String aux: tipos){
            ret+=" - " + aux+"\n";
        }
        return ret;
    }
    
    @Override
    public String toString() {
        String ret = "tipos:\nGeriatria\nOftalmologia\nOncologia\nDermatologia\nInfectologia\nPatologia\nPediatria\nPneumologia\nPsiquiatria\nReumatologia\nUrologia";
        return "ret\nEspecialidade{" + "especialidades=" + especialidades + ", horas=" + horas + '}';
    }

    
}

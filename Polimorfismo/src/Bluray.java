/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gabriel.machado4
 */
public class Bluray extends Midias{
    
    int idBluray;
    String nomeFilme;
    int duracaoMin;
    int idade;
    
    public int getIdBluray() {
        return idBluray;
    }

    public void setIdBluray(int idBluray) {
        this.idBluray = idBluray;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public double getDuracaoMin() {
        return duracaoMin;
    }

    public void setDuracaoMin(int duracaoMin) {
        this.duracaoMin = duracaoMin;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    void informarCensura(){
        
        
        if(this.idade < 10){
            System.out.println("Categoria da classificação indicativa: Infantil");
        } 
        if(this.idade >= 10 && this.idade < 18){
            System.out.println("Categoria da classificação indicativa: Normal");
        }
        if(this.idade >= 18){
            System.out.println("Categoria da classificação indicativa: Adulto");
        }          
    }
}

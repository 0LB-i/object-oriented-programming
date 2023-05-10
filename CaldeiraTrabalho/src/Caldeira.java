/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gabriel.machado4
 */
public class Caldeira {
    double tempMax = 250;
    double tempMin = 80;
    double tempAtual;
    double aumentarTemp;
    double diminuirTemp;

    public double getTempMax() {
        return tempMax;
    }

    public void setTempMax(double tempMax) {
        this.tempMax = tempMax;
    }

    public double getTemMin() {
        return tempMin;
    }

    public void setTemMin(double temMin) {
        this.tempMin = temMin;
    }

    public double getTempAtual() {
        return tempAtual;
    }

    public void setTempAtual(double tempAtual) {
        this.tempAtual = tempAtual;
    }

    public double getAumentarTemp() {
        return aumentarTemp;
    }

    public void setAumentarTemp(double aumentarTemp) {
        this.aumentarTemp = aumentarTemp;
    }

    public double getDiminuirTemp() {
        return diminuirTemp;
    }

    public void setDiminuirTemp(double diminuirTemp) {
        this.diminuirTemp = diminuirTemp;
    }
    
    public Caldeira (double tempAtual){
        this.tempAtual = tempAtual;
    }  
    
    public void aumentarTemp() throws TemperaturaMaxima{
        double num = this.tempAtual + this.aumentarTemp;
        if(num > tempMax){
            throw new TemperaturaMaxima("Perigo! Risco de Explosão");
        } else {
            this.tempAtual = num;
        }
    }
    
    public void diminuirTemp() throws TemperaturaMinima{
        double num = this.tempAtual - this.diminuirTemp;
        if(num < tempMin){
            throw new TemperaturaMinima("Perigo !! Resfriamento Perigoso");
        } else {
            this.tempAtual = num;
        }
    }
    
    public void setParametros(){
        this.tempMax = Entrada.leiaDouble("Qual é o novo limite Máximo de temperatura?");
        this.tempMin = Entrada.leiaDouble("Qual é o novo limite Mínimo de temperatura?");
        Entrada.escrever("Limites Atualizados!");
    }
    
    public static void main(String[] args) {
        
        Caldeira caldeira = new Caldeira(100);
        
        int op=0;
        
        while(op!=4){
            String mens = "Controle de Aquecimento da Caldeira!!\n\n"
                + "Temperatura Atual: " + caldeira.getTempAtual()+"\n\n"
                +"1 - Aumentar Temperatura \n"
                +"2 - Diminuir Temperatura \n"
                +"3 - Ajustar Parâmetros de Temperatura \n"
                +"4 - Sair";
            op = Entrada.leiaInt(mens);
            
            if(op==1){
                caldeira.setAumentarTemp(Entrada.leiaDouble("Em quantos graus deseja Aumentar a Temperatura?"));
                try{
                    caldeira.aumentarTemp();
                } catch(TemperaturaMaxima a){
                    Entrada.escrever("Perigo! Risco de Explosão!");
                }
            }
            
            if(op==2){
                caldeira.setDiminuirTemp(Entrada.leiaDouble("Em quantos graus deseja Diminuir a Temperatura?"));
                try{
                    caldeira.diminuirTemp();
                } catch(TemperaturaMinima a){
                    Entrada.escrever("Perigo !! Resfriamento Perigoso");
                }
            }
            
            if(op==3){
                caldeira.setParametros();
            }
            
            if(op==4){
                System.out.println("Programa Encerrado");
                System.exit(0);
            } 
        }
    }
    
}

//Leonardo Gräff, Gabriel Bandão Machado


public class Ford extends Carro{
    
    private double potenciaMotor = 5000;

    public double getPotenciaMotor() {
        return potenciaMotor;
    }

    public void setPotenciaMotor(double potenciaMotor) {
        this.potenciaMotor = potenciaMotor;
    }

    public void alterarPotencia(int potencia){
         
        if(this.getAno() > 2010 && this.getPortas() == 2){
            this.potenciaMotor = potencia;
        } else{
            
            this.potenciaMotor = this.potenciaMotor *1.1;
            Entrada.escrever("Como o ano do carro é menor que 2010 e/ou têm mais ou menos que 2 portas a potência foir alterada para: " + this.getPotenciaMotor());
        }
    }
    
}

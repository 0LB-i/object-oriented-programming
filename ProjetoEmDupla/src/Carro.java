//Leonardo Gräff, Gabriel Bandão Machado

public abstract class Carro {
    
    private String cor;
    private String modelo;
    private String marca;
    private int ano;
    private int portas;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }
    
    public void Carro(){
        this.cor = "Branco";
        this.modelo = "Uno";
        this.marca = "Fiat";
        this.ano = 2000;
        this.portas = 2;
    }
    
    public void Carro(String cor, String modelo, String marca, int ano, int portas){
        
        this.setCor(cor);
        this.setModelo(modelo);
        this.setMarca(marca);
        this.setAno(ano);
        this.setPortas(portas); 
        
    }
    
    public void alterarCarro(String cor, String modelo, String marca, int ano, int portas){
        
        try{
            if(portas > 5 || ano < 2000){
                throw new CaracteristicaInvalida("Limite de portas no carro foi ultrapassado");
            } else{
           
            this.setCor(cor);
            this.setModelo(modelo);
            this.setMarca(marca);
            this.setAno(ano);  
            this.setPortas(portas);
            }
            
        } catch(CaracteristicaInvalida p){
            System.out.println("O número de portas não pode ser maior que 5 e o ano do carro não pode ser alterado para menos que 2000");
        }
    }
}

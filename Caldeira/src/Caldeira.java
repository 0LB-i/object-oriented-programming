
/**
 *
 * @author rocha
 */
public class Caldeira {
    double aumentarTemperatura;
    double diminuirTemperatura;
    double temperaturaAtual;
    double maximo = 250;
    double minimo = 80;

    public double getAumentarTemperatura() {
        return aumentarTemperatura;
    }

    public void setAumentarTemperatura(double aumentarTemperatura) {
        this.aumentarTemperatura = aumentarTemperatura;
    }

    public double getDiminuirTemperatura() {
        return diminuirTemperatura;
    }

    public void setDiminuirTemperatura(double diminuirTemperatura) {
        this.diminuirTemperatura = diminuirTemperatura;
    }

    public double getTemperaturaAtual() {
        return temperaturaAtual;
    }

    public void setTemperaturaAtual(double temperaturaAtual) {
        this.temperaturaAtual = temperaturaAtual;
    }

    public double getMaximo() {
        return maximo;
    }

    public void setMaximo(double maximo) {
        this.maximo = maximo;
    }

    public double getMinimo() {
        return minimo;
    }

    public void setMinimo(double minimo) {
        this.minimo = minimo;
    }

    public Caldeira(double temperaturaAtual) {
        this.temperaturaAtual = temperaturaAtual;
    }

   
    
    public void aumentarTemp() throws LimiteSuperiorTemperatura{
        double calculo = this.temperaturaAtual+this.aumentarTemperatura;
            if(calculo>maximo){
                throw new LimiteSuperiorTemperatura("Perigo! Risco de Explosão!");
            }else{
                this.temperaturaAtual = calculo;
            }
        
    }
    
    public void diminuirTemp() throws LimiteInferiorTemperatura{
        double calculo = this.temperaturaAtual-this.diminuirTemperatura;
            if(calculo<minimo){
                throw new LimiteInferiorTemperatura("Perigo! Desaquecimento Perigoso!");
            }else{
                this.temperaturaAtual = calculo;
            }
    }
    
    public void setParametros(){
        this.maximo = Entrada.leiaDouble("Qual é o novo limite Máximo?");
        this.minimo = Entrada.leiaDouble("Qual é o novo limite Mínimo?");
        Entrada.escrever("Limites atualizados!");
    }
    
    public static void main(String[] args) {
        Caldeira caldeira = new Caldeira(100);
        int op=0;
        while(op!=4){
            String mens = "CONTROLE DE AQUECIMENTO DE CALDEIRA\n\n";
            mens += "Temperatura Atual: "+caldeira.getTemperaturaAtual()+"\n\n";
            mens += "1 - Aumentar Temperatura\n";
            mens += "2 - Diminuir Temperatura\n";
            mens += "3 - Ajustar Temperaturas\n";
            mens += "4 - Sair";
            op = Entrada.leiaInt(mens);
            if(op==1){
                caldeira.setAumentarTemperatura(Entrada.leiaDouble("Em quantos graus deseja Aumentar?"));
                try{
                 caldeira.aumentarTemp();   
                }catch(LimiteSuperiorTemperatura a){
                    Entrada.escrever("Perigo! Risco de Explosão!");
                }
            }
            if(op==2){
                caldeira.setDiminuirTemperatura(Entrada.leiaDouble("Em quantos graus deseja Diminuir?"));
                try{
                   caldeira.diminuirTemp(); 
                }catch(LimiteInferiorTemperatura b){
                    Entrada.escrever("Perigo! Desaquecimento Perigoso!");
                }
            }
            
            if(op==3){
                caldeira.setParametros();
            }
            
            if(op==4){
                System.out.println("Fim de Programa");
                System.exit(0);
            }
        }
    }
}

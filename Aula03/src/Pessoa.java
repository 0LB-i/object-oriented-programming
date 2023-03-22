/** @author gabriel.machado4 */
public class Pessoa {
    
    String nome;
    char sexo;
    int idade;
    double peso;//Em Kg
    double altura;//Em centimetros
    
    double calcularPesoIdeal(){
        double pesoIdeal = 0;
        
        if(this.sexo == 'M' || this.sexo == 'm'){
            pesoIdeal = 52 + (0.75 * (this.altura - 152.4));
        }else{
            pesoIdeal = 52 + (0.67 * (this.altura - 152.4));
        }
        
        return pesoIdeal;
    }
    
    String classificarIdade(){
        
        String idadeClassificada = "";
        
        if(this.idade <= 19){
            idadeClassificada = "Jovem";
        } else if(this.idade >= 20 && idade <= 59){
            idadeClassificada = "Adulto";
        } else if(this.idade >= 60){
            idadeClassificada = "Idoso";
        }
        
        return idadeClassificada;
    }
    
}

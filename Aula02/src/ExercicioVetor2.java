/**
*Ler um vetor de até 10 elementos. A leitura deverá ser executada até que o vetor fique
    totalmente preenchido ou seja informado um valor negativo ou zero. Calcular e imprimir a
    soma dos valores maiores que 5 existentes no vetor
 * 
 * @author gabriel.machado4
 */
public class ExercicioVetor2 {
    public static void main(String[] args) {
               
        int vet[] = new int [10];
        int soma = 0;
        
        for(int y =0; y <vet.length; y++){
            vet[y] = (int)(Math.random()*10);
            
            if(vet[y] <= 0){
                System.out.println("Programa parou no vetor "+y+" porque o número é: "+vet[y]);
                break;
            }else if(vet[y] > 5){
               soma = soma + vet[y]; 
            }
            
            System.out.println("Número gerado: "+ vet[y]);
        }
        
        System.out.println("Soma dos Números maiores que 5: "+soma);
        
        System.exit(0);
    }
}

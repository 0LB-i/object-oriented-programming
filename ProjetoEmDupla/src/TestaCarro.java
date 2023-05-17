//Leonardo Gräff, Gabriel Bandão Machado

public class TestaCarro {
    public static void main(String[] args) {
        Ford ford1 = null;
        
        
        int n;
        while(true){
        String menu = "1 - Cadastrar Carro Padrão \n2 - Exibir Informações do Veículo  \n3 - Alterar informações do Carro \n4 - Alterar Potência \n5 - Sair";
        n = Entrada.leiaInt(menu);
        
            switch(n){
                case 1:
                    ford1 = new Ford();
                    
                    ford1.Carro();
                    break;
                
                case 2:
                    System.out.println("Cor: " + ford1.getCor() + "\nModelo: " + ford1.getModelo() + "\nMarca: " + ford1.getMarca() + "\nAno: " + ford1.getAno() + "\nPortas: " + ford1.getPortas() + "\nPotência: " + ford1.getPotenciaMotor());
                    break;
                    
                case 3: 
                    String cor = Entrada.leiaString("Informe a cor do carro");
                    String modelo = Entrada.leiaString("Informe o modelo do carro");
                    String marca = Entrada.leiaString("Informe a marca do carro");
                    int portas = Entrada.leiaInt("Informe a quantidade de portas que têm no carro");
                    int ano = Entrada.leiaInt("Informe o ano do carro");
                    
                    ford1.alterarCarro(cor, modelo, marca, ano, portas);
                    break;
                case 4:
                    
                    int potencia = Entrada.leiaInt("Potência atual: "+ ford1.getPotenciaMotor() +"\nQual o novo valor da potência do carro?");
                    
                    ford1.alterarPotencia(potencia);
                    break;
                    
                case 5:
                    System.exit(0);
                    break;
            }
        }
    }
}

//Leonardo Gräff, Gabriel Bandão

public class TestaCalculadora {

    public static void main(String[] args) {
        CalculadoraCientifica c = new CalculadoraCientifica();
        while (true) {
            char op = Entrada.leiaChar("Calculadora Cientifica\n"
                    + "-------------------------------\n"
                    + "[+] Somar\n"
                    + "[-] Subtrair\n"
                    + "[*] Multiplicar\n"
                    + "[/] Dividir\n"
                    + "[1] Raiz Quadrada\n"
                    + "[2] Potencia\n"
                    + "[3] Sair\n"
                    + "-------------------------------");
            switch (op) {
                case '+':
                    c.somar(Entrada.leiaDouble("Valor 1"), Entrada.leiaDouble("Valor 2"));
                    break;
                case '-':
                    c.subtrair(Entrada.leiaDouble("Valor 1"), Entrada.leiaDouble("Valor 2"));
                    break;
                case '*':
                    c.multiplicar(Entrada.leiaDouble("Valor 1"), Entrada.leiaDouble("Valor 2"));
                    break;
                case '/':
                    c.dividir(Entrada.leiaDouble("Valor 1"), Entrada.leiaDouble("Valor 2"));
                    break;
                case '1':
                    c.raizQuadrada(Entrada.leiaDouble("Valor"));
                    break;
                case '2':
                    c.potencia(Entrada.leiaDouble("Valor 1"), Entrada.leiaDouble("Valor 2"));
                    break;
                case '3':
                    System.exit(0);
                default:
                    Entrada.escrever("Opção Invalida");
                    break;
            }
        }
    }
}

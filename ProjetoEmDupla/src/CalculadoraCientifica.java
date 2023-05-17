//Leonardo Gräff, Gabriel Bandão

public class CalculadoraCientifica extends Calculadora {

    double raizQuadrada(double v1) {
        double raiz;
        raiz = Math.sqrt(v1);
        Entrada.escrever("Raiz Quadrada de " + v1 + " = " + raiz);
        return raiz;
    }

    double potencia(double v1, double v2) {
        double valor;
        valor = Math.pow(v1, v2);
        Entrada.escrever(v1 + " ^ " + v2 + " = " + valor);
        return valor;
    }
}

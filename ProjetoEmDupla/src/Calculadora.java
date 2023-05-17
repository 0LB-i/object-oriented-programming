//Leonardo Gräff, Gabriel Bandão Machado

public abstract class Calculadora {

    double somar(double v1, double v2) {
        double soma;
        soma = v1 + v2;
        Entrada.escrever(v1 + " + " + v2 + " = " + soma);
        return soma;
    }

    double subtrair(double v1, double v2) {
        double soma;
        soma = v1 - v2;
        Entrada.escrever(v1 + " - " + v2 + " = " + soma);
        return soma;
    }

    double multiplicar(double v1, double v2) {
        double soma;
        soma = v1 * v2;
        Entrada.escrever(v1 + " * " + v2 + " = " + soma);
        return soma;
    }

    double dividir(double v1, double v2) {
        double soma = 0;
        soma = v1 / v2;
        try {
            if (v2 == 0) {
                throw new ArithmeticException();
            } else {
                Entrada.escrever(v1 + " / " + v2 + " = " + soma);
            }
        } catch (ArithmeticException e) {
            Entrada.escrever("                   Erro!!\n"
                    + "        [Divisão por zero]");
        }
        return soma;
    }
}

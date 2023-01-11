package edu.tarik.primeirasemana;

public class Calculadora {
    public static void main(String[] args) throws Exception {
        int primeiroValor = 7;
        int segundoValor = 9;

        int total = somar(primeiroValor, segundoValor);
        System.out.println(total);
    }

    public static int somar(int primeiroValor, int segundoValor) {
        int soma = primeiroValor + segundoValor;
        return soma;
    }
}

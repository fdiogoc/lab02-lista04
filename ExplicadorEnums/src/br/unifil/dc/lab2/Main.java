package br.unifil.dc.lab2;

public class Main {

    public static void main(String[] args) {
        System.out.println(operacaoMatematica(2,10,OperacaoMatematica.POTENCIACAO));
    }

    public static double operacaoMatematica(double a, double b, OperacaoMatematica operacao) {
        double result = 0.0;
        switch(operacao) {
            case ADICAO:
                result = a + b;
                break;
            case MULTIPLICACAO:
                result = a * b;
                break;
            case POTENCIACAO:
                result = Math.pow(a, b);
                break;
        }
        return result;
    }
}

enum OperacaoMatematica {
    ADICAO, MULTIPLICACAO, POTENCIACAO
}

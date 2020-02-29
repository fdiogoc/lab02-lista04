package br.unifil.dc.lab2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        testeFibonacci();
    }

    private static void testeFibonacci() {
        System.out.println("Esperava 1, e tive: " + fibRecursivo(1));
        System.out.println("Esperava 1, e tive: " + fibRecursivo(2));
        System.out.println("Esperava 55, e tive: " + fibRecursivo(10));
    }


    public static int fibonacci(int n) {
        int f0 = 0;
        int f1 = 1;
        for (int i = n; i > 0; i--) {
            int fNovo = f0 + f1;
            f0 = f1;
            f1 = fNovo;
        }
        return f0;
    }

    public static int fibRecursivo(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return fibRecursivo(n-1) + fibRecursivo(n-2);
        }
    }




    private static void testeTiposCompostosReferencia() {
        IntegerLab2 investimentos = new IntegerLab2(1000);
        renderDuasVezesLab2(investimentos);
        System.out.println("Você agora tem " + investimentos.getValor());
    }

    public static void renderDuasVezesLab2(IntegerLab2 investimentos) {
        investimentos.setValor(investimentos.getValor()* 2);
    }



    private static void testeInvestimentosPrimitivo() {
        int investimentos = 1000;
        renderDuasVezes(investimentos);
        System.out.println("Total após investimento é " + investimentos);
    }

    public static int renderDuasVezes(int investimentos) {
        investimentos = investimentos * 2;
        return investimentos;
    }
}



class IntegerLab2 {
    public IntegerLab2(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    private int valor;
}

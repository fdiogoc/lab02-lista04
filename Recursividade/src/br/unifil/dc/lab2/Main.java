package br.unifil.dc.lab2;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Espero 24, tive " + fatorial(4));
    }

    public static int fatorial(int n) {
        // Casos base
        if (n == 0) return 1;
        // Casos de divisão recursiva
        return n * fatorial(n-1);
    }

    private static void testeSomatorioArranjos() {
        int[] valores = { 1,2,3,4,5 };
        System.out.println("Esperava 15, tive " + somatorio(valores));
    }

    public static int somatorio(int[] valores) {
        return somatorio(valores, 0);
    }
    private static int somatorio(int[] valores, int i) {
        return i >= valores.length
                ? 0
                : valores[i] + somatorio(valores, i+1);
    }

    private static void testeSomatorioLista() {
        System.out.println("Queria 10, tive " + somatorio(Arrays.asList(0,1,2,3,4)));
    }

    private static int somatorio(List<Integer> valores) {
        throw new RuntimeException("A ser implementado pelo estagiário.");
    }


    private static void testeFibonacci() {
        System.out.println("Esperava 1, e tive: " + fibRecursivo(1));
        System.out.println("Esperava 1, e tive: " + fibRecursivo(2));
        System.out.println("Esperava 55, e tive: " + fibRecursivo(10));

        for (int i = 1; i <= 50; i++) {
            System.out.println(i + ", " + fibonacci(i));
        }
    }

    public static int fibRecursivoTernario(int n) {
        return (n < 3)
                ? 1
                : fibRecursivoTernario(n - 1) + fibRecursivoTernario(n - 2);
    }

    public static int fibRecursivo(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        return fibRecursivo(n - 1) + fibRecursivo(n - 2);
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

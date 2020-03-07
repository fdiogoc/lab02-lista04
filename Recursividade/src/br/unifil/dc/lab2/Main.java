package br.unifil.dc.lab2;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int[] valores = { 1,2,3,4,5 };
        System.out.println("Espero true, tive " + existeRecursivo(3,valores));
        System.out.println("Espero true, tive " + existeRecursivo(5,valores));
        System.out.println("Espero false, tive " + existeRecursivo(0,valores));

        System.out.println("Espero true, tive " + existe(3,valores));
        System.out.println("Espero true, tive " + existe(5,valores));
        System.out.println("Espero false, tive " + existe(0,valores));
    }

    /**
     * Verifica se a chave existe em valores.
     *
     * Atenção! Essa é uma implementação recursiva.
     *
     * @param chave Valor a ser buscado.
     * @param valores Arranjo onde chave será buscada.
     * @return true se chave estiver em valores, false caso contrário.
     */
    public static boolean existeRecursivo(int chave, int[] valores) {
        return existeRecursivo(chave, valores, 0);
    }
    private static boolean existeRecursivo(int chave, int[] valores, int i) {
        if (i >= valores.length) return false;
        if (chave == valores[i]) return true;
        return existeRecursivo(chave, valores, i+1);
    }

    public static boolean existe(int chave, int[] valores) {
        // Para-passo
        /*for (int i = 0; i < valores.length; i++) {
            int valor = valores[i];
            if (valor == chave) return true;
        }*/

        // Para cada (for-each), semanticamente, a mesma coisa que o
        // 'for' anterior.
        for (int valor : valores) {
            if (valor == chave) return true;
        }
        return false;
    }

    private static void testeFatorial() {
        System.out.println("Espero 24, tive " + fatorial(4));
    }

    /**
     * Resolve a função fatorial para n.
     *
     * Atenção! O overflow acontece rapidamente!
     *
     * Pré-condição: n não pode ser negativo, é barrado com assert.
     * @param n Valor do fatorial a ser calculado. Deve respeitar n ≥ 0.
     * @return Valor fatorial de n.
     */
    public static BigInteger fatorialSemOverflow(BigInteger n) {
        throw new RuntimeException("A aula acabou e não implementei. My bad!");
        /*assert n >= 0 : "Não existe fatorial de negativos.";

        // Casos base
        if (n == 0) return 1;
        // Casos de divisão recursiva
        return n * fatorial(n - 1);*/
    }

    /**
     * Resolve a função fatorial para n.
     * <br><br>
     * Atenção! O overflow acontece rapidamente! Recomenda-se a
     * utilização do método fatorialSemOverflow ao invés desse.
     * <br><br>
     * Pré-condição: n não pode ser negativo, é barrado com assert.
     * @param n Valor do fatorial a ser calculado. Deve respeitar n ≥ 0.
     * @return Valor fatorial de n.
     */
    public static long fatorial(long n) {
        assert n >= 0 : "Não existe fatorial de negativos.";

        // Casos base
        if (n == 0) return 1;
        // Casos de divisão recursiva
        return n * fatorial(n - 1);
    }

    private static void testeSomatorioArranjos() {
        int[] valores = {1, 2, 3, 4, 5};
        System.out.println("Esperava 15, tive " + somatorio(valores));
    }

    public static int somatorio(int[] valores) {
        return somatorio(valores, 0);
    }

    private static int somatorio(int[] valores, int i) {
        return i >= valores.length
                ? 0
                : valores[i] + somatorio(valores, i + 1);
    }

    private static void testeSomatorioLista() {
        System.out.println("Queria 10, tive " + somatorio(Arrays.asList(0, 1, 2, 3, 4)));
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
}
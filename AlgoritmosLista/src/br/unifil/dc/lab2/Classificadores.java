package br.unifil.dc.lab2;

import java.util.List;
import java.util.Random;

public class Classificadores {

    /**
     * Classifica a lista em ordem crescente, pelo método de
     * inserção, in-place.
     * @param lista Lista a ser classificada, sofre mutação (in-place).
     */
    public static void insertionsort(List<Integer> lista) {
        resetMedidores();

        for (int i = 1; i < lista.size(); i++) {
            Integer elem = lista.get(i);

            int j = i; comparacoes++;
            while (j > 0 && lista.get(j-1) > elem) {
                operacaoRwMemoria++;
                lista.set(j, lista.get(j-1)); // Deslocamento

                j--; comparacoes++;
            }

            lista.set(j, elem);
        }
    }

    /**
     * Classifica a lista em ordem crescente, pelo método de
     * bubblesort, in-place.
     * @param lista Lista a ser classificada, sofre mutação (in-place).
     */
    public static void bubblesort(List<Integer> lista) {
        resetMedidores();

        boolean houvePermuta;
        do {
            houvePermuta = false;

            // Sobe a bolha
            for (int i = 1; i < lista.size(); i++) {
                comparacoes++;
                if (lista.get(i-1) > lista.get(i)) {
                    permutar(lista, i - 1, i);
                    houvePermuta = true;
                }
            }
        } while (houvePermuta);
    }

    /**
     * Classifica a lista em ordem crescente, pelo método de
     * selection sort, in-place.
     * @param lista Lista a ser classificada, sofre mutação (in-place).
     */
    public static void selectionsort(List<Integer> lista) {
        resetMedidores();

        for (int i = 0; i < lista.size(); i++) {
            int menorIdx = encontrarIndiceMenorElem(lista, i);
            permutar(lista, menorIdx, i);
        }
    }

    public static void bogosort(List<Integer> lista) {
        Random rng = new Random();
        while (!isOrdenada(lista)) {
            int a = rng.nextInt(lista.size());
            int b = rng.nextInt(lista.size());
            permutar(lista, a, b);
        }
    }

    public static String prettyPrintMedicoes() {
        return "Houve " + comparacoes + " comparacoes, e " + operacaoRwMemoria + " operacoes RW em memoria.";
    }


    /********
     *  SECAO DOS PRIVATES
     */

    private static boolean isOrdenada(List<Integer> lista) {
        for (int i = 1; i < lista.size(); i++)
            if (lista.get(i-1) > lista.get(i))
                return false;

        return true;
    }

    /**
     * Encontra o índice do menor elemento da lista.
     * @param lista lista a ser procurada.
     * @return índice do elemento, na escala iniciada em zero.
     */
    private static int encontrarIndiceMenorElem(List<Integer> lista, int idxInicio) {
        int menor = idxInicio;
        for (int i = idxInicio+1; i < lista.size(); i++) {
            comparacoes++;
            if (lista.get(menor) > lista.get(i))
                menor = i;
        }
        return menor;
    }

    /**
     * Permuta (swap) dois elementos da lista de posição.
     * @param lista Lista cujos elementos serão permutados.
     * @param a Îndice do primeiro elemento a ser permutado.
     * @param b Îndice do outro elemento a ser permutado.
     */
    private static void permutar(List<Integer> lista, int a, int b) {
        Integer permutador = lista.get(a); // permutador = lista[a]
        lista.set(a, lista.get(b)); // lista[a] = lista[b]
        lista.set(b, permutador); // lista[b] = permutador

        operacaoRwMemoria+=2;
    }

    private static void resetMedidores() {
        operacaoRwMemoria = 0;
        comparacoes = 0;
    }

    // NUNCA FACA ISSO PROFISSIONALMENTE!!!
    private static int operacaoRwMemoria = 0;
    private static int comparacoes = 0;
}

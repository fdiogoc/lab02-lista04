package br.unifil.dc.lab2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        List<Integer> listaTeste = Arrays.asList(4,2,3,4,5,4);
        System.out.println("Esperava 0, tive " + pesquisar(listaTeste, 4));
        System.out.println("Esperava empty, tive " + pesquisar(listaTeste, 10));

        System.out.println("Esperava 0, tive " + pesquisarSentinela(listaTeste, 4));
        System.out.println("Esperava empty, tive " + pesquisarSentinela(listaTeste, 10));
    }

    /**
     * Encontra o índice da primeira ocorrência da esquerda para a direita,
     * sendo esquerda o índice 0.
     *
     * @param lista A lista onde será feita a pesquisa.
     * @param chave A chave a ser encontrada.
     * @return O índice de chave, se existir, senão -1.
     */
    public static Optional<Integer> pesquisar(List<Integer> lista, Integer chave) {
        for (int i = 0; i < lista.size(); i++)
            if (lista.get(i) == chave) return Optional.of(i);

        // return -1; // Programador feio, feio!!
        // throw new RuntimeException("Chave não existe em lista."); // Na década de 90, era cool!!
        // return null; // Era legal na década de 2000.
        return Optional.empty();
    }

    public static Optional<Integer> pesquisarSentinela(List<Integer> lista, Integer chave) {
        Integer ultimo = lista.get(lista.size()-1);
        lista.set(lista.size()-1, chave);

        int i = 0;
        while (lista.get(i) != chave) i++;
        lista.set(lista.size()-1, ultimo);

        return i < lista.size()-1 || ultimo == chave
                ? Optional.of(i)
                : Optional.empty();
    }

    public static Optional<Integer> pesquisarRecursivo(List<Integer> lista, Integer chave) {
        // Caso base
        if (lista.size() == 0) return Optional.empty();
        if (lista.get(0) == chave) return Optional.of(0);
        // Caso recursivo
        Optional<Integer> pos = pesquisarRecursivo(lista.subList(1, lista.size()), chave);
        if (pos.isEmpty()) return Optional.empty();
        return Optional.of(pos.get() + 1);
    }

    /**
     * Encontra o índice de chave em arranjo, se existir.
     *
     * @param arranjo O arranjo onde será feita a pesquisa.
     * @param chave A chave a ser encontrada.
     * @return O índice de chave, se existir, senão -1.
     */
    public static int pesquisar(int[] arranjo, int chave) {
        for (int i = 0; i < arranjo.length; i++)
            if (arranjo[i] == chave) return i;
        return -1;
    }
}

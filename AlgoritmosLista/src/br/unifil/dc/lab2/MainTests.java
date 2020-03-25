package br.unifil.dc.lab2;

import java.util.Arrays;
import java.util.List;

public class MainTests {

    private static List<Integer> listaTeste = Arrays.asList(4,2,3,4,5,4);
    private static List<Integer> listaOrdenada = Arrays.asList(1,3,4,5,7,9,10,12,14,15,16);

    public static void testarPesquisas() {
        System.out.println("Esperava 0, tive " + Main.pesquisar(listaTeste, 4));
        System.out.println("Esperava empty, tive " + Main.pesquisar(listaTeste, 10));

        System.out.println("Esperava 0, tive " + Main.pesquisarSentinela(listaTeste, 4));
        System.out.println("Esperava empty, tive " + Main.pesquisarSentinela(listaTeste, 10));
    }

    public static void testarPesquisasBinarias() {
        System.out.println("Espero 2 mas obtive " + Main.pesquisarBinario(listaOrdenada, 4));
        System.out.println("Espero 5 mas obtive " + Main.pesquisarBinario(listaOrdenada, 9));
        System.out.println("Espero "+ (listaOrdenada.size()-1) +" mas obtive " + Main.pesquisarBinario(listaOrdenada, 16));
        System.out.println("Espero empty mas obtive " + Main.pesquisarBinario(listaOrdenada, 20));
        System.out.println("Espero empty mas obtive " + Main.pesquisarBinario(listaOrdenada, -3));
    }
}

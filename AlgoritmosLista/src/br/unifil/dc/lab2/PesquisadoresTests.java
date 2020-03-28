package br.unifil.dc.lab2;

import java.util.Arrays;
import java.util.List;

public class PesquisadoresTests {

    private static List<Integer> listaTeste = Arrays.asList(4,2,3,4,5,4);
    private static List<Integer> listaOrdenada = Arrays.asList(1,3,4,5,7,9,10,12,14,15,16);

    public static void testarPesquisas() {
        System.out.println("Esperava 0, tive " + Pesquisadores.pesquisar(listaTeste, 4));
        System.out.println("Esperava empty, tive " + Pesquisadores.pesquisar(listaTeste, 10));

        System.out.println("Esperava 0, tive " + Pesquisadores.pesquisarSentinela(listaTeste, 4));
        System.out.println("Esperava empty, tive " + Pesquisadores.pesquisarSentinela(listaTeste, 10));
    }

    public static void testarPesquisasBinarias() {
        System.out.println("Espero 2 mas obtive " + Pesquisadores.pesquisarBinario(listaOrdenada, 4));
        System.out.println("Espero 5 mas obtive " + Pesquisadores.pesquisarBinario(listaOrdenada, 9));
        System.out.println("Espero "+ (listaOrdenada.size()-1) +" mas obtive " + Pesquisadores.pesquisarBinario(listaOrdenada, 16));
        System.out.println("Espero empty mas obtive " + Pesquisadores.pesquisarBinario(listaOrdenada, 20));
        System.out.println("Espero empty mas obtive " + Pesquisadores.pesquisarBinario(listaOrdenada, -3));
    }
}

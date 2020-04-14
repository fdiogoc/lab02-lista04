package br.unifil.dc.lab2;

import java.util.Arrays;
import java.util.List;

public class ClassificadoresTests {
    

    public static void testarInsertionsort(int tamanho) {
       
        System.out.println("ORDENADA - TAMANHO: "+ tamanho);
        List<Integer> preordenada = Geradores.listaOrdenada(tamanho);
        Classificadores.insertionsort(preordenada);
        //System.out.println("Lista deve estar ordenada: " + preordenada);
        System.out.println(Classificadores.prettyPrintMedicoes());

        System.out.println("ORDENADA REV - TAMANHO: "+ tamanho);
        List<Integer> totalDesordenada = Geradores.listaOrdenadaRev(tamanho);
        Classificadores.insertionsort(totalDesordenada);
        //System.out.println("Lista deve estar ordenada: " + totalDesordenada);
        System.out.println(Classificadores.prettyPrintMedicoes());

        System.out.println("SORTEADA - TAMANHO: "+ tamanho);
        List<Integer> apenasDesordenada = Geradores.listaSorteados(tamanho);
        Classificadores.insertionsort(apenasDesordenada);
        //System.out.println("Lista deve estar ordenada: " + apenasDesordenada);
        System.out.println(Classificadores.prettyPrintMedicoes());
    }

    public static void testarBubblesort(int tamanho) {

        System.out.println("ORDENADA - TAMANHO: "+ tamanho);
        List<Integer> preordenada = Geradores.listaOrdenada(tamanho);
        Classificadores.bubblesort(preordenada);
        //System.out.println("Lista deve estar ordenada: " + preordenada);
        System.out.println(Classificadores.prettyPrintMedicoes());

        System.out.println("ORDENADA REV - TAMANHO: "+ tamanho);
        List<Integer> totalDesordenada = Geradores.listaOrdenadaRev(tamanho);
        Classificadores.bubblesort(totalDesordenada);
        //System.out.println("Lista deve estar ordenada: " + totalDesordenada);
        System.out.println(Classificadores.prettyPrintMedicoes());

        System.out.println("SORTEADA - TAMANHO: "+ tamanho);
        List<Integer> apenasDesordenada = Geradores.listaSorteados(tamanho);
        Classificadores.bubblesort(apenasDesordenada);
        //System.out.println("Lista deve estar ordenada: " + apenasDesordenada);
        System.out.println(Classificadores.prettyPrintMedicoes());
    }

    public static void testarSelectionsort(int tamanho) {

        System.out.println("ORDENADA - TAMANHO: "+ tamanho);
        List<Integer> preordenada = Geradores.listaOrdenada(tamanho);
        Classificadores.selectionsort(preordenada);
        //System.out.println("Lista deve estar ordenada: " + preordenada);
        System.out.println(Classificadores.prettyPrintMedicoes());

        System.out.println("ORDENADA REV - TAMANHO: "+ tamanho);
        List<Integer> totalDesordenada = Geradores.listaOrdenadaRev(tamanho);
        Classificadores.selectionsort(totalDesordenada);
        //System.out.println("Lista deve estar ordenada: " + totalDesordenada);
        System.out.println(Classificadores.prettyPrintMedicoes());

        System.out.println("SORTEADA - TAMANHO: "+ tamanho);
        List<Integer> apenasDesordenada = Geradores.listaSorteados(tamanho);
        Classificadores.selectionsort(apenasDesordenada);
        //System.out.println("Lista deve estar ordenada: " + apenasDesordenada);
        System.out.println(Classificadores.prettyPrintMedicoes());
    }


}

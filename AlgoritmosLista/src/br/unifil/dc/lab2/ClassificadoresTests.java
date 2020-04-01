package br.unifil.dc.lab2;

import java.util.Arrays;
import java.util.List;

public class ClassificadoresTests {
    private static List<Integer> preordenada = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
    private static List<Integer> totalDesordenada = Arrays.asList(10,9,8,7,6,5,4,3,2,1);
    private static List<Integer> apenasDesordenada = Arrays.asList(5, 100, 9, 28, 23, 70, 53, 89, 1, 75);

    public static void testarInsertionsort() {
        Classificadores.insertionsort(preordenada);
        System.out.println("Lista deve estar ordenada: " + preordenada);
        System.out.println(Classificadores.prettyPrintMedicoes());

        Classificadores.insertionsort(totalDesordenada);
        System.out.println("Lista deve estar ordenada: " + totalDesordenada);
        System.out.println(Classificadores.prettyPrintMedicoes());

        Classificadores.insertionsort(apenasDesordenada);
        System.out.println("Lista deve estar ordenada: " + apenasDesordenada);
        System.out.println(Classificadores.prettyPrintMedicoes());
    }

    public static void testarBubblesort() {
        Classificadores.bubblesort(preordenada);
        System.out.println("Lista deve estar ordenada: " + preordenada);
        System.out.println(Classificadores.prettyPrintMedicoes());

        Classificadores.bubblesort(totalDesordenada);
        System.out.println("Lista deve estar ordenada: " + totalDesordenada);
        System.out.println(Classificadores.prettyPrintMedicoes());

        Classificadores.bubblesort(apenasDesordenada);
        System.out.println("Lista deve estar ordenada: " + apenasDesordenada);
        System.out.println(Classificadores.prettyPrintMedicoes());
    }

    public static void testarSelectionsort() {
        Classificadores.selectionsort(preordenada);
        System.out.println("Lista deve estar ordenada: " + preordenada);
        System.out.println(Classificadores.prettyPrintMedicoes());

        Classificadores.selectionsort(totalDesordenada);
        System.out.println("Lista deve estar ordenada: " + totalDesordenada);
        System.out.println(Classificadores.prettyPrintMedicoes());

        Classificadores.selectionsort(apenasDesordenada);
        System.out.println("Lista deve estar ordenada: " + apenasDesordenada);
        System.out.println(Classificadores.prettyPrintMedicoes());
    }

    public static void testarBogosort() {
        Classificadores.bogosort(preordenada);
        System.out.println("Lista deve estar ordenada: " + preordenada);
        System.out.println(Classificadores.prettyPrintMedicoes());

        Classificadores.bogosort(totalDesordenada);
        System.out.println("Lista deve estar ordenada: " + totalDesordenada);
        System.out.println(Classificadores.prettyPrintMedicoes());

        Classificadores.bogosort(apenasDesordenada);
        System.out.println("Lista deve estar ordenada: " + apenasDesordenada);
        System.out.println(Classificadores.prettyPrintMedicoes());
    }
}

package br.unifil.dc.lab2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Geradores {

    public static List<Integer> listaOrdenada(int tamanho) {
        List<Integer> lista = new ArrayList<Integer>(tamanho);
        for(int i = 0; i < tamanho; lista.add(i), i++ );
        return lista;  
    }
    public static List<Integer> listaOrdenadaRev(int tamanho) {
        List<Integer> lista = new ArrayList<Integer>(tamanho);
        for(int i = tamanho; i > 0 ; i--, lista.add(i));
        return lista;  
    }
    public static List<Integer> listaSorteados(int tamanho) {
        List<Integer> lista = new ArrayList<Integer>(tamanho);
        Random gerador = new Random(25061993);
        for(int i = 0; i < tamanho; lista.add(gerador.nextInt(tamanho)), i++ );
        return lista; 
    }
    

}
package br.unifil.dc.lab2;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        //ClassificadoresTests.testarInsertionsort();

        Random rng = new Random("Aula do Ricardo".hashCode());
        for (int i = 0; i < 10; i++) {
            System.out.println(rng.nextInt(10_000));
        }
    }
}

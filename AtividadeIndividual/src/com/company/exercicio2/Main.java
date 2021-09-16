package com.company.exercicio2;

public class Main {

    public static void main(String[] args) {

        String frase = "Subi no onibus";
        ManipulaStrings manipulaStrings = new ManipulaStrings();

        System.out.println("---Imprimi apenas invertido e tudo maiusculo---");
        manipulaStrings.invertString(frase);

        System.out.println("---Verifica se e um palindromo---");
        manipulaStrings.palindromo(frase);

    }
}

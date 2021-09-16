package com.company.exercicio2;

import java.util.Locale;

public class ManipulaStrings {

    String palavraInvertida;

    public void invertString(String nome){
        palavraInvertida = new StringBuilder(nome.toUpperCase(Locale.ROOT)).reverse().toString();
        System.out.println(palavraInvertida + "\n");
    }

    public void palindromo(String nome){

        nome = nome.toUpperCase(Locale.ROOT).replaceAll("\\s+", "");
        palavraInvertida = palavraInvertida.toUpperCase(Locale.ROOT).replaceAll("\\s+", "");
        if (nome.equals(palavraInvertida)){
            System.out.println("E um palindromo" + "\n");
        } else {
            System.out.println("Nao e um palindromo" + "\n");
        }
    }
}

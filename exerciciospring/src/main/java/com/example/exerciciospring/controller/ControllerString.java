package com.example.exerciciospring.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Locale;

@RestController
@RequestMapping("/string")
public class ControllerString {

    String palavraInvertida;
    @GetMapping("/invert/{nome}")
    public String invertString(@PathVariable String nome){
        palavraInvertida = new StringBuilder(nome.toUpperCase(Locale.ROOT)).reverse().toString();
        return "A palavra invertida fica da seguinte forma " + palavraInvertida;
    }

    String palavra;
    @GetMapping("/palindromo/{nome}")
    public String palindromo(@PathVariable String nome){
        nome = nome.toUpperCase(Locale.ROOT).replaceAll("\\s+", "");
        palavra = new StringBuilder(nome.toUpperCase(Locale.ROOT)).reverse().toString();
        palavra = palavra.toUpperCase(Locale.ROOT).replaceAll("\\s+", "");
        if (nome.equals(palavra)){
            return "E um palindromo a frase : " + palavra;
        } else {
            return "Nao e um palindromo a frase : " + palavra;
        }
    }


}

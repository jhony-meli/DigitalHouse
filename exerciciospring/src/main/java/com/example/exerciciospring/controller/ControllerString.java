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


}
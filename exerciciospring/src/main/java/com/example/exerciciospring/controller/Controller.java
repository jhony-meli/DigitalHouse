package com.example.exerciciospring.controller;

import com.example.exerciciospring.entity.Produto;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/string")
public class Controller {

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

    @GetMapping("/produtos")
    public List<Produto> produtos() {
        Produto produto1 = new Produto("Uva", 10.100);
        Produto produto2 = new Produto("Laranja", 200.500);
        Produto produto3 = new Produto("Melancia", 100.100);

        List<Produto> produtos = new ArrayList<>();

        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);

        Collections.sort(produtos, Comparator.comparing(Produto::getPeso));
        return produtos;
    }


    // ex /pessoal com nome e sobrenome: /localhost:8090/string/pessoal?nome=jhony&sobrenome=zuim"
    @GetMapping("/end1")
    public String end1(String nome, String sobrenome){
        if (nome.equalsIgnoreCase("jhony") && sobrenome.equalsIgnoreCase("zuim")) {
            return "Vc e :" + nome + sobrenome;
        } else {
            return "Vc nao e o Jhony";
        }
    }



}

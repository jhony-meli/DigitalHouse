package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class romanosController {

    public int [] valores = {10, 5, 1};
    public String [] letras = {"X", "V", "I"};

    //Exemplo de chamada -> http://localhost:8080/convNumbers/23
    @GetMapping("convNumbers/{number}")
    public String roman(@PathVariable int number){
        String romano="";
        for(int i=0; i<valores.length;i++){
            while(number>=valores[i]){
                number-=valores[i];
                romano+=letras[i];
            }
        }
        return romano;
    }

    //Exemplo de chamada -> http://localhost:8080/convNumbers?number=23
    @GetMapping("convNumbers")
    public String roman01(@RequestParam int number){
        String romano="";
        for(int i=0; i<valores.length;i++){
            while(number>=valores[i]){
                number-=valores[i];
                romano+=letras[i];
            }
        }
        return romano;
    }

}

package com.example.desafiodiploma.controller;

import com.example.desafiodiploma.entity.AlunoEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/inicio")
public class DiplomaController<aluno1> {

    private Map<String, String> map = new HashMap<>();

    public DiplomaController() {
        map.put("kenyo", "faria");
        map.put("filipe", "vaz");
        map.put("mauri", "klein");
        map.put("joice", "lima");
    }

    @GetMapping(value="/ping")
    public String ping() {
        return "pong";
    }

    @GetMapping(value = "/pessoa")
    public String end1(String nome) {
        if(nome.equalsIgnoreCase("kenyo")) {
            return "kenyo abadio crosara faria";
        }else {
            return "não é o kenyo";
        }
    }

    @GetMapping(value = "/pessoal")
    public String end2(String nome, String cargo) {
        if(nome.equalsIgnoreCase("kenyo") && cargo.equalsIgnoreCase("professor")) {
            return "professor: kenyo abadio crosara faria";
        }else {
            if(nome.equalsIgnoreCase("kenyo")) {
                return "aluno: kenyo abadio crosara faria";
            }
        }
        return "não é o kenyo";
    }


    @GetMapping(value = "/query")
    public String consulta(@RequestParam("q") String primeiroNome) {
        Optional<String> item = map.entrySet().stream()
                .filter(e -> primeiroNome.equalsIgnoreCase(e.getKey()))
                .map(Map.Entry::getValue)
                .findFirst();
        return item.get();
    }

    @PostMapping(value = "/cadastra")
    public void  cadastrar(@RequestBody AlunoEntity payLoad) {

        map.put(payLoad.getPrimeiroNome(), payLoad.getUltimoNome());
    }

    @PutMapping(value = "/atualiza")
    public void atualizar(@RequestBody AlunoEntity payLoad) {
        map.put(payLoad.getPrimeiroNome(), payLoad.getUltimoNome());
    }

    @DeleteMapping(value ="/deleta/{i}")
    public void remover(@PathVariable("i") String nome) {
        map.remove(nome);
    }

}

package com.example.demo.controller;

import com.example.demo.model.Aluno;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @RequestMapping("/cadastra")
    public Aluno cadastra(@RequestBody Aluno aluno){
        System.out.println("O aluno chegou " + aluno);
        return aluno;
    }
}

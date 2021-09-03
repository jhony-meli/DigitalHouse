package com.example.demo.controller;

import com.example.demo.model.dto.AlunoDto;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @RequestMapping("/cadastra")
    public AlunoDto cadastra(@RequestBody AlunoDto alunoDto){
        System.out.println("O aluno chegou " + alunoDto);
        return alunoDto;
    }
}

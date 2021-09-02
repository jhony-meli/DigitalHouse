package com.example.demo.controller;

import com.example.demo.model.service.ImovelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/imovel")
public class ImovelController {

    @Autowired
    private ImovelService imovelService;

    @GetMapping("/rti")
    public double retornarTamanhoImovel(){
        return imovelService.getTamanho();
    }

    @GetMapping("/cvi")
    public double calcularValorImovel(){
        return imovelService.getTamanho()*800;
    }


}

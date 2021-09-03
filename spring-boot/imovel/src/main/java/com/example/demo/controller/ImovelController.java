package com.example.demo.controller;

import com.example.demo.model.dto.ImovelDto;
import com.example.demo.model.dto.QuartoDto;
import com.example.demo.model.entity.Imovel;
import com.example.demo.model.entity.Quarto;
import com.example.demo.model.service.ImovelService;
import com.example.demo.model.service.QuartoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/imovel")
public class ImovelController {

    @Autowired
    private ImovelService imovelService;

    @Autowired
    private QuartoService quartoService;

    @GetMapping("/rti")
    public double retornarTamanhoImovel(){
        ImovelDto imovelDto = new ImovelDto();
        imovelDto.setTamanho(imovelService.getTamanho());
        return imovelDto.getTamanho();
    }

    @GetMapping("/cvi")
    public double calcularValorImovel(){
        ImovelDto imovelDto = new ImovelDto();
        imovelDto.setTamanho(imovelService.getTamanho());
        return imovelDto.getTamanho()*800;
    }

    @GetMapping("/listarquartos")
    public List<QuartoDto> listarQuartos(){
        List<QuartoDto> listaDto = new ArrayList<>();
        for (int i = 0; i < quartoService.criarQuartos().size() ;i++){
            QuartoDto quartoDto = new QuartoDto();
            quartoDto.setComprimento(quartoService.quartoRecebendoId(i).getComprimento());
            quartoDto.setNome(quartoService.quartoRecebendoId(i).getNome());
            quartoDto.setLargura(quartoService.quartoRecebendoId(i).getLargura());
            listaDto.add(quartoDto);
        }
        return listaDto;
    }



}

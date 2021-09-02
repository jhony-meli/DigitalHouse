package com.example.demo.model.dto;

import lombok.Data;

@Data
public class ImovelDto {

    private String nome;
    private String endereco;
    private double tamanho;
    private int qtdQuartos;

    public ImovelDto() {
        this.nome = "casa";
        this.endereco = "Rua da felicidade 317";
        this.tamanho = 40.0;
        this.qtdQuartos = 2;
    }
}

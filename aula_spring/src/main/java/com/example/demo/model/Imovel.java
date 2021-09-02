package com.example.demo.model;

public class Imovel {

    private String nome;
    private String endereco;
    private double tamanho;
    private int qtdQuartos;

    public Imovel() {
    }

    public Imovel(String nome, String endereco, double tamanho, int qtdQuartos) {
        this.nome = nome;
        this.endereco = endereco;
        this.tamanho = tamanho;
        this.qtdQuartos = qtdQuartos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public int getQtdQuartos() {
        return qtdQuartos;
    }

    public void setQtdQuartos(int qtdQuartos) {
        this.qtdQuartos = qtdQuartos;
    }

    @Override
    public String toString() {
        return "Imovel{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", tamanho=" + tamanho +
                ", qtdQuartos=" + qtdQuartos +
                '}';
    }
}

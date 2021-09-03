package com.company;

public class Roupa {

    private String tipo;
    private String cor;
    private String tamanho;

    public Roupa(String tipo, String cor, String tamanho) {
        this.tipo = tipo;
        this.cor = cor;
        this.tamanho = tamanho;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
}

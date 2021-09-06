package com.company;

// Herda de Funcionario - subclasse
public class Gerente extends Funcionario{

    private double gratificacao;

    // chamando construtor do funcionario
    public Gerente(String nome, String sexo, double salario) {
        super(nome, sexo, salario);
    }

    public double getGratificacao() {
        return super.getSalario() * 0.5;
    }

    public void setGratificacao(double gratificacao) {
        this.gratificacao = gratificacao;
    }

    @Override
    public double getSalario(){ return super.getSalario() + gratificacao;}
}

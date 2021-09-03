package com.company;

// Herda de Funcionario - subclasse
public class Vendedor extends Funcionario{

    private double comissao;
    private double faturamento;
    private double remuneracao;

    public Vendedor(String nome, String sexo, double salario, double faturamento) {
        super(nome, sexo, salario);
        this.faturamento = faturamento;
    }

    public double getRemuneracao() {
        return getComissao() + super.getSalario();
    }

    public void setRemuneracao(double remuneracao) {
        this.remuneracao = remuneracao;
    }

    public double getComissao() {
        return faturamento * 0.5;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public double getFaturamento() {
        return faturamento;
    }
    @Override
    public double getSalario(){
        return super.getSalario() + getComissao();
    }

    public void setFaturamento(double faturamento) {
        this.faturamento = faturamento;
    }
}

package com.company;

import java.util.Locale;

// classe pai - super classe // extends object e implicito colocando ou nao
public class Funcionario extends Object{

    String nome;
    String sexo;
    double salario;

    // construtor
    public Funcionario() {
    }

    // construtor
    public Funcionario(String nome, String sexo, double salario) {
        this.nome = nome;
        this.sexo = sexo;
        this.salario = salario;
    }

    public String getNome() {
        return nome.toUpperCase(Locale.ROOT);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", sexo='" + sexo + '\'' +
                ", salario=" + salario +
                '}';
    }
}

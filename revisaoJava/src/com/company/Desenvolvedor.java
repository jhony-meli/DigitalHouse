package com.company;

public class Desenvolvedor extends Funcionario{

    // ajustar
    private String senha;

    public Desenvolvedor(String nome, String sexo, double salario, String senha) {
        super(nome, sexo, salario);
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Desenvolvedor{" +
                "senha='" + senha + '\'' +
                ", nome='" + nome + '\'' +
                ", sexo='" + sexo + '\'' +
                ", salario=" + salario +
                '}';
    }
}

package com.company.exercicio1;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

    List<Pessoa> listaPessoa = new ArrayList();

    public void armazenarPessoa(Pessoa pessoa){
        listaPessoa.add(pessoa);
    }

    public void removerPessoa(Pessoa pessoa){
        listaPessoa.remove(pessoa);
    }

    public int buscarPessoa(String nome){
        int posicao = 0;
        for (int i = 0; i < listaPessoa.size(); i++){
            if (nome.equals(listaPessoa.get(i).getNome())){
                posicao = i;
            }
        }

        return posicao;
    }
    public void exibirTodaAgenda(){
        System.out.println(listaPessoa);
    }

    public void exibirPessoa(Pessoa pessoa){
        System.out.println(pessoa.toString());
    }

}

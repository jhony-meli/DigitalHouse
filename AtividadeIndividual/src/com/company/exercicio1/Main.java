package com.company.exercicio1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        int retorno;

        Pessoa pessoa1 = new Pessoa("Jhony", "Rua xxxx, 1", "1111111111",11,1.11);
        Pessoa pessoa2 = new Pessoa("Rafa", "Rua yyyyy, 2", "2222222222",22,1.20);
        Pessoa pessoa3 = new Pessoa("Lucas", "Rua bbbb, 3", "3333333333",33,1.30);
        Pessoa pessoa4 = new Pessoa("Ed", "Rua wwwwwww, 4", "4444444444",44,1.40);
        Pessoa pessoa5 = new Pessoa("Filipe", "Rua ooo, 5", "5555555555",55,1.50);
        Pessoa pessoa6 = new Pessoa("Mauri", "Rua tttt, 6", "6666666666",66,1.60);
        Pessoa pessoa7 = new Pessoa("Joyce", "Rua eeee, 7", "7777777777",77,1.70);
        Pessoa pessoa8 = new Pessoa("Kenyo", "Rua uuuu, 8", "8888888888",88,1.80);
        Pessoa pessoa9 = new Pessoa("Katia", "Rua mmmm, 9", "9999999999",99,1.90);
        Pessoa pessoa10 = new Pessoa("Manu", "Rua zzz, 19", "1010101010",10,1.10);


        Agenda agenda = new Agenda();
        agenda.armazenarPessoa(pessoa1);
        agenda.armazenarPessoa(pessoa2);
        agenda.armazenarPessoa(pessoa3);
        agenda.armazenarPessoa(pessoa4);
        agenda.armazenarPessoa(pessoa5);
        agenda.armazenarPessoa(pessoa6);
        agenda.armazenarPessoa(pessoa7);
        agenda.armazenarPessoa(pessoa8);
        agenda.armazenarPessoa(pessoa9);
        agenda.armazenarPessoa(pessoa10);

        System.out.println("---Lista com 10 pessoas---");
        agenda.exibirTodaAgenda();

        agenda.removerPessoa(pessoa1);

        System.out.println("---Lista com 9 pessoas---");
        agenda.exibirTodaAgenda();

        System.out.println("---Buscar pessoa pelo nome---");
        retorno = agenda.buscarPessoa("Lucas");
        System.out.println(retorno);

        System.out.println("---Listar todas as pessoas da agenda---");
        agenda.exibirTodaAgenda();

        System.out.println("---Apresente uma pessoa especifico---");
        agenda.exibirPessoa(pessoa1);

    }
}

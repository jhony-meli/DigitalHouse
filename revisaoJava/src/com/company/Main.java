package com.company;

import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        System.out.println("-----------------------------Parte 01 e 02-------------------------------");

        Roupa[] roupas = new Roupa[3];
        roupas[0] = new Roupa("short","preto","P");
        roupas[1] = new Roupa("camisa","branco","M");
        roupas[2] = new Roupa("calca","azul","G");

        for (int i = 0; i < roupas.length; i++){
            System.out.println(roupas[i].getTipo());
        }

        System.out.println("-----------------------------Parte 03------------------------------------");

        // Encapsulamento
        // criando objeto Funcionario
        Funcionario funcionario1 = new Funcionario("Jhony", "M", 1000.01);
        Funcionario funcionario2 = new Funcionario("Edemir", "M", 1000.01);
        Funcionario funcionario3 = new Funcionario("Rafael", "M", 1000.01);

        //cria um arquivo
        FileOutputStream fos = new FileOutputStream("funcionarios.txt");
        //escrever no arquivo
        OutputStreamWriter osw = new OutputStreamWriter(fos);
        //gera metodos de escrita
        BufferedWriter bw = new BufferedWriter(osw);

        //escreveu nome funcionario1
        bw.append(funcionario1.toString());
        //pula linha
        bw.newLine();
        bw.append(funcionario2.getNome());
        bw.newLine();
        bw.append(funcionario3.getNome());
        bw.newLine();

        //fecha o arquivo para salvar a escrita
        //bw.close();

            System.out.println(funcionario1.getSalario());
            System.out.println(funcionario1.getNome());
            System.out.println(funcionario1.getSexo());

        System.out.println("-----------------------------Parte 04------------------------------------");

        // Heranca
        // criando objeto Gerente que extend de Funcionario
        Gerente rodrigo = new Gerente("Rodrigo", "M", 13000);
        Vendedor ana = new Vendedor("Ana", "F", 5000, 1000);

        bw.append(rodrigo.getNome() + " gratificacao: " + rodrigo.getGratificacao());
        bw.newLine();
        bw.append(ana.getNome() + " comissao: " + ana.getComissao() + " remuneracao: " + ana.getSalario());
        bw.newLine();

        System.out.println("-----------------------------Exercicio------------------------------------");

        Desenvolvedor jhony = new Desenvolvedor("Jhony", "M", 10000, "12345");

        bw.append(jhony.toString());

        bw.close();


    }
}

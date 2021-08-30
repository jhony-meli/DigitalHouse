package com.guardaroupa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        // declara guarda roupas
        Scanner teclado = new Scanner(System.in);
        GuardaRoupa guardaRoupa = new GuardaRoupa();
        String itemMarca;
        String itemModelo;
        List<Roupa> listRoupa = new ArrayList<>();


        int opcao = 0;
//        int num = 0;

        while (opcao != 99) {
            int resposta = 1;
            System.out.println("Favor esolher a opcao: ( 1 - incluir, 2 - mostrar, 99 - encerrar)");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    // adiciona roupas
                    while (resposta == 1) {

                        System.out.println("Favor incluir marca da roupa");
                        itemMarca = teclado.next();
                        System.out.println("Favor incluir modelo da roupa");
                        itemModelo = teclado.next();

                        Roupa roupa = new Roupa();
                        roupa.setMarca(itemMarca);
                        roupa.setModelo(itemModelo);
                        listRoupa.add(roupa);

                        System.out.println("Deseja incluir outra roupa? (ex 1 para sim ou 2 para nao)");
                        resposta = teclado.nextInt();
                    }

                    guardaRoupa.incluirRoupa(listRoupa);
                    break;
                case 2:
                    guardaRoupa.mostraRoupas();
                    break;
                case 99:
                    break;

                default:
                    System.out.println("Opcao invalida");
                    break;

            }

        }

    }
}

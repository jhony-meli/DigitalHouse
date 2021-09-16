package com.company.exercicio4;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws IOException {

          File file = new File("file.txt");
          ManipulaArquivos manipulaArquivos = new ManipulaArquivos(file);
          List<String> list;

        try {
            manipulaArquivos.escreve("Thiago");
            manipulaArquivos.escreve("Maria");
            manipulaArquivos.escreve("Alexandre");
            manipulaArquivos.escreve("Nomandes");
        } catch (IOException e) {
            e.printStackTrace();
        }

        manipulaArquivos.fechaArquivo();
        list = manipulaArquivos.retornaRegistros();
        Collections.sort(list);
        System.out.println("-----Lista ordenada----\n");
        System.out.println(list);
    }
}

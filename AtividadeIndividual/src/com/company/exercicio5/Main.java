package com.company.exercicio5;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Jhony", "321.123.456-54","Rua Alvorada","jhony@mercadolivre.com","119876543");

        List<Cliente> listClientes = new ArrayList<>();

        if (cliente1.getNome().length() > 2 && cliente1.getNome().length() < 51){
            listClientes.add(cliente1);
        }
        System.out.println(listClientes);
    }
}

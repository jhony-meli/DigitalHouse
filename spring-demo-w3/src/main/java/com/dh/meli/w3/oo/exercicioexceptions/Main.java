package com.dh.meli.w3.oo.exercicioexceptions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		List<Cliente> clientes = new ArrayList<>();

		while (true) {
			System.out.println("Digite seu nome: ");
			String nomeDigitado = teclado.next();
			System.out.println("Digite sua idade: ");
			int idadeDigitada = teclado.nextInt();

			try {
				if (idadeDigitada < 18){
					throw new IdadeException();
				}

			} catch (IdadeException e){
				System.out.println("Voce e menor de idade!!!");
				break;
			}

			Cliente cliente = new Cliente(nomeDigitado, idadeDigitada);

			try {
				if (clientes.contains(cliente)) {

					throw new IdadeException();
				}
			} catch (IdadeException e) {
				System.out.println("Cliente ja existente!!!");
				break;
			}

			clientes.add(cliente);

			System.out.println("Clientes cadastrado! " + clientes.toString());

			System.out.println("Deseja cadastrar outro cliente? (1 para sim e 2 para nao)");
			int resposta = teclado.nextInt();

			if (resposta == 1){
			} else {
				break;
			}
		}
	}
}
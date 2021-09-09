package com.dh.meli.w3.oo.exercicioexceptions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

//		Scanner teclado = new Scanner(System.in);
//		System.out.println("Digite seu nome: ");
//		String nomeDigitado = teclado.nextLine();
//		System.out.println("Digite sua idade: ");
//		String idadeDigitada = teclado.nextLine();
//		teclado.close();

		List<Cliente> clientes = new ArrayList<>();
		Cliente cliente1 = new Cliente("Jhony", 20);
		Cliente cliente2 = new Cliente("Lucas", 17);

		clientes.add(cliente1);
		clientes.add(cliente2);

		System.out.println(clientes.toString());

		for (Cliente cliente:clientes) {
			if (cliente.getIdade() >17){

			} else {
				throw new IdadeException(String"Vc e menor de idade");
			}
		}

	}

	private static class IdadeException extends Throwable {
		public String IdadeException(String mensagem) {
			mensagem = "Vc e menor de idade";
			return mensagem;
		}
	}
}

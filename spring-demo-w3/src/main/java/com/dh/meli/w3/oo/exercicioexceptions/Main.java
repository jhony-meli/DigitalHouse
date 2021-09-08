package com.dh.meli.w3.oo.exercicioexceptions;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Cliente> clientes = new ArrayList<>();
		Cliente cliente1 = new Cliente("Jhony", 20);
		Cliente cliente2 = new Cliente("Lucas", 17);

		clientes.add(cliente1);
		clientes.add(cliente2);

		System.out.println(clientes.toString());

		for (Cliente cliente:clientes) {
			if (cliente.getIdade() >17){

			} else {
				throw new IdadeException("Voce e menor de idade");
			}
		}

	}
}

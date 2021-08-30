package com.guardaroupa;

import java.util.HashMap;
import java.util.List;

public class GuardaRoupa {

    HashMap<Integer, List<Roupa>> guardaRoupa = new HashMap<>();
    int num = 1;

    // metodo incluir
    public Integer incluirRoupa(List<Roupa> listaDeRoupas){
        guardaRoupa.put(num++,listaDeRoupas);

        return num;
    }

    // usar um for para percorrer o Hash
    public void mostraRoupas() {
        for (Integer numero: guardaRoupa.keySet()){
            List<Roupa> listaRoupas = guardaRoupa.get(numero);
            for (Roupa roupa: listaRoupas){
                System.out.println(roupa.toString());
            }
        }
    }

    public List<Roupa> devolverRoupas(Integer numero){
        List<Roupa> listaRoupa = guardaRoupa.get(numero);
        guardaRoupa.remove(numero);
        return listaRoupa;

    }

    @Override
    public String toString() {
        return "GuardaRoupa{" +
                "guardaRoupa=" + guardaRoupa +
                '}';
    }
}

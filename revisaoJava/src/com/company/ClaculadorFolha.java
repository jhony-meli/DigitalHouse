package com.company;

public class ClaculadorFolha {

    public double calcula(Funcionario[] funcionarios){
        double total =0;
        for (int i=0; i<funcionarios.length; i++){
            total = total + funcionarios[i].getSalario();
        }
        return total;
    }
}

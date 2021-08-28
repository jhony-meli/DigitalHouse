package com.exemplos;

public class Main {

    public static void main(String[] args) {

        int valor;
        int numero =11;

        valor = soma(10, 20);
        System.out.println("A soma e : " + valor);

        if(ePar(numero)){ // ou if(ePar(numero) == true){
            System.out.println("E par");
        } else {
            System.out.println("E impar");
        }

    }

    static int soma(int i, int i1) {
        int resultado = i + i1;
        return resultado;
    }

    // versao mais simples
    static boolean ePar2(int num){
        return (num % 2 == 0);
    }

    // versao mais clara
    static boolean ePar(int num){
        if(num % 2 == 0){
            return true;
        } else {
            return false;
        }
    }
}

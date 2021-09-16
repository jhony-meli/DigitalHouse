package com.company.exercicio3;

public class Retangulo {

    private double ladoA;
    private double ladoB;
    private double area;
    private double perimetro;
    private double quantidadePiso;
    private double quantidadeRodape;

    public void calculaArea(double ladoA, double ladoB){
        System.out.println(area = ladoA * ladoB);
    }

    public void calculaPerimetro(double ladoA, double ladoB){
        System.out.println(perimetro = ladoA + ladoB + ladoA + ladoB);
    }

    public void quantidadePisos(double tamanhoPiso, double area){
        System.out.println(quantidadePiso = area / tamanhoPiso);
    }

    public void quantidadeRodapes(double tamanhoRodade, double perimetro){
        System.out.println(quantidadeRodape = perimetro / tamanhoRodade);
    }

    public Retangulo() {
    }

    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    @Override
    public String toString() {
        return "Retangulo{" +
                "ladoA=" + ladoA +
                ", ladoB=" + ladoB +
                '}';
    }
}
